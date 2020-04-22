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
// 		sendMsg.jsp에서 전달된 값을 receiveMsg.jsp에서 요청
		String msg = request.getParameter("msg");
	
	%>
	<h1>전달받은 메시지 : <%=msg %></h1>
</body>
</html>