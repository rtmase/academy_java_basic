package type.primitive;
/**
 * 문자 1개를 저장하는 타입인 char 형 변수에 문자를 
 * 유니코드 표기법으로 저장하여 테스트하는 클래스
 * @author PC38221
 *
 */
public class CharTestUnicode {

	public static void main(String[] args) {
		// 1. 선언, 2. 초기화
		char han = '\ud55c';
		char gul = '\uae00';
		
		// 3. 사용
		System.out.println(han + gul);
		// 99164
		System.out.println(han+ " " + gul);
		// '한' + '글'
		System.out.println(han);
		System.out.println(gul);

	}

}
