<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
<script type="text/javascript">
	$(function(){
		$('li.mainmenu ul').hide();
		$('li.mainmenu').hover(function(){
			console.log("mouse enter");
			
			// 내 카테고리의 자식요소를 호출
			$('ul', this).stop().slideDown(300);
		}, function(){
			console.log("mouse out");	
			$('ul', this).stop().slideUp(300);
		});
	});
</script>
<title>jQueryEx14.jsp</title>
<style type="text/css">
	.mainmenu{
		float: left;
		width: 320px;
		list-style-type: none;
	}
	
	li.mainmenu ul{ /* 공백 하나 주면 자식 */
		margin : 0;
		display : block;
		list-style-type: none;
		padding: 0;
	}
	
	li.mainmenu a{
		width: 300px;
		display : block;
		background-color: #a50000;
		color: white;
		text-decoration: none;
		padding: 10px;
		border-bottom: 1px solid yellow;
	}
/* 	ul#dropDownMenu li a{ */
/* 		background-color: gray; */
/* 	} */
</style>
</head>
<body>
	<ul id="dropDownMenu">
		<li class="mainmenu">
			<a href="#">도서</a>
			<ul>
				<li><a href="#">IT</a></li>
				<li><a href="#">소설</a></li>
				<li><a href="#">비소설</a></li>
			</ul>
		</li>
		<li class="mainmenu">
			<a href="#">명품</a>
			<ul>
				<li><a href="#">명품이</a></li>
				<li><a href="#">뭐에요?</a></li>
				<li><a href="#">삼성?</a></li>
			</ul>
		</li>
	</ul>
</body>
</html>