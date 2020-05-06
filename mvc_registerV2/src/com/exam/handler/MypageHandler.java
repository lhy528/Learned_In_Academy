package com.exam.handler;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.sql.SQLException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.exam.dto.MemberDTO;
import com.exam.dto.User;
import com.exam.service.MypageEditService;

public class MypageHandler implements Action{
	private static String FORM_VIEW = "/WEB-INF/view/mypage.jsp";
	private static String RETURN_VIEW = "/WEB-INF/view/mypageEditOk.jsp";
	@Override
	public String process(HttpServletRequest req, HttpServletResponse resp)
			throws SQLException, IOException {
		if(req.getMethod().equalsIgnoreCase("get")) {
			return processForm(req, resp);
		}else if(req.getMethod().equalsIgnoreCase("post")) {
			return processSubmit(req, resp);
		}else {
			resp.setStatus(HttpServletResponse.SC_METHOD_NOT_ALLOWED);
			return null;			
		}		
		
	} // process() end
	
	private String processForm(HttpServletRequest req, HttpServletResponse resp) {
		return FORM_VIEW;
	} // processForm() end
	
	private String trim(String str) {
		return str == null ? null : str.trim();
	}
	
	private String processSubmit(HttpServletRequest req, HttpServletResponse resp) {
		try {
			req.setCharacterEncoding("UTF-8");
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}
		resp.setContentType("text/html;charset=UTF-8");
		
		String name = req.getParameter("name");
		String password = req.getParameter("password");
		int result = 0;
		
		User user = (User)req.getSession().getAttribute("authUser");
		MemberDTO member = new MemberDTO();
		member.setId(user.getId());
		member.setName(name);
		member.setPassword(password);
		System.out.println(result);
		
		result = new MypageEditService().mypageEdit(member);
		return RETURN_VIEW;			
	} // processSubmit() end
	
	
	
	
}
