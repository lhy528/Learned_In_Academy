<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<head>
<meta charset="UTF-8">
<title>mypage.jsp</title>
</head>
<body>
<%-- 	<jsp:include page="header.jsp"></jsp:include> --%>
	<br />
	<div>
	<form action="./mypage.do" method="post">
		<table>
			<tr>
				<th colspan='2'>My Page</th>
			</tr>
			<tr>
				<td>아이디</td>
				<td>${authUser.id }</td>
			</tr>
			<tr>
				<td>비밀번호</td>
				<td>
					<input type="text" name="password" id="" />
				</td>
			</tr>
			<tr>
				<td>이름</td>
				<td><input type="text" name="name" value="${authUser.name }" /></td>
			</tr>
			<tr>
				<td colspan="2">
					<input type="submit" value="수정" />
					<input type="reset" value="취소" />
				</td>
			</tr>
		</table>
		</form>
	</div>
</body>
</html>