<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>fileWrite</title>
<style media="screen">
  table, tr, th, td{
    margin: 0 auto;
    border: 1px solid black;
  }
  #contents{
    height: 200px;
  }
</style>
</head>
<body>
<!-- 파일 전송(업로드) 기능 구현 -->
	<form action="fileWriteOk.jsp" method="post" enctype="multipart/form-data" >
	<!-- jar파일의 공식 form -->
	
	
		<table>
			<tr>
				<th>제목</th>
				<td><input type="text" name="title" id=""></td>
			</tr>
      <tr>
				<th>작성자</th>
				<td><input type="text" name="writer" id=""></td>
			</tr>
      <tr>
				<th>내용</th>
				<td><input type="text" name="contents" id="contents"></td>
			</tr>
      <tr>
        <th>첨부파일</th>
        <td><input type="file" name="fileName" id=""></td>
      </tr>
      <tr>
        <td colspan="2">
          <input type="submit" name="" value="전송">
        </td>
      </tr>
		</table>
	</form>

</body>
</html>
