<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>jQueryEx04.jsp</title>
<style type="text/css">
	div{
		margin: 10px;
        padding: 10px;
        border: 2px solid black;
	}
</style>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
<script type="text/javascript">
	$(document).ready(function(){
		$("div").click(function(){
			console.dir($(this).get(0));
			console.dir($(this).find('h1').text());
			
			var h1 = $("h1",this);
			var p = $("p", this);
			console.log(h1.text()+p.text());
		});
	});
</script>

</head>
<body>
	<div id="1">
		<h1>HELLO</h1>
		<p>안녕하세요</p>
	</div>
	<div id="2">
		<h1>jQuery</h1>
		<p>제이쿼리</p>
	</div>
	<div id="3">
		<h1>World</h1>
		<p>월드</p>
	</div>
</body>
</html>