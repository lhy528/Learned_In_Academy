<%@page import="java.util.Vector"%>
<%@page import="vo.ProductVO"%>
<%@page import="dao.ProductDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	// 사용자 입력데이터를 받아서 수행할 페이지
	request.setCharacterEncoding("UTF-8");
	String txt = request.getParameter("txt");
	
	// 검색할 단어를 이용하여 Product 테이블에 있는 정보를 추출
	ProductDAO dao = new ProductDAO();
	
	ProductVO vo = new ProductVO();
	vo = dao.getDataByName(txt);
	
	out.println(vo.getImgfile());
	
%>