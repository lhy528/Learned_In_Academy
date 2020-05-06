package com.exam.handler;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class NullHandler implements Action{
	@Override
	public String process(HttpServletRequest req, HttpServletResponse resp)
			throws SQLException, IOException {
		resp.sendError(HttpServletResponse.SC_NOT_FOUND);
		return null;
	}
}
