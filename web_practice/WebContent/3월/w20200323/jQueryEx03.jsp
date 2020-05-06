<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>jQueryEx03.jsp</title>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
<script type="text/javascript">
	$(document).ready(function(){
		$("h1").click(function(){
			$(this).html("WoW");

			alert("이벤트 발생중...");

			// 남아있는 효과를 제거
			$(this).off();
		});
	});
</script>

</head>
<body>
	<h1>HELLO</h1>
	<h1>jQuery</h1>
	<h1>WORLD</h1>
</body>
</html>