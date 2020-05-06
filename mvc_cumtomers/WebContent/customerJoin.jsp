<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>customerJoin.jsp</title>
<style type="text/css">
	table, tr, th, td {
		margin: 0 auto;
		border: 1px solid black;
		border-collapse : collapse;
		padding: 10px;
	}
	table{width: 600px;}
	th, td{ text-align : center;}
	
</style>
</head>
<body>
	<div>
		<form action="./custom.do">
			<table>
				<tr>
					<th colspan="2">사원 등록</th>
				</tr>
				<tr>
					<th>아이디</th>
					<td>
						<input type="text" name="id" id="" />
					</td>
				</tr>
				<tr>
					<th>비밀번호</th>
					<td>
						<input type="text" name="pass" id="" />
					</td>
				</tr>
				</tr>
				<tr>
					<th>이름</th>
					<td>
						<input type="text" name="name" id="" />
					</td>
				</tr>
				<tr>
					<th>권한부여</th>
					<td>
						<select name="lev" id="">
							<option value="A">운영자</option>
							<option value="B">일반사원</option>
						</select>
					</td>
				</tr>
				<tr>
					<th>성별</th>
					<td>
						<select name="gender" id="">
							<option value="1">남성</option>
							<option value="2">여성</option>
						</select>
					</td>
				</tr>
				<tr>
					<th>전화번호</th>
					<td>
						<input type="text" name="phone" id="" placeholder="010-0000-0000"/>
					</td>
				</tr>
				<tr>
					<td colspan="2">
						<input type="submit" value="등록" />
						<input type="reset" value="취소" />
					</td>
				</tr>
			</table>
		
		
		</form>
	</div>
</body>
</html>