package spring_app14_jdbc;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

public class MysqlDAO implements DAO{
	
	StringBuffer sb = new StringBuffer();
	private JdbcTemplate jdbcTemplate;
	
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	
	@Override
	public List<EmpDTO> sellectAll() {
		sb.setLength(0);
		sb.append("select * from emp ");
		
		RowMapper<EmpDTO> rm = new RowMapper<EmpDTO>() {
			
			@Override
			public EmpDTO mapRow(ResultSet rs, int rowNum) throws SQLException {
				
				return new EmpDTO(rs.getInt("empno"), rs.getString("ename"), rs.getInt("sal"), rs.getInt("deptno"));
			}
		};// RowMapper end
		
		List<EmpDTO> list = jdbcTemplate.query(sb.toString(), rm);
		
		return list;
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
