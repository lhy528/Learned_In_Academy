<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script
  src="https://code.jquery.com/jquery-3.4.1.js"
  integrity="sha256-WpOohJOqMqqyKL9FccASB9O0KwACQJpFTUBLTYOVvVU="
  crossorigin="anonymous"></script>  
<script type="text/javascript">
	$(function(){
		$("#logout").click(function(){
			console.log("클릭됐어요");
			location.href = "./logout.do";
		});
	});
</script>
</head>
<body>
	<jsp:include page="header.jsp"></jsp:include>
	<h1 align="center">로그인 성공한 메인페이지</h1>
	<h2 align="center">아이디 : ${emp.id }, 상태 : ${result }, req의 이름: ${name }</h2>
	<input type="button" value="로그아웃" id="logout"/>
</body>
</html>