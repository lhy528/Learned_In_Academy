<%@page import="java.net.URLEncoder"%>
<%@page import="dao.JSP_MemberDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!-- loginOk -->
<%
	// id, pw 정보를 받아와서 db에 접근한 다음 원래 db에 회원이 있는지 여부 체크
	String id = request.getParameter("id");
	String pw = request.getParameter("pw");
	
	JSP_MemberDAO dao = new JSP_MemberDAO();
// 	boolean flag = dao.isExist(id, pw);
	boolean flag = false;
	
	//회원이면 로그인 기능 --> 쿠키를 통하여 기능 수행
	if(flag){
// 		out.println(id+"! 어서오시게");
		String userId = URLEncoder.encode(id, "UTF-8");
		
		Cookie c = new Cookie("memberLogin",userId);
		c.setMaxAge(60*60*24); // 유효기간 하루
		
		response.addCookie(c);
		response.sendRedirect("loginCk.jsp");
	}else{
		out.println("회원가입 필요");
	}
	
%>