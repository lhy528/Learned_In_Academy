<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>jQueryEx24.jsp</title>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
<script type="text/javascript">
	$(function(){
		$('input').click(getData); // 이름으로 호출, 괄호 없이
		
		function getData(){
			// ajax
			$.ajax({
				// 서버에 요청할 자원
				url : 'serverEx.xml',
				
				// 파일 타입
				dataType : 'xml',
				
				// 전송 방식
				type : 'GET',
				
				// 수행 전
				beforeSend: function(){
					// 필요한 기능 호출
					alert('url 접근 전');
				},
				
				// 성공하면
				success : function(data){ // 데이터 받아와서 이런저런 작업 해야하므로 매개변수 열어주고
					// 넘겨받은 데이터(data)에서 book요소를 검색해서 각각 처리(한 record씩)
					$(data).find('book').each(function(){
						// 찾은 book 요소에서 title과 price 검색해서 추출
						var title = $(this).find('title').text();
						var price = $(this).find('price').text();
						
						// 화면에 HTML형식으로 출력하기 위한 조작
						var txt = "<li>"+title+" : " + price +"</li>";
						
						// ul 안쪽에 추가
						$('ul').append(txt);
						
					});
				
				},
				
				// 성공 못하면
				error : function(){
					// 필요한 기능 수행
					alert("실패했으요");
				},
				
				// 작업이 끝난 후
				complete : function(){
					// 필요한 기능 수행
					alert("다 끝났어요");
				}
				
			}); // ajax end
		} // getData() end
	});
</script>
</head>
<body>
	<h2>GOOTT 도서관</h2>
	<input type="button" value="도서목록" />
	<div>
		<h2>도서목록</h2>
		<div>
			<ul>
			</ul>
		</div>
	</div>
</body>
</html>