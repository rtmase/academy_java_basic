package shop.dao;

import java.util.List;

import shop.exception.DuplicateException;
import shop.exception.NotFoundException;
import shop.vo.Product;

/**
 * 제품을 관리하기 위한 창고의 기능을 선언한 인터페이스
 * @param product
 */
public interface GeneralWarehouse {
	public int add (Product product) throws DuplicateException;
	public Product get(Product product) throws NotFoundException;
	public int set(Product product) throws NotFoundException;
	public int remove(Product product) throws NotFoundException;
	public List<Product> getAllProducts();
	
}
