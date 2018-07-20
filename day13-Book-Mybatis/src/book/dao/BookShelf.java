package book.dao;

import java.util.List;

import book.exception.DuplicateException;
import book.exception.NotFoundException;
import book.vo.Book;

public interface BookShelf {
	/**
	 * 책 하나를 추가
	 * @param book
	 * @return
	 * @throws DuplicateException
	 */
	public int insert(Book book) throws DuplicateException;
	
	/**
	 * 책 하나를 수정
	 * @param book
	 * @return
	 * @throws NotFoundException
	 */
	public int update(Book book) throws NotFoundException;
	
	/**
	 * 책 하나를 삭제
	 * @param book
	 * @return
	 * @throws NotFoundException
	 */
	public int delete(Book book) throws NotFoundException;
	
	/**
	 * 책 하나를 조회
	 * @param book
	 * @return
	 * @throws NotFoundException
	 */
	public Book select(Book book) throws NotFoundException;
	
	/**
	 * 가지고 있는 모든 책 조회
	 * @return
	 */
	public List<Book> select();
}
