<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<html>
<head>
<meta charset="UTF-8">
<title>layout.jsp</title>
<link rel="stylesheet" href="../css/layout.css" />
</head>
<body>
	<%
		String pname = "";
		String fno = request.getParameter("fno");
		if (fno == null) {
			pname = "leftContents.jsp";
		}else{
			pname = fno + ".jsp";
		}
	%>
	<div id="container">
		<!-- 		layout.jsp에서 navbar 선택한 페이지가 노출되는 형태로... -->
		<jsp:include page="header.jsp"></jsp:include>
		<jsp:include page="nav.jsp"></jsp:include>
		<jsp:include page="<%=pname %>"></jsp:include>
		<jsp:include page="sidebar.jsp"></jsp:include>
		<jsp:include page="footer.jsp"></jsp:include>
	</div>
</body>
</html>