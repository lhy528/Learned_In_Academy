package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Vector;


import vo.DeptVO;

//DAO : DB에 쉽게 접근하기 위한 객체.
public class DeptDAO {
	final String DRIVER = "oracle.jdbc.driver.OracleDriver";
	final String URL = "jdbc:oracle:thin:@localhost:1521:XE";
	final String USER = "scott";
	final String PASSWORD = "tiger";
	
	StringBuffer sb = new StringBuffer();
	ResultSet rs = null;
	PreparedStatement pstmt = null ;
	
	//객체 호출시 DB접속이 완료 되게 하고픔.
	Connection conn = null;

	public DeptDAO() {
		
		try {
			Class.forName(DRIVER);
			conn = DriverManager.getConnection(URL,USER,PASSWORD);
			System.out.println("연결완료 : " + conn);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("클래스 오류");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("sql오류");
		}
		
		
	}//생성자 end
	
	// 1회 정보 조회. 부서 번호를 입력받아 부서번호, 부서이름, 부서위치 정보를 return
	
	// return 받는 자료형이 int, string 으로 다르므로 (같으면 배열로 리턴)
	// VO객체를 통해서 데이터를 담아 보낸다.
	
	public DeptVO selectOne(int deptno) {
		
		sb.setLength(0);
		//버퍼 내용 지우기.
		
		sb.append("select * from dept ");
		sb.append("where deptno = ? ");
		
		DeptVO vo = null;
		
		try {
			pstmt = conn.prepareStatement(sb.toString());
			pstmt.setInt(1, deptno);
			
			rs = pstmt.executeQuery();
			rs.next();
			
			String dname = rs.getString(2);
			String loc = rs.getString(3);
			
			vo = new DeptVO(deptno, dname, loc);
			
//			또는
//			vo.setDeptno(deptno);
//			vo.setDname(dname);
//			vo.setLoc(loc);
			
			
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		return vo;
		
	}//selectOne end
	
	
	//데이터 추가
	
	public int insertOne(DeptVO vo) {
		sb.setLength(0);
		sb.append("insert into dept ");
		sb.append("values (?,?,?)" );
		
		int result = -1;
		
		try {
			pstmt = conn.prepareStatement(sb.toString());
			pstmt.setInt(1, vo.getDeptno());
			pstmt.setString(2, vo.getDname());
			pstmt.setString(3, vo.getLoc());
			
			result = pstmt.executeUpdate();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return result;
		
		
	}
	
	public void updateOne(DeptVO vo) {
		
//		update dept
//		set 수정
//		where 조건
		
		sb.setLength(0);
		sb.append("update dept ");
		sb.append("set dname = ?, loc = ? ");
		sb.append("where deptno = ? ");
		
		try {
			pstmt = conn.prepareStatement(sb.toString());
			pstmt.setString(1, vo.getDname());
			pstmt.setString(2, vo.getLoc());
			pstmt.setInt(3, vo.getDeptno());
			
			pstmt.executeUpdate();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}//update end
	
	public void deleteOne(int deptno) {
//		delete dept
//		where deptno = ?
		sb.setLength(0);
		sb.append("delete dept ");
		sb.append("where deptno = ? ");
		
		try {
			pstmt = conn.prepareStatement(sb.toString());
			pstmt.setInt(1, deptno);
			
			pstmt.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	//전체 조회.
	
	public Vector<DeptVO> selectAll() {
		
		Vector<DeptVO> list = new Vector<DeptVO>(); 
		
		sb.setLength(0);
		sb.append("select * from dept ");
		
		try {
			pstmt = conn.prepareStatement(sb.toString());
			
			rs = pstmt.executeQuery();
			
			while(rs.next()) {
				int deptno = rs.getInt(1);
				String dname = rs.getString(2);
				String loc = rs.getString(3);
				
				DeptVO vo = new DeptVO();
				vo.setDeptno(deptno);
				vo.setDname(dname);
				vo.setLoc(loc);
				
				list.add(vo);
				
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return list;
	}
	
	
	
}
