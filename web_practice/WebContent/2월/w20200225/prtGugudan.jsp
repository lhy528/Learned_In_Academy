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
		String dan_s = request.getParameter("d1");
		int dan = Integer.parseInt(dan_s.substring(0, 1));
		
		for(int i=1; i<=9; i++){
			out.print(dan+" * "+i+" = "+dan*i+"<br>");
		}
	%>
</body>
</html>