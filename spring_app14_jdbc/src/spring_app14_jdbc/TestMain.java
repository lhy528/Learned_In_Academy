package spring_app14_jdbc;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class TestMain {
	public static void main(String[] args) {
		ApplicationContext context = new GenericXmlApplicationContext("app.xml");
		
		DAO d = context.getBean("dao", DAO.class);
		
		// 전체 데이터 조회
		List<EmpDTO> list = d.sellectAll();
		
		for(EmpDTO dto : list) {
			System.out.println("사원번호"+dto.getEmpno()+" 사원이름"+dto.getEname()
				+" sal"+dto.getSal()+" 부서번호"+dto.getDeptno());
		}
	}
}
