package control.ifstmt;

import java.util.Scanner;

/**
 * 세 정수를 입력받아서
 * 그 중 가장 작은  정수를 판별하는 클래스
 * @author PC38221
 *
 */
public class MinOfThree {
	public static void main(String[] args) {
		int x,y,z;
		int min;
		Scanner scan;
		
		scan = new Scanner(System.in);
		System.out.println("enter to 3 integer");
		
		x = scan.nextInt();
		y = scan.nextInt();
		z = scan.nextInt();
		
		if(x < y) {
			if(x < z) {
				min = x;
			}
			else {
				min = z;
			}
		}
		else {
			if(y < z) {
				min = y;
			}
			else {
				min = z;
			}
		}
		
		System.out.println("min = "+ min);
	}
}
