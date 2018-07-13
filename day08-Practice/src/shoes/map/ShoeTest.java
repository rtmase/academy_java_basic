package shoes.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import shoes.list.Shoe;

public class ShoeTest {
	public static void main(String[] args) {
		String key = null; 
		
		Map<String, Shoe> shoes = new HashMap<String, Shoe>();
		Set<String> shoesKeys = shoes.keySet();
		
		Shoe nike = new Shoe("S001", "NIKE AIR MAX ADVANTAGE", 280, 62300, "운동화", 200);
		Shoe vans = new Shoe("S002", "STYLE 23 V", 270, 39000, "컨버스화", 100);
		Shoe adidas = new Shoe("S003", "STAN SMITH", 250, 58000, "스니커즈", 50);
		Shoe converse = new Shoe("S004", "CT AS Core", 260, 54000, "컨버스화", 246);
		Shoe adidas1 = new Shoe("S003", "STAN SMITH", 250, 58000, "스니커즈", 0);
		
		
		shoes.put(nike.getShoeCode(), nike);
		shoes.put(vans.getShoeCode(), vans);
		shoes.put(adidas.getShoeCode(), adidas);
		shoes.put(converse.getShoeCode(), converse);
		
		
		
		for (String keys : shoesKeys) {
			System.out.println(shoes.get(keys));
		}
		System.out.println("===============================");
		for (String keys : shoesKeys) {
			if (keys.equals("S003")) {
				System.out.println(shoes.get(keys));
			}
		}
		System.out.println("===============================");
		shoes.replace(adidas.getShoeCode(), adidas, adidas1);
		for (String keys : shoesKeys) {
			if (keys.equals("S003")) {
				System.out.println(shoes.get(keys));
			}
		}
		System.out.println("===============================");
		for (String keys : shoesKeys) {
			if (keys.equals("S003")) {
				key = keys;
			}
		}
		shoes.remove(key);
		for (String keys : shoesKeys) {
			System.out.println(shoes.get(keys));
		}
	}
}
