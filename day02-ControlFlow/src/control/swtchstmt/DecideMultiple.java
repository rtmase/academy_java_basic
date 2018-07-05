package control.swtchstmt;

import java.util.Scanner;

/**
 * 입력된 자연수가 3의 배수인지 판별하는 클래스
 * @author PC38221
 *
 */
public class DecideMultiple {
	public static void main(String[] args) {
		int input;
		Scanner scan;
		
		scan = new Scanner(System.in);
		System.out.println("enter to integer");
		input = scan.nextInt();
		
		switch (input%3) {
		case 0:
			System.out.println(input+"은 3의 배수 입니다");
			break;
		case 1:
			//System.out.println(input+"은 3의 배수가 아닙니다");
			//break;
		case 2:
			System.out.println(input+"은 3의 배수가 아닙니다");
			break;
		}
	}
}
