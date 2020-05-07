package conn;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import vo.DeptVO;
import vo.EmpVO;

public class ConnTest {
	public static void main(String[] args) {
		SqlSessionFactory factory = ConnectionManager.getInstance().getFactory();
		
//		System.out.println(factory);
		
		SqlSession ss = factory.openSession(true);
		
//		List<DeptVO> list = ss.selectList("selectAllDept");
//		for (DeptVO vo : list) {
//			System.out.println(vo.getDeptno()+" / "+vo.getDname());
//		}

//		EmpVO vo = ss.selectOne("selectOneEmp" , 7900);
//		System.out.println(vo.getEname());
		
	}
}
