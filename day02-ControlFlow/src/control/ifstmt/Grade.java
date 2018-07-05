package control.ifstmt;

import java.util.Scanner;

/**
 * 다중 선택 if 구문을 사용하여 다음의 기준으로
 * 90 A
 * 80~89 B
 * 60~79 C
 * 40~59 D
 * 나머지 F
 * 
 * 입력된 점수에 대해 학점을 계산하는 클래스 작성
 * 
 * 점수 int 타입 변수명 score
 * 학점 char 타입 변수명 grade 을 사용할 것
 * 
 * 출력시 printf 사용
 * @author PC38221
 *
 */
public class Grade {
	public static void main(String[] args) {
		int score;
		char grade;
		Scanner scan;
		
		scan = new Scanner(System.in);
		System.out.println("enter to score");
		score = scan.nextInt();
		
		if(score >= 90) {
			grade = 'A';
		}
		else if((score >= 80) && (score < 90)) {
			grade = 'B';
		}
		else if ((score >= 60) && (score < 80)) {
			grade = 'C';
		}
		else if ((score >= 40) && (score < 60)) {
			grade = 'D';
		}
		else {
			grade = 'F';
		}
		
		System.out.printf("점수는 %d 이고 등급은 %c 입니다 %n",score,grade);
	}
}
