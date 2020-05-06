<%@page import="vo.DeptVO"%>
<%@page import="java.util.Vector"%>
<%@page import="dao.DeptDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>부서정보가 노출될 페이지</title>
<style type="text/css">
	table{
		width: 600px; 
		margin: 0 auto;
	}
	table, tr, th, td{
		border: 1px solid black;
		border-collapse: collapse;
		text-align: center;
	}
	th{
		background-color: #aaa;
	}
</style>
</head>
<body>
	<table>
		<tr>
			<th>부서번호</th>
			<th>부서이름</th>
			<th>부서위치</th>
		</tr>
		
<% 
	DeptDAO dao = new DeptDAO();
	Vector<DeptVO> vt = dao.selectAll();
	for(DeptVO vo : vt){
		
%>
		<tr>
			<td><%=vo.getDeptno() %></td>
			<td><%=vo.getDname() %></td>
			<td><%=vo.getLoc() %></td>
		</tr>
<%
	}

%>
	</table>
</body>
</html>




