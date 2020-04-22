<%@page import="vo.ReBoardVO"%>
<%@page import="dao.ReBoardDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!-- [replyOk.jsp] -->

<%
	String b = request.getParameter("bno");
	String id = "replier01";
	String contents = request.getParameter("retxt");
	out.print(b);
	if(b!=null){
		int bno = Integer.parseInt(b);
		ReBoardDAO dao = new ReBoardDAO();
		ReBoardVO vo = new ReBoardVO();
		
		vo.setId(id);
		vo.setContents(contents);
		vo.setRef(bno);
		
		dao.insertReply(vo);
		response.sendRedirect("detail.jsp?bno="+bno);
	}else{
		response.sendRedirect("list.jsp");
	}

%>