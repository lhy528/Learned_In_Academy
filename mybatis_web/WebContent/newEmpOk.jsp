<%@page import="vo.EmpVO"%>
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
<%
	EmpDAO dao = new EmpDAO();
	EmpVO vo = new EmpVO();
	
	vo.setDeptno(Integer.parseInt(request.getParameter("deptno")));
	vo.setEmpno(Integer.parseInt(request.getParameter("empno")));
	vo.setEname(request.getParameter("ename"));
	vo.setSal(Integer.parseInt(request.getParameter("sal")));
	dao.insertOneEmp(vo);
%>

	<h1>등록 완료 : <%=request.getParameter("ename") %></h1>
</body>
</html>