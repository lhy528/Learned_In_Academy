<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>el.jsp</title>
</head>
<body>
<%-- 	EL(Expression Language)
	: JSP에서 저장 객체를 출력할 때 스크립틀릿을 전혀 쓰지 않아도 됨
	<%%>
	: 기본적으로 지원이 되므로 따로 설정 x --%>
	
<!-- 	ex) id 파라미터 값을 가져와서 출력한다면 -->
	<%
		String id = request.getParameter("id");
		out.println(id);
	%>
<!-- 	ex) el코드로 작성한다면 -->
	${param.id}
	
</body>
</html>