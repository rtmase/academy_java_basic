package shop.dao;

import java.util.List;

import shop.exception.DuplicateException;
import shop.exception.NotFoundException;
import shop.vo.Product;

public class ListWarehouse implements GeneralWarehouse {
	// 1. 멤버 변수 선언
	private List<Product> products;
	
	// 2. 생성자
	public ListWarehouse () {
		
	}
		
	public ListWarehouse(List<Product> products) {
		super();
		this.products = products;
	}


	public List<Product> getProducts() {
		return products;
	}


	public void setProducts(List<Product> products) {
		this.products = products;
	}


	@Override
	public int add(Product product) throws DuplicateException {
		int addIndex = findProductIdx(product);
		int addCnt = 0;
		
		if(addIndex == -1) {
			products.add(product);
		}
		else {
			throw new DuplicateException("add", product);
		}
	
		return addCnt;
	}

	@Override
	public Product get(Product product) throws NotFoundException {
		int getIndex = findProductIdx(product);
		Product finded = null;
		
		if (getIndex > -1) {
			// 찾아올 제품이 존재
			finded = products.get(getIndex);
		}
		else {
			throw new NotFoundException("get", product);
		}
		
		return finded;
	}

	@Override
	public int set(Product product) throws NotFoundException {
		int setIdx = findProductIdx(product);
		
		if(setIdx > -1) {
			products.set(setIdx, product);
		}
		else {
			throw new NotFoundException("set", product);
		}
		
		return setIdx;
	}

	@Override
	public int remove(Product product) throws NotFoundException {
		int rmIdx = 0;
		
		rmIdx = findProductIdx(product);
		
		if(rmIdx > -1) {
			products.remove(rmIdx);
		} 
		else {
			throw new NotFoundException("remove", product);
		}
		
		return rmIdx;
	}

	@Override
	public List<Product> getAllProducts() {
		return this.products;
	}
	
	// 리스트 안에 찾으려는 제품의 인덱스를 구하는 지원 메소드
	private int findProductIdx(Product product) {
		int index = -1;
		
		for (int idx = 0; idx < products.size(); idx++) {
			if (products.get(idx).equals(product)) {
				index = idx;
				break;
			}
		}
	
		return index;
	}
}
