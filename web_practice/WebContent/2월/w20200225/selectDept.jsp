<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.Connection"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>selectDept.jsp</title>
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
</head>
<body>
	<table>
		<tr>
			<th>부서번호</th>
			<th>부서이름</th>
			<th>부서위치</th>
		</tr>
		<%
			//DB 연결 순서
			//0. 변수 선언
			String driver = "oracle.jdbc.driver.OracleDriver";
			String url = "jdbc:oracle:thin:@localhost:1521:XE";
			String user = "scott";
			String password = "tiger";
			
			StringBuffer sb = new StringBuffer();
			
			Connection conn = null;
			PreparedStatement pstmt = null;
			ResultSet rs = null;
			
			//1. 드라이버 로딩
			Class.forName(driver);
			
			//2. Connection 객체 생성
			conn = DriverManager.getConnection(url, user, password);
// 			out.println(conn);
			
			//3. SQL문 작성
			sb.append("select * from dept");
			
			//4. 문장 객체 생성
			pstmt = conn.prepareStatement(sb.toString());
			
			//5. 실행,결과받기
			rs = pstmt.executeQuery();
			
			//6. 레코드 처리
			while(rs.next()){
				int deptno = rs.getInt(1);
				String dname = rs.getString(2);
				String loc = rs.getString(3);
				
// 				out.println(deptno+"\t"+dname+"\t"+loc);
		%>
	
		<tr>
			<td><%=deptno %></td>
			<td><%=dname %></td>
			<td><%=loc %></td>
		</tr>
		<%
		}//7. 자원 반납
		if(rs!=null) rs.close();
		if(pstmt!=null)pstmt.close();
		if(conn!=null)conn.close();
		%>
	</table>
</body>
</html>