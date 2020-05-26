<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
<script type="text/javascript">
	$(function(){
		$("#btn").click(function(){
/*  	 		if($("#agree")[0].checked){
				location.href="step2.do";
			}  */
			
 	 		document.frm.action ="step2.do";
	 		document.frm.submit();
		});
		
	});
	
	
</script>
<meta charset="UTF-8">
<title>step1.jsp</title>
</head>
<body>
	<h2>step1.jsp</h2>
	<h1>약관</h1>
	<textarea name="txtarea" id="txtarea" cols="30" rows="10">고객님의 소중한 개인정보를잘 쓰겠습니다.</textarea>
	<form action="#" name="frm">
		<input type="checkbox" name="chk" id="agree" />
		<span>약관동의</span>
		<input type="button" value="다음" id="btn"/>
	</form>
	
</body>
</html>
<%-- <%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<script type="text/javascript">
	function func(){
		/* location.href="step2.do"; */
		location.href = '<c:url value="/register/step2.do"></c:url>';
	}
</script>
<meta charset="UTF-8">
<title>step1.jsp</title>
</head>
<body>
	<h2>step1.jsp</h2>
	<h1>약관</h1>
	<textarea name="txtarea" id="txtarea" cols="30" rows="10">고객님의 소중한 개인정보를잘 쓰겠습니다.</textarea>
	<form action="#">
		<input type="checkbox" name="chk" id="agree" />
		<span>약관동의</span>
		<input type="button" value="다음" id="btn" onclick="func()"/> 
	</form>
	
</body>
</html> --%>