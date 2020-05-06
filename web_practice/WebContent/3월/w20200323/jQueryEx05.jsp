<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
<script type="text/javascript">
	// jQuery로 CSS 효과 주기
	$(document).ready(function(){
		// HTML 모든 엘리먼트를 찾아서 붉은 선으로 표시
		$("*").css("border", "1px solid red");
		
		// id가 id인 엘리먼트 찾아서 css 효과 주기
		$("#id").css("border", "1px solid blue");
		
		// class가 row인 엘리먼트 찾아서 css 효과 주기
		$(".row").css("border", "1px solid green");
		
		// 다중 선택도 가능
		$("#id, .row, table").css("border", "1px solid gray");
		
		$("*").hover(function(){
			$(this).css("border", "3px solid black");
		});
		
	});
</script>
<title>jQueryEx05.jsp</title>
</head>
<body>
	<table>
		<tr>
			<th class="row">ID : </th>
			<td><input type="text" name="" id="id" /></td>
		</tr>
		<tr>
			<th class="row">PW : </th>
			<td><input type="text" name="" id="pw" /></td>
		</tr>
		<tr>
			<td colspan="2">
				<input type="button" value="로그인" />
				<input type="reset" value="reset" />
			</td>
		</tr>
	</table>
</body>
</html>