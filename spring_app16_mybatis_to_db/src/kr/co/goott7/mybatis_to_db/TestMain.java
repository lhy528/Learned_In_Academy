package kr.co.goott7.mybatis_to_db;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class TestMain {
	public static void main(String[] args) {
		ApplicationContext context = 
				new GenericXmlApplicationContext("app.xml");
		DAO d = context.getBean("dao", DAO.class);
		
		List<EmpDTO> list = d.selectAll();
		for (EmpDTO dto : list) {
			System.out.println(dto.getEname()+" / "+dto.getEmpno()+" / "+dto.getSal());
		}
	}
}
