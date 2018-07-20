package book.dao;

import static java.sql.DriverManager.getConnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import book.exception.DuplicateException;
import book.exception.NotFoundException;
import book.vo.Book;


public class JdbcBookShelf implements BookShelf{
	
	private static final String URL = "jdbc:oracle:thin:@//127.0.0.1:1521/XE";
	private static final String USER = "SCOTT";
	private static final String PASSWORD = "TIGER";
	private static final String DRIVER = "oracle.jdbc.OracleDriver";
	
	// 생성자 선언
	public JdbcBookShelf(){
		
	}
	
	//메소드 선언
	@Override
	public int insert(Book book) throws DuplicateException {
		Connection conn = null;
		PreparedStatement pstmt = null;
		int inCnt = 0;
		
		if(findBook(book)) {
			throw new DuplicateException();
		}
		
		try {
			// 1. 드라이버 로드
			Class.forName(DRIVER);
			// 2. 커넥션 맺기
			conn = DriverManager.getConnection(URL, USER, PASSWORD);
			
			// 3. 쿼리 준비
			String sql = " INSERT INTO ( bookid, title, author, price, isbn, publish,)\r\n" + 
					"      VALUES ( ?, ?, ?, ?, ?, ?)";
			
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, book.getBookId());
			pstmt.setString(2, book.getTitle());
			pstmt.setString(3, book.getAuthor());
			pstmt.setInt(4, book.getPrice());
			pstmt.setString(5, book.getIsbn());
			pstmt.setString(6, book.getPublish());
			
			// 4. 쿼리 실행
			inCnt = pstmt.executeUpdate();
			
			// 5. 결과 처리
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			
				try {
					if(pstmt != null) 
						pstmt.close();
					
					if(conn != null) {
						conn.close();
					}
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		
		return inCnt;
	}

	@Override
	public int update(Book book) throws NotFoundException {
		Connection conn = null;
		PreparedStatement pstmt = null;
		int upCnt = 0;
		
		if(!findBook(book)) {
			throw new NotFoundException();
		}
		
		try {
			// 1. 드라이버 로드
			Class.forName(DRIVER);
			// 2. 커넥션 맺기
			conn = DriverManager.getConnection(URL, USER, PASSWORD);
			
			// 3. 쿼리 준비
			String sql = " UPDATE book b" + 
					"         SET b.TITLE = ?," + 
					"        	  b.author = ?," + 
					"        	  b.price = ?," + 
					"        	  b.isbn = ?," + 
					"        	  b.publish = ?," + 
					"        	  b.moddate = sysdate" + 
					"  		WHERE b.bookid = ?     ";
			
			
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, book.getTitle());
			pstmt.setString(2, book.getAuthor());
			pstmt.setInt(3, book.getPrice());
			pstmt.setString(4, book.getIsbn());
			pstmt.setString(5, book.getPublish());
			pstmt.setString(6, book.getBookId());
			
			// 4. 쿼리 실행
			upCnt = pstmt.executeUpdate();
			
			// 5. 결과 처리
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			
				try {
					if(pstmt != null) 
						pstmt.close();
					
					if(conn != null) {
						conn.close();
					}
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		
		return upCnt;
	}

	@Override
	public int delete(Book book) throws NotFoundException {
		if (!findBook(book)) {
			throw new NotFoundException();
		}
		
		int rmCnt = 0;
		Connection conn = null;
		PreparedStatement pstmt = null;
		
		try {
			conn = DriverManager.getConnection(URL, USER, PASSWORD);
			
			String sql = "DELETE book b" 
					+ "    WHERE b.bookid = ?";
			
			
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, book.getBookId());
			
			rmCnt = pstmt.executeUpdate();
			
			
		} catch (SQLException e) {
			e.printStackTrace();
			
		} finally {
			try {
				if(pstmt != null) 
					pstmt.close();
				
				if(conn != null) {
					conn.close();
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		return rmCnt;

	}

	@Override
	public Book select(Book book) throws NotFoundException {
				if (!findBook(book)) {
					throw new NotFoundException();
				}
				
				Book found = null;
				Connection conn = null;
				PreparedStatement pstmt = null;
				ResultSet result =null;
				
				try {
					conn = getConnection(URL, USER, PASSWORD);
					
					String sql = "SELECT b.bookid," + 
							"      		 b.title," + 
							"  	         b.author," + 
							"        	 b.price," + 
							"        	 b.isbn," + 
							"        	 b.PUBLISH" + 
							"   	FROM book b" + 
							"  	   WHERE b.bookid = ?";
					
					pstmt = conn.prepareStatement(sql);
					pstmt.setString(1, book.getBookId());
					
					// 4. 
					result = pstmt.executeQuery();
					
					// 5.
					
					System.out.println("--------------");
					while (result.next()) {
						String bookId = result.getString(1);
						String title = result.getString(2);
						String author = result.getString(3);
						int price = result.getInt(4);
						String isbn = result.getString(5);
						String publish = result.getString(6);
						
						found = new Book(bookId, title, author, price, isbn, publish);
						
					}
					
				} catch (SQLException e) {
					e.printStackTrace();
					
				} finally {
					try {
						if(result != null) 
							result.close();
							
						if(pstmt != null) 
							pstmt.close();
						
						if(conn != null) {
							conn.close();
						}
					} catch (SQLException e) {
						e.printStackTrace();
					}
				} // end finally
				
				return found;
	}

	@Override
	public List<Book> select() {
		List<Book> books = new ArrayList<Book>();
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet result =null;
		
		try {
			// 2. 
			conn = getConnection(URL, USER, PASSWORD);
			
			// 3.
			String sql = "SELECT b.bookid," + 
					"   	     b.title," + 
					"       	 b.author," + 
					"       	 b.price," + 
					"	         b.isbn," + 
					"   	     b.PUBLISH" + 
					"	    FROM book b";
			
			pstmt = conn.prepareStatement(sql);
			
			
			// 4. 
			result = pstmt.executeQuery();
			
			// 5.
			
			System.out.println("--------------");
			while (result.next()) {
				String bookId = result.getString(1);
				String title = result.getString(2);
				String author = result.getString(3);
				int price = result.getInt(4);
				String isbn = result.getString(5);
				String publish = result.getString(6);
				
				Book product = new Book(bookId, title, author, price, isbn, publish);
				books.add(product);
				
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
			
		} finally {
			try {
				if(result != null)
					result.close();
				
				if(pstmt != null) {
					pstmt.close();
				}
				
				if(conn != null) {
					conn.close();
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} 	
		
		return books;
	}
	
	private boolean findBook(Book book) {
		boolean fBook = false;
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet result = null;
		
		try {
			Class.forName(DRIVER);
			
			conn = DriverManager.getConnection(URL, USER, PASSWORD);
			
			String sql = "SELECT b.bookid" + 
					"   	FROM book b" + 
					"  	   WHERE b.BOOKID = ?";
			
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, book.getBookId());
			
			result = pstmt.executeQuery();
			
			while(result.next()) {
				fBook = true;
			}
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
				try {
					if(result != null)
						result.close();
					
					if(pstmt != null) {
						pstmt.close();
					}
					
					if(conn != null) {
						conn.close();
					}
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			
		}
		
		
		return fBook;
	}
}
