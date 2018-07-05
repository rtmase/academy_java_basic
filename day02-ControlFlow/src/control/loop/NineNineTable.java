package control.loop;
/**
 * 중첩 루프를 사용해서 구구단 출력
 * 2 ~ 9 단을 출력
 * 각 단을 시작할 때 단의 제목 출력
 * @author PC38221
 *
 */
public class NineNineTable {
	public static void main(String[] args) {
		int i = 0;
		int j = 0;
		
		for(i=2;i<10;i++) {
			System.out.println(i+" 단");
			for(j=1;j<10;j++) {
				System.out.println(i+" * "+j+" = "+ (i*j));
			}
			System.out.println("");
		}
	}
}

