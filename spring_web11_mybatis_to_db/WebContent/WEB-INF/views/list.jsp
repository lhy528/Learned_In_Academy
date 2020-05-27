<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>list.jsp</title>
</head>
<body>
	<h2>list.jsp 입니다</h2>
	<table>
		<tr>
			<th>부서명</th>
			<th>부서번호</th>
			<th>부서위치</th>
		</tr>
		<c:forEach var="i" items="${list }">
		<tr>
			<td>${i.deptno }</td>
			<td>${i.dname }</td>
			<td>${i.loc }</td>
		</tr>
		</c:forEach>
	</table>
	<!-- 
	/insert => insertForm.jsp
	/insertOK ===DB===> insertOK.jsp
	
	cf) /insert (get) ==> insertForm.jsp
		/insert (post) ==> list.jsp
		 -->
		 
		 <a href="/insert">
		 	<input type="button" value="부서정보입력" />
		 </a>
</body>
</html>