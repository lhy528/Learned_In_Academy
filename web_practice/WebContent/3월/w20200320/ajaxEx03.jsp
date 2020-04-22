<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>ajax Ex03</title>
<script type="text/javascript">
  var request = new XMLHttpRequest();
//   console.dir(request);

  request.open("get", "data.json", true);
  request.onreadystatechange = function(event){
    if(request.readyState==4 & request.status==200){
      var json = request.responseText;

//    console.log(json);
//    document.write(json);

      //가공하여 출력
      var prt = "";
      for (var i = 0; i < json.length; i++) {
//     	  for (String j : json.length) {
    	  for (var j in json[i]) {
			prt += '<h1>'+i+" : "+json[i][j]+'</h1>';
	        console.log(prt);
		}
      }
      //브라우저에 출력
      var di = document.getElementById('di');
      di.innerHTML += prt;
    }
  }

  request.send();
</script>
</head>
<body>
  <h1>Ajax Ex</h1>
  <div id="di"></div>
</body>
</html>
