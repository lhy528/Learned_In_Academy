<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>jQueryEx08.jsp</title>
<style type="text/css">
	*{
		font-weight: bold;
		font-family: 고도 b;
	}
</style>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
<script type="text/javascript">
	$(function(){
		$('textarea').keyup(function(){
			// 사용자가 입력한 글의 글자수 구하기
			var input = $(this).val().length;
// 			console.log(input);

// 			남은 글자수 계산
// 			var cnt = 60-input;
// 			console.log(cnt);

			$('span').html(input+"자");
			// 30자가 넘어가면 글자색이 노란색
			if(input<=30){
				$('textarea').css('color', 'black');
			}
			if(input>30){
				$('textarea').css('color', 'gray');
			// 50자가 넘어가면 글자색이 빨강색
			}if(input>50){
				$('textarea').css('color', 'red');
			// 59자가 되면 더이상 못쓰도록
			}if(input>60){
// 				alert("60자 까지 작성 가능합니다");
				$(this).val($(this).val().substring(0,60));
// 				$(this).attr('disabled', 'disabled');
			}
		});
	});
</script>
</head>
<body>
	<div>
		<p>한마디 작성하세요</p>
		<h2><span></span>/60자 제한</h2>
		<textarea name="" id="" cols="40" rows="10"></textarea>
	</div>
</body>
</html>