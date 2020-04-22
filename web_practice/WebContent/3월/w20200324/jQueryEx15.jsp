<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<style type="text/css">
	div{
		width : 100px;
		height: 100px;
		background-color: gray;
		
	}
</style>
<meta charset="UTF-8">
<title>jQueryEx15</title>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
<script type="text/javascript">
	$(function(){
		$('#btn1').click(function(){
// 			// right버튼 클릭 시 이미지가 오른쪽으로 200 이동
// 			$('img').css('marginLeft',200);
			
// 			// 맵방식 - JSON
// 			$('img').css({'margin-left' : '800px'});
			
			// animate(애니메이션 효과, 시간)
			$('img').animate({'margin-left' : "800px"}, 1000);
			
		}); // btn1 click end
		
		$('#btn2').click(function(){
			// down버튼 클릭 - 200px 아래로
			$('img').animate({marginTop : 200}, 1000);
		}); // btn2 click end
		
		$('#btn3').click(function(){
// 			var w = $('img').width();
			var w = parseInt($('img').css('width'));
// 			alert(w);
			$('img').animate({width : w/2}, 1000);
		});
		
		$('div').click(function(){
// 			var dw = $('div').width();
// 			var dh = $('div').height();
// 			$('div').animate({width : dw+100, height : dh+100}, 100);
			$(this).animate({
				width : '+=100',
				height : '+=100'
			}, 'fast');
		});
	});
</script>
</head>
<body>
	<input type="button" value="right" id="btn1" />
	<input type="button" value="down" id="btn2" />
	<input type="button" value="zoom2X" id="btn3" />
	<br /><br /><br />
	
	<img src="../images/amazonlogo.jpg" alt="" />
	<br /><br />
	<!-- div에 애니메이션 효과 주기 -->
	<div></div>
</body>
</html>