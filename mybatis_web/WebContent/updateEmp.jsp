
<%@page import="vo.EmpVO"%>
<%@page import="java.util.List"%>
<%@page import="dao.EmpDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h2>사원정보수정수정</h2>
	<form action="updateEmpOk.jsp">
	<table>
		<tr>
			<th>사원번호</th>
			<th>사원이름</th>
			<th>급여</th>
			<th>부서번호</th>
		</tr>
		<%
			EmpDAO dao = new EmpDAO();
			EmpVO vo = dao.selectOneEmp(Integer.parseInt(request.getParameter("empno")));

		%>				
		<tr>
			<td><%=vo.getEmpno() %></td>
			<td><input type="text" name="ename" id="" value="<%=vo.getEname() %>"/></td>
			<td><input type="text" name="sal" id="" value="<%=vo.getSal() %>"/></td>
			<td><input type="text" name="deptno" id="" value="<%=vo.getDeptno() %>"/></td>
		</tr>
	</table>
		<input type="hidden" name="empno" value = <%=vo.getEmpno() %> />
		<input type="submit" value="확인" />
		</form>
</body>
</html>