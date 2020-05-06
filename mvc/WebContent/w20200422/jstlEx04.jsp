<%@page import="java.util.HashMap"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>jstlEx04.jsp</title>
<style type="text/css">
	td{
		border: 2px solid red;
		margin: 3px;
		padding : 3px;
	}
	
</style>
</head>
<body>
<!-- 	자바 for 반복문 역할 -->
	<h1>
		<c:forEach begin="1" end="10" step="1">하이</c:forEach>
		
	</h1>
	
	<h1>
		<c:forEach var="i" begin = "1" end="10" step="2">${i }</c:forEach>
	</h1>
	
<!-- 	구구단 3단 출력 -->
	<h1>
		<c:forEach var='j' begin='1' end='9' step='1'>
			3 * ${j } = ${3*j } <br />
		
		</c:forEach>
	</h1>
<!-- 	구구단 9단까지 출력(table 형태로 개행해서) -->
	<table>
		<c:forEach var='dan' begin='2' end='9' step='1' >
			<c:forEach var = 'k' begin='1' end='9' step='1'>
				<tr>
					<td>${dan }</td>
					<td> * </td>
					<td>${k }</td>
					<td> = </td>
					<td>${dan*k }</td>
				</tr>
			</c:forEach>
		</c:forEach>
	</table>
<!-- 	배열값 출력 -->
	<h1>
		<c:set var = "arr" value="<%=new int[]{1,2,3,4,5} %>"></c:set>
		<c:forEach var='l' begin='0' end='4'>
			${arr[l] }
		</c:forEach>
		<c:forEach var='x' items='${arr }'>
			${x }
		</c:forEach>
	</h1>
	
<!-- 	JCF 사용 -->
<!-- 	ArrayList 담아서 보낼 때 많이 쓰는 코드 -->
<%-- 	<c:forEach var='vo' items='list'>${vo.name }</c:forEach>  --%>

<!-- 	JCF : Map 출력 -->
	<%
		HashMap hm = new HashMap();
		hm.put("뷔페", "애슐리");
		hm.put("구내식당", "구내식당1");
	%>
	
	<h1>
		<c:set var='m' value = "<%=hm %>"></c:set>
		<c:forEach var = 'm1' items='${m }'>
			${m1.key } : ${m1.value } <br />
		</c:forEach>
	</h1>
	
	<h1>
		<c:forTokens var='m2' items="1, 2, 3, 4, 5" delims="," varStatus='num'>
			${num.count } - 데이터 : ${m2 } <br />
		</c:forTokens>
	
	</h1>
	
	
</body>
</html>




