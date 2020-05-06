<%@page import="vo.BoardVO"%>
<%@page import="dao.BoardDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!-- 사용자에게 보여줄 페이지가 아니므로 HTML이 필요 없음
	[writeOk.jsp] 스크립틀릿 열고 주석 달아야 안보임 -->
<script type="text/javascript">
	window.onload=function(){
		setTimeout(function(){
			console.log("script ok");
			location.href = "./board.do";
		}, 3000);
	}
</script>
<h1>
${vo.title } 등록 완료

</h1>	

<div id="button">
				<input type="button" value="목록보기" onclick="./board.do?cmd=list"/>

</div>