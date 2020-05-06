<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<title>customersList.jsp</title>
</head>
<body>
	<jsp:include page="header.jsp"></jsp:include>
	<br />
	<div>
		<table>
			<tr>
				<th>아이디</th>
				<th>이름</th>
				<th>권한</th>
				<th>입사일</th>
				<th>성별</th>
				<th>연락처</th>
			</tr>
			<c:forEach var='vo' items='${list }'>
			<tr>
				<td>${vo.id }</td>
				<td>${vo.name }</td>
				<td>${vo.lev }</td>
				<td>${vo.enter }</td>
				<td>${vo.gender }</td>
				<td>${vo.phone }</td>
			</tr>
			</c:forEach>
		</table>
	
	</div>
</body>
</html>