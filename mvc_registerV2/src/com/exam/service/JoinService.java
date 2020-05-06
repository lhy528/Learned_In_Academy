package com.exam.service;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.Date;

import com.exam.connection.ConnectionProvider;
import com.exam.dao.MemberDAO;
import com.exam.dto.MemberDTO;
import com.exam.jdbc.JdbcUtils;

public class JoinService {
	private MemberDAO memberDao = new MemberDAO();
	
	public void join(JoinRequest joinReq)  {
		
		Connection conn = null;
		try {
			conn = ConnectionProvider.getConnection();
			conn.setAutoCommit(false);
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		MemberDTO member = memberDao.selectById(conn, joinReq.getId());
		
		if(member != null) {
			// 현재 같은 id를 가진 회원이 존재함
			JdbcUtils.rollback(conn);
			
			throw new RuntimeException();
		}
				
		memberDao.insert(conn, 
				new MemberDTO(joinReq.getId(), joinReq.getName(), joinReq.getPassword(),
						new Date())
				);
		try {
			conn.commit();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
}












