<%@page import="dao.BoardV2_DAO"%>
<%@page import="dao.BoardDAO"%>
<%@page import="vo.BoardVO"%>
<%@page import="java.util.Vector"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%
	/* 페이징 처리 */
	// 현재 페이지 얻어오기
	String cp = request.getParameter("cp");
 
	int currentPage = 0;
	if(cp!=null){
		currentPage = Integer.parseInt(cp);
	}else{
		currentPage = 1;
	}
	BoardV2_DAO dao2 = new BoardV2_DAO();
	BoardDAO dao = new BoardDAO();
	
	// 총 게시글 수
	int totalCount = dao2.getTotalCount();
	
	// 한 페이지당 레코드 수 : 10
	int recordByPage = 10;
	
	//총 페이지 수
	int totalPage = 
		(totalCount%recordByPage==0)?totalCount/recordByPage:totalCount/recordByPage+1;
	// 3항 연산자!! (조건)?true:false;
	
	out.println("총 게시물 수 : "+totalCount);
	out.println("한 페이지당 게시물 수 : "+recordByPage);
	out.println("총 페이지 수 : "+totalPage);
	out.println("현재 페이지 번호 : "+currentPage);



%>
    
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
	.red{
		background-color: cyan;
		font-size: 20px;

	}
	
</style>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
<script type="text/javascript">
	$(document).ready(function(){
		// tr - 첫번째 tr이 0번째
		// :nth-child(1) 첫번째~
		$("tr:first").css("background-color","pink");
		$("tr:last").css("background-color","pink");
		$("tr:odd").css("background-color","lightgray");
	
		$("tr").on('mouseover', function(){
			$(this).addClass("red");
		});
		$("tr").on('mouseout', function(){
			$(this).removeClass("red");
		});
	});
	
</script>

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
			Vector<BoardVO> vt = dao2.getAllData((currentPage-1)*recordByPage+1,(currentPage-1)*recordByPage+1+recordByPage);
// 			Vector<BoardVO> vt = dao2.getAllData(1,10);
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
			<td colspan="4" id="page">
			<%
				for(int i=1; i<=totalPage; i++){
			%>
			<span><a href="list.jsp?cp=<%=i%>">[<%=i %>]</a></span>
			<%
				} 
			
			%>
			</td>
		</tr>
		<tr>
			<td colspan="4" id="btn"> <input type="button" value="등록" onclick="location.href='write.jsp'"/></td>			
		</tr>
	</table>
	
	
</body>
</html>