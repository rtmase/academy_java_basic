package type.casting;
/**
 * 숫자형 데이터 사이에 형 변환을 테스트하는 클래스
 * @author PC38221
 *
 */
public class TypeCastingTest {
	public static void main(String[] args) {
		// 1. 선언, 2. 초기화
		double pi = 3.14159265357979323846;
		int number = 100;
		int result;
		
		// (타입)피연산값 <= 피 연산값을 강제 형변환 구문
		result = number + (int)pi;
		
		
		// 3. 사용
		System.out.println(pi);
		System.out.println(number);
		System.out.println("result = " + result);
	}
}
