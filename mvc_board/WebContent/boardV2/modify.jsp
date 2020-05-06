<%@page import="vo.BoardVO"%>
<%@page import="dao.BoardDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>

<!-- include libraries(jQuery, bootstrap) -->
<link href="https://stackpath.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" rel="stylesheet">
<script src="https://code.jquery.com/jquery-3.4.1.min.js"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<!-- include summernote css/js -->
<link href="https://cdn.jsdelivr.net/npm/summernote@0.8.16/dist/summernote.min.css" rel="stylesheet">
<script src="https://cdn.jsdelivr.net/npm/summernote@0.8.16/dist/summernote.min.js"></script>

<script type="text/javascript">

$(document).ready(function() {
   $('#summernote').summernote({
        height: 300,                 // 에디터 높이
        minHeight: null,             // 최소 높이
        maxHeight: null,             // 최대 높이
        focus: true,                  // 에디터 로딩후 포커스를 맞출지 여부
        lang: "ko-KR",               // 한글 설정
        placeholder: '최대 2048자까지 쓸 수 있습니다'   //placeholder 설정
          
   });
   
   //$('#summernote').summernote('disable');

});
</script>
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
<body>
	<form action="./board.do" name="frm">
		<input type="hidden" name="bno" value="${vo.bno }" />
		<input type="hidden" name="cmd" value="modifyOk"/>
		<div id="container">
			<div id="top">
				<p>
				<h3><textarea name="ti" id="" cols="30" rows="1" >${vo.title}</textarea></h3>
				</p>
			</div>
			<div id="writer">
				<p>
					<span>WRITER : ${vo.writer}</span>
				</p>
			</div>
			<div id="hits">
				<p>
					<span>조회수 : ${vo.hits}</span><br />
					<span>작성일자 : ${vo.regdate}</span>
				</p>
			</div>
			<div id="contents">
				<p>
					<textarea name="ct" id="summernote" cols="45" rows="10" >${vo.contents}</textarea>
				</p>
			</div>
			<div id="button">
				<input type="button" value="취소" onclick="location.href='./board.do?cmd=detail&bno=${vo.bno}'" />
				<a href="./board.do?cmd=modify"><input type="submit" value="확인" /></a> 
				
			</div>
		</div>
	</form>
</body>
</html>