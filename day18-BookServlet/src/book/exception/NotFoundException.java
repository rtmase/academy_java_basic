package book.exception;

import book.vo.Book;

public class NotFoundException extends Exception {
	
	public NotFoundException() {
		super("제품이 존재하지 않습니다.");
	}
	
	public NotFoundException(String type, Book book) {
		super(String.format("제품 %s[%s] 이(가) 존재하지 않습니다.", type, book));
	}
}
