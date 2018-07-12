package api.wrapper;

import static java.lang.Integer.*;
import static java.lang.Double.*;
/**
 * 기본형을 객체형으로 포장하는 포장클래스
 * int : Integer
 * double : Double
 * 두 가지를 테스트하는 클래스
 * @author PC38221
 *
 */
public class IntDoubleWrapper {
	public static void main(String[] args) {
		// (0) 사용할 문자열 변수 선언
		String intInput = "100";
		String doubleInput = "200.0";
		
		// (1) String ---> 기본형
		// (1-1) parseType() : static 메소드 사용하는 방법
		// 선호
		String intFrm = String.format("문자열 [%s] 를 기본형 [%d] 로 변경", intInput, Integer.parseInt(intInput));
		System.out.println(intFrm);
		String dblFrm = String.format("문자열 [%s] 를 기본형 [%f] 로 변경", doubleInput, Double.parseDouble(doubleInput));
		System.out.println(dblFrm);
		
		// static import 를 진행하면 클래스이름을 생략  가능 
		intFrm = String.format("문자열 [%s] 를 기본형 [%d] 로 변경", intInput, parseInt(intInput));
		System.out.println(intFrm);
		dblFrm = String.format("문자열 [%s] 를 기본형 [%f] 로 변경", doubleInput, parseDouble(doubleInput));
		System.out.println(dblFrm);
		
	
		// (1-2) typeValue() : non-static 메소드 사용
		intFrm = String.format("문자열 [%s] 를 기본형 [%d] 로 변경", intInput, new Integer(intInput).intValue());
		System.out.println(intFrm);
		dblFrm = String.format("문자열 [%s] 를 기본형 [%f] 로 변경", doubleInput, new Double(doubleInput).doubleValue());
		System.out.println(dblFrm);
		
		// (2) 기본형 ---> String
		int ten = 10;
		double sixty = 60.0;
		
		String tenStr = new Integer(ten).toString();
		String sixtyStry = new Double(sixty).toString();
		
		// String 변경 확인을 위해 문자열 접합
		tenStr += "입니다.";
		sixtyStry += "입니다.";
		
		System.out.println(tenStr);
		System.out.println(sixtyStry);
		
		// (3) 기본형 <-----> 객체형
		Integer objTen = new Integer(ten);
		Double objSixty = new Double(sixty);
		
		System.out.println(ten + "의 객체 형 데이터 : " + objTen);
		System.out.println(sixty + "의 객체 형 데이터 : " + objSixty);
		
	}
}
