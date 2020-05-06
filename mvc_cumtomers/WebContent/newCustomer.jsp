<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>newCustomer.jsp</title>
<style type="text/css">
	table, tr, th, td{
	margin : 0 auto;
	text-align: center;
	border : 1px solid black;
	border-collapse:  collapse;
	padding: 20px;
	}
</style>
</head>

<body>
	<table>
		<tr>
			<th>ID</th>
			<th>NAME</th>
			<th>LEVEL</th>
			<th>GENDER</th>
			<th>PHONE</th>
		</tr>
		
		<!-- EL(Expression Language)은 보안이 안좋아요~ JSTL(JSP Standard Tag Library) 쓰세요~~ -->
		<tr>
			<td>${custom.id }</td>
			<td>${custom.name }</td>
			<td>${custom.lev }</td>
			<c:if test="${custom.gender == 1 }">
			<td>남성</td>			 
			</c:if>
			<c:if test="${custom.gender == 2 }">
			<td>여성</td>			
			</c:if>
			<td>${custom.phone }</td>
		</tr>
	</table>
</body>
</html>