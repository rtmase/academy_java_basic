package shoes.list;

import java.util.ArrayList;
import java.util.List;

/**
 * 1. Shoe 타입의 객체를 4개 생성
 * 		shoeCode 는 SH001 과 같이 일련번호 부여
 * 		sheName, size, price, type 등은
 * 		실제로 있는 데이터 인터넷 검색하여 생성
 * 
 * 2. (1) Shoe 타입을 저장할 수 있는 List<Shoe> shoes 를 선언하여
 * 		리스트에 add(shoe) 로 추가
 * 	  (2) Set<Shoe> shoes 를 선언하여 add(shoe)로 추가
 * 	  (3) Map<Shoe> shoes 를 선언하여 put(code, shoe)로 추가
 * 
 * 3. 각 자료구조별 shoes 를 foreach 로 출력
 * 
 * 4. SH003 번 코드로 등록된
 * @author PC38221
 *
 */
public class ShoeTest {
	public static void main(String[] args) {
		Shoe shoees = new Shoe();
		List<Shoe> shoes = new ArrayList<Shoe>();
		
		Shoe nike = new Shoe("S001", "NIKE AIR MAX ADVANTAGE", 280, 62300, "운동화", 200);
		Shoe vans = new Shoe("S002", "STYLE 23 V", 270, 39000, "컨버스화", 100);
		Shoe adidas = new Shoe("S003", "STAN SMITH", 250, 58000, "스니커즈", 50);
		Shoe converse = new Shoe("S004", "CT AS Core", 260, 54000, "컨버스화", 246);
		
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
				shoes.remove(object);
			}
		}
		for(Shoe object : shoes) {
			System.out.println(object);
		}
	}
}
