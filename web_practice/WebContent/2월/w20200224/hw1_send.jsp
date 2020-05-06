<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script>

</script>
</head>
<body>
		<%
			String dan_s = request.getParameter("dan");//String 형으로 몇단인지을 값을 받음
			if(dan_s==null) dan_s = "0";  //단에 값이 없을경우 디폴트 값으로 지정
			int dan = Integer.parseInt(dan_s); //int 형으로 변환 시켜줌
			for(int i=1; i<=9; i++){				
			out.println(dan+" * "+i+" = "+dan*i+"<br>");
			}
		%>
	<form action=""> <!-- 액션 안에 구구단출력하는 jsp로 보내면 데이터 소통도 가능 -->
		<input type="text" name="dan" id="" />
		<input type="submit" value="단"/>
	</form>
	<div id = aa></div>
</body>
</html>