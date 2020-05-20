package kr.co.goott7.mybatis_to_db;

import java.util.List;

public class EmpDAO implements DAO {
	ConnectionManager cm;
	
	public void setCm(ConnectionManager cm) {
		this.cm = cm;
	}

	@Override
	public List<EmpDTO> selectAll() {
		return cm.getFactory().openSession(true).selectList("selectAllEmp");
	}

	@Override
	public EmpDTO selectOne(int no) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void insertOne(EmpDTO dto) {
		// TODO Auto-generated method stub

	}

	@Override
	public void updateOne(EmpDTO dto) {
		// TODO Auto-generated method stub

	}

	@Override
	public void deleteOne(int no) {
		// TODO Auto-generated method stub

	}

}
