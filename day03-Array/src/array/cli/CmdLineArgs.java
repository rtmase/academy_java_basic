package array.cli;
/**
 * 소스코드 ==> 오른쪽마우스 클릭
 * 		 ==> run as...
 * 		 ==> run configuration..
 *       ==> 명령줄 인수를 적용할 클래스를 왼쪽 목록에서 선택
 *       ==> (x)arguments 탭에 데이터를 빈칸 구분 입력
 *       ==> apply ==> run
 * @author PC38221
 *
 */
public class CmdLineArgs {
	public static void main(String[] args) {
		// main 메소드의 매개변수로 선언이 이미 되어 있는 args 변수를 출력
		for(String input : args) {
			System.out.printf("%s \t",input);
		}
	}
}
