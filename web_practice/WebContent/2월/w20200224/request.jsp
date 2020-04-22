<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>request.jsp</title>
</head>
<body>
	<div style="font-size: 24px">
	<%
		out.println("1. "+ request.getRequestURL()+"<br>");
		// URL : 웹 상에서 서비스를 제공하는 각 서버 안에 있는 파일들의 위치
		
		out.println("2. "+ request.getRequestURI()+"<br>");
		// URI : HTTP, 호스트명, 포트번호를 제외한 나머지 정보
		
// 		out.println("3. 사용자로부터 입력을 받을 경우 <br>");
// 		out.println("급여 : "+ request.getParameter("pay")+"<br>");
		out.println("4. 사용자로부터 입력된 값이 여러 개일 경우<br>");
	%>
	<form action="#">
		<input type="text" name="pay" id="" /> <br />
		<input type="text" name="name" id="" /><br />
		<input type="text" name="java" id="" /><br />
		<input type="text" name="jsp" id="" /><br />
		<input type="text" name="spring" id="" /><br />
		<input type="submit" value="확인" />
	</form>
	<%	
		out.println("급여 : "+ request.getParameter("pay")+"<br>");
		out.println("성명 : "+ request.getParameter("name")+"<br>");
		out.println("java : "+ request.getParameter("java")+"<br>");
		out.println("jsp : "+ request.getParameter("jsp")+"<br>");
		out.println("spring : "+ request.getParameter("spring")+"<br>");
		
		// 급여: 20000000, 성명: 홍길동, java: 90, jsp:85, spring:80
	%>
	</div>
	<div>
	
	</div>
</body>
</html>