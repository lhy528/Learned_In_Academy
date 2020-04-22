<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>ajaxEx05</title>
<!--▼이거슨 ajaxEx04의 과정을 단축한 js파일(스크립트) -->
<script type="text/javascript" src="../js/httpRequest.js"></script>
<script type="text/javascript">
  function ajaxToServer() {
    var txt = document.getElementById("txt").value;

    //ex) hello.jsp?txt=홍길동
    var params = "txt="+encodeURIComponent(txt);
    //URL : 주소 포함, URI : 주소 미포함

    // function sendRequest(url, params, callback, method){
    sendRequest('hello.jsp', params, callback, 'GET');
  }

  function callback(){
	//이곳의 xhr변수는 js/httpRequest.js 파일에서 선언된 변수이고,
	//위에서 스크립트를 불러왔기때문에 사용가능
	
    //readyState : 0~4 단계 (4이면 완료)
    if(xhr.readyState==4){  //완료되면..
      //그리고 정상페이지이면..
      if(xhr.status==200){
        // alert(xhr.responseText);
        var div1 = document.getElementById("div1");

        div1.innerHTML = "<h1>"+xhr.responseText+"<h1>";
      }
    }
  }//viewMessage() end
</script>
</head>
<body>
  <input type="text" name="" id="txt"/>
  <input type="button" name="" value="입력" onclick="ajaxToServer()"/>
  <div id="div1">
  </div>
</body>
</html>
