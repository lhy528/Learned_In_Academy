<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>selectOption.jsp</title>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
<script type="text/javascript">
// 	JQuery : 자바스크립트 잘 되어있는 것을 모아둔 라이브러리
// JQuery를 통해서 Element들을 인식하겠다는 표시 필요
	$(document).ready(function(){
		$("#dan").on('change', movePage); // JS에서 함수 호출할 때는 이름만 
		
	}); // 기본 형태!!!


	function movePage(x) {
		console.log("옵션 변경 되었음"+x);
		document.frm.action = "prtGugudan.jsp";
		document.frm.submit();
	}
</script>
</head>
<body>
	<h2>구구단을 선택하세요</h2>
	<form action="#" name="frm">
<!-- 		<select name="d1" id="dan" onchange="movePage(this.value)"> -->
		<select name="d1" id="dan">
			<option value="-------">선택</option>
			<option value="1단">1단</option>
			<option value="2단">2단</option>
			<option value="3단">3단</option>
			<option value="4단">4단</option>
			<option value="5단">5단</option>
			<option value="6단">6단</option>
			<option value="7단">7단</option>
			<option value="8단">8단</option>
			<option value="9단">9단</option>
		</select>
	</form>
</body>
</html>