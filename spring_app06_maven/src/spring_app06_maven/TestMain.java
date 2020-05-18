package spring_app06_maven;

import java.sql.Connection;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

public class TestMain {
	public static void main(String[] args) {
		// 직접 호출한다면
//		OracleDAO dao = new OracleDAO();
//		System.out.println(dao);
//		MysqlDAO dao2 = new MysqlDAO();
//		System.out.println(dao2);
		
		// 인터페이스로 만들어놓고 호출한다면
//		CommonDAO dao = new OracleDAO();
//		System.out.println(dao.connect());
//		
//		CommonDAO dao2 = new MysqlDAO();
//		dao2.connect();
//		System.out.println(dao2.connect());
		
		// xml파일을 통해 호출한다면
		BeanFactory factory =
				new XmlBeanFactory(new FileSystemResource("src/connection.xml"));
		CommonDAO dao1 = factory.getBean("oracle", CommonDAO.class);
		Connection conn1 = dao1.connect();
		System.out.println(conn1+" : 커넥션");
		dao1.selectAll();
		
		CommonDAO dao2 = factory.getBean("mysql", CommonDAO.class);
		Connection conn2 = dao2.connect();
		System.out.println(conn2+" : 마이커넥션");
		dao2.selectAll();
	}
}
