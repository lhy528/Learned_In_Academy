
<%@page import="vo.EmpVO"%>
<%@page import="java.util.List"%>
<%@page import="dao.EmpDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h2>사원정보</h2>
	<table>
		<tr>
			<th>사원번호</th>
			<th>사원이름</th>
			<th>급여</th>
			<th>부서번호</th>
		</tr>
		<%
			EmpDAO dao = new EmpDAO();
			List<EmpVO> list = dao.selectAllEmp();
			for(EmpVO vo : list){
		%>				
		<tr>
			<td><a href="empListOne.jsp?empno=<%=vo.getEmpno()%>"><%=vo.getEmpno() %></a></td>
			<td><%=vo.getEname() %></td>
			<td><%=vo.getSal() %></td>
			<td><%=vo.getDeptno() %></td>
		</tr>
		<%
			}
		%>
		
		<tr>
			<td colspan="2">
				<a href="newEmp.jsp"><input type="button" value="신규등록" /></a>
			</td>
		</tr>
	</table>
</body>
</html>