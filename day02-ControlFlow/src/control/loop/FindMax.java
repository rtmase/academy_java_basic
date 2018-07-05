package control.loop;

import java.util.Scanner;

/**
 * 입력된 자연수 중 최댓값을 찾는 클래스
 * do ~ while 활용
 * @author PC38221
 *
 */
public class FindMax {
	public static void main(String[] args) {
		int input;
		int max = 0;
		Scanner scan = new Scanner(System.in);
		
		
		do {
			System.out.println("enter to integer(but end to 0)");
			input = scan.nextInt();
			if(input > max) {
				max = input;
			}
		} while (input > 0);
		
		System.out.println(max);
	}
}
