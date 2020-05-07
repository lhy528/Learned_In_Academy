package dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import conn.ConnectionManager;
import vo.DeptVO;

public class DeptDAO {
	// connection =======	SqlSession
	private SqlSession ss = null;
	
	public DeptDAO() {
		SqlSessionFactory factory = ConnectionManager.getInstance().getFactory(); 
		// getInstance()를 하는 이유는 ConnectionManager가 2개 이상 생성되는 것을 방지하기 위해
		ss = factory.openSession(true);
	}
	
	// 전체 조회
	public List<DeptVO> selectAll(){
		return ss.selectList("selectAllDept");
	}
	
	// 개별 조회
	public DeptVO selectOneDept(int deptno) {
		return ss.selectOne("selectOneDept", deptno);
	}
}
