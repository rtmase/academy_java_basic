package book.mabatis;

import java.io.IOException;
import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class MybatisClient {
	// 멤버 변수 선언
	private static SqlSessionFactory factory; 
	
	// 생성자 선언
	public MybatisClient() {
		String resource = "mybatis-config.xml";
		InputStream inputStream;
		
		try {
			inputStream = Resources.getResourceAsStream(resource);
			factory = new SqlSessionFactoryBuilder().build(inputStream);
			
		} catch (IOException e) {
			System.err.println("mybatis 설정 읽기 오류");
			e.printStackTrace();
		}
	}
	
	public static SqlSessionFactory getFactory() {
		if(factory == null) {
				new MybatisClient();
		}
		
		return factory;
	}
	
	
}
