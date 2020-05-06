package com.exam.handler;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.exam.dto.UserDTO;
import com.exam.service.LoginService;

public class LoginHandler implements Action{
	
	private static final String FORM_VIEW = "/WEB-INF/view/loginForm.jsp";
	private static final String RETURN_VIEW = "/WEB-INF/view/loginOk.jsp";
	
	private LoginService loginService = new LoginService();
	
	
	@Override
	public String process(HttpServletRequest req, HttpServletResponse resp)
			throws SQLException, IOException {
		if(req.getMethod().equalsIgnoreCase("GET")) {
			return processForm(req, resp);
		}else if(req.getMethod().equalsIgnoreCase("POST")) {
			return processSubmit(req, resp);
		}else {
			resp.setStatus(HttpServletResponse.SC_METHOD_NOT_ALLOWED);
			return null;
		}

	}
	
	private String processForm(HttpServletRequest req, HttpServletResponse resp) {
		return FORM_VIEW;
	}
	
	private String trim(String str) {
		return str == null ? null : str.trim();
	}
	private String processSubmit(HttpServletRequest req, HttpServletResponse resp) {

			try {
				req.setCharacterEncoding("UTF-8");
			} catch (UnsupportedEncodingException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			resp.setContentType("text/html;charset=UTF-8");
			
			String id = req.getParameter("id");
			String password = req.getParameter("password");
			
			Map<String, Boolean> errors = new HashMap<String, Boolean>();
			req.setAttribute("errors", errors);
			
			if(id == null || id.isEmpty()) {
				errors.put("id", Boolean.TRUE);
			}if(password == null || password.isEmpty()) {
				errors.put("password", Boolean.TRUE);
			}if(!errors.isEmpty()) { // 에러가 비어있지 않으면 >> 유효성검사를 통과 못하면
				return FORM_VIEW;
			}else {				
				try {
					UserDTO user = loginService.login(id, password);
					req.getSession().setAttribute("authUser", user);
					
					return RETURN_VIEW;
				}catch(RuntimeException e) {
					errors.put("pwNotEqual", Boolean.TRUE);
					return FORM_VIEW;
				}
			}
			

	}
	
	

}







