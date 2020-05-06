<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>jstlEx03.jsp</title>
</head>
<body>

	<c:set var="visitor" value="0" scope="session"></c:set>
	<jsp:forward page="jstlEx03Sub.jsp"></jsp:forward>

</body>
</html>