package book.dao;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

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
public class SetBookShelf implements BookShelf {
	
	// 멤버 변수 선언
	private Set<Book> books;
	
	// 생성자 선언
	public SetBookShelf () {
		books = new HashSet<Book>();
	}

	public SetBookShelf(Set<Book> books) {
		this.books = books;
	}

	// 메소드 선언
	@Override
	public int insert(Book book) throws DuplicateException {
		boolean success = books.add(book);
		int inCnt = 0;
		
		if(success == true)
			inCnt = 1;
		else
			throw new DuplicateException();
			
		return inCnt;
	}

	@Override
	public int update(Book book) throws NotFoundException {
		boolean rmsuc = false;
		boolean insuc = false;
		int upCnt = 0;
		
		rmsuc = books.remove(book);
		
		if(rmsuc == true) { 
			insuc = books.add(book);
			
			if(insuc == true) { 
				upCnt = 1;
			}
		}
		else {
			throw new NotFoundException();
		}
		
		return upCnt;
	}

	@Override
	public int delete(Book book) throws NotFoundException {
		boolean success = books.remove(book);
		int rmCnt = 0;
		
		if(success == true) {
			rmCnt = 1;
		}
		else {
			throw new NotFoundException();
		}
		
		return rmCnt;
	}

	@Override
	public Book select(Book book) throws NotFoundException {
		Book findBook = findBookId(book);
		
		return findBook;
	}

	@Override
	public List<Book> select() {
		List<Book> books = new ArrayList<Book>();
		
		for(Book book : this.books ) {
			books.add(book);
		}

		
		return books;
	}

	private Book findBookId(Book book) {
		Book found = null;
		
		for (Book bok: books) {
			if (bok.equals(book)) {
				found = bok;
				break;
			}
		}
		
		return found;
	}
	
}
