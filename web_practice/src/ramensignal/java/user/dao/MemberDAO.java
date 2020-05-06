package ramensignal.java.user.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import ramensignal.java.user.vo.MemberVO;


public class MemberDAO {
	
	final String DRIVER = "oracle.jdbc.driver.OracleDriver";
	final String URL = "jdbc:oracle:thin:@localhost:1521:XE";
	final String USER = "scott";
	final String PASSWORD = "tiger";
	
	StringBuffer sb = new StringBuffer();
	ResultSet rs = null;
	PreparedStatement pstmt = null;
	Connection conn = null;
	
	public MemberDAO() {
		
		try {
			Class.forName(DRIVER);
			conn = DriverManager.getConnection(URL, USER, PASSWORD);
			System.out.println("conn : " + conn);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public void addData(MemberVO vo) {
		
		sb.setLength(0);
		sb.append("insert into JSP_MEMBER ");
		sb.append("values (USER_JOIN_SEQ.nextval, ?, ?, ?, sysdate) ");
		
		try {
			pstmt = conn.prepareStatement(sb.toString());
			pstmt.setString(1, vo.getId());
			pstmt.setString(2, vo.getPw());
			pstmt.setString(3, vo.getName());
			
			pstmt.executeUpdate();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}// addData() ends
	
	
	
	public ArrayList selectAll() {
		
		ArrayList<MemberVO> list = new ArrayList<MemberVO>();
		sb.setLength(0);
		sb.append("select * from JSP_MEMBER ");
		
		try {
			pstmt = conn.prepareStatement(sb.toString());
			
			rs = pstmt.executeQuery();
			
			while(rs.next()) {
				
				MemberVO vo = new MemberVO();
				vo.setMemno(rs.getInt("memno"));
				vo.setId(rs.getString("id"));
				vo.setPw(rs.getString("pw"));
				vo.setName(rs.getString("name"));
				
				list.add(vo);
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return list;
	}// selectAll() ends
	
	
	public boolean isExist(String id, String pw) {
		
		sb.setLength(0);
		sb.append("select * from jsp_member ");
		sb.append("where id = ? and pw = ? ");
		
		boolean isOk = false;
		
		try {
			pstmt = conn.prepareStatement(sb.toString());
			pstmt.setString(1, id);
			pstmt.setString(2, pw);
			
			rs = pstmt.executeQuery();
			
			isOk = rs.next();	
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return isOk;
	}// isExist() ends
	
	
	public boolean isExistById(String id) {
		
		sb.setLength(0);
		sb.append("select * from member ");
		sb.append("where id = ? ");
		
		boolean flag = false;
		
		try {
			pstmt = conn.prepareStatement(sb.toString());
			pstmt.setString(1, id);
			
			rs = pstmt.executeQuery();
			
			flag = rs.next();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return flag;
	}// isExistById() ends
	
	
	
	
}
