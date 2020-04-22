<%@page import="java.util.Scanner"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>scriptletEx07.jsp</title>
</head>
<body>
	<!--	jsp(java server page) 	<====	 HTML + 자바 로직 ==> 동적인 페이지 구성 가능 -->
	<%
		for (int i = 1; i < 10; i++) {
			out.println("3 * " + i + " = " + 3 * i + "<br>");
		}
	
		for(int i=2; i<10; i++){
			for(int j=1; j<10; j++){
				out.println(
						i + " * " + j +" = "+(i*j)+"<br>");
			}
		}
		Scanner sc = new Scanner(System.in);
		int input =100;
		int sum =0;
		for(int i=1; i<=100; i++){
			sum = sum + i;
		}
		out.println("1부터 100까지의 합은 "+sum+" 입니다" );
	%>

</body>
</html>