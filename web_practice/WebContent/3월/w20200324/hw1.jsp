<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<style type="text/css">
	div{
		width : 100px;
		height : 100px;
		margin : 5px 5px;
		background-color: pink;
	}
</style>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
<script type="text/javascript">
	$(function(){
		$('#div1').click(function(){
			$(this).animate({
				marginLeft : '+=100'
			}, function(){
				var w = $(this).width();
				$(this).animate({
					width : w*2
				}, function(){
					var h = $(this).height();
					$(this).animate({
						height : h*2
					});
				});
			});
		}); // div1 click end
		
		$('#div2').click(function(){
			$(this).animate({
				marginLeft : '+=100'
			}, function(){
				var w2 = $(this).width();
				$(this).animate({
					width : w2*2
				}, function(){
					var h2 = $(this).height();
					$(this).animate({
						height : h2*2
					}, function(){
						$(this).css('display' , 'none');
					});
				});
			});
		}); // div2 click end
		
		$('h1').click(function(){
			$('h1').append("★");
		});
		
	});
	$(function(){
		setInterval(function(){
			$('h1').append("★");
		},1000);
	});

</script>
<meta charset="UTF-8">
<title>hw1.jsp</title>
</head>
<body>
	<div id="div1"></div>
	<div id="div2"></div>
	<h1>STAR</h1>
</body>
</html>