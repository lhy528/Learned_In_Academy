package com.exam.handler;

import java.io.IOException;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.exam.service.JoinRequest;
import com.exam.service.JoinService;

public class JoinHandler implements Action{
	private static final String VIEW = "/WEB-INF/view/joinForm.jsp"; // WEB-INF폴더는 웹 규약상 브라우저가 못봄 > MVC1으론 접근불가
	private JoinService joinService = new JoinService();
	
	@Override
	public String process(HttpServletRequest req, HttpServletResponse resp)
			throws SQLException, IOException {
		req.setCharacterEncoding("UTF-8");
		resp.setContentType("text/html;charset=UTF-8");
		if(req.getMethod().equalsIgnoreCase("get")) {
			return processForm(req, resp);
		}else if(req.getMethod().equalsIgnoreCase("post")) {
			return processSubmit(req, resp);
		}else {
			resp.setStatus(HttpServletResponse.SC_METHOD_NOT_ALLOWED);
			return null;
		}
// 지금까진 URI로 간단하게 보냈던 부분을 객체로 만들어서 보내는 작업임(return이 URI에서 메소드로 바뀌었음)
		
	}// process() end
	
	private String processForm(HttpServletRequest req, HttpServletResponse resp) {
		return VIEW;
	} // processForm() end
	
	private String processSubmit(HttpServletRequest req, HttpServletResponse resp) throws IOException{
		JoinRequest joinReq = new JoinRequest();
		req.setCharacterEncoding("UTF-8");
		resp.setContentType("text/html;charset=UTF-8");
		
		joinReq.setId(req.getParameter("id"));
		joinReq.setName(req.getParameter("name"));
		joinReq.setPassword(req.getParameter("password"));
		joinReq.setconfirmPassword(req.getParameter("confirmPassword"));
		
		// 에러 담을 객체 생성
		Map<String, Boolean> errors = new HashMap<String, Boolean>();
		
		// 유효성 검사 수행
		joinReq.validate(errors); // errors = joinReq.validate(errors); 
		
		req.setAttribute("errors", errors);
		
		if(!errors.isEmpty()) { // 유효성검사를 통과 못했으면
			return VIEW; // 리턴되고나면 아랫줄 안읽힘
		}else {
			
			try {
				joinService.join(joinReq);
				return "WEB-INF/view/joinOk.jsp";
			}
			catch(RuntimeException e) {
				errors.put("duplicated", Boolean.TRUE);
				return VIEW;
			}
			
		}
		
	}
}











