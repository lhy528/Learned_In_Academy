<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>header.jsp</title>
<style type="text/css">
	table, tr, td{
		margin : 0 auto;
		border : 1px solid black;
		border-collapse: collapse;
		padding : 10px;
	}
	
	table{ width : 1000px;}
	
	td{
		width : 200px;
		text-align: center;
	}
	.explain {font-size : 14px; color :red;}
	.login a {font-weight: bold;}
	a {text-decoration: none}
	td:hover{
		background-color: gray;
		cursor: pointer;
	}
</style>
</head>
<body>

	<table>
		<c:if test="${empty emp }">
		<tr>
			<td></td>
			<td></td>
			<td class="login"><a href="login.do"><span>로그인</span></a></td>
			<td>사원등록</td>
			<td><span>Mypage</span><br />
			
				<span class="explain">로그인 후 사용 가능</span>
			</td>
		</tr>
		</c:if>
		
		<!-- emp 는 로그인 여부. -->
		<!-- result 는 권한. -->
		<c:if test="${!empty emp }">
		<tr>
			<td>${emp.name } 님</td>
			<td>권한 ${emp.lev }</td>
			<td class="login"><a href="logout.do"><span>로그아웃</span></a></td>
		
		<c:choose>
		
			<c:when test="${result==2 }">
	
			<td ><a href="newcustom.do">사원등록 </a></td>
		
			</c:when>
		
	
			<c:when test="${result ==3 }">
			<td >사원등록 ${result }<br /><span class="explain">운영자 권한으로 등록 가능.</span></td>
			
			</c:when>
		
		</c:choose>
			<td><a href="mypage.do"><span>Mypage</span></a></td>
		</tr>
		</c:if>
		
		
	</table>

</body>
</html>