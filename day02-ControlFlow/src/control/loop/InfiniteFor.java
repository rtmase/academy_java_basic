package control.loop;
/**
 * for 반복구조에서 선언식, 조건식, 증감식이 생략된 구문을 무한반복을 테스트
 * @author PC38221
 *
 */
public class InfiniteFor {
	public static void main(String[] args) {
		int i = 0;
		
		for(i = 0 ; ; i++) {
			System.out.println("무한반복");
		}
	}
}
