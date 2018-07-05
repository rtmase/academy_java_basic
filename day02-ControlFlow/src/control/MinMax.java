package control;

import java.util.Scanner;

/**
 * 두 정수를 입력받아 둘 중 큰 값, 작은 값을 가려내는 클래스
 * @author PC38221
 *
 */
public class MinMax {
	public static void main(String[] args) {
		int x,y; // 입력받을 변수 선언
		int min,max; // 큰 값, 작은 값 판별하여 저장할 변수
		Scanner scan; // 입력을 받기 위한 스캐너 변수
		
		//스캐너 변수 초기화
		scan = new Scanner(System.in);
		System.out.println("enter to 2 integer");
		//스캐너를 사용해 x,y 변수에 값을 초기화(입력)
		x = scan.nextInt();
		y = scan.nextInt();
		
		// if ~ else 구조를 사용하여 두 값중 큰 값은 max, 작은 값은 min 에 저장
		if(x < y) {
			min = x;
			max = y;
		}
		else {
			min = y;
			max = x;
		}
		
		System.out.println("Min = "+ min + ", Max = "+ max);
	}
}
