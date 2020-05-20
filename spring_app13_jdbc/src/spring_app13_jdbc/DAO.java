package spring_app13_jdbc;

import java.util.List;

public interface DAO {
	public List<DeptDTO> sellectAll();
	public DeptDTO selectOne(int no);
	public void insertOne(DeptDTO dto);
	public void updateOne(DeptDTO dto);
	public void deleteOne(int no);
}
