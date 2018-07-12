package school;
/**
 * 학교 구성원들인 학생, 직원, 교사의 
 * 출결, 수업 기능을 테스트하는 클래스
 * @author PC38221
 *
 */
public class SchoolTest {
	public static void main(String[] args) {
		// 선언, 초기화
		Attendance[] attends = new Attendance[3];
		attends[0] = new Student("S001", "홍길동", 18, "도술");
		attends[1] = new Teacher("T001", "허균", 46, "문학");
		attends[2] = new Employee("E001", "행랑아범", 51, "행랑채");
		
		
		// 사용
		for(Attendance attendance : attends) {
			//모든 구성원의 출결사항 출력
			System.out.println(attendance.attend());
			// 각 구성원은 다시 person 타입이므로 person의 print() 기능을 쓰고 싶다면 강제 형변환
			((Person)attendance).print();
			
			//Employee 는 Lesson 타입은 아니므로 형 검사
			if(attendance instanceof Lesson) {
				// student, teacher 는 lesson 인터페이스도 구현하므로
				// if 조건을 통과하여 lesson() 기능도 사용 할 수 있다.
				String lessonStr = ((Lesson)attendance).lesson();
				System.out.println(lessonStr);
			}
			System.out.println("================================");
		} // end for
	} //method end
}
