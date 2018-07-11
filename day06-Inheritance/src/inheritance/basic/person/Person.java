package inheritance.basic.person;
/**
 * 일반적인 사람의 정보를 저장하는 클래스
 * id : String
 * name : String
 * age : int
 * 
 * 
 * @author PC38221
 *
 */
public class Person {
	String id;
	String name;
	int age;
	
	// 기본 생성자 : 생성자 선언부를 완전히 생략하면 자동으로 기본 생성자 선언이 들어간다.
	Person() {}
	
	// 매개 변수를 받는 생성자가 선언되고, 기본 생성자 선언이 누락된 경우는
	// 자동으로 기본 생성자를 만들어 주지 않는다.
	Person(String id) {
		this.id = id;
	}
	Person(String id, String name) {
		this(id);
		this.name = name;
	}

	Person(String id, String name, int age) {
		this(id, name);
		this.age = age;
	}

	
	// toString() 재정의
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return String.format("아이디 : %s , 이름 : %s , 나이 : %d",id, name, age);
	}

	
	
	
}
