package api.collection;

import java.util.HashSet;
import java.util.Set;

import api.object.Product;
/**
 * 객체를 요소(element)로 저장하는 컬렉션(collrection) 중에서
 * 
 * 1. 중복을 비허용
 * 2. 순서 상관없음
 * 
 * 으로 저장하는 Set 타입을 테스트
 * @author PC38221
 *
 */
public class SetTest {
	public static void main(String[] args) {
		// 1. Set 선언
		Set set;
		
		// 2. Set 초기화 : Set 인터페이스 구현클래스인 HashSet 으로 생성
		set = new HashSet();
		
		// 3. 사용
		// (1) Set 에 아이템 추가
		System.out.println(set.add("1st Item"));
		System.out.println(set.add(2));
		System.out.println(set.add(new Double(3.0)));
		System.out.println(set.add(new Boolean(true)));
		
		// 사용자 정의 타입 객체도 추가
		Product product = new Product("P001", "MS-아크 터치 마우스", 51330, 36);
		System.out.println(set.add(product));
		
		// 동일한 데이터 추가 시도
		System.out.println("=== 동일한 데이터 추가 시도 ===");
		System.out.println(set.add("1st Item"));
		
		// (2) set 내용 출력
		System.out.println("=== Set 의 내용 출력 ===");
		System.out.println(set);
		// set만 쳐도 set의 내용이 출력되는 이유
		// print 계열 메소드에서 객체(object)를 출력하면 toString 이 자동으로 작동
		
		System.out.println("=== for each 로 출력 ===");
		for (Object obj : set) {
			System.out.println(obj);
		}
		
		
	}
}
