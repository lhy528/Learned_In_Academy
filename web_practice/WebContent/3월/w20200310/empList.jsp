<%@page import="vo.EmpVO"%>
<%@page import="java.util.Vector"%>
<%@page import="dao.EmpDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>사원정보가 표시될 페이지</title>
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
			<th>사원번호</th>
			<th>사원이름</th>
			<th>직책</th>
			<th>매니저번호</th>
			<th>입사일자</th>
			<th>급여</th>
			<th>수당</th>
			<th>부서번호</th>
		</tr>
		
<%
	EmpDAO dao = new EmpDAO();
	Vector<EmpVO> vt = dao.selectAll();
	for(EmpVO vo : vt){
		
%>		
		<tr>
			<td><%=vo.getEmpno() %></td>
			<td><%=vo.getEname() %></td>
			<td><%=vo.getJob() %></td>
			<td><%=vo.getMgr()%></td>
			<td><%=vo.getHiredate().substring(0,10) %></td>
			<td><%=vo.getSal() %></td>
			<td><%=vo.getComm() %></td>
			<td><%=vo.getDeptno() %></td>
		</tr>
	<%
	}
	 %>
	</table>

</body>
</html>