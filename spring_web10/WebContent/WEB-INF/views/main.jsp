<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>main.jsp</title>
</head>
<body>
	<h2>main.jsp</h2>
	<img src='<c:url value="/images/spring.png"></c:url>' alt="스프링메인" /> <!-- view resolvers에서 매칭 기준을 정해놨기 때문에 절대주소도 못봄 -->
	
</body>
</html>