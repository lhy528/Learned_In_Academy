<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<style type="text/css">
	#msg, h4{
		display: inline;
		color: red;
	}
</style>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
<script type="text/javascript" src="../js/httpRequest.js"></script>
<script type="text/javascript">
	$(document).ready(function(){
		$("#id").focus();
		// 버튼 클릭 후 중복 확인
		$("input[value='중복확인']").on('click', checkUp); // 자바스크립트에서 함수호출 시 함수명만!
		
		// 입력 중에 중복 확인
		$("#id").on('keyup', checkUp);
	});
	
	function checkUp(){
		// 사용자 입력을 받아서 parameter로 전달-ajax 수행
		var txt = $("#id").val().trim();	// trim : 공백제거 함수
		var params = "id="+encodeURIComponent(txt);
		
		sendRequest('idCheck.jsp',params, callback, "GET");
		
	}
	
	function callback(){
		if(xhr.readyState== 4 & xhr.status==200){
			var msg = xhr.responseText.trim();
			console.log(msg);
			
			// 응답이 true이면 span에 아이디가 이미 있습니다. 출력
			// 응답이 false이면 span에 사용가능합니다. 출력
			if(msg=='true'){
				$("#msg").html('동일한 아이디가 있습니다');
			}else{
				$("#msg").html('사용가능한 아이디입니다');
			}
		}
	}


</script>
<title>ajaxEx07.jsp</title>
</head>
<body>
	<!-- 로그인창에서 id를 검색했을 때 존재유무를 알림 -->
	<form action="registerOk.jsp">
		<input type="text" name="id" id="id" placeholder="중복확인하세요" />
		<input type="button" value="중복확인" />
		<span id="msg"></span><br />
		<input type="text" name="pw" id="pw" />
		<br />
		<input type="button" value="로그인" />
		<input type="button" value="회원가입" />
	</form>
</body>
</html>