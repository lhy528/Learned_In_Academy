<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>sendObject.jsp</title>
</head>
<body>
	<jsp:useBean id="bean" class="bean.MemberBean" scope="request"></jsp:useBean>
	<jsp:setProperty property="*" name="bean"/>
	
	<jsp:forward page="el2.jsp"></jsp:forward> 
	
</body>
</html>