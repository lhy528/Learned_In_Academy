
<%@page import="vo.EmpVO"%>
<%@page import="java.util.List"%>
<%@page import="dao.EmpDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    
<!DOCTYPE html>
<html>
<head>
<script
  src="https://code.jquery.com/jquery-3.4.1.js"
  integrity="sha256-WpOohJOqMqqyKL9FccASB9O0KwACQJpFTUBLTYOVvVU="
  crossorigin="anonymous"></script>  
		<%
			EmpDAO dao = new EmpDAO();
			EmpVO vo = dao.selectOneEmp(Integer.parseInt(request.getParameter("empno")));
		%>				
<script type="text/javascript">
$(function(){
	$("#deleteEmp").click(function(){
		if(confirm("정말 삭제하시겠습니까?")==true){
			location.href='deleteEmpOk.jsp?empno='+<%=vo.getEmpno()%>
		}
		
	});
});
	
</script>
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
		<tr>
			<td><%=vo.getEmpno() %></td>
			<td><%=vo.getEname() %></td>
			<td><%=vo.getSal() %></td>
			<td><%=vo.getDeptno() %></td>
		</tr>
	</table>
		<a href="updateEmp.jsp?empno=<%=vo.getEmpno()%>"><input type="button" value="수정" /></a>
		<input type="button" value="삭제" id = "deleteEmp"/>
</body>
</html>