<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>write.jsp</title>
<script type="text/javascript" src="../se2/js/HuskyEZCreator.js" charset="utf-8"></script>
<script type="text/javascript">
	var oEditors = [];
	
	window.onload = function(){
		// 네이버 스마트 에디터 skin
		nhn.husky.EZCreator.createInIFrame({
		 oAppRef: oEditors,
		 elPlaceHolder: "ct",
		 sSkinURI: "../se2/SmartEditor2Skin.html",
		 fCreator: "createSEditor2"
		});
	}
	
	function submitForm(elClickedObj) {
		 // 에디터의 내용이 textarea에 적용된다.
		 oEditors.getById["ct"].exec("UPDATE_CONTENTS_FIELD", []);

		 // 에디터의 내용에 대한 값 검증은 이곳에서
		 // document.getElementById("ir1").value를 이용해서 처리한다.

		 try {
		     elClickedObj.form.submit();
		 } catch(e) {}
	}
</script>
<style type="text/css">
	#container{
		margin: 0 auto;
		width: 80%;
		border : 1px solid black;	
		text-align: center;
	}
	
	#top{
		text-align: center;
		border-bottom: : 1px solid black;
	}
	
	#button{
		margin-bottom: 15px;
	}

</style>
</head>
<body>
	<form action="writeOk.jsp" name="frm">
		<div id="container">
			<div id="top">
				<p>
				<h3>하고 싶은 얘기가 있으신가요?</h3>
				</p>
			</div>
			<div id="writer">
				<p>
					<span>WRITER : </span> <input type="text" name="wr" id="wr" />
				</p>
			</div>
			<div id="title">
				<p>
					<span>TITLE : </span><input type="text" name="ti" id="ti" />
				</p>
			</div>
			<div id="contents">
				<p>
					<textarea name="ct" id="ct" cols="70" rows="20"></textarea>
				</p>
			</div>
			<div id="button">
				<input type="button" value="목록보기" onclick="location.href='list.jsp'"/>
				<input type="button" value="등록" onclick="submitForm(this)"/>
				<input type="reset" value="다시쓰기" />
			</div>
			
		</div>
	</form>
</body>
</html>