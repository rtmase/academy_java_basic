package eraser.one;
/**
 * 칠판 지우개를 정의하는 클래스
 * 
 * 칠판 지우개의 속성을 정의하기 위해
 * 가로 : width : double
 * 세로 : height : double
 * 높이 : depth : double
 * 겹 : layer : int
 * 네 개의 멤버 변수를 선언
 * 
 * 기본 생성자 : 매개변수를 받지 않는  생성자
 * 매개 변수를 받는 생성자 두개를 정의
 * 매개변수를 받는 생성자는 네 개의 필드 모두에 대해서 매개변수를 받도록 정의한다.
 * 
 * 칠판 지우개의 상태를 출력 : print() : void
 * 지우개의 한 겹을 제거 : peel() : void 
 * @author PC38221
 *
 */
public class Eraser {
	// 멤버 변수
	/** 가로 */
	double width;
	/** 세로 */
	double height;
	/** 높이 */
	double depth;
	/** 겹 */
	int layer;
	
	// 기본 생성자
	Eraser() {}
	// 멤버 변수를 갖는 생성자
	Eraser(double newWidth, double newHeight, double newDepth, int newLayer) {
		this.width = newWidth;
		this.height = newHeight;
		this.depth = newDepth;
		this.layer = newLayer;
	}
	
	/**
	 * 칠판 지우개의 상태를 출력
	 */
	public void print()	{
		System.out.printf("가로 : %2.2f | 세로 : %2.2f | 높이 : %2.2f | 겹 : %d%n",width,height,depth,layer);
	}
	/**
	 * 칠판 지우개의 한 겹을 제거
	 * @param layer
	 */
	public void peel() {
		if ( layer - 1 >= 0 ) {
			layer -= 1;
		}
	}
}
