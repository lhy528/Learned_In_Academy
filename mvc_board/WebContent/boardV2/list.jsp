<%@page import="dao.BoardV2_DAO"%>
<%@page import="dao.BoardDAO"%>
<%@page import="vo.BoardVO"%>
<%@page import="java.util.Vector"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>list.jsp</title>
<style type="text/css">
table {
	width: 100%;
	margin: 0 auto;
}

table, tr, th, td {
	border: 1px solid black;
	border-collapse: collapse;
	text-align: center;
}

th {
	background-color: #aaa;
}

#btn {
	text-align: right;
}

.red {
	background-color: cyan;
	font-size: 20px;
}
</style>
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
<script type="text/javascript">
	$(document).ready(function() {
		// tr - 첫번째 tr이 0번째
		// :nth-child(1) 첫번째~
		$("tr:first").css("background-color", "pink");
		$("tr:last").css("background-color", "pink");
		$("tr:odd").css("background-color", "lightgray");

		$("tr").on('mouseover', function() {
			$(this).addClass("red");
		});
		$("tr").on('mouseout', function() {
			$(this).removeClass("red");
		});
	});
</script>

</head>
<body>
	<table>
		<tr>
			<th class="col1">게시물번호</th>
			<th class="col2">제목</th>
			<th class="col3">작성자</th>
			<th class="col4">조회수</th>
		</tr>
		<c:forEach var="vo" items="${list }">
			<tr>
				<td>${vo.bno }</td>
				<td><a href="./board.do?cmd=detail&bno=${vo.bno }">${vo.title }</a></td>
				<td>${vo.writer }</td>
				<td>${vo.hits }</td>

			</tr>
		</c:forEach>
		<tr>
			<td colspan="4" id="page">
			<c:forEach var ='i' begin='1' end='${cp+2 }'>
			<span><a href="./board.do?cp=${i }">[${i }]</a></span>
			</c:forEach>
			</td>
		</tr>
		<tr>
			<td colspan="4" class="btn"><a href="./board.do?cmd=insertForm"><img
					src="images/btn_add.jpg" alt="글쓰기" /></a></td>
		</tr>
	</table>


</body>
</html>