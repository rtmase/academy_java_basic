package control.loop;
/**
 * 1 ~ 100 사이의 홀수의 합을 for 문과 continue 
 * 의 조합으로 구하는 클래스
 * @author PC38221
 *
 */
public class SumOfOdds2 {
	public static void main(String[] args) {
		int sum;
		int i;
		
		for(sum =0, i= 1;i<=100;i++) {
			/*
			if(i%2==0) {
				continue;
			}
			sum += i;
			*/
			if(i%2==0) {
				
			}
			else {
				sum+=1;
			}
		}
		
	}
}
