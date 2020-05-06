<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
<meta charset="UTF-8">
<title>Index.jsp</title>
</head>
<body>
	<h1>Index Page</h1>
	<c:if test="${empty authUser }"> 
		<div>
			<a href="./login.do"><span>로그인하기</span></a>
			<a href="./join.do"><span>회원가입하기</span></a>
		</div>
	</c:if>
	<c:if test="${!empty authUser }">
		<div>
			<h2>${authUser.name } 님 환영합니다.</h2>
			<a href="./logout.do"><span>로그아웃</span></a>
			<a href="./myPage.do"><span>마이페이지</span></a>
		</div>
	
	</c:if>
</body>
</html>