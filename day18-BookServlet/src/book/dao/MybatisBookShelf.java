package book.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.transaction.Transaction;

import book.exception.DuplicateException;
import book.exception.NotFoundException;
import book.mapper.BookMapper;
import book.mybatis.MybatisClient;
import book.vo.Book;

public class MybatisBookShelf implements BookShelf {
	// 멤버 변수 선언
	private SqlSessionFactory factory;
	
	// 생성자 선언
	public MybatisBookShelf() {
		factory = MybatisClient.getFactory();
	}
	
	//메소드 선언
	@Override
	public int insert(Book book) throws DuplicateException {
		// 추가하고자 하는 책이 보유중인지 확인
		if (findBook(book)) {
			throw new DuplicateException();
		}
		
		// SqlSession 얻기
		SqlSession session = factory.openSession(true);
		int addCnt = 0;
		
		// mapper 인터페이스 객체를 session 으로 얻기
		BookMapper mapper;
		mapper = session.getMapper(BookMapper.class);
		
		try {
			addCnt = mapper.insert(book);
			
		} finally {
			// session 은 finally 에서 닫을 것을 권고
			if(session != null) {
				session.close();
			}
		}
		
		
		return 0;
	}

	@Override
	public int update(Book book) throws NotFoundException {
		int upCnt = 0;
		// 수정하고자 하는 책이 보유중인지 확인
		if (!findBook(book)) {
			throw new NotFoundException();
		}
		
		// SqlSession 얻기
		SqlSession session = factory.openSession(true);
		
		// mapper 인터페이스 객체를 session 으로 얻기
		BookMapper mapper;
		mapper = session.getMapper(BookMapper.class);
		
		try {
			upCnt = mapper.update(book);
			
		} finally {
			if(session != null) {
				session.close();
			}
		}
		
		return upCnt;
	}

	@Override
	public int delete(Book book) throws NotFoundException {
		int deCnt = 0;
		
		// 제거하고자 하는 책이 보유중인지 확인
		if (!findBook(book)) {
			throw new NotFoundException();
		}

		// SqlSession 얻기
		SqlSession session = factory.openSession(true);
		
		// mapper 인터페이스 객체를 session 으로 얻기
		BookMapper mapper;
		mapper = session.getMapper(BookMapper.class);
		//session.commit();
		/*
		 * try {
		 *  // transaction work
		 *  
		 *   // commit();
		 * } catch (transaction exception e) {
		 *   // rollback();
		 * }
		 */
		
		try {
			deCnt = mapper.deleteOne(book);
			
		} finally {
			if (session != null) {
				session.close();
			}
		}
		
		return deCnt;
	}

	@Override
	public Book select(Book book) throws NotFoundException {
		Book fBook = null;
		
		// 조회하고자 하는 책이 보유중인지 확인
		if (!findBook(book)) {
			throw new NotFoundException();
		}
		
		SqlSession session = factory.openSession();
		
		BookMapper mapper = session.getMapper(BookMapper.class);
		
		try {
			fBook = mapper.selectOne(book);
			
		} finally {
			if(session != null) {
				session.close();
			}
		}
		
		return fBook;
	}

	@Override
	public List<Book> select() {
		List<Book> allBook = null;
		
		SqlSession session = factory.openSession();
		
		BookMapper mapper = session.getMapper(BookMapper.class);
		
		try {
			allBook = mapper.selectAll();
		} finally {
			if(session != null) {
				session.close();
			}
		}
		return allBook;
	}
	
	public List<Book> select(int low, int high){
		List<Book> allBook = null;
		
		
		
		return allBook;
	}
	
	private boolean findBook(Book book) {
		boolean fBook = false;
		
		// 1. SqlSession 얻기
		SqlSession session = factory.openSession();
		
		// 2. Mapper 인터페이스 객체를 session 에서 얻기
		BookMapper mapper;
		mapper = session.getMapper(BookMapper.class);
		
		// 3. Mapper 객체에서 메소드호출로 쿼리 실행
		try {
			String bookId = mapper.findBook(book);
			if (bookId != null) {
				fBook = true;
			}
		} finally {
			// 4. session 닫기
			if (session != null)
				session.close();
		}
		
		return fBook;
	}
}
