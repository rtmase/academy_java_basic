package operator.ternary;

import java.util.Scanner;

/**
 * 삼항연산자 (조건식 ? 값1 : 값2) 를 테스트하는 클래스
 * 수학적 절대값 계산을 사용하여 테스트
 * ---------------------------------------
 * 조건식 : 연산 결과는 항상 boolean 타입의 데이터
 * 값1 : 조건식의 결과가 true 일 때 선택되는 값
 * 값2 : 조건식의 결과가 false 일 때 선택되는 값
 * ---------------------------------------
 * 값 1, 값2 의 데이터 타입이 일치해야 한다
 * @author PC38221
 *
 */
public class TernaryTest {
	public static void main(String[] args) {
		// 1. 선언, 2. 초기화
		int x = 10;
		int y = -10;
		
		// x, y 변수에 들어있는 값의 절대값을 저장할 변수
		int absX = (x < 0) ? -x : x;
		int absY = (y < 0) ? -y : y;
		// 3. 사용
		System.out.println("absX = "+ absX);
		System.out.println("absY = "+ absY);
		
		//scanner를 사용해 입력받은 값의 절대값을 구해보자
		// 1. 스캐너, 새 변수 선언
		Scanner scan;
		int z;
		int absZ;
		// 2. 초기화
		scan = new Scanner(System.in);
		System.out.println("input integer: ");
		z = scan.nextInt();
		absZ = (z < 0) ? -z: z;
		System.out.println("absZ = "+ absZ);
		
	}
}
