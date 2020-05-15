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
		int empno = Integer.parseInt(request.getParameter("empno"));
		EmpDAO dao = new EmpDAO();
		dao.deleteOneEmp(empno);	

	%>
	<h1>삭제 성공</h1>
</body>
</html>