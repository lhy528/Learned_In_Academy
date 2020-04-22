<%@page import="vo.BoardVO"%>
<%@page import="dao.BoardDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head> 
<meta charset="UTF-8">
<title>modify.jsp</title>
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
	<form action="modifyOk.jsp" name="frm">
		<input type="hidden" name="bno" value="<%=bno%>" />
		<div id="container">
			<div id="top">
				<p>
				<h3><textarea name="ti" id="" cols="30" rows="1" ><%=vo.getTitle()%></textarea></h3>
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
					<textarea name="ct" id="" cols="45" rows="10" ><%=vo.getContents()%></textarea>
				</p>
			</div>
			<div id="button">
				<input type="button" value="취소" onclick="location.href='detail.jsp?bno=<%=bno %>'" />
				<a href="modifyOk.jsp"><input type="submit" value="확인" /></a> 
				
			</div>
		</div>
	</form>
</body>
</html>