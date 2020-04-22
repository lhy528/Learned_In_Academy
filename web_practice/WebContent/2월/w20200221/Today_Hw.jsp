<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>랜덤 메시지</title>
</head>
<body>
	<h2>메세지가 출력됩니다</h2>
	<br>
	<%
		int idx = (int) (Math.random() * 10);
		String[] msg = { "1번", "2번", "3번", "4번", "5번", "6번", "7번", "8번", "9번", "10번" };
	%>
	<h1>
		당신의 메세지는!!!!
		<%=msg[idx]%></h1>
</body>
</html>