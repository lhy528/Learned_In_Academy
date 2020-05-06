<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>logout.jsp</title>
<script type="text/javascript">
	window.onload=function(){
		setTimeout(function(){
			console.log("logout ok");
			location.href = "./login.do";
		}, 3000);
	}
</script>
</head>
<body>
	${name }님 안녕히 가세요.
	로그아웃 되었습니다. 3초 후 이동합니다.
</body>
</html>