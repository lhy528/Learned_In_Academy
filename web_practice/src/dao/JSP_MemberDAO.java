package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Vector;

import vo.JSP_MemberVO;

public class JSP_MemberDAO {
	final String DRIVER = "oracle.jdbc.driver.OracleDriver";
	final String URL = "jdbc:oracle:thin:@localhost:1521:XE";
	final String USER = "scott";
	final String PASSWORD = "tiger";
	
	StringBuffer sb = new StringBuffer();
	ResultSet rs = null;
	PreparedStatement pstmt = null;
	Connection conn =  null;
	
	public JSP_MemberDAO() {
		try {
			Class.forName(DRIVER);
			
			conn = DriverManager.getConnection(URL, USER, PASSWORD);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
			System.out.println("드라이버 로딩 실패");
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("DB연결 실패");
		}
//		System.out.println("ㅅㄱ");
	}
	
	//멤버 추가
	public int addData(JSP_MemberVO vo) {
		int result = -1;
		sb.setLength(0);
		sb.append("insert into JSP_MEMBER ");
		sb.append("values (JSP_MEMBER_MEMNO_SEQ.nextval, ?, ?, ?, ?, ?, sysdate, ?)");
//		날짜 : 시간의 연속성이 필요할 때 || 문자 : 그날 그날
		try {
			pstmt = conn.prepareStatement(sb.toString());
			pstmt.setString(1, vo.getId());
			pstmt.setString(2, vo.getPw());
			pstmt.setString(3, vo.getName());
			pstmt.setString(4, vo.getBirth());
			pstmt.setString(5, vo.getMp());
			pstmt.setString(6, vo.getEmail());
			result = pstmt.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return result;
	}
	
	public Vector<JSP_MemberVO> selectAll() {
		Vector<JSP_MemberVO> list = new Vector<JSP_MemberVO>();
		sb.setLength(0);
		sb.append("select * from JSP_MemberVO ");
		try {
			pstmt = conn.prepareStatement(sb.toString());
			rs = pstmt.executeQuery();
			
			while(rs.next()) {
				JSP_MemberVO vo = new JSP_MemberVO(rs.getString(8), 
										rs.getString(2), rs.getString(3), 
										rs.getString(4), rs.getString(5), 
										rs.getString(6), rs.getString(7), 
										rs.getInt(1));
				list.add(vo);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		return list;
	}
	
	public void pwChange(String id, String pw) {
		sb.setLength(0);
		sb.append("update jsp_member ");
		sb.append("set pw = ? ");
		sb.append("where id = ? ");
		
		try {
			pstmt = conn.prepareStatement(sb.toString());
			pstmt.setString(1, pw);
			pstmt.setString(2, id);

			pstmt.executeUpdate();
			
			System.out.println("회원정보 수정 완료 DAO");
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
	}
	
	
	//회원 정보 삭제.
	
	//존재하는 회원인지 여부를 확인하는 메소드.(id, pw)
	
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
			
			//rs.next가 있으면 true 없으면 false 다.
			
			isOk = rs.next();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
		return isOk;
	}
	
	// id로만 존재하는 회원인지 여부를 파악하는 메소드
	
	public boolean isExistById(String id) {
		sb.setLength(0);
		sb.append("select * from jsp_member ");
		sb.append("where id = ? ");
		
		boolean flag = false;
		
		try {
			pstmt = conn.prepareStatement(sb.toString());
			pstmt.setString(1, id);

			
			rs = pstmt.executeQuery();
			
			//rs.next가 있으면 true 없으면 false 다.
			
			flag = rs.next();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		return flag;
	}
	
	
	
	
	
}
