package exception;

import java.util.Scanner;

/**
 * 입력값에 따라 0으로 나누는 상황이 발생할 수 있는
 * Divider 클래스를 테스트
 * 
 * 테스트 과정에서 DivideZeroException을 
 * try ~ catch 구문으로 처리
 * @author PC38221
 *
 */
public class DividerTest {
	public static void main(String[] args) {
		// 선언
		Scanner scan;
		int input;
		Divider div;
		
		// 초기화
		scan = new Scanner(System.in);
		
		System.out.println("enter to integer");
		input = scan.nextInt();
		
		div = new Divider();
		
		try {
			int result = div.divide(input);
			System.out.println("나눗셈 성공 : " + result);
			
		} catch (DivideZeroException e) {
			System.err.println("나눗셈 실패 : " + e);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		System.out.println("프로그램 종료");
		
	}
}
