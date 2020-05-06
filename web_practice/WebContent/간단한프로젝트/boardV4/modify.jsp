<%@page import="vo.BoardVO"%>
<%@page import="dao.BoardDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<%
	int bno = Integer.parseInt(request.getParameter("bno"));
	BoardDAO dao = new BoardDAO();
	BoardVO vo = dao.getData(bno);
// 	out.print(vo.toString());
%>
<meta charset="UTF-8">
<title>modify.jsp</title>
<script type="text/javascript" src="../se2/js/HuskyEZCreator.js" charset="utf-8"></script>
<script type="text/javascript"> 
	var oEditors = [];
	window.onload = function(){
		// 네이버 스마트 에디터 skin
		nhn.husky.EZCreator.createInIFrame({
		 oAppRef: oEditors,
		 elPlaceHolder: "ct",
		 sSkinURI: "../se2/SmartEditor2Skin.html",
		 fCreator: "createSEditor2"
		});

		
	}
	
	function submitForm(elClickedObj) {
		 // 에디터의 내용이 textarea에 적용된다.
		 oEditors.getById["ct"].exec("UPDATE_CONTENTS_FIELD", []);

		 // 에디터의 내용에 대한 값 검증은 이곳에서
		 // document.getElementById("ir1").value를 이용해서 처리한다.

		 try {
		     elClickedObj.form.submit();
		 } catch(e) {}
	}
</script>
<style type="text/css">
#container {
	margin: 0 auto;
	width: 80%;
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

/* #contents { */
/* 	text-align: left; */
/* 	border: 1px solid black; */
/* 	margin: 0 10px; */
/* } */
</style>
</head>
<body>
	<form action="modifyOk.jsp" name="frm">
		<input type="hidden" name="bno" id="bno" value="<%=vo.getBno()%>" />
		<div id="container">
			<div id="top">
				<p>
				<h3><textarea name="ti" id="ti" cols="30" rows="1" ><%=vo.getTitle()%></textarea></h3>
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
					<textarea name="ct" id="ct" cols="70" rows="10" ><%=vo.getContents()%></textarea>
				</p>
			</div>
			<div id="button">
				<input type="button" value="취소" onclick="location.href='detail.jsp?bno=<%=vo.getBno() %>'" />
				<input type="button" value="확인" onclick="submitForm(this)"/> 
				
			</div>
		</div>
	</form>
</body>
</html>