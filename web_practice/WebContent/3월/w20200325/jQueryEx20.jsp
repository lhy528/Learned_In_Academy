<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<style type="text/css">
	*{margin : 0px; padding:0px;}
	ul{list-style-type: none;}
	img{width: 600px;}
</style>
<title>jQueryEx18.jsp</title>
</head>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
<script type="text/javascript" src = "../js/jquery.innerfade.js"></script>
<script type="text/javascript">
	$(function(){
		// jquery.innerFade.js 적용
		$('#innerFade').innerfade({
			animationtype : 'slide',
			speed : 2000,
			timeout : 2000,
			type : 'random',
			containerheight : '700px'
		});
		
	});
</script>
<body>
	<div id="wrapper">
		<ul id="innerFade">
			<li><img src="../images/movie_image1.jpg" alt="" /></li>
			<li><img src="../images/movie_image2.jpg" alt="" /></li>
			<li><img src="../images/movie_image3.jpg" alt="" /></li>
			<li><img src="../images/movie_image4.jpg" alt="" /></li>
			<li><img src="../images/movie_image5.jpg" alt="" /></li>
			<li><img src="../images/movie_image6.jpg" alt="" /></li>
			<li><img src="../images/movie_image7.jpg" alt="" /></li>
			<li><img src="../images/movie_image8.jpg" alt="" /></li>
			<li><img src="../images/movie_image9.jpg" alt="" /></li>
			<li><img src="../images/movie_image10.jpg" alt="" /></li>
		</ul>
	</div>
</body>
</html>