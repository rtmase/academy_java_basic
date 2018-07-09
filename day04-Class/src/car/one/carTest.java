package car.one;
/**
 * 자동차 라는 타입의 실제 객체를 생성하고 테스트하는 클래스
 * @author PC38221
 *
 */
public class carTest {
	public static void main(String[] args) {
		// Car 라는 타입의 객체를 사용하기 위한 변수가 필요함
		// 1. 선언 
		Car mycar;
		// 2. 초기화
		mycar = new Car();
		// 3. 사용 : Car 타입 안에 정의된 메소드를 호출
		System.out.println("1. 초기 mycar 의 속도");
		mycar.print();
		
		System.out.println("2. 100 만큼 가속후 속도");
		mycar.accelerate(100);
		mycar.print();
		
		System.out.println("3. 정지 후 속도");
		mycar.stop();
		mycar.print();

	}
}
