package kr.co.goott.dao;

import java.util.List;

import org.springframework.stereotype.Controller;

import kr.co.goott.model.EmpDTO;

@Controller
public interface DAO {
	public List<EmpDTO> getAllData();
	public EmpDTO getOneByEmpno(int empno);
	public void insertOneData(EmpDTO empDto);
	public void updateOneData(EmpDTO empDto);
	public void deleteOneByEmpno(int empno);
}
