package control.loop;
/**
 * 1 ~ 100 사이의 홀수의 합을 구하는 클래스
 * while 구문을 활용
 * @author PC38221
 *
 */
public class SumOfOdds {
	public static void main(String[] args) {
		//int num = 0;
		int num = 1;
		int sum = 0;
		
		while(num<=100) {
			
			/*
			num++;
			if(num%2==0){
				continue;
			}
			*/
			//System.out.println(num);
			sum += num;
			num +=2;
		}
		System.out.println(sum);
		
	}
}
