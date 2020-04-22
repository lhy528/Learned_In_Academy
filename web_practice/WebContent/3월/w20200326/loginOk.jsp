<%@page import="bean.MemberBean"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>loginOk.jsp</title>
</head>
<body>
	<%
// 		String id = request.getParameter("id"); 
// 		String pw = request.getParameter("pw");	
	
	%>
	
	<%
// 		MemberBean mb = new MemberBean();
// 		mb.setId(request.getParameter("id"));
	%>
<!-- 	jsp action tag : 자바 문법을 태그로 만들어 놓은 것들 -->
<!-- 	jsp 페이지에서 최대한 자바코드를 사용하지 않기 위해 -->

	<jsp:useBean id="vo" class="bean.MemberBean" scope="session"></jsp:useBean>
<!-- 	자동으로 new 해줌 -->
<%-- 	<jsp:setProperty property="id" name="vo" param="id"/> --%>
<!-- 	bean에서 setter를 찾아옴 -->
<%-- 	<jsp:setProperty property="pw" name="vo" param="pw"/> --%>
<!-- 	만약 property와 param(이전 페이지 form에 적혀있는 name 속성값)의 이름이 같다면 -->
<!-- 	개발자가 일일히 매핑할 필요가 없도록 자동으로 찾아줄 수 있음 -->
	<jsp:setProperty property="*" name="vo"/>

	
	<h2>ID : <jsp:getProperty property="id" name="vo"/></h2>
	<h2>PW : <jsp:getProperty property="pw" name="vo"/></h2>

<%-- 	<h2>id : <a href="loginMain.jsp?id=<%=mb.getId() %>"><%=mb.getId() %></a></h2> --%>
<!-- 	페이지 이동 -->
	<%
// 		response.sendRedirect("loginMain.jsp");
	%>
	
	<jsp:forward page="loginMain.jsp"></jsp:forward>
<%-- 	<jsp:forward page="myPage.jsp"></jsp:forward> --%>
<!-- 	최종목적지를 알려주지 않음 : 페이지 주소는 그대로, 내용만 바뀜 -->
	
	
	
	
	
	
	
	
	
	
	

	
	

</body>
</html>