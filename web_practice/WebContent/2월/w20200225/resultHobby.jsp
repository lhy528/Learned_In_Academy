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
		String[] str = request.getParameterValues("box");
		for(String hobby : str){
			out.println("취미 : "+hobby+"<br>");
		}
	%>
</body>
</html>