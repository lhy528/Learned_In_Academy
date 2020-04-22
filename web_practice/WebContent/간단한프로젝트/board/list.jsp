<%@page import="dao.BoardDAO"%>
<%@page import="vo.BoardVO"%>
<%@page import="java.util.Vector"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head> 
<meta charset="UTF-8">
<title>list.jsp</title>
<style type="text/css">
	table{
		width: 100%;
		margin: 0 auto;
	}
	table, tr, th, td{
		border: 1px solid black;
		border-collapse: collapse;
		text-align: center;
	}
	th{
		background-color: #aaa;
	}
	#btn{
		text-align: right;
	}
</style>

</head>
<body>
	<table>
		<tr>
			<th class="col1">게시물번호</th>
			<th class="col2">제목</th>
			<th class="col3">작성자</th>
			<th class="col4">조회수</th>
		</tr>
		<%
			BoardDAO dao = new BoardDAO();
			Vector<BoardVO> vt = dao.getAllData(); 
			for(BoardVO vo : vt){
		%>	
		<tr>
			<td><%=vo.getBno() %></td>
			<td><a href="detail.jsp?bno=<%=vo.getBno()%>"><%=vo.getTitle() %></a></td>
			<td><%=vo.getWriter()%></td>
			<td><%=vo.getHits() %></td>
		</tr>
		<%
			}
		%>
		<tr>
			<td colspan="4" id="btn"> <input type="button" value="등록" onclick="location.href='write.jsp'"/></td>			
		</tr>
	</table>
	
	
</body>
</html>