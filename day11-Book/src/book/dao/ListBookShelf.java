package book.dao;

import java.util.ArrayList;
import java.util.List;

import book.exception.DuplicateException;
import book.exception.NotFoundException;
import book.vo.Book;

/**
 * + insert(Book book) : int : 1건 입력
 * + update(Book book) : int : 1건 수정
 * + delete(Book book) : int : 1건 삭제
 * + select(Book book) : Book : 1건 조회
 * + select() : List<Book> : 모든 책 정보 조회
 * @author PC38221
 *
 */
public class ListBookShelf implements BookShelf {
	
	// 멤버변수 선언
	private List<Book> books;
	
	// 생성자 선언
	public ListBookShelf() {
		books = new ArrayList<Book>();
	}
	
	public ListBookShelf(List<Book> books) {
		super();
		this.books = books;
	}


	// 메소드 선언
	/**
	 * 1건의 책 입력
	 * @param book
	 * @return
	 * @throws DuplicateException
	 */
	public int insert(Book book) throws DuplicateException {
		int inCnt = 0;
		int fBindex = findBookId(book);
		
		if (fBindex == -1) {
			books.add(book);
			inCnt = 1;
		}
		else {
			throw new DuplicateException();
		}
		
		return inCnt;
	}
	
	/**
	 * 1건의 책 수정
	 * @param book
	 * @return
	 * @throws NotFoundException
	 */
	public int update(Book book) throws NotFoundException {
		int fBindex = findBookId(book);
		
		if (fBindex > -1) {
			books.set(fBindex, book);
		}
		else {
			throw new NotFoundException();
		}
		
		return fBindex;
	}
	
	/**
	 * 1건의 책 삭제
	 * @param book
	 * @return
	 * @throws NotFoundException 
	 */
	public int delete(Book book) throws NotFoundException {
		int fBindex = findBookId(book);
		
		if (fBindex > -1) {
			books.remove(fBindex);
		}
		else {
			throw new NotFoundException();
		}
		
		return fBindex;
	}
	
	/**
	 * 1건의 책 조회
	 * @param book
	 * @return
	 * @throws NotFoundException 
	 */
	public Book select(Book book) throws NotFoundException {
		int fBindex = findBookId(book);
		Book findBook;
		if (fBindex > -1) {
			findBook = books.get(fBindex);
		}
		else {
			throw new NotFoundException();
		}
		
		
		return findBook;
	}
	
	/**
	 * 모든 책 정보 조회
	 * @return 
	 */
	public List<Book> select() {
		
		return this.books;
	}
	
	private int findBookId(Book book) {
		int fbindex = -1;
		
		for(int idx = 0; idx < books.size(); idx++) {
			if(book.equals(books.get(idx))) {
				fbindex = idx;
				break;
			}
		}
		
		return fbindex;
	}
}
