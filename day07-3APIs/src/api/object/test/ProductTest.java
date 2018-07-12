package api.object.test;

import api.object.Product;
/**
 * 매장에서 제품을 생성하고 입출고, 할인가격을 
 * 구하는 등의 기능을 하는 클래스
 * @author PC38221
 *
 */
public class ProductTest {
	public static void main(String[] args) {
		// 선언
		Product prod;
		
		// 초기화
		prod = new Product("P001", "MS-아크 터치 마우스", 51330, 36);
		
		// 사용
		// (1) 제품 상태 출력
		prod.print();
		
		// (2) 20% 할인가는 어떻게 되나
		int dcPrice = prod.discount(20);
		System.out.println("제품 가격 : "+ prod.getPrice() +", 20% 할인된 가격 : " + dcPrice);
		
		// (3) 2개 판매(sell)
		prod.sell(2);
		
		// (4) 상태 출력
		prod.print();
		
		// (5) 10 개 입고
		prod.buy(10);
		
		// (6) 상태 출력
		prod.print();
		
		System.out.println("=======================================");
		//System.out.println(prod.toString());
		System.out.println(prod);
		System.out.println("=======================================");
		
	}
}
