<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<style type="text/css">
	table, tr, th, td{
	margin : 0 auto;
	text-align: center;
	border : 1px solid black;
	border-collapse:  collapse;
	padding: 20px;
	}
	#msg{
		text-align: center;
		font-weight: bold;
		color: red;
	}
</style>
<title>login.jsp</title>
</head>
<body>
<jsp:include page="header.jsp"></jsp:include>
<br />
	<div>
		<form action="./login.do" method="post">
			<div>
				<table>
					<tr>
						<th colspan="2">로그인</th>
					</tr>
					
					<tr>
						<th>아이디</th>
						<td><input type="text" name="id" id="" /></td>
					</tr>
					<tr>
						<th>비밀번호</th>
						<td><input type="text" name="pass" id="" /></td>
					</tr>
					<tr>
						<th>LEVEL</th>
						<td>
							<select name="lev" id="">
								<option value="A">운영자</option>
								<option value="B">일반사원</option>
							</select>
						</td>
					</tr>
					
					<tr>
						<td colspan="2">
							<input type="submit" value="로그인" />
							<input type="reset" value="취소" />
						</td>
					</tr>
				</table>
				<div id="msg">${message }</div>
			</div>
		</form>
	</div>
</body>
</html>