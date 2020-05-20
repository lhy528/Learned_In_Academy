package kr.co.goott7.mybatis_to_db;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class TestMain {
	public static void main(String[] args) {
		ApplicationContext context = 
				new GenericXmlApplicationContext("app.xml");
		
		DAO d = context.getBean("dao", DAO.class);
		
		// 전체 데이터 조회
		List<DeptDTO> list = d.selectAll();
		
		for (DeptDTO dto : list) {
			System.out.println(dto.getDeptno()+" / "+dto.getDname()+" / "+dto.getLoc());
		}
		System.out.println("===============================");
		
		// 한 건 조회
//		DeptDTO dto = d.selectOne(10);
//		System.out.println(dto.getDname());
//		System.out.println("==============================");
		
		// 한 건 추가
//		DeptDTO dto2 = new DeptDTO(60, "QA", "SEOUL");
//		d.insertOne(dto2);
		
		// 한 건 수정
//		DeptDTO dto3 = new DeptDTO(60, "부서", "주소");
//		d.updateOne(dto3);
		
		// 한 건 삭제
		d.deleteOne(60);
	}
}
