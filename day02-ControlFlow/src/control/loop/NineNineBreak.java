package control.loop;
/**
 * 구구단에서 곱셈의 결과가 50이 넘으면 중단
 * break 구문을 for 문과 조합하여 테스트
 * @author PC38221
 *
 */
public class NineNineBreak {
	public static void main(String[] args) {
		
		for(int stage = 2; stage < 10; stage++) {
			// 단의 제목 출력
			System.out.println(stage+"단");
			for(int times =1; times < 10; times++) {
				if(stage * times > 50) {
					break;
				}
				System.out.printf("%d * %d = %d%n",stage,times,stage * times);
			}
			System.out.println("");
		}
		System.out.println("===============================================");
		
		OUT:for(int stage = 2; stage < 10; stage++) {
			// 단의 제목 출력
			System.out.println(stage+"단");
			for(int times =1; times < 10; times++) {
				if(stage * times > 50) {
					break OUT;
				}
				System.out.printf("%d * %d = %d%n",stage,times,stage * times);
			}
			System.out.println("");
		}
	}
}
