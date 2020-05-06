<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
<script type="text/javascript">
	$(function(){
		// 각 버튼을 누르면 기능을 수행
		$('input[value="숨기기"]').on('click',function(){
			$("#box1").hide(3000); // 함수안에 밀리세컨드 단위 시간 지정
		});
		$('input[value="보이기"]').on('click',function(){
			$("#box1").show(3000);
		});
		$('input[value="번갈아 수행"]').on('click',function(){
			$("#box1").toggle(3000);
		});
		$('input[value="점점 사라지기"]').on('click',function(){
			$("#box1").fadeOut(3000);		
		});
		$('input[value="점점 보이기"]').on('click',function(){
			$("#box1").fadeIn(3000);
		});
		$('input[value="효과주기"]').on('click',function(){
			// 하나의 화면 효과(effect)가 끝나고 다른 함수를 붙일 수 있음
			// ex) 다른 페이지로 이동
			$("#box1").slideToggle(1000, function(){
				$(this).show(1000);
			});
		});
		
	});
</script>
<title>jQueryEx12.jsp</title>
</head>
<body>
	<input type="button" value="숨기기" />
	<input type="button" value="보이기" />
	<input type="button" value="번갈아 수행" />
	<input type="button" value="점점 사라지기" />
	<input type="button" value="점점 보이기" />
	<input type="button" value="효과주기" />
	
	<div id="box1" style="font-size: 20px">
		<br />
		오늘은 화요일 <br /><br />
		내일은 수요일<br /><br />
		곧 점심시간<br /><br />
		조편성이라니<br /><br />
		누굴 데려가지<br />
		조장을 할까말까<br />
		조장해서 준호형 데려가면<br />
	
	</div>
</body>
</html>