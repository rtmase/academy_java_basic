package book.view;

import java.util.List;

import book.vo.Book;

public class ListView implements BookView {

	@Override
	public void display(Object object) {
		List<Book> books = (List<Book>) object;
		for(Book book : books) {
			System.out.println(book);
		}
	}

}
