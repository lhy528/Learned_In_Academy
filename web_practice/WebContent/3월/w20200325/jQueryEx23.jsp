<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>jQueryEx23.jsp</title>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
<script type="text/javascript">
	$(function(){
		$('input').click(function(){
			// ajax
			$.ajax({
				// 서버에 요청할 자원 주소
				url : 'serverEx.jsp',
				
				// type
				dataType : 'text' ,
				
				// 성공했다면
				success : function(data){
	// 				alert('성공했다면 호출');
	// 				alert("전달받은 데이터 : " + data);
					// data : account, sales, operations
					// 콤마를 기준으로 단어를 구분해서 li tag로 감싸서 ul에 append
					var dataarray = data.trim().split(",");
					console.log(dataarray);
					for(var i=0; i<dataarray.length; i++){
						var str = dataarray[i];
						var txt = "<li>"+str+"</li>";
						$('ul').append(txt);
					}
				}
				
			}); // ajax end
		}); // click end
	}); // jquery end
</script>
</head>
<body>
	<h2>부서목록</h2>
	<input type="button" value="출력" />
	<!-- 
		화면 갱신 없이 특정 부분에만 내가 원하는 데이터를 출력할거야
		=>> aJax
	-->
	<div>
		<ul>
		</ul>
	</div>
</body>
</html>