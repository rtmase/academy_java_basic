package book.test;

import java.util.ArrayList;
import java.util.List;

import book.controller.BookManager;
import book.dao.BookShelf;
import book.dao.JdbcBookShelf;
import book.dao.ListBookShelf;
import book.vo.Book;

public class BookStore {
	public static void main(String[] args) {
		List<Book> book = new ArrayList<Book>();
		
//		BookShelf books = new JdbcBookShelf();
		BookShelf books = new ListBookShelf(book);
		BookManager manager = new BookManager(books);
		
		Book History = new Book("B001" ,"역사의 역사", "유시민", 14400, "9788971998557", "돌배게");
		Book novel = new Book("B002" ,"모든 순간이 너였다", "하태완", 12420, "9791162202913", "위즈덤하우스");
		
		// 추가 
		manager.insert(History);
		manager.insert(novel);
		
		// 조회
		manager.select();
		
		// 삭제
		manager.delete(novel);
		
		// 1건 조회
		manager.select(History);
		
	}
}
