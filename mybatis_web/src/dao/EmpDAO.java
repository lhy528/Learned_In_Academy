package dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import conn.ConnectionManager;
import vo.EmpVO;

public class EmpDAO {
	SqlSession ss = null;
	public EmpDAO() {
		SqlSessionFactory factory = ConnectionManager.getInstance().getFactory();
		ss = factory.openSession(true);
	}
	
	// 전체조회
	public List<EmpVO> selectAllEmp(){
		return ss.selectList("selectAllEmp");
	}
	
	// 개별 조회
	public EmpVO selectOneEmp(int empno) {
		return ss.selectOne("selectOneEmp", empno);
	}
	
	// 한건 추가
	public void insertOneEmp(EmpVO vo) {
		ss.insert("insertOneEmp", vo);
	}
	
	// 한건 수정
	public void updateOneEmp(EmpVO vo) {
		ss.update("updateOneEmp", vo);
	}
	
	// 한건 삭제
	public void deleteOneEmp(int empno) {
		ss.delete("deleteOneEmp", empno);
	}
	
}
