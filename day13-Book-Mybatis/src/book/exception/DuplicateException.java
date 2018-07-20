package book.exception;

import book.vo.Book;

public class DuplicateException extends Exception {
	
	public DuplicateException () {
		super("제품이 중북되었습니다.");
	}
	
	public DuplicateException (String type, Book book) {
		super(String.format("제품 %s[%s] 의 정보가 중복되었습니다. ", type, book));
	}
}
