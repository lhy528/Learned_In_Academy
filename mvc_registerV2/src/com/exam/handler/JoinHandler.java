package com.exam.handler;

import java.io.IOException;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.exam.service.JoinRequest;
import com.exam.service.JoinService;

public class JoinHandler implements Action {
	
	private static final String VIEW = "/WEB-INF/view/joinForm.jsp";
	private JoinService joinService = new JoinService();	
	
	@Override
	public String process(HttpServletRequest req, HttpServletResponse resp) throws SQLException, IOException {
		if(req.getMethod().equalsIgnoreCase("GET")) {
			return processForm(req, resp);
		}else if(req.getMethod().equalsIgnoreCase("POST")) {
			return processSubmit(req, resp);
		}else {
			resp.setStatus(HttpServletResponse.SC_METHOD_NOT_ALLOWED);
			return null;			
		}		
	}// process() end


	private String processForm(HttpServletRequest req, HttpServletResponse resp) {
		
		return VIEW;
	}

	private String processSubmit(HttpServletRequest req, HttpServletResponse resp) throws IOException {
		
		req.setCharacterEncoding("UTF-8");
		resp.setContentType("text/html;charset=UTF-8");
		
		JoinRequest joinReq = new JoinRequest();
		joinReq.setId(req.getParameter("id"));
		joinReq.setName(req.getParameter("name"));
		joinReq.setPassword(req.getParameter("password"));
		joinReq.setConfirmPassword(req.getParameter("confirmPassword"));
	
		// 에러 담을 객체 생성
		Map<String, Boolean> errors = new HashMap<String, Boolean>();		
		req.setAttribute("errors", errors);
		
		// 유효성 검사 수행
		joinReq.validate(errors);		
		
		if(!errors.isEmpty()) {
			return VIEW;
		}
		
		try {
			joinService.join(joinReq);	
			return "/WEB-INF/view/joinOk.jsp";			
		}catch(RuntimeException e) {
			errors.put("duplicated", Boolean.TRUE);
			return VIEW;
		}
		
		
	}
}













