<%@page import="bean.MemberBean"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>loginMain.jsp</title>
</head>
<body>
	<%
// 		MemberBean mb = new MemberBean();
// 		mb.setId(request.getParameter("id"));
// 		mb.setPw(request.getParameter("pw"));
// 		out.print(mb.getId()+"님 환영합니다");
// 		out.print(mb.getPw()+"가 비밀번호입니다");
		
// 		Object obj = session.getAttribute("vo");
// 		if(obj != null){
// // 			out.println(obj);
// 			MemberBean mb = (MemberBean)obj; // 가장 최상위객체에서 멤버빈으로 캐스팅
// 			out.print(mb.getId()+" 아디비번사잇값 "+mb.getPw());
// 			out.print(mb.getPw());
// 		}else{
// 			out.print("안넘어왔어요");
// 		}
		
	%>
	<jsp:useBean id="vo" class="bean.MemberBean" scope="session"></jsp:useBean>
<!-- 	loginOk.jsp에서 scope를 session으로 설정해서 보냈으므로 받는쪽도 session이어야 함 -->
	<h1>ID : <jsp:getProperty property="id" name="vo"/></h1>
	<h1>PW : <jsp:getProperty property="pw" name="vo"/></h1>









	<h2><a href="myPage.jsp">마이페이지</a></h2>
	
	
	
	
	
	
	
	
	
	
</body>
</html>