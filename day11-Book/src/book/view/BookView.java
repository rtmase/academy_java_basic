package book.view;

import book.vo.Book;

public interface BookView {
	/**
	 * 메시지, 에러, 하나의 책에 대한 조회, 모든 책에 대한 조회 알림
	 * @param object
	 */
	public void display(Object object);
}
