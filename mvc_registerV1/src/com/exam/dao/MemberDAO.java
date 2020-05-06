package com.exam.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.Date;

import com.exam.connection.MakeConnection;
import com.exam.dto.MemberDTO;

public class MemberDAO {
	StringBuffer sb = new StringBuffer();
	ResultSet rs = null;
	PreparedStatement pstmt = null;
	Connection conn = null;
	
	public MemberDAO() {
		conn = MakeConnection.getInstance().getConnection();
	} // 생성자로 conn 만들도록
	
	// 회원 존재 여부 체크
	public MemberDTO selectById(String id) {
		sb.setLength(0);
		sb.append("select * from member ");
		sb.append("where memberid = ? ");
		
		MemberDTO member = null;
		
		try {
			pstmt = conn.prepareStatement(sb.toString());
			pstmt.setString(1, id);
			rs = pstmt.executeQuery();
			rs.next();
			
			member = new MemberDTO(rs.getString(1), rs.getString(2), rs.getString(3), toDate(rs.getTimestamp(4)));
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return member;	
	} // selectById() end
	
	private Date toDate(Timestamp date) {
		return date == null ? null : new Date(date.getTime());
	}
	
	public void insert(MemberDTO dto) {
		sb.setLength(0);
		sb.append("insert into member ");
		sb.append("values (?, ?, ?, ?) ");
		
		try { 
			pstmt = conn.prepareStatement(sb.toString());
			pstmt.setString(1, dto.getId());
			pstmt.setString(2, dto.getName()); 
			pstmt.setString(3, dto.getPassword());
			pstmt.setTimestamp(4, new Timestamp(dto.getRegdate().getTime()));
			
			pstmt.executeUpdate();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	
}
