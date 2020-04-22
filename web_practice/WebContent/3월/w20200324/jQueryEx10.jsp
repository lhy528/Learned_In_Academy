<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>jQueryEx10.jsp</title>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
<script type="text/javascript">
	$(function(){
		$('#all').change(function(){
			if(this.checked){
				$('#check').children().prop('checked', true);
				// prop : attr과 다르게 객체를 가져옴. attr은 값만?
			}else{
				$('#check').children().prop('checked', false);				
			}
		});
	});
</script>
</head>
<body>
	<div id="div1">
		<input type="checkbox" name="" id="all" />ALL <br />
		<div id="check">
			<input type="checkbox" name="" id="" />RED
			<input type="checkbox" name="" id="" />YELLOW
			<input type="checkbox" name="" id="" />GREEN
		</div>
	</div>
	
</body>
</html>