<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<script type="text/javascript">
  var request = new XMLHttpRequest();

  	request.open("get", "hello.jsp", true);
 	request.onreadystatechange = function(event){
	  
	console.log(request);
	console.dir(request);

  }

  request.send();
</script>
	<%
// 	String downPath = System.getProperty("user.home").concat("/");
// 	out.println(downPath);
	%>
</body>
</html>
