<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
<script type="text/javascript">
	$(function(){
		$('img').css({
			"width" : "150px",
			"height" : "300px",
			"margin" : "20px"
		});
		
		$('li').css('float','left');
		$('ul').css('list-style', 'none');
	});
</script>
<style type="text/css">
	p{
		margin-top: 0px;
	}
</style>
<meta charset="UTF-8">
<title>jQueryEx10.jsp</title>
</head>
<body>
	<!-- jQuery + css + img -->
	<h1>영화 소개</h1>
	<ul>
		<li>
			<div>
				<img src="../images/movie_image1.jpg" alt="" />
				<p>1번영화</p>
			</div>
		</li>
		<li>
			<div>
				<img src="../images/movie_image2.jpg" alt="" />
				<p>2번영화</p>
			</div>
		</li>
		<li>
			<div>
				<img src="../images/movie_image3.jpg" alt="" />
				<p>3번영화</p>
			</div>
		</li>
		<li>
			<div>
				<img src="../images/movie_image4.jpg" alt="" />
				<p>4번영화</p>
			</div>
		</li>
		<li>
			<div>
				<img src="../images/movie_image5.jpg" alt="" />
				<p>5번영화</p>
			</div>
		</li>
	</ul>
	
</body>
</html>