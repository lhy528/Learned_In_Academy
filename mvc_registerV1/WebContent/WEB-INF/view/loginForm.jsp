<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<style type="text/css">
.alert {
	color: red;
}

div, table, tr, th, td {
	margin: 0 auto;
	text-align: center;
	border: 1px solid black;
	border-collapse: collapse;
	padding: 20px;
}
</style>
<title>loginForm.jsp</title>
</head>
<body>
	<div>
		<form action="./login.do" method="post">
			<c:if test="${errors.pwNotEqual }">
				<span class='alert'>일치하는 정보가 없습니다</span><br />
			</c:if>
			<c:if test="${errors.id }">
				<span class='alert'>아이디를 입력하세요</span><br />
			</c:if>
			<c:if test="${errors.password }">
				<span class='alert'>비밀번호를 입력하세요</span><br />
			</c:if>
			<table>
				<tr>
					<th>아이디</th>
					<td><input type="text" name="id" id="" /></td>
				</tr>
				<tr>
					<th>비밀번호</th>
					<td><input type="text" name="password" id="" /></td>
				</tr>
				<tr>
					<td colspan="2"><input type="submit" value="로그인" /> <input
						type="reset" value="reset" /></td>
				</tr>
			</table>

		</form>

	</div>
</body>
</html>