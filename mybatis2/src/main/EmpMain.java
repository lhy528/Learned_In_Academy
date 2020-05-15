package main;

import java.io.IOException;
import java.io.Reader;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import vo.EmpVO;

public class EmpMain {
	public static void main(String[] args) {
		Reader r = null;
		SqlSession ss = null;
		
		try {
			r = Resources.getResourceAsReader("config/SqlMapConfig.xml");			
			SqlSessionFactoryBuilder ssfb = new SqlSessionFactoryBuilder();			
			SqlSessionFactory factory = ssfb.build(r);
			r.close();			
			ss = factory.openSession(true);
			// 셋팅 끝
			
			// EMP 전체 읽어오기
//			List<EmpVO> list = ss.selectList("selectAllEmp");
//			for (EmpVO vo : list) {
//				System.out.println(vo.getEmpno()+" / "+vo.getEname()+" / "+vo.getSal()+" / "+vo.getDeptno());
//				
//			}		
			
			// EMP 한건 읽어오기
//			EmpVO vo = new EmpVO();
//			vo = ss.selectOne("selectOneEmp", 7900);
//			System.out.println(vo.getEmpno()+" / "+vo.getEname()+" / "+vo.getSal()+" / "+vo.getDeptno());
			
			// EMP 하나 추가하기
//			EmpVO vo2 = new EmpVO();
//			vo2.setDeptno(10);
//			vo2.setEmpno(7812);
//			vo2.setEname("HY");
//			vo2.setSal(12000);
//			
//			ss.insert("insertOneEmp", vo2);
			
			// EMP 하나 수정하기
//			EmpVO vo3 = new EmpVO();
//			vo3.setEmpno(7812);
//			vo3.setEname("임학영");
//			vo3.setSal(99999);
//			ss.update("updateOneEmp", vo3);
			
			// EMP 하나 삭제하기
			ss.delete("deleteOneEmp", 7812);
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
