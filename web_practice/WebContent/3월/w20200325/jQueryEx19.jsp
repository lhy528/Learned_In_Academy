<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Ex19</title>
<style media="screen">
  *{
    margin: 0;
    padding: 0;
  }

  #postbox{
    margin-left: 200px;
    margin-top: 30px;
  }

  #box1{
    width: 600px;
    height: 190px;
    background-color: black;
    border: 4px solid #aaaaaa;
    overflow: hidden; /* 자식 영역이 부모보다 더 크면 오버된 영역은 숨기기 */
    position: relative;
  }

  #box2{
    width: 1200px;
    height: 190px;
    margin: 0;
    padding: 0;
    position: absolute;
    left: 0;
  }

  #box2 ul li{
    list-style-type: none;
    float: left;
    margin: 0;
    padding: 0;
  }

  #box2 ul li img{
    width: 135px;
    margin-right: 5px;
  }

  #eventBox{
    width: 690px;
    height: 200px;
    background-color: #cccccc;
    margin-left: 200px;
    margin-top: 30px;
  }

  #eventBox ul li{
    list-style-type: none;
  }

  #box3{padding: 30px;}
</style>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
<script type="text/javascript">
  $(function(){
    //반복적 수행 : setInterval
    setInterval(function(){
      $('#box2').animate({left : "-=10px"}, 100);
      //모든 이미지가 다 보인경우 다시 오른쪽에서 나오게 설정하기
      //현재 left속성 가져오기
      var left = parseInt($("#box").css("left"));

      if(left > -1100){
        $('#box2').css({"left" : "0"});
      }
    });
  });
</script>
</head>
<body>
  <%-- 영화 소개 메인 페이지 --%>
  <%-- 전광판 같은 느낌(?) --%>
  <div id="postbox">
    <h2>메가박스</h2>
    <div id="box1">
      <div id="box2">
        <ul>
          <li><img src="../images/movie_image1.jpg" alt=""></li>
          <li><img src="../images/movie_image2.jpg" alt=""></li>
          <li><img src="../images/movie_image3.jpg" alt=""></li>
          <li><img src="../images/movie_image4.jpg" alt=""></li>
          <li><img src="../images/movie_image5.jpg" alt=""></li>
          <li><img src="../images/movie_image6.jpg" alt=""></li>
          <li><img src="../images/movie_image7.jpg" alt=""></li>
          <li><img src="../images/movie_image8.jpg" alt=""></li>
        </ul>
      </div>
    </div>
  </div>

  <div id="eventBox">
    <div id="box3">
      <h2>진행중인 이벤트</h2>
      <ul>
        <li>1. 누군가의 인생영화</li>
        <li>2. 감사감사 이벤트</li>
        <li>3. 군장병 온라인 할인오픈</li>
        <li>4. 블랙말랑카우 에디션 판매개시</li>
      </ul>
    </div>
  </div>
</body>
</html>
