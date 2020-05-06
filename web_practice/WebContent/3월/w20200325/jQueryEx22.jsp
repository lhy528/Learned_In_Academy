<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
<script type="text/javascript">
	$(function(){
// 		$('body').load('data.html');
// 		$.get('data.html', function(data){ // 왼쪽 데이터를 함수안에 파라미터로 쓰겠다
// 			$('body').html(data);
			
// 		});
		$.getJSON('data.json', function(data){ // 콤마 구분의 데이터를 읽어옴
			$.each(data, function(name, value){ // name과 value로 처리할 수 있게 해줌
				$('body').append('<h1>'+name+' : '+value + '</h1>');
				
			});		
		});
		
	});
</script>
<title>Insert title here</title>
</head>
<body>

</body>
</html>