<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
<script type="text/javascript">
	$(document).ready(function(){
		$("#reg").on('click', function(){
// 			console.log("click");
// 			var id = document.getElementById("id"); 이렇게부르면 id를 호출해서

/* 아래처럼 부르면 경로를 찾아서 */			
// 			var id = document.frm.id.value;
// 			var pw = document.frm.pw.value;
// 			var pwchk = document.frm.pwchk.value;
// 			var name = document.frm.name.value;
// 			var birth = document.frm.birth.value;
// 			var mp1 = document.frm.mp1.value;
// 			var mp2 = document.frm.mp2.value;
// 			var email = document.frm.email.value;
// 			console.log(pw);

/* 아래처럼 쓰면 jQuery를 이용해서 */
// 			var id = $("#id");
// 			console.log(id);

			if($("#id").val()==""){
				alert("아이디를 입력하세요");
				$("#id").focus();
				return;
			}else if($("#pw").val()==""){
				alert("패스워드 입력하세요");
				$("#pw").focus();
				return;
			}else if($("#pwchk").val()=="" || $("#pwchk").val() != $("#pw").val()){
				alert("패스워드 중복 확인하세요");
				$("#pwchk").focus();
				return;
			}else if($("#name").val()==""){
				alert("이름 입력하세요");
				$("#name").focus();
				return;
			}
			
			document.frm.action = "registerOk.jsp";
			document.frm.method = "get";
			document.frm.submit();
		});
	});
</script>
<style type="text/css">
	#regDiv{
		width: 500px;
		margin: 0 auto;
	}
	
	table, tr, th, td{
		border: 1px solid black;
		border-collapse: collapse;
	}
	
	#botTr{
		background-color: pink;
		text-align: center;
	}
	
	#mp0{
		background-color: white;
		text-align: center;
	}
</style>
</head>
<body>
	<div>
		<form action="#" name="frm">
			<table>
				<tr>
					<th>ID</th>
					<td><input type="text" name="id" id="id"></td>
				</tr>
				<tr>
					<th>pw</th>
					<td><input type="text" name="pw" id="pw"></td>
				</tr>
				<tr>
					<th>pwchk</th>
					<td><input type="text" name="pwchk" id="pwchk"></td>
				</tr>
				<tr>
					<th>name</th>
					<td><input type="text" name="name" id="name"></td>
				</tr>
				<tr>
					<th>birth</th>
					<td><input type="text" name="birth" id="birth" placeholder="생년월일 6자리"></td>
				</tr>
				<tr>
					<th>mp</th>
					<td><input type="text" name="mp0" id="mp0" value="010" size="2" disabled>- <input type="text" name="mp1" id="mp1" size="3">- <input type="text" name="mp2" id="mp2" size="3"></td>
				</tr>
				<tr>
					<th>EMAIL</th>
					<td><input type="text" name="email" id="email" /></td>
				</tr>
				<tr id="botTr">
					<td colspan="2">
						<input type="button" value="가입"	 id="reg" />
						<input type="reset" value="reset" id="reset" />
					</td>
				</tr>
			</table>
		</form>
	</div>
</body>
</html>