<%@page import="vo.DeptVO"%>
<%@page import="java.util.List"%>
<%@page import="dao.DeptDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h2>부서 하나의 정보</h2>
	<table>
		<tr>
			<th>부서번호</th>
			<th>부서이름</th>
			<th>부서위치</th>
		</tr>
		<%
			DeptDAO dao = new DeptDAO();
			DeptVO vo = dao.selectOneDept(Integer.parseInt(request.getParameter("deptno")));
		%>				
		<tr>
			<td><%=vo.getDeptno() %></a></td>
			<td><%=vo.getDname() %></td>
			<td><%=vo.getLoc() %></td>
		</tr>

	</table>
</body>
</html>