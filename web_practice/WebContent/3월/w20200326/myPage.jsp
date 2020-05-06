<%@page import="bean.MemberBean"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>myPage</title>
</head>
<body>
	<%
		Object obj = session.getAttribute("vo");
		if(obj != null){
	//			out.println(obj);
			MemberBean mb = (MemberBean)obj; // 가장 최상위객체에서 멤버빈으로 캐스팅
			out.print(mb.getId()+" 아디비번사잇값 "+mb.getPw());
			out.print(mb.getPw());
		}else{
			out.print("안넘어왔어요");
		}
	
	%>
</body>
</html>