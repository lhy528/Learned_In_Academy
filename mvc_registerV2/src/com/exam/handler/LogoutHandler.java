package com.exam.handler;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class LogoutHandler implements Action{
	@Override
	public String process(HttpServletRequest req, HttpServletResponse resp)
			throws SQLException, IOException {
		HttpSession session = req.getSession(false);
		
		if(session!=null) {
			session.invalidate();
		}
		
		resp.sendRedirect(req.getContextPath()+"/index.jsp");
		return null;
	}
}
