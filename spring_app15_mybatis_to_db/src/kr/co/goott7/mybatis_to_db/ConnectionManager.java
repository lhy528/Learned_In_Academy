package kr.co.goott7.mybatis_to_db;

import java.io.IOException;
import java.io.Reader;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class ConnectionManager {
	// SqlSession <===> Connection
	static SqlSessionFactory factory;
	
	static { // static{} : ConnectionManager가 메모리에 로딩될 때 같이 실행되는 부분(생성자는 new를 해야 올라가는데 이건 new 안해도 메모리에 올라감?)
		try {
			Reader r =
					Resources.getResourceAsReader("resource/SqlMapConfig.xml");
			
			SqlSessionFactoryBuilder builder = new SqlSessionFactoryBuilder();
			factory = builder.build(r);
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	} // static{} end
	
	public static SqlSessionFactory getFactory() {
		return factory;
	}
	
}
