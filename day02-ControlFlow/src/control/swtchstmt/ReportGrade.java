package control.swtchstmt;

import java.util.Scanner;

/**
 * 90 A
 * 80~89 B
 * 60~79 C
 * 40~59 D
 * 나머지 F 
 * @author PC38221
 *
 */
public class ReportGrade {
	public static void main(String[] args) {
		int score;
		char grade=0;
		Scanner scan;
		
		scan = new Scanner(System.in);
		System.out.println("enter to score(0~100)");
		score = scan.nextInt();
		
		switch (score) {
		case 100:
		case 90:
			grade = 'A';
			break;
		case 80:
			grade = 'B';
			break;
		case 60:
			grade = 'C';
			break;
		case 40:
			grade = 'D';
			break;
		case 0:
			grade = 'F';
			break;
		default:
			System.out.println("0~100점 사이로 입력하세요");
			break;
		}
		//if(score >=0 && score <100)
			System.out.printf("%d 의 등급은 %c 입니다",score,grade);
	}
}
