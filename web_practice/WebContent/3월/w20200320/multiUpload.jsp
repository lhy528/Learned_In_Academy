<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>multiUpload</title>
</head>
<body>
  <form action="multiUploadOk.jsp" method="post" enctype="multipart/form-data">
    <div> <!--multiple 지원이 됨-->
      <input type="file" name="" value="파일선택" multiple="multiple"/>
      <input type="submit" name="" value="파일업로드"/>
    </div>
  </form>
</body>
</html>
