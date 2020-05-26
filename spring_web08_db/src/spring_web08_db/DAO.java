package spring_web08_db;

import java.util.List;

public interface DAO { // 공통적인 기능으로 배포하는건데 generic type을 꼭 정해야 하는지?
	public List<DeptDTO> selectAll();
	public DeptDTO selectOne(int no);
	public void insertOne(DeptDTO dto);
	public void updateOne(DeptDTO dto);
	public void deleteOne(int no);
}
