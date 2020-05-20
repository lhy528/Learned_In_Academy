package spring_app12_conn;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class TestMain {
	public static void main(String[] args) {
		/*
		ApplicationContext context = new ClassPathXmlApplicationContext("app.xml");
		
		OracleDAO dao = context.getBean("oracle", OracleDAO.class);
		System.out.println("dept 테이블의 총 row 수: "+dao.selectCount());
		*/
		
		ApplicationContext context = new GenericXmlApplicationContext("app.xml");
		
		MysqlDAO dao = context.getBean("dao", MysqlDAO.class);
		//dao.init();
		System.out.println("dept 테이블의 총 row 수: "+dao.selectCount());
		//dao.close();
		// 객체를 호출하면 처음과 끝이? 나옴? 뭐 그래서 하여간 저 init(), close()는 필요 없다.
		
		
	}
}
