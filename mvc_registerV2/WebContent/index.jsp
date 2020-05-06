<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>index.jsp</title>
</head>
<body>
	<h1>Index Page</h1>
	<c:if test="${empty authUser }">
	<div>
		<a href="./join.do"><span>회원가입하기</span></a>
		<a href="./login.do"><span>로그인하기</span></a>
	</div>
	</c:if>
	
	<c:if test="${!empty authUser}">
		<div>
		<h2>${authUser.name } 님 환영합니다.</h2>
		<a href="./logout.do"><span>로그아웃하기</span></a>
		<a href="./mypage.do"><span>마이페이지</span></a>
		</div>	
	</c:if>
	
</body>
</html>












