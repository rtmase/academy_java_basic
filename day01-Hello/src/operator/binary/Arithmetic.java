package operator.binary;

import java.util.Scanner;

/**
 * 이한연산 중 산술연산자를(+, -, *, /, %) 테스트하는 클래스
 * printf를 써서 포맷팅하여 테스트
 * 두정수를 입력을 받아서 입력받은 값으로 사칙연산과 나머지 연산 수행
 * @author PC38221
 *
 */
public class Arithmetic {
	public static void main(String[] args) {
		// 키보드 입력을 쉽게 해주는 스캐너를 사용
		// 1. 선언
		// 정수를 저장할 변수 선언
		int in1;
		int in2;
		
		// 키보드 입력을 쉽게 해주는 스캐너를 사용 
		// 스캐너 변수 선언 Ctrl + Shift + o (자동 import)
		Scanner scan;
		
		// 2 . 초기화
		// 스캐너 변수 초기화
		scan = new Scanner(System.in);
		System.out.println("2 integer input : ");
		in1 = scan.nextInt();
		in2 = scan.nextInt();
		
		System.out.printf("%d + %d = %d\n",in1,in2,in1+in2);
		System.out.printf("%d - %d = %d\n",in1,in2,in1-in2);
		System.out.printf("%d * %d = %d\n",in1,in2,in1*in2);
		System.out.printf("%d / %d = %d\n",in1,in2,in1/in2);
		System.out.printf("%d %% %d = %d\n",in1,in2,in1%in2);
		
		/*
		 * Scanner scan // 선언
		 * scan = new Scanner(); // 초기화 
		 * 
		 * 단 String 은 제외
		 */
	}
}
