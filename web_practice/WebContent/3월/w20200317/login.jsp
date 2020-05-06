<%@page import="java.net.URLDecoder"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>login</title>
</head>
<body>
  <form action="loginOk.jsp">
  	<%
  		boolean ck = false;
  		String value = null;
  		Cookie[] clist = request.getCookies();
		
		for(Cookie c : clist){
			if(c.getName().equals("memberLogin")){
				ck = true;
				value = URLDecoder.decode(c.getValue(), "UTF-8");
			}
		}
		if(value==null){
  	%>
    <div id="loginform">
      <table>
        <tr>
          <th>ID : </th>
          <td><input type="text" name="id" id=""></td>
        </tr>
        <tr>
          <th>PW : </th>
          <td><input type="text" name="pw" id=""></td>
        </tr>
        <tr>
          <td colspan="2">
            <input type="submit" name="" value="로그인">
            <a href="register.jsp">
            	<input type="button" name="" value="회원가입">
            </a>
          </td>
        </tr>
      </table>
    </div>
    <%
    	}else{
    		out.println("<h1>"+value+"님 안녕~~"+"</h1>");
    	}
		if(ck){
    %>
		<a href="logout.jsp">로그아웃</a>
	<%
		}
	%>
  </form>
</body>
</html>
