<%@page import="vo.JSP_MemberVO"%>
<%@page import="dao.JSP_MemberDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
		String id = request.getParameter("id");
		String pw = request.getParameter("pw");
		String name = request.getParameter("name");
		String birth = request.getParameter("birth");
		String mp1 = request.getParameter("mp1");
		String mp2 = request.getParameter("mp2");
		String email = request.getParameter("email");
		
// 		out.println(id+" "+pw+" " +name+ " "+birth+" "+mp1+mp2+" "+email);

		// 회원가입 수행 => 데이터베이스에 입력
		JSP_MemberDAO dao = new JSP_MemberDAO();
		JSP_MemberVO vo = new JSP_MemberVO();
		
		vo.setId(id);
		vo.setPw(pw);
		vo.setName(name);
		vo.setBirth(birth);
		vo.setMp("010-"+mp1+"-"+mp2);
		vo.setEmail(email);

	%>

</body>
</html>