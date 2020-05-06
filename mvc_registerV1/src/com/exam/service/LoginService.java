package com.exam.service;

import java.sql.Connection;
import java.sql.SQLException;

import com.exam.connection.MakeConnection;
import com.exam.dao.MemberDAO;
import com.exam.dto.MemberDTO;
import com.exam.dto.UserDTO;

public class LoginService {
	private MemberDAO memberDao = new MemberDAO();
	
	public UserDTO login(String id, String password) {
		// try~catch~resource형태
		MemberDTO member = memberDao.selectById(id);
		try(Connection conn = MakeConnection.getInstance().getConnection()){
			
			if(member == null) {
				throw new RuntimeException();
			}
			if(!member.matchPassword(password)) {
				throw new RuntimeException();
			}
			return new UserDTO(member.getId(), member.getPassword());
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw new RuntimeException();
		}
	}
}
