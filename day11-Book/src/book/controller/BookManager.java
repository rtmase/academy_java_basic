package book.controller;

import java.util.List;

import book.dao.BookShelf;
import book.exception.DuplicateException;
import book.exception.NotFoundException;
import book.view.BookView;
import book.view.ErrorView;
import book.view.ListView;
import book.view.MessageView;
import book.view.SingleView;
import book.vo.Book;
/**
 * + insert(Book book) : void : 1건 입력
 * + update(Book book) : void : 1건 수정
 * + delete(Book book) : void : 1건 삭제
 * + select(Book book) : void : 1건 조회
 * + select() : void : 전체 목록 조회
 * @author PC38221
 *
 */
public class BookManager {
	
	// 멤버 변수 선언
	private BookShelf books;
	private BookView view;
	
	// 생성자 선언
	public BookManager() {
	}
	
	public BookManager(BookShelf book) {
		this.books = book;
	}
	
	// 접근자 / 수정자 선언
	public BookShelf getBook() {
		return books;
	}

	public void setBook(BookShelf book) {
		this.books = book;
	}

	// 메소드 선언
	
	public void insert(Book book) {
		String msg = null;
		
		try {
			books.insert(book);
			msg = String.format("%s 제품이 추가되었습니다.", book.getBookId());
			view = new MessageView();
			
		} catch (DuplicateException e) {
			msg = String.format("%s 제품이 이미 존재합니다", book.getBookId());
			e.printStackTrace();
			view = new ErrorView();
			
		} finally {
			//view.display(msg);;
		}
	}
	
	public void update(Book book) {
		String msg = null;
		
		try {
			books.update(book);
			msg = String.format("%s 제품이 수정되었습니다.", book.getBookId());
			view = new MessageView();
			
		} catch (NotFoundException e) {
			msg = String.format("%s 제품 수정에 실패했습니다.", book.getBookId());
			e.printStackTrace();
			view = new ErrorView();
			
		} finally {
			view.display(msg);
		}
		
	}
	
	public void delete(Book book) {
		String msg = null;
		
		try {
			books.delete(book);
			msg = String.format("%s 제품이 제거되었습니다.", book.getBookId());
			view = new MessageView();
			
		} catch (NotFoundException e) {
			msg = String.format("%s 제품 제거에 실패했습니다.", book.getBookId());
			e.printStackTrace();
			view = new ErrorView();
			
		} finally {
			view.display(msg);
		}
	}
	
	public void select(Book book) {
		Book selectBook = null;
		try {
			selectBook = books.select(book);
			view = new SingleView();
			view.display(selectBook);
			
		} catch (NotFoundException e) {
			e.printStackTrace();
			view = new ErrorView();
			view.display(String.format("%s 제품 (이)가 없습니다.", book.getBookId()));
		}
	}
	
	public void select() {
		
		List<Book> book = books.select();
		BookView view = new ListView();
		view.display(book);
	}
	
	
}
