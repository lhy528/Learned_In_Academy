<%@page import="java.util.Vector"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
	div{font-size: 24px;
		font-family: 고도 B;
		text-shadow: 1px 1px 1px pink;}
</style>
</head>
<body>
	<%!
	String name = "유관순";
	int kor = 90;
	int eng = 95;
	int math = 100;
	public Vector getTotal(){
		int total = kor + eng + math;
		float avg = total/3;
		Vector score = new Vector();
		score.add(this.name);
		score.add(this.kor);
		score.add(this.eng);
		score.add(this.math);
		score.add(total);
		score.add(avg);
		return score;
	}
	%>
		<h1>성적표</h1>
	<div>
		성명 : <%=name %><br>
		국어점수 : <%=kor %><br>
		영어점수 : <%=eng %><br>
		수학점수 : <%=math %><br>
		총점 : <%=getTotal().elementAt(4) %><br>
		평균 : <%=getTotal().elementAt(5) %>
	</div>
</body>
</html>