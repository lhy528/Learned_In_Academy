<%@page import="java.net.URLDecoder"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>loginCk.jsp</title>
</head>
<body>
	<%
		Cookie[] clist = request.getCookies();
		String id = null;
		
		if(clist!=null){
			for(Cookie c : clist){
				if(c.getName().equals("memberLogin")){
					id = URLDecoder.decode(c.getValue(), "UTF-8");
				}
			}
		}
	%>
	<h1><%=id %>님 환영합니다.</h1>
	<a href="logout.jsp">로그아웃</a>
</body>
</html>