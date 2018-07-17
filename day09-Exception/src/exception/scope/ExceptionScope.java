package exception.scope;
/**
 * level1() -> level2() -> level3()
 * 의 순서로 메소드 호출이 일어나는 클래스
 * 
 * level3() 메소드 안에는 0으로 나누는 상황이 발생할 수 있는 연산을 수행
 * 
 * level3() 에서 발생하는 예외가 메소드 호출의 반대로 순서로 전파되는 것을 확인
 * 
 * @author PC38221
 *
 */
public class ExceptionScope {
	
	public void level3(int input) {
		int current = 1;
		System.out.println("== level3 이 시작 ==");
		current = current / input;
		System.out.println("== level3 이 종료 ==");
	}
	
	public void level2() {
		System.out.println("== level2 이 시작 ==");
		level3(0);
		System.out.println("== level2 이 종료 ==");
	}
	
	public void level1() {
		System.out.println("== level1 이 시작 ==");
		try {
			level2();
		} catch (ArithmeticException e) {
			System.err.println("문제 발생! : "+ e.getMessage());
			e.printStackTrace();
		}
		
		System.out.println("== level1 이 종료 ==");
	}
}
