<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>jstlEx03Sub2.jsp</title>
</head>
<body>

	<h2>jstlEx03Sub2.jsp</h2>
	<!-- switch-case 문과 비슷한 문법 -->
	<h1>
		<c:choose>
			<c:when test="${sessionScope.visitor == 0 }">안녕하세요</c:when>
			<c:when test="${sessionScope.visitor == 1 }">안녕</c:when>
			<c:when test="${sessionScope.visitor <= 2 }">하이</c:when>
		</c:choose>
	</h1>
	

</body>
</html>