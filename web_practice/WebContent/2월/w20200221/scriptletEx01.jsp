<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h2>Hello JSP World</h2>
	<%
		out.println("Hello JSP World"); 
	%>
	
	<%
		out.println("이 줄은 자바 프로그램에서 <br/> 출력되고 있습니다");
	%>
	<!-- 스크립틀릿 안에 HTML태그도 적용이 된다? -->
	
	<% out.println("이 줄은 자바프로그램에서") ;%>
	<br/>
	<% out.println("출력되고 있습니다"); %>
	
	<hr/>
	<br/>
	
	<%
		int i = 10;	
	%>
	<!--
		하나의 jsp 파일에서 두개 이상의 스크립틀릿을 사용할 수 있음 
		각 스크립틀릿 간에는 변수가 공유된다
	-->
	<%
		int j = 30;
		int sum = i+j;
	%>
	
	<%
		out.println("i+j = "+sum);
	%>
	

</body>
</html>









