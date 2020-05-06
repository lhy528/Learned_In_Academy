<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>scriptletEx02.jsp</title>
</head>
<body>
	<%! public String strMethod(){
		return "Hello Jsp World"; 
		}
	
	%>
	<%
		String day = "토";	// 자료형이 String인 str 변수 선언과 동시에 초기화
	%>
	
	<% out.println(strMethod()); %>
	<%= strMethod() %> <br/>
	
	<h2>내일은 <%=day %>요일 입니다</h2>
	<!--  HTML 주석 -->
	<%-- <% 스크립틀릿 주석%> --%>
	
</body>
</html>