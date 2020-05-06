package com.exam.service;

import java.sql.Connection;
import java.sql.SQLException;

import com.exam.connection.ConnectionProvider;
import com.exam.connection.MakeConnection;
import com.exam.dao.MemberDAO;
import com.exam.dto.MemberDTO;
import com.exam.dto.User;

public class LoginService {
	
	private MemberDAO memberDao = new MemberDAO();
	
	public User login(String id, String password) {
		// try~catch~resource
		try(Connection conn = ConnectionProvider.getConnection()){
			MemberDTO member = memberDao.selectById(conn, id);
			
			if(member == null) {
				throw new RuntimeException();
			}
			
			if(!member.matchPassword(password)) {
				throw new RuntimeException();
			}
			
			return new User(member.getId(), member.getName());
			
		}catch (SQLException e) {
			e.getStackTrace();
			throw new RuntimeException();
		}		
	}
	
}















