package com.exam.service;

import java.sql.Connection;
import java.sql.SQLException;

import com.exam.connection.ConnectionProvider;
import com.exam.dao.MemberDAO;
import com.exam.dto.MemberDTO;

public class MypageEditService {
	MemberDAO dao = new MemberDAO();
	
	public int mypageEdit(MemberDTO member) {
		int result = 0;
		Connection conn;
		try {
			conn = ConnectionProvider.getConnection();
			dao.update(conn, member);
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return result;
	}

}
