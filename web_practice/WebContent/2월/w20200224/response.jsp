<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>response.jsp</title>
<script>
	function naver() {
		location.href="http://www.naver.com";
	}
</script>
</head>
<body>
	<h2>네이버로 페이지 이동하기</h2>
	<a href="https://www.naver.com"><input type="button" value="네이버로" /></a>
	<input type="button" value="네이버로2" onclick="naver()" />
	<%
		response.sendRedirect("https://www.naver.com");
	%>
	
</body>
</html>