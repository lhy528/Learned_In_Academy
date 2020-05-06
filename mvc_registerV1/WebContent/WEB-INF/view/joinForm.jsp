<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<meta charset="UTF-8">
<title>joinForm.jsp</title>
<style type="text/css">
	table, tr, th, td{
		margin : 0 auto;
		border : 1px solid black;
		border-collapse: collapse;
		padding: 20px;
		
	}

</style>
</head>

<body>
	<div>
		<form action="join.do" method="post">
			<table>
				<tr>
					<th>아이디</th>
					<td>
					<input type="text" name="id" id="" />
					<c:if test="${errors.id }">ID를 입력하세요</c:if> 
					<c:if test="${errors.duplicated }">중복된 ID입니다</c:if>
					</td>
				</tr>
				<tr>
					<th>이름</th>
					<td><input type="text" name="name" id="" />
					<c:if test="${errors.name }">이름을 입력하세요</c:if></td>
				</tr>
				<tr>
					<th>비밀번호</th>
					<td><input type="text" name="password" id="" />
					<c:if test="${errors.password }">비밀번호를 입력하세요</c:if></td>
				</tr>
				<tr>
					<th>비밀번호확인</th>
					<td><input type="text" name="confirmPassword" id="" />
					<c:if test="${errors.confirmPassword }">비밀번호 확인란을 입력하세요</c:if>
					<c:if test="${errors.notEqual }">비밀번호가 같지 않습니다</c:if></td>
				</tr>
				<tr>
					<td colspan="2">
						<input type="submit" value="등록" />
						<input type="reset" value="다시쓰기" />
					</td>
				</tr>
			</table>


		</form>

	</div>
</body>
</html>