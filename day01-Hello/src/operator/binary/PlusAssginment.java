package operator.binary;
/**
 * + 연산자를 테스트
 * @author PC38221
 *
 */
public class PlusAssginment {
	public static void main(String[] args) {
		// 1. 선언, 2. 초기화
		int num = 0;
		
		// 3. 테스트
		System.out.println("초기 num : "+ num); 	//0
		
		num += 1;
		
		System.out.println("num += : "+ num); 	//1
		
		num = num + 1;
		
		System.out.println("num = num + 1 : "+ num);	//2
		
		num += num + 1;
		
		System.out.println("num += num + 1 : "+ num);	//5
		
		num *= num * num;
		
		System.out.println("num *= num * num : "+ num);	//125
	}
}
