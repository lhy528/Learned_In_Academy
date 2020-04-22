<%@page import="java.util.Vector"%>
<%@page import="vo.ProductVO"%>
<%@page import="java.util.ArrayList"%>
<%@page import="dao.ProductDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>search</title>
<!-- 일단 상품 이름으로 검색해서 정보를 가져오자. -->
</head>
<body>
	<%
		String pname = request.getParameter("pname");
		ProductVO vo = new ProductDAO().getDataByName(pname);
		
	%>
	<h2>이름 : <%=vo.getPname() %></h2>
	<h2>정보 : <%=vo.getProdesc() %></h2>
	<h2>개수 : <%=vo.getQty() %></h2>
  <img src="<%=vo.getImgfile() %>" alt="상품이미지">
</body>
</html>
