package control.loop;
/**
 * 화씨 온도 -> 섭씨온도 변환
 * C = 5/9 * (F-32)
 * 화씨온도 0.0도 에서 10도씩 증가시키면서 100.0도까지 계산
 * 화씨온도 : fah
 * 섭씨온도 : cel
 * 
 * for 구문 사용
 * @author PC38221
 *
 */
public class F2CTable {
	public static void main(String[] args) {
		double fah = 0.0 , cel = 0.0;
		int i = 0;
		
		for (i = 0; i < 10; i++) {
			fah = fah + 10;
			cel = (double)5/9 * (fah - 32);
			System.out.printf("%5.1f F = %4.2f F%n",fah,cel);
		}
	}
}
