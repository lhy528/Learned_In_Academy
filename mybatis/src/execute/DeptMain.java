package execute;

import java.io.IOException;
import java.io.Reader;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import vo.DeptVO;

public class DeptMain {
	public static void main(String[] args) {
		// JDBC에서 DBMS 연결하려면 connection 객체 필요
		// mybatis에서도 connection 객체가 필요 : SqlSession
				
		// 1. 설정 파일 읽어오기
		Reader r = null; // IO니까 예외가 터지므로 Reader를 전역으로 선언한 것
		SqlSession ss= null;
		
		try {
			r = Resources.getResourceAsReader("config/MapConfig.xml");
//			 System.out.println("r : "+r);
			
			// 2. DB 접근
			// connection	=========	SqlSession		>> 완성품		ex) 자동차
			// 				=========	SqlSessionFactory			ex) 공장
			// 				=========	SqlSessionFactoryBuilder	ex) 인부
			
			// 인부 객체 생성
			SqlSessionFactoryBuilder ssfb = new SqlSessionFactoryBuilder();
			
			// 공장 객체 생성
			SqlSessionFactory factory = ssfb.build(r);
			
			// IO 관련 클래스는 한번 사용하고 나면 닫기(권장)
			r.close();
			
			// 완성 객체(세션) 생성
			ss = factory.openSession(true); // true : autocommit;
//			System.out.println("ss : "+ss);
			
			// DB로부터 데이터를 가져오기
			List<DeptVO> list = ss.selectList("selectAllDept");
			
			// 데이터를 꺼내서 출력
//			for(DeptVO vo : list) {
//				System.out.println(vo.getDeptno()+" / " + vo.getDname()+" / "+vo.getLoc());
//			}
			
			System.out.println("----------------------------------------------------");
			
//			Object obj = ss.selectOne("selectOneByDeptno", 10);
//			DeptVO vo1 = (DeptVO)obj;
//			System.out.println(vo1.getDeptno() + " / "+vo1.getDname()+" / "+vo1.getLoc());
			
			System.out.println("----------------------------------------------------");
			
			// 데이터 한건 입력
//			DeptVO vo2 = new DeptVO();
//			vo2.setDeptno(60);
//			vo2.setDname("QA");
//			vo2.setLoc("GURO");
//			ss.insert("insertOneDept", vo2);
			
			System.out.println("----------------------------------------------------");
			
			// 데이터 한건 수정
//			DeptVO vo3 = new DeptVO();
//			vo3.setDeptno(60);
//			vo3.setDname("CS");
//			vo3.setLoc("GOOTT");
//			
//			ss.update("updateOneDept", vo3);
			
			// 데이터 한건 삭제
			ss.delete("deleteOneDept", 60);
			for(DeptVO vo : list) {
			System.out.println(vo.getDeptno()+" / " + vo.getDname()+" / "+vo.getLoc());
			}
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
