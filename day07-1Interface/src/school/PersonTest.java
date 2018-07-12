package school;
/**
 * Person 과 상속관계인 Student 를 테스트하는 클래스
 * @author PC38221
 *
 */
public class PersonTest {
	public static void main(String[] args) {
		// 선언 , 초기화
		//사용 불가	person 클래스를 추상클래스로 변경
		//Person person = new Person("P01", "홍길동", 18);
		
		//다형성 적용 	상위타입의 변수 - 하위 타입의 인스턴스 를 연결
		//표면적으로는 person student 이나 실제 하위 인스턴스 타입에 맞춰서 재정의 해놓은 메소드가 응답
		//재정의를 하지 않을 시 부모 것을 따라 감 ( 가상 메소드 호출)
		/*
		 * Person student = new Student("S02", "홍길동", 18, "도술");
		   Person employee = new Employee("E03", "임꺽정", 40, "농림부");
	       Person teacher = new Teacher("T04", "기러기", 35, "비행");
		 */
		Person[] persons = new Person[3];
		persons[0] = new Student("S02", "홍길동", 18, "도술");
		persons[1] = new Employee("E03", "임꺽정", 40, "농림부");
		persons[2] = new Teacher("T04", "기러기", 35, "비행");
								
		// 사용
		/*
		//System.out.println(person);
		System.out.println(student);
		System.out.println(employee);
		System.out.println(teacher);
		// 암묵적으로 toString() 있는 것
		System.out.println("===================================");
		student.print();
		employee.print();
		teacher.print();
		*/
		for (Person person : persons) {
			person.print();
		}
	}
}
