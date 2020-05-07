<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>신규등록</title>
</head>
<body>
	<form action="newEmpOk.jsp">
		<table>
			<tr>
				<th>사원번호</th>
				<th>사원이름</th>
				<th>급여</th>
				<th>부서번호</th>
			</tr>			
			<tr>
				<td>
					<input type="text" name="empno" id="" />
				</td>
				<td>
					<input type="text" name="ename" id="" />
				</td>
				<td>
					<input type="text" name="sal" id="" />
				</td>
				<td>
					<input type="text" name="deptno" id="" />
				</td>
			</tr>
			<input type="submit" value="등록" />
			<input type="reset" value="다시쓰기" />
	
		</table>
	</form>
</body>
</html>