<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<style type="text/css">
	.myStyle{
		border : 5px solid black;
	}
</style>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
<script type="text/javascript">
	$(document).ready(function(){
		// 1번 버튼을 누르면 CSS 효과 적용하기
		$("#btn1").click(function(){
			// $를 이용하여 객체를 찾아가면 결국 느려짐 - $(선택자)를 변수로
			var $box1 = $("#box1");
			$box1.css({
				"background-color" : "green", 
				"color" : "white",
				"width" : "50%"
			});
			
			// 1. 맵 방식 - JSON {name1 : value1, name2 : value2, ...}
// 			$("#box1").css({
// 				"background-color" : "green", 
// 				"color" : "white",
// 				"width" : "50%"
// 			});
			
// 			// 2. 메소드 체이닝 방식
// 			$("#box1").css("background-color", "red").css("color","yellow");			
		}); // btn1 click() end
		
		// 2번 버튼을 누르면 prompt를 띄워서 어떤 배경색을 사용할지 물어보고 box1의 배경색을 변경
		$("#btn2").click(function(){
			var color = prompt("어떤 배경색을 사용할까요?", "red");
// 			console.log(color);
			$("#box1").css("background-color",color);
			
		}); //btn2 click end
		
		// 3번 버튼을 누르면 box1의 너비를 구해서 alert에 출력
		$("#btn3").click(function(){
// 			var width = $("#box1").width(); // 숫자로 가져옴
			var width = $("#box1").css("width"); // px까지 포함해서 가져옴
			alert(width);
			// CSS를 속성만 주고 value값을 안주면 get해옴
		}); // btn3 click end
		
		// 4번 버튼을 누르면 box1에 myStyle 클래스를 추가
		$("#btn4").click(function(){
			$("#box1").addClass("myStyle");
		}); // btn4 click end
		
		// 5번 버튼을 누르면 box1에 myStyle 클래스를 제거
		$("#btn5").on('click' , function(){
			$("#box1").removeClass("myStyle");
		}); // btn5 click end
		
		// 이미지에 마우스가 올라오면 테두리를 추가
// 		$("img").on('mouseenter',function(){
// 			$(this).css('border', '3px solid black');
// 		});
// 		$("img").on('mouseout',function(){
// 			$(this).css('border', '0px');
// 		}); 방법 1==============

// 		$("img").on({
// 			'mouseenter' : function(){
// 				$(this).css('border', '3px solid black');
// 			},
// 			'mouseout' : function(){
// 				$(this).css('border', '0px');
// 			}
// 		}); 방법 2==============
	});
</script>
<title>jQueryEx06.jsp</title>
</head>
<body>
	<!-- CSS 처리를 위한 버튼 -->
	<input type="button" value="btn1" id="btn1" />
	<input type="button" value="btn2" id="btn2" />
	<input type="button" value="btn3" id="btn3" />
	<input type="button" value="btn4" id="btn4" />
	<input type="button" value="btn5" id="btn5" />
	<div id="box1">box1</div>
	
	<img src="../images/niro.jpg" alt="니로" />
</body>
</html>