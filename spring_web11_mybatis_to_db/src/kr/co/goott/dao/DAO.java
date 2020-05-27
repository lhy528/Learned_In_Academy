package kr.co.goott.dao;

import java.util.List;

import kr.co.goott.dto.DeptDTO;

public interface DAO { // 공통적인 기능으로 배포하는건데 generic type을 꼭 정해야 하는지?
	public List<DeptDTO> selectAll();
	public DeptDTO selectOne(int no);
	public void insertOne(DeptDTO deptDto);
	public void updateOne(DeptDTO deptDto);
	public void deleteOne(int no);
}
