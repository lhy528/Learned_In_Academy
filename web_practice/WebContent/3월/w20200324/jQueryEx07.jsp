<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>jQueryEx07.jsp</title>
<style type="text/css">
	#div2{
		width: 100px;
		height: 100px;
		background: pink;
		padding: 50px;
	}
</style>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
<script type="text/javascript">
// 	$(document).ready(function(){	});
	// jQuery 버전업이 되면 deprecated되는 것 확인!
	
	$(function(){
		$('h1').click(function(){
// 			console.log('click');
			var length = $('h1').length;
			var html = $('h1').html(); // 내용이 나옴
			
// 			console.dir($('h1'));
// 			console.log(length);
// 			console.log(html);

			// javascript는 innerHTML 효과
			$('#div1').append('<h1>'+length+' : '+html+'</h1>')

		}); // h1 click end
		
		// 빨간 div에 마우스가 오버되면 빨간 div아래에 코로나 조심하세요~ 출력
		$('#div2').on('mouseenter', function(){
			$('body').append("<div>코로나 조심하세요~</div>");
		}).mouseenter(function(){
			$('body').append("<div>코로나 조심하세요~2</div>");			
		});
	});
</script>
</head>
<body>
	<div id="div1">
		<h1>오늘은 화요일</h1>
		
	</div>
	
	<div id="div2">
		
	</div>
</body>
</html>