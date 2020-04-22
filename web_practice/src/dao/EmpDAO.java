package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Vector;

import vo.EmpVO;

public class EmpDAO {
	
	final String driver = "oracle.jdbc.driver.OracleDriver";
	final String url = "jdbc:oracle:thin:@localhost:1521:XE";
	final String user = "scott";
	final String password = "tiger";
	
	StringBuffer sb = new StringBuffer();
	
	Connection conn = null;
	PreparedStatement pstmt = null;
	ResultSet rs = null;
	
	public EmpDAO() {
		
		try {
			Class.forName(driver);
			conn = DriverManager.getConnection(url, user, password);
			
			System.out.println(conn);
			
			
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}//생성자 end
	
	public EmpVO selectOne(int empno) {
		
		sb.setLength(0);
		sb.append("select * from emp ");
		sb.append("where empno = ? ");
		
		EmpVO vo = new EmpVO();
		
		try {
			pstmt = conn.prepareStatement(sb.toString());
			pstmt.setInt(1, empno);
			
			rs = pstmt.executeQuery();
			
			rs.next();
			
			vo.setEmpno(rs.getInt(1));
			vo.setEname(rs.getString(2));
			vo.setJob(rs.getString(3));
			vo.setMgr(rs.getInt(4));
			vo.setHiredate(rs.getDate(5));
			vo.setSal(rs.getInt(6));
			vo.setComm(rs.getInt(7));
			vo.setDeptno(rs.getInt(8));
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
		return vo;
	}//selectOne end
	
	public Vector<EmpVO> selectAll() {
		
		sb.setLength(0);
		sb.append("select * from emp");
		
		Vector<EmpVO> list = new Vector<EmpVO>();
		
		
		try {
			pstmt = conn.prepareStatement(sb.toString());
			rs = pstmt.executeQuery();
			
			
			while(rs.next()) {
				
				EmpVO vo = new EmpVO();

				vo.setEmpno(rs.getInt(1));
				vo.setEname(rs.getString(2));
				vo.setJob(rs.getString(3));
				vo.setMgr(rs.getInt(4));
				vo.setHiredate(rs.getDate(5));
				vo.setSal(rs.getInt(6));
				vo.setComm(rs.getInt(7));
				vo.setDeptno(rs.getInt(8));
				
				list.add(vo);
				
				
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		return list;
	}
	
}
