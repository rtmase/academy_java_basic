package exception.scope;
/**
 * 
 * @author PC38221
 *
 */
public class EsceptionScopeTest {
	public static void main(String[] args) {
		// 선언
		ExceptionScope demo;
		
		// 초기화
		demo = new ExceptionScope();
		
		// 사용
		System.out.println("== main method start ==");
		demo.level1();
		System.out.println("== main method end ==");
	}
}
