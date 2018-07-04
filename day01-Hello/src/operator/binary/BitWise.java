package operator.binary;
/**
 * 비트연산을 수행하는 이항연산자를 테스트하는 클래스
 * &, |, ^
 * @author PC38221
 *
 */
public class BitWise {
	public static void main(String[] args) {
		// 1. 선언, 2. 초기화
		// 0x 로 시작하면 16진수
		// 0 ~ 9, a ~ f 로 값을 표기하는 방식
		int a = 0xf05;
		int b = 0x31a1;
		
		// 3. 사용
		System.out.printf("%x & %x %x%n", a, b, a & b);
		System.out.printf("%x | %x %x%n", a, b, a | b);
		System.out.printf("%x ^ %x %x%n", a, b, a ^ b);
		System.out.printf("~%x = %x%n", a, ~a);
	}
}
