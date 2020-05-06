<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>loginForm.jsp</title>
<style type="text/css">
	table, tr, th, td {
		margin: 0 auto;
		border: 1px solid black;
		border-collapse: collapse;
		padding: 20px;
	}
	
	table {width: 600px;}
</style>
</head>
<body>
	<div>
		<form action="./login.do" method="post">
			<table>
				<tr>
					<th>아이디</th>
					<td>
						<input type="text" name="id" id="" />
						<c:if test="${errors.id }">ID 입력하세요</c:if>						
					</td>
				</tr>
				<tr>
					<th>비밀번호</th>
					<td>
						<input type="text" name="password" id="" />
						<c:if test="${errors.pwNotEqual }">	비밀번호가 일치하지 않습니다.</c:if>
						<c:if test="${errors.password }">비밀번호 입력하세요</c:if>
					</td>
				</tr>
				<tr>
					<td colspan="2">
						<input type="submit" value="로그인" />
						<input type="reset" value="reset" />
					</td>
				</tr>
			</table>
		</form>	
	</div>

</body>
</html>