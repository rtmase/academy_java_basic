package control.loop;
/**
 * 
 * @author PC38221
 *
 */
public class PrintToTenByFor {
	public static void main(String[] args) {
		int i =0;
		for(i= 0;i<=10;i++) {
			System.out.println(i);
		}
		System.out.println("====================");
		final int FROM = 1; // 상수는 선언과 초기화를 같이해줘야 함
		final int TO = 10;
		for(i = FROM; i<= TO; i++) {
			System.out.println(i);
		}
		System.out.println("====================");
		System.out.println("10 ~ 1 역순 출력");
		for(i = TO ; i >= FROM; i--) {
			System.out.println(i);
		}
	}

}
