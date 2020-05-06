<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!-- [loginOk.jsp] -->
<% 
// 	response.sendRedirect("../../index.jsp"); // 이렇게 이동 못함(RequestDispacher로 가는게 아니라서)
	response.sendRedirect(request.getContextPath()+"/index.jsp");
%>
