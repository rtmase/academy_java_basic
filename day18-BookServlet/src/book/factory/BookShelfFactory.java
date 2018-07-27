package book.factory;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import book.dao.BookShelf;
import book.dao.JdbcBookShelf;
import book.dao.ListBookShelf;
import book.dao.MapBookShelf;
import book.dao.MybatisBookShelf;
import book.dao.SetBookShelf;
import book.vo.Book;


public class BookShelfFactory {
	public static BookShelf getBooks(String type) {
		BookShelf books = null;
		
		if ("mybatis".equals(type)) {
			books = new MybatisBookShelf();
		}
		else if ("jdbc".equals(type)) {
			books = new JdbcBookShelf();
		}
		else if ("list".equals(type)) {
			List<Book> book = new ArrayList<>();
			books = new ListBookShelf(book);
		}
		else if ("set".equals(type)) {
			Set<Book> book = new HashSet<>();
			books = new SetBookShelf(book);
		}
		else if ("map".equals(type)) {
			Map<String, Book> book = new HashMap<>();
			books = new MapBookShelf(book);
		}
		
		
		
		
		return books;
	}
}
