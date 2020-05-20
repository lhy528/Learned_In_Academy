package kr.co.goott7.mybatis_to_db;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

public class MysqlDAO implements DAO{
	
	ConnectionManager cm; // 팩토리를 매번 만들어줘야 하니 한곳에 공통된 코드로 넣고 싶은데
							// 호출해서 사용하려면 어차피 new를 해야 하니 new 대신 스프링 bean으로 만든 상태
							// 스프링 bean으로 만들지 않는다면 그냥 ConnectionManager cm = new ConnectionManager(); 해서 호출해서 써도 됨
							// 근데 그렇게 하면 cm을 new할 때마다 Factory가 새로 생김(메모리낭비)
							// 즉, cm을 한번 호출해서 메모리에 올려놓고 그것만 계속 쓰려는 방법
							// 다만 new해서 쓰더라도 싱글톤으로 하면 괜찮긴 할듯
	

	public void setCm(ConnectionManager cm) {
		this.cm = cm;
	}

	@Override
	public List<DeptDTO> selectAll() {
//		SqlSessionFactory factory = cm.getFactory();
//		
//		SqlSession ss = factory.openSession(true);
//		
//		List<DeptDTO> list = ss.selectList("selectAll"); 아래에 한번에 줄여서!
		
		return cm.getFactory().openSession(true).selectList("selectAll");
	}

	@Override
	public DeptDTO selectOne(int no) {		
		return cm.getFactory().openSession(true).selectOne("selectOneByDeptno", no);
	}

	@Override
	public void insertOne(DeptDTO dto) {
		cm.getFactory().openSession(true).insert("insertOne", dto);
	}

	@Override
	public void updateOne(DeptDTO dto) {
		cm.getFactory().openSession(true).update("updateOneByDeptno", dto);
	}

	@Override
	public void deleteOne(int no) {
		cm.getFactory().openSession(true).delete("deleteOneByDeptno", no);
	}

}
