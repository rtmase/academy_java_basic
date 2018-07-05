package control.ifstmt;

import java.util.Scanner;

/*
 * bmi = 몸무게/키
 * 15.0 병적인 저체중
 * 15.0~18.5 저체중
 */
public class CalcBMI {
	public static void main(String[] args) {
		double weight,height,BMI;
		String verdict = null;
		
		Scanner scan = new Scanner(System.in);
		System.out.println("enter to weight(kg)");
		weight = scan.nextDouble();
		System.out.println("enter to height(m)");
		height = scan.nextDouble();
		
		BMI = weight/(height*height);
		if(BMI<15.0) {
			verdict = "병적인 저체중";
		}
		else if(BMI>=15.0 && BMI<18.5) {
			verdict = "저체중";
		}
		else if(BMI>=18.5 && BMI<23.0) {
			verdict = "정상";
		}
		else if(BMI>=23.0 && BMI<27.5) {
			verdict = "과체중";
		}
		else if(BMI>=27.5 && BMI<40.0) {
			verdict = "비만";
		}
		else if(BMI>=40.0) {
			verdict = "병적인 비만";
		}
		
		System.out.printf("당신의 BMI는 "+BMI+"이고, "+(String)verdict+"입니다.");
	}
	
}
