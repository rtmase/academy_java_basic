package operator.binary;
/**
 * 객체의 타입을 조사하는 연산자
 * instanceof 를 테스트하는 클래스
 * object instanceof class로 사용시 object가 class 타입의 객체이면 true
 * 그 외의 경우는 false 를 결과로 얻어내느 연산자
 * @author PC38221
 *
 */
public class InstanceofTest {
	public static void main(String[] args) {
		String name = "이동희";
		boolean result;
		
		result = (name instanceof String);
		System.out.println("name = " + name + " result = " + result);
		
		//StringBuffer = 문자열을 저장할 수 있는 String과 유사하지만 다른 타입
		StringBuffer surname;
		
		surname = new StringBuffer("Lee");
				
		result = ((Object)surname instanceof String);
		System.out.println("surname = " + surname + " result = " + result);

	}
}
