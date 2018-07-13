package shoes.set;

import java.util.HashSet;
import java.util.Set;

import shoes.list.Shoe;

public class ShoeTest {
	public static void main(String[] args) {
		
		Set<Shoe> shoes = new HashSet<Shoe>();
		
		Shoe nike = new Shoe("S001", "NIKE AIR MAX ADVANTAGE", 280, 62300, "운동화", 200);
		Shoe vans = new Shoe("S002", "STYLE 23 V", 270, 39000, "컨버스화", 100);
		Shoe adidas = new Shoe("S003", "STAN SMITH", 250, 58000, "스니커즈", 50);
		Shoe converse = new Shoe("S004", "CT AS Core", 260, 54000, "컨버스화", 246);
		Shoe copy = null;
		shoes.add(nike);
		shoes.add(vans);
		shoes.add(adidas);
		shoes.add(converse);
		
		for(Shoe object : shoes) {
			System.out.println(object);
		}
		System.out.println("===============================");
		for (Shoe object : shoes) {
			if(object.getShoeCode().equals("S003")) {
				System.out.println(object);
			}
		}
		System.out.println("===============================");
		for (Shoe object : shoes) {
			if(object.getShoeCode().equals("S003")) {
				object.setQuantity(0);
				System.out.println(object);
			}
		}
		System.out.println("===============================");
		for (Shoe object : shoes) {
			if(object.getShoeCode().equals("S003")) {
				copy = object;
			}
		}
		shoes.remove(copy);
		for(Shoe object : shoes) {
			System.out.println(object);
		}
	}
}
