package book.dao;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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
public class MapBookShelf implements BookShelf {
	
	// 멤버 변수 선언
	Map<String, Book> books;
	
	// 생성자 선언
	public MapBookShelf() {
		books = new HashMap<String, Book>();
	}

	public MapBookShelf(Map<String, Book> books) {
		this.books = books;
	}

	// 메소드 선언
	@Override
	public int insert(Book book) throws DuplicateException {
		int inCnt = 0;
		
		if(!findBookId(book)) {
			books.put(book.getBookId(), book);
			inCnt = 1;
		}
		else {
			throw new DuplicateException();
		}
		
		return inCnt;
	}

	@Override
	public int update(Book book) throws NotFoundException {
		int upCnt = 0;
		
		if(findBookId(book)) {
			books.replace(book.getBookId(), book);
			upCnt = 1;
		}
		else {
			throw new NotFoundException();
		}

		return upCnt;
	}

	@Override
	public int delete(Book book) throws NotFoundException {
		int rmCnt = 0;
		
		if(findBookId(book)) {
			books.remove(book.getBookId());
			rmCnt = 1;
		}
		else {
			throw new NotFoundException();
		}
		
		return rmCnt;
	}

	@Override
	public Book select(Book book) throws NotFoundException {
		Book findBook = null;
		
		if(findBookId(book)) {
			findBook = books.get(book.getBookId());
		}
		else {
			throw new NotFoundException();
		}
		
		return findBook;
	}

	@Override
	public List<Book> select() {
		Collection<Book> collection = books.values();
		Book[] prodArr = new Book[collection.size()];
		
		return Arrays.asList(collection.toArray(prodArr));
	}
	
	private boolean findBookId(Book book) {
		return books.containsKey(book.getBookId());
	}

}
