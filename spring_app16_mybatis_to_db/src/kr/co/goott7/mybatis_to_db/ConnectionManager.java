package kr.co.goott7.mybatis_to_db;

import java.io.IOException;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class ConnectionManager {
	static SqlSessionFactory factory; // 팩토리 하나만 메모리할당시키고 계속 씁시다
	
	public ConnectionManager() {
		try {
			factory = new SqlSessionFactoryBuilder().build(Resources.getResourceAsReader("resource/SqlMapConfig.xml"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	} // 생성자 end
	
	public static SqlSessionFactory getFactory() {
		return factory;
	}
}
