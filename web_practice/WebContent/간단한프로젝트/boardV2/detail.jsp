<%@page import="dao.BoardV2_DAO"%>
<%@page import="vo.BoardVO"%>
<%@page import="dao.BoardDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%
	int bno = Integer.parseInt(request.getParameter("bno"));
	BoardDAO dao = new BoardDAO();
	BoardV2_DAO dao2 = new BoardV2_DAO();
	BoardVO vo = dao.getData(bno);
	 
	dao2.raiseHits(bno);
// 	dao.close();
// 	dao2.close();
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>detail.jsp</title>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
<script type="text/javascript">
	$(document).ready(function(){ // document가 준비되어있으면 함수로쓸꺼야~
		$("#delConfirm").on('click', function(){
// 			console.log("click");			
			var flag = confirm("정말 삭제하시겠습니까?");
			if(flag){
				// 창 이동시키기
				location.href="deleteOk.jsp?bno=<%=bno%>";
			}
			
		});	
	});

</script>
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
				<input type="button" value="삭제" id="delConfirm"/>
			</div>
		</div>
	</form>
</body>
</html>