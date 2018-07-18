package calc;

import static calc.Calculator.*;
/**
 * 산술연산을 하는 클래스
 * @author PC38221
 *
 */
public class CalculatorTest {
	public static void main(String[] args) {
		// 선언
		Calculator calc;
		
		// 초기화 : Calculator 클래스의 모든 생성자 정의를  생략하여 기본생성자가 자동 제공
		calc = new Calculator();
		//non-static 영역의 명시적  초기화 : new 사용
		
		// 사용
		// Calculator 클래스의 add() 메소드
		// (1) static -> non-static : 다른 클래스
		int addresult = calc.add(100, 200);
		System.out.println("100 + 200 = "+ addresult);
		
		// 이 클래스에 있는 add() 를 사용
		// 이 클래스 자신의 객체를 생성 후 사용 가능
		// (2) static -> non-static :같은 클래스
		CalculatorTest cTest = new CalculatorTest();
		cTest.add(10,20);
		
		// 동일 클래스 안의 static 영영끼리의 호출 : 바로 이름 만으로 사용 가능
		// (3) static -> static : 같은 클래스
		subtract(10,20);
		
		// 다른 클래스의 static 영역끼리의 호출 : 앞에 클래스 이름을 명시
		// (4) static -> static : 다른 클래스
		Calculator.subtract(20.0,45.0);
		
		// (5) static import 를 사용하여 마치 내가 가지고 있는 메소드처럼 호출 가능
		Calculator.add(10.0, 20.0); // 원래 맞는 코드
		multiply(10.0, 20.0); // static import를 사용한 코드
		
		
		
		
		
	} // end main
	

	// add 메소드 정의 : non-static 
	public int add(int x, int y) {
		System.out.printf("%d + %d = %d",x, y, x+y);
		return x + y;
	}
	
	// subtract 메소드 정의 : static
	public static int subtract(int x, int y) {
		return x - y;
	}
}
