<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
	<title>Home</title>
</head>
<body>
<h1>
	EMPList
</h1>
	<table>
	<c:forEach var="dto" items="${list }">
		<tr>
			<th>EMPNO</th>
			<td>${dto.empno }</td>
		</tr>
		<tr>
			<th>ENAME</th>
			<td>${dto.ename }</td>
		</tr>
		<tr>
			<th>SAL</th>
			<td>${dto.sal }</td>
		</tr>
		<tr>
			<th>DEPTNO</th>
			<td>${dto.deptno }</td>
		</tr>
		</c:forEach>
	</table>
</body>
</html>
