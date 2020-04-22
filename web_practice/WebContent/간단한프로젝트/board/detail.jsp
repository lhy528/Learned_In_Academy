<%@page import="vo.BoardVO"%>
<%@page import="dao.BoardDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html> 
<head>
<meta charset="UTF-8">
<title>detail.jsp</title>
<style type="text/css">
#container {
	margin: 0 auto;
	width: 50%;
	border: 1px solid black;
	text-align: left;
}

#top {
	text-align: center;
	border-bottom: : 1px solid black;
}

#button{
	margin-left: 10px;
	margin-bottom: 15px;
	margin-top: 15px;
}
#writer {

	margin-left: 10px;
	margin-bottom: 15px;
	margin-top: 15px;
}
#hits{

	text-align: right;
	margin-right: 10px;
}

#contents {
	text-align: left;
	border: 1px solid black;
	margin: 0 10px;
}
</style>
</head>
<%
	int bno = Integer.parseInt(request.getParameter("bno"));
	BoardDAO dao = new BoardDAO();
	BoardVO vo = dao.getData(bno);
%>
<body>
	<form action="writeOk.jsp" name="frm">
		<div id="container">
			<div id="top">
				<p>
				<h3><%=vo.getTitle()%></h3>
				</p>
			</div>
			<div id="writer">
				<p>
					<span>WRITER : <%=vo.getWriter()%></span>
				</p>
			</div>
			<div id="hits">
				<p>
					<span>조회수 : <%=vo.getHits()%></span><br />
					<span>작성일자 : <%=vo.getRegdate().substring(0,16)%></span>
				</p>
			</div>
			<div id="contents">
				<p>
					<%=vo.getContents()%>
				</p>
			</div>
			<div id="button">
				<input type="button" value="목록보기" onclick="location.href='list.jsp'" />
				<a href="modify.jsp?bno=<%=bno%>"><input type="button" value="수정" /></a> 
				<a href="deleteOk.jsp?bno=<%=bno%>"><input type="button" value="삭제" /></a>
			</div>
		</div>
	</form>
</body>
</html>