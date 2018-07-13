package shop;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class MapWarehouse implements GeneralWarehouse {
	// 멤버변수 선언
	Map<String, Product> map;
	
	// 생성자 선언
	MapWarehouse (){
		map = new HashMap<>();
	}
	
	MapWarehouse (Map<String, Product> map){
		
	}
	
	// 접근자 수정자 선언
	public Map<String, Product> getMap() {
		return map;
	}

	public void setMap(Map<String, Product> map) {
		this.map = map;
	}

	
	@Override
	public int add(Product product) {
		int success = -1;
		if(!product.getProdCode().equals(findKeySet(product))) {
			map.put(product.getProdCode(), product);
			success = 1;
		}
				
		return success;
	}

	
	@Override
	public Product get(Product product) {
		
		return map.get(product);
	}

	@Override
	public int set(Product product) {
		this.add(product);
		return 0;
	}

	@Override
	public int remove(Product product) {
		int success = -1;
		if(map.containsKey(product)==true);{
			map.remove(product);
			success = 1;
		}
		
		return success;
	}

	@Override
	public List<Product> getAllProducts() {
		
		return null;
	}
	
	private String findKeySet(Product product) {
		String keyStr = null;
		Set keySet = map.keySet();
		for(Object key : keySet ) {
			if(product.equals(map)) {
				keyStr = key.toString();
			}
		}
		
		return keyStr;
	}
}
