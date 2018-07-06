package array.multi;

import java.util.Scanner;

public class BestPitcher {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		double[][] ERA = new double[3][5];
		double min = 10.0;
		int i = 0, j =0;
		
		// 각 팀별로 각 투수의 방어율 입력받아 배열에 저장한다
		System.out.println("1선발/2선발/3선발/4선발/5선발 방어율 입력");
		for( i = 0; i < ERA.length; i++) {
			System.out.print((i+1)+"번째 팀 1~5선발 투수 방어률 ");
			for( j = 0; j < ERA[i].length ; j++) {
				ERA[i][j] = scan.nextDouble();
			}
			
		}
		System.out.print("최고의 투수의 방어율 : ");
		for( i = 0; i < ERA.length; i++) {
			for( j = 0; j < ERA[i].length ; j++) {
				if(ERA[i][j]<min) {
					min = ERA[i][j];
				}
			}
		}
		for(i = 0; i < ERA.length ; i++	) {
			for(j = 0; j < ERA[i].length; j++) {
				if(min == ERA[i][j]) {
					break;
				}
			}
		}
		
		System.out.println(min);
		System.out.printf("%d팀 %d 번째 투수%n",i+1,j+1);
		
		
	}
}
