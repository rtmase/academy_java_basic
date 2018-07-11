package inheritance.basic.person;
/**
 * Person 과 상속관계인 Student 를 테스트하는 클래스
 * @author PC38221
 *
 */
public class PersonTest {
	public static void main(String[] args) {
		// 선언 , 초기화
		// Person person = new Person("P01","홍길동", 18);
		Person person = new Person("P01", "홍길동", 18);
		Student student = new Student("S02", "홍길동", 18, "도술");
		Employee employee = new Employee("E03", "임꺽정", 40, "농림부");
		Teacher teacher = new Teacher("T04", "기러기", 35, "비행");
		
		
		
		
		
		// 사용
		System.out.println(person);
		System.out.println(student);
		System.out.println(employee);
		System.out.println(teacher);
		
	}
}
