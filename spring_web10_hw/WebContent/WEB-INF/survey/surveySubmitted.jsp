<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>선택 결과(surveySubmitted.jsp)</title>
</head>
<body>
	<h1>당신이 선택한 연예인은</h1>
	<img src="<c:url value="/images/${picked }"></c:url>" alt='선택결과' />
	<h1>입니다</h1>
	
</body>
</html>