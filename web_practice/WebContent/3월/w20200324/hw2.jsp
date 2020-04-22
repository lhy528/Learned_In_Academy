<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<style type="text/css">
	div{
		background-color: gray;
		margin: 5px 5px;
		width : 100px;
		height : 100px;
	}
</style>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
<script type="text/javascript">
	$(function(){
		$('div').mouseenter(function(){
			$(this).animate({
				marginLeft : '+=500'
			}, function(){
				$(this).animate({
					marginLeft : '-=500'
				});
			});
		});
	});
</script>
<meta charset="UTF-8">
<title>hw2</title>
</head>
<body>
	<div id="div1"></div>
	<div id="div2"></div>
	<div id="div3"></div>
	<div id="div4"></div>
	<div id="div5"></div>
	<div id="div6"></div>
</body>
</html>