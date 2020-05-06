<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>ajaxEx06.jsp</title>
<script type="text/javascript" src="../js/httpRequest.js"></script>
<script type="text/javascript">

	function prtImg(){
		var txt = document.getElementById('txt');
		console.log(txt.value);
		var params = "txt="+encodeURIComponent(txt.value); // URI: 도메인주소가 없는 주소
		console.log(params);
		
		// 수행
		sendRequest('search.jsp', params, callback, "GET");
	}
	
	// callback : 대기하고 있다가 데이터가 들어오면 처리하는 기능
		function callback(){
			if(xhr.readyState==4){	// 4 : 완료된 상태
				if(xhr.status==200){	// 200 : 정상 페이지
// 					console.log("callback 함수 실행 중");
// 					console.log(xhr.responseText);
					var img = document.getElementById("img");
					img.src = xhr.responseText;
				}
			}
	}

</script>
</head>
<body>
	<!-- 현재 페이지에서 상품검색을 수행 후 그 상품이 있으면 이미지로 출력 -->
	<input type="text" name="" id="txt" />
	<input type="button" value="검색"  onclick="prtImg()"/>
	<hr />
	<div id="div1">
		<img src="../images/morning.png" alt="사진1" id="img" />
	</div>
	
</body>
</html>