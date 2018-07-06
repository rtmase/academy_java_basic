package array.multi;

import java.util.Scanner;

/**
 * 3명의 양궁선수가 맞힌 과녁의 점수를 각각 차시(9차)별로 배열에 입력
 * 전체 합산 점수가 가장 높은 선수의 인덱스와 점수를 출력
 * @author PC38221
 *
 */
public class ArcherScore {
	public static void main(String[] args) {
		int[][] score = new int[3][9];
		int[] sum = new int[3];
		int max = 0,i = 0,j = 0;
		
		Scanner scan = new Scanner(System.in);
		System.out.println("양궁 선수 점수 입력");
		//각 선수별로 과녁 점수를 입력받아 배열에 저장
		for ( i = 0; i < score.length; i++) {
			System.out.println((i+1)+" 번째 점수");
			for ( j = 0; j < score[i].length; j++) {
				score[i][j] = scan.nextInt();
				sum[i] = sum[i] + score[i][j];
			}
		}
		System.out.print("우승 선수 : ");
		for ( i = 0; i < sum.length; i++) {
			if(sum[i]>max) {
					max = sum[i];
					
			}
		}
		for ( i = 0; i < sum.length; i++) {
			if(sum[i]==max) {
				break;
			}
		}
		System.out.println((i+1)+" 번째 선수");
		System.out.println("총점 : "+max);
	}
}
