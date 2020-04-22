<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>each메소드</title>
<style media="screen">
div{
  position: relative;
  padding: 0px;
  background-color: yellow;
  height: 100px;
  width: 100px;
  margin-top: 5px;
}
</style>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
<script type="text/javascript">
  $(function(){
    //반복문(for:each)기능을 하는 메소드이다.(즉, 배열관리)
    $("div").each(function(index){
      //delay(index*1/1000초)초 후에 각각 효과가 적용됨
      $(this).delay(index*500).animate({left : 700}, 'slow');
    });

    $("div").each(function(index){
      $(this).delay(index*500).animate({left : 0}, 'slow');
    });
  });
</script>
</head>
<body>
  <div></div>
  <div></div>
  <div></div>
  <div></div>
  <div></div>
  <div></div>
</body>
</html>
