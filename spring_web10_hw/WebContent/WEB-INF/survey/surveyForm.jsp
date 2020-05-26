<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>    
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>이상형월드컵(surveyForm.jsp)</title>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
<script type="text/javascript">
	$(function(){
		$("#btn_select").click(function(){
			var check = $("input[name='worldcup']:checked")[0].id;
			$("input[name='picked']").attr('value', check);
			document.frm.action = "survey.ok";
			document.frm.method = 'post';
			document.frm.submit();
		});
	});
</script>
</head>
<body>
	<form action="" name="frm">
	<input type="hidden" name="picked" value="" />
		<table>
			<tr>
				<td><img src='<c:url value="/images/suzy.jpg"></c:url>' alt="후보1" /></td>
				<td><img src='<c:url value="/images/iu.png"></c:url>' alt="후보2" /></td>
			</tr>
			
			<tr>
				<td><input type="radio" name="worldcup" id="suzy.jpg" /></td>
				<td><input type="radio" name="worldcup" id="iu.png" /></td>
			</tr>
			<tr>
				<td colspan="2"><input type="button" value="확정" id="btn_select"/></td>
			</tr>
		</table>
	</form>
</body>
</html>