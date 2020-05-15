package conn;
// single-tone pattern

import java.io.IOException;
import java.io.Reader;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class ConnectionManager {
	private static ConnectionManager manager;
	private static SqlSessionFactory factory;
	
	private ConnectionManager() {}
	
	public static SqlSessionFactory getFactory() {
		if(factory==null) {
			Reader r;
			try {
				r = Resources.getResourceAsReader("config/SqlMapConfig.xml");
				SqlSessionFactoryBuilder ssfb = new SqlSessionFactoryBuilder();
				factory = ssfb.build(r);
				
				r.close();
				
			} catch (IOException e) {
				e.printStackTrace();
			}
			
		}
		return factory;
	}// getFactory() end
	
	public static ConnectionManager getInstance() {
		if(manager==null) {
			manager = new ConnectionManager();
		}
		return manager;
	}// getInstance() end
}
