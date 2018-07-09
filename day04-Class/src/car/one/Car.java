package car.one;
/**
 * 자동차라는 타입을 정의하는 클래스
 * 
 * 자동차는 자바가 기본 제공하는 타입이 아님
 * (기본 제공 타입의 예 : String...)
 * 
 * 속성: 현재의 속도
 * 기능: 가속, 정지
 * 
 * 
 * @author PC38221
 *
 */
public class Car {
	// 1. 멤버 변수 선언부 : 상태 저장을 위한 선언
	int velocity;
	// 2. 생성자 선언부 : 초기화를 위한 선언
	
	// 3. 메소드 선언부 : 사용을 위한 (기능)선언
	// (1) 가속 : 가속된 결과 현재 속도가 얼마인지 리턴
	int accelerate(int value) {
		velocity += value;
		return velocity;
	}
	// (2) 정지 : 속도를 완전히 0으로 설정
	void stop () {
		velocity = 0;
	}
	// (3) 현재 차의 상태를 출력
	void print() {
		System.out.println("이 차의 현재 속도는 : "+velocity+" km/h");
	}
	//==================
}
