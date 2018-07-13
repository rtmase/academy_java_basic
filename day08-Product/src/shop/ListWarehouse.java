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
	public int add(Product product) {
		boolean success = products.add(product);
		int addCnt = 0;
		
		if (success) {
			addCnt++;
		}
		
		return addCnt;
	}

	@Override
	public Product get(Product product) {
		int getIndex = findProductIdx(product);
		Product finded = null;
		
		if (getIndex > -1) {
			// 찾아올 제품이 존재
			finded = products.get(getIndex);
		}
		
		return finded;
	}

	@Override
	public int set(Product product) {
		int setIdx = findProductIdx(product);
		
		if(setIdx > -1) {
			products.set(setIdx, product);
		}
		
		return setIdx;
	}

	@Override
	public int remove(Product product) {
		int rmIdx = findProductIdx(product);
		
		if(rmIdx > -1) {
			products.remove(rmIdx);
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
