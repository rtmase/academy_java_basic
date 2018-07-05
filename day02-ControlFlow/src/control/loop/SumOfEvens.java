package control.loop;
/**
 * 1 ~ 100 사이의 짝수의 합을 계산하는 클래스
 * while 구문을 활용
 * @author PC38221
 *
 */
public class SumOfEvens {
	public static void main(String[] args) {
		int num =0, sum =0;
		
		while(num<=100) {
			num++;
			if(num%2==0) {
				sum += num;
				//System.out.println(num);
			}
		}
		System.out.println(sum);
	}
}
