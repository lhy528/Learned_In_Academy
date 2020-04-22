<%@page import="vo.BoardVO"%>
<%@page import="dao.BoardDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!-- 사용자에게 보여줄 페이지가 아니므로 HTML이 필요 없음
	[writeOk.jsp] 스크립틀릿 열고 주석 달아야 안보임 -->
	
<%
	// 사용자가 입력한 데이터를 브라우저 화면에 출력해보세요
	String writer = request.getParameter("wr");
	String title = request.getParameter("ti");
	String contents = request.getParameter("ct");
	String ip = request.getRemoteAddr(); 
	
	BoardDAO dao = new BoardDAO();
	BoardVO vo = new BoardVO();
	vo.setWriter(writer);
	vo.setTitle(title);
	vo.setContents(contents);
	vo.setIp(ip);
	
	dao.addData(vo);
%>
<div id="button">
				<input type="button" value="목록보기" onclick="location.href='list.jsp'"/>

</div>