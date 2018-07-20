package book.mapper;

import java.util.List;

import book.vo.Book;

public interface BookMapper {
	int insert(Book book);
	int update(Book book);
	int deleteOne(Book book);
	Book selectOne(Book book);
	List<Book> selectAll();
	String findBook(Book book);
}
