package control.loop;

import java.util.Scanner;

public class TotalNAverage {
	public static void main(String[] args) {
		int total = 0;
		int score = 0;
		int count = 0;
		double average;
		
		Scanner scan = new Scanner(System.in);
		System.out.println("enter to score 1~ (but End to 0)");
		score = scan.nextInt();
		while(score != 0) {
			total += score;
			count++;
			System.out.println("enter to score 1~ (but End to 0)");
			score = scan.nextInt();
		}
		if(count == 0) {
			System.out.println("not values");
		}
		else {
			average = (double)total/count;
			System.out.printf("sum = %d%n",total);
			System.out.printf("avg = %5.2f%n",average);
		}
	}
}
