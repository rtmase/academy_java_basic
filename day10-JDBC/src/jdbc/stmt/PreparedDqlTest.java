package jdbc.stmt;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

/**
 * SCOTT 계정의 EMP 테이블의 내용을 조회하여
 * 데이터베이스 접속을 테스트
 * 
 * 1. 드라이버 로드
 * 2. 커넥션 맺기
 * 3. 쿼리 준비
 * 4. 쿼리 실행
 * 5. 결과 처리
 * 6. 자원 해제
 * @author PC38221
 *
 */

public class PreparedDqlTest {
	
	
	private static final String URL = "jdbc:oracle:thin:@//127.0.0.1:1521/XE";
	private static final String USER = "SCOTT";
	private static final String PASSWORD = "TIGER";
	private static final String DRIVER = "oracle.jdbc.OracleDriver";
	
	public static void main(String[] args) throws SQLException, ClassNotFoundException {
		// 1. 드라이버 로드 : 방법 5 : 클래스를 바로 메모리에 로드
		Class.forName(DRIVER);
		
		// 2. 커넥션 맺기
		Connection conn = DriverManager.getConnection(URL, USER, PASSWORD);
		
		// 3. 쿼리 준비 : empno 의 값을 변경해가며 1명의 정보를 조회
		//emp 테이블에서 사번과 이름 조회 
		System.out.println("조회할 직원의 사번을 숫자 4자리로 입력");
		Scanner scan = new Scanner(System.in);
		//int eno = scan.nextInt();
		String input = scan.nextLine();
		
		String sql = "SELECT e.empno," // 별칭 줄 때 쌍따옴표 쓰지말고 소문자 사용 x   \"empno\"
				+ "  		 e.ename"
				+ "     FROM emp e"
				+ "    WHERE e.empno = ?";
		
		PreparedStatement pstmt = conn.prepareStatement(sql);
		// 안전한 쿼리
		
		// 4. 쿼리 실행
		// PreparedStatment 는 execute 전에 ? 에 해당하는 위치에 각각의 값들을 매핑하는 단계가 추가됨
		pstmt.setString(1, input);
		
		ResultSet result = pstmt.executeQuery();
		
		// 5. 결과 처리 : 반복 수행(DQL 실행 결과는 보통 여러 행이기 때문에)
		// 결과 셋의 정보
		ResultSetMetaData meta = result.getMetaData();
		String empnocol = meta.getColumnName(1);
		String enamecol = meta.getColumnName(2);
		
		System.out.printf("%6s| %6s%n",empnocol, enamecol);
		System.out.println("--------------");
		while (result.next()) {
			int empno = result.getInt("EMPNO");
			String ename = result.getString(2);
			System.out.printf("%6d, %6s%n",empno, ename);
		}
		
		// 6. 자원 해제
		// 순서 : 오픈한 반대 순서
		// result -> stmt -> conn
		if (result != null) {
			result.close();
		}
		
		if (pstmt != null) {
			pstmt.close();
		}
		
		if (conn != null) {
			conn.close();
		}
		
		
	}
	
	
}
