<%@page import="javafx.scene.control.Alert"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>ajaxEx01</title>
</head>
<body>
	<script type="text/javascript">
		//XMLHttpRequest 객체
		var request = new XMLHttpRequest();
		console.log(request);
	    console.dir(request);
		// 찾기		(method, data, 동기(false)/비동기(true)) - 이동없이 불러오기
	    request.open('GET','data.html', false);
	    // 수행(불려진 입장에서 이곳으로 전송)
	    request.send();
	
	    //확인
	    //alert(request.responseText);
    	
	    var txt = request.responseText;
	    document.write(txt);
	</script>
</body>
</html>
