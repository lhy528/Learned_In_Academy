package kr.co.goott.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import kr.co.goott.model.EmpDTO;

public class MysqlDAO implements DAO {

	SqlSession ss;
	public void setSs(SqlSession ss) {
		this.ss = ss;
	}

	@Override
	public List<EmpDTO> getAllData() {
		List<EmpDTO> list = ss.selectList("selectAllData");
		return list;
	}

	@Override
	public EmpDTO getOneByEmpno(int empno) {
		EmpDTO empDto = ss.selectOne("selectOneByEmpno", empno);
		return empDto;
	}

	@Override
	public void insertOneData(EmpDTO empDto) {
		ss.insert("insertOneData", empDto);
	}

	@Override
	public void updateOneData(EmpDTO empDto) {
		ss.update("updateOneData", empDto);
	}

	@Override
	public void deleteOneByEmpno(int empno) {
		ss.delete("deleteOneByEmpno", empno);
	}

}
