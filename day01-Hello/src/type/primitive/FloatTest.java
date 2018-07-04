package type.primitive;
/**
 * 실수형 탕ㅂ인 float,double 타입을 테스트하는 클래스
 * @author PC38221
 *
 */
public class FloatTest {

	public static void main(String[] args) {
		// 1. 선언
		float pi1;
		double pi2;
		
		// 2. 초기화
		pi1 = 3.14F;
		pi2 = 3.14; // -- double 타입이 default
		
		// 3. 사용
		System.out.println("flaot = " + pi1);
		System.out.println("double = " + pi2);
		
		pi1 = 3.14159265357979323846F;
		pi2 = 3.14159265357979323846; // -- double 타입이 default
		
		// 3. 사용
		System.out.println("flaot = " + pi1);
		System.out.println("double = " + pi2);
	}

}
