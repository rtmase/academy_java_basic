package shop;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SetWarehouse implements GeneralWarehouse {
	// 멤버변수 선언
	Set<Product> sets;
	
	// 생성자 선언
	public SetWarehouse () {
		sets = new HashSet<Product>();
	}
	
	public SetWarehouse (Set<Product> sets){
		super();
		this.sets = sets;
	}
	
	// 접근자, 수정자 선언
	public Set<Product> getSets() {
		return sets;
	}

	public void setSets(Set<Product> sets) {
		this.sets = sets;
	}

	
	@Override
	public int add(Product product) {
		boolean success = sets.add(product);
		int addCnt = 0;
		
		if (success) {
			addCnt++;
		}
		
		return addCnt;
	}

	@Override
	public Product get(Product product) {
		
		return findeProduct(product);
	}

	@Override
	public int set(Product product) {
		int success = -1;
		
		for (Product set : sets ) {
			if (product.equals(sets)) {
				sets.remove(sets);
				sets.add(product);
				success = 1;
			}
		}
		return success;
	}

	@Override
	public int remove(Product product) {
		boolean success = sets.remove(product);
		return success ? 1 : -1;
	}

	@Override
	public List<Product> getAllProducts() {
		Product[] prodArr = new Product[this.sets.size()];
		return Arrays.asList(this.sets.toArray(prodArr));
		//////////////////////////////////////////////
		/*
		List<Product> products = new ArrayList<Product>();
		for (Product product : this.sets) {
			products.add(product);
		}
		
		return products;
		*/
		
		
	}
	
	private Product findeProduct(Product product){
		Product found = null;
		for(Product set : sets) {
			if(product.equals(sets)) {
				found = ;
			}
		}
		
		return found;
	}
}
