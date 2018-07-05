package control;

import java.util.Scanner;

/**
 * 하나의 정수를 입력받아서 음수인지, 0 인지, 양수인지를
 * 판단하는 클래스
 * -------------------
 * 값의 부호를 판단할 때
 * if ~ else if ~ else 구문을 사용
 * @author PC38221
 *
 */
public class PositiveNegative {
	public static void main(String[] args) {
		int input;
		Scanner scan;
		String result; // 결과 판단을 저장할 변수
		
		scan = new Scanner(System.in);
		System.out.println("enter to integer");
		input = scan.nextInt();
		
		if (input > 0) {
			result = "양수";
		}
		else if(input == 0) {
			result ="0";
		}
		else {
			result = "음수";
		}
		
		System.out.println(input+" 은 "+result+" 입니다.");
	}
}
