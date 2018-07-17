package divider.scope;

public class DividerScopeTest {
	public static void main(String[] args) {
		// 선언
		DividerScope divScope;
		
		// 초기화
		divScope = new DividerScope();
		
		// 사용
		System.out.println("main start");
		
		divScope.level1();
		
		System.out.println("main end");
	}
}
