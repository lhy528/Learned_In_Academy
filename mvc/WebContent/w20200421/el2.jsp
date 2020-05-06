<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>el2.jsp</title>
</head>
<body>
	여기야
	<jsp:useBean id="bean" class="bean.MemberBean" scope="request"></jsp:useBean>
	<jsp:getProperty property="id" name="bean"/><br />
	<jsp:getProperty property="pw" name="bean"/>
	<h2>ID : <%=bean.getId() %></h2>
    <h2>PW : <%=bean.getPw() %></h2>
    <hr />
    <h2>ID : ${bean.id}</h2>
    <h2>PW : ${bean.pw}</h2>
   
   
    <!-- scope 찾아오는 순서가 있음 : page, request, session, application -->
    <!-- 빨리 정확하게 찾아오고 싶을 때는 : ~~ + Scope -->
    <h2>ID : ${requestScope.bean.id }</h2>
    <h2>PW : ${requestScope.bean.pw }</h2>
	
<!-- 	scope 찾아오는 순서 : page > request > session > application -->
</body>
</html>