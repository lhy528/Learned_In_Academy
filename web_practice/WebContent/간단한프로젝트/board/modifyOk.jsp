<%@page import="vo.BoardVO"%>
<%@page import="dao.BoardDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!-- [modifyOk.jsp] -->
<!-- DB에 접근해서 사용자가 수정한 내용을 저장 -->
<%
	String title = request.getParameter("ti");
	String contents = request.getParameter("ct");
	String bno = request.getParameter("bno");
	
/* 	out.println(title+contents+bno); */

	BoardDAO dao = new BoardDAO(); 
	BoardVO vo = new BoardVO();
	vo.setTitle(title);
	vo.setContents(contents);
	vo.setBno(Integer.parseInt(bno));

	dao.modifyData(vo);
	
	out.println("수정완료");
	response.sendRedirect("detail.jsp?bno="+bno);
%>