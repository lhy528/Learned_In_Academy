<%@page import="dao.BoardDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	if(request.getParameter("bno")!=null){
	int bno = Integer.parseInt(request.getParameter("bno"));
	BoardDAO dao = new BoardDAO();
	dao.deleteData(bno);
		
	}
	
	response.sendRedirect("list.jsp");
	
%> 