<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>scriptletEx05.jsp</title>
<style>
	div{font-size: 24px;
		font-family: 고도 B;
		text-shadow: 1px 1px 1px pink;}
</style>
</head>
<body>
	<%
	String name = "홍길동";
	int kor = 90;
	int eng = 95;
	int total = kor+eng;
	double avg = total/2;
	%>
	
	<h1>성적표</h1>
	<div>
		성명 : <%=name %><br>
		국어점수 : <%=kor %><br>
		영어점수 : <%=eng %><br>
		총점 : <%=total %><br>
		평균 : <%=avg %>
	</div>
</body>
</html>