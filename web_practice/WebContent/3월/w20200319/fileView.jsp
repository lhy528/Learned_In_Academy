<%@page import="vo.FileUploadTestVO"%>
<%@page import="dao.FileUploadTestDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>fileView.jsp</title>
</head>
<body> 
	<%
		String writer = request.getParameter("writer");
	
		// DB에 접근해서 filepath를 찾아오기
		FileUploadTestDAO dao = new FileUploadTestDAO();
		FileUploadTestVO vo = dao.getData(writer);
	%>
	
	<h2><%=vo.getFilePath() %></h2>
</body>
</html>