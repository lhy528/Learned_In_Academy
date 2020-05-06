<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>write.jsp</title>
<script src="https://code.jquery.com/jquery-3.4.1.js"
	integrity="sha256-WpOohJOqMqqyKL9FccASB9O0KwACQJpFTUBLTYOVvVU="
	crossorigin="anonymous"></script>
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
<style type="text/css">

#container {
	margin: 0 auto;
	width: 300px;
	border: 1px solid black;
	text-align: center;
}

#top {
	text-align: center;
	border-bottom: : 1px solid black;
}

#button {
	margin-bottom: 15px;
}
</style>
</head>
<body>
	<form action="./board.do" name="frm">
			<input type="hidden" name="cmd" value="insert" />
		<div id="container">
			<div id="top">
				<p>
				<h3>하고 싶은 얘기가 있으신가요?</h3>
				</p>
			</div>
			<div id="writer">
				<p>
					<span>WRITER : </span> <input type="text" name="wr" id="wr" />
				</p>
			</div>
			<div id="title">
				<p>
					<span>TITLE : </span><input type="text" name="ti" id="ti" />
				</p>
			</div>
			<div id="contents">
				<p>
					<textarea name="ct" id="summernote" cols="35" rows="20"></textarea>
				</p>
			</div>
			<div id="button">

				<a href="./board.do?cmd=list"> <input type="button" value="목록보기" /></a>
				<input type="submit" value="등록" /> <input type="reset" value="다시쓰기" />
			</div>

		</div>
	</form>
</body>

</html>