<%@page import="vo.BoardVO"%>
<%@page import="dao.BoardDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <script type="text/javascript">
	window.onload=function(){
		setTimeout(function(){
			console.log("script ok");
			location.href = "./board.do";
		}, 3000);
	}
</script>
<!-- [modifyOk.jsp] -->
<!-- DB에 접근해서 사용자가 수정한 내용을 저장 -->
 <h1>수정 완료</h1>