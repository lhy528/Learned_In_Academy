<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>ScriptletEx03</title>
</head>
<body>
	<%!
	// 메소드가 들어있으면 선언문으로 써야 한다
		int one; // 초기화 안했는데도 써짐
		int two = 1;
		
		public int sumMethod(){
			return one+two;
		}
		String msg;
		int three; // 초기화 안했는데도 0으로 나옴
		
		// 하나의 선언문에 여러 개의 변수, 여러 개의 메소드 선언 가능
		// 필드(멤버변수)는 초기화 하지 않으면
		// int는 0, String은 null 값을 return
	%>
	
	<h2>one과 two의 합 : <%= sumMethod() %></h2>
	<h2>msg : <%=msg %></h2>
	<h2>three : <%=three %></h2>
	
	<hr/>
	<%  String str = f_name + "길동" ;%>
	<%! 
	// str보다 f_name이 더 늦게 선언되었지만 선언문을 스크립트보다 먼저 인식하므로
	// f_name 값을 참조할 수 있다.
	String f_name = "홍" ;%>
	
	<h2>name : <%=str %></h2>
</body>
</html>