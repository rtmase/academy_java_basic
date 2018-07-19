package jdbc.callable;

import static java.sql.Types.VARCHAR;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * JDBC 에서 제공하는 CallableStatement 인터페이스를 테스트하는 클래스
 * 
 * 데이터베이스 내부에 정의되어있는 SP_INSERT_CUSTOMER 를 호출한다.
 * @author PC38221
 *
 */
public class CustomerSpTest {
	
	private static final String URL = "jdbc:oracle:thin:@//127.0.0.1:1521/XE";
	private static final String USER = "SCOTT";
	private static final String PASSWORD = "TIGER";
	private static final String DRIVER = "oracle.jdbc.OracleDriver";
	
	public static void main(String[] args) {
		
		// 0. 필요 객체 선언
		Connection conn = null;
		CallableStatement cstmt = null;
		
		try {
			// 1. 드라이버 로드
			Class.forName(DRIVER);
			
			// 2. 커넥션 맺기
			conn = DriverManager.getConnection(URL, USER, PASSWORD);
			
			// 3. 쿼리 준비
			// (1) call 구문을 스트링 변수 sql 로 작성
			String sql = "{call SP_INSERT_CUSTOMER(?, ?, ?, ?)}";
			
			// (2) 커넥션으로부터 callable 객체를 얻어냄
			cstmt = conn.prepareCall(sql);
			
			// (3) call 구문의 ? 를 매핑(prepareStatement 와 유사)
			// IN MODE 변수 세팅
			cstmt.setString(1, "이동희");
			cstmt.setString(2, "법동");
			cstmt.setString(3, "042-8282-8282");
			
			// OUT MODE 변수 세팅
			cstmt.registerOutParameter(4, VARCHAR);
			
			// 4. 쿼리 실행
			System.out.println("저장 프로시저 : SP_INSERT_CUSTOMER 실행중...");
			cstmt.executeQuery();
			
			// 5. 결과 처리
			String outMsg = cstmt.getString(4);
			System.out.println("프로시저 수행 결과 : " + outMsg);
			
		} catch (ClassNotFoundException e) {
			System.err.println("드라이버 로드 오류");
			e.printStackTrace();
			
		} catch (SQLException e) {
			System.err.println("SQL 수행중 오류");
			e.printStackTrace();
		} finally {
			// 6. 제한 해제
			try {
				if(cstmt != null)
					cstmt.close();
				
				if(conn != null)
					conn.close();
			} catch (SQLException e) {
				System.err.println("자원 해제 오류");
				e.printStackTrace();
			}
			
		}
	}
}
