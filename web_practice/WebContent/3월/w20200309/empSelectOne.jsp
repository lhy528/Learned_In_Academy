<%@page import="java.util.Vector"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.ResultSet"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<style type="text/css">
	table{
		width: 600px;
		margin: 0 auto;
	}
	table, tr, th, td{
		border: 1px solid black;
		border-collapse: collapse;
		text-align: center;
	}
	th{
		background-color: #aaa;
	}
</style>
<meta charset="UTF-8">
<title>사원번호로 사원정보를 검색</title>
</head>
<body>
<!-- <form action="#"> -->
<!-- 	<h1>사원번호</h1> -->
<!-- </form> -->
<select name="no" id="">

<%
	String driver = "oracle.jdbc.driver.OracleDriver";
	String url = "jdbc:oracle:thin:@localhost:1521:XE";
	String user = "scott";
	String password = "tiger";
	
	StringBuffer sb = new StringBuffer();
	ResultSet rs = null;
	PreparedStatement pstmt = null;
	Connection conn = null;
	
	String no = request.getParameter("no");
	
	try{
	Class.forName(driver);
	conn = DriverManager.getConnection(url, user, password);
	
	sb.append("select empno, ename, job, sal from emp ");
// 	sb.append("where empno = ? ");
	
	pstmt = conn.prepareStatement(sb.toString());
// 	pstmt.setString(1, no);
	rs = pstmt.executeQuery();
	
	Vector a = new Vector();
	
		while(rs.next()){
			int empno = rs.getInt(1);
			String ename = rs.getString(2);
			String job = rs.getString(3);
			int sal = rs.getInt(4);
	
%>	
	<option value="<%=empno%>"><%=empno %></option>
	<%
	Vector line = new Vector();
	line.add(empno);
	line.add(ename);
	line.add(job);
	line.add(sal);
	
	a.add(line);
	
	%>
<%			
		}
	System.out.println(a);
	}
	catch(ClassNotFoundException cnfe){
		cnfe.getStackTrace();
	}
	
	// DB에서 사원번호 불러와서 옵션에 다는것 까진 완료, 
	// 사원번호 선택 시 해당 정보 나오게 해야함 >> 아마도 스크립트로?
	
%>

</select>
</body>
</html>