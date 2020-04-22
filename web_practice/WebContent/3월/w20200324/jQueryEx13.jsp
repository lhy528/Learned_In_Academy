<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<style type="text/css">
	img{
		display : none;
	}
</style>
<meta charset="UTF-8">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
<script>
	$(function(){
		$("#btn").click(function(){
			$("img").css("margin-left","100px").slideToggle(1000, function(){
// 				alert("되었나");
				location.href='main.jsp'
			});
		});
	});
</script>		
	

<title>jQueryEx13.jsp</title>
</head>
<body>
	<!-- 
		1. 버튼 클릭 시 브라우저에 이미지가 출력
		100px 정도 오른쪽에서 점점 보이는 형태로
		
		2. 사진이 전부 보이면 main.jsp페이지로 이동
		
		3. main.jsp에서는 어서어세요~! 출력
	 -->
	 
	 <input type="button" value="사진출력" id="btn"/>
	 <img src='../images/niro.jpg' alt='니로니로니'/>
	 
</body>
</html>