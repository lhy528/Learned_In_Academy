<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>jstlEx01Sub.jsp</title>
</head>
<body>

	<h2>jstlEx01Sub.jsp</h2>
	<!-- jstlEx -->

	<h2>합 : <c:out value="${requestScope.num1 + requestScope.num2}"></c:out></h2>
	<h2>차 : <c:out value="${requestScope.num1 - requestScope.num2}"></c:out></h2>
	<h2>곱 : <c:out value="${requestScope.num1 * requestScope.num2}"></c:out></h2>
	<h2>비 : <c:out value="${requestScope.num1 / requestScope.num2}"></c:out></h2>



</body>
</html>