<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>ajaxEx02</title>
<script type="text/javascript">
	var request = new XMLHttpRequest();
	//디폴트는 동기방식, 비동기방식일경우 알려줘야함
	request.onreadystatechange = function(event) {
		//onreadystate는 0~4 까지 순서로 되어있고 4가 완료됨을 의미
		// 		alert("request.readystate : "+request.readystate);

		if (request.readyState == 4) {
			if (request.status == 200) {
				var txt = request.responseText;
				var di = document.getElementById("di");
        di.innerHTML = "<h2>"+txt+"<h2>";
// 				document.write(txt);
			}
		}
	};
	request.open("GET", "data.html", true);
	request.send();
</script>
</head>
<body>
	<h1>Ajax Ex</h1>
	<div id="di"></div>
</body>
</html>
