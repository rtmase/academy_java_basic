package shop;

import java.util.List;

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
	public void add(Product product) {
		products.add(product);
	}

	@Override
	public Product get(Product product) {
		int getIndex = findProductIdx(product);
		return products.get(getIndex);
	}

	@Override
	public void set(Product product) {
		int setIdx = findProductIdx(product);
		
		if(setIdx > -1) {
			products.set(setIdx, product);
		}
	}

	@Override
	public void remove(Product product) {
		int rmIdx = findProductIdx(product);
		
		if(rmIdx > -1) {
			products.remove(rmIdx);
		}
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
