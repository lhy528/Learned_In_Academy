<%@page import="java.awt.Image"%>
<%@page import="java.util.Vector"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>scriptletEx09</title>
</head>
<body>	
	<%
// 		String[] images = {
// 				"movie_image1.jpg","movie_image2.jpg",
// 				"movie_image3.jpg","movie_image4.jpg",
// 				"movie_image5.jpg","movie_image6.jpg",
// 				"movie_image7.jpg","movie_image8.jpg",
// 				"movie_image9.jpg","movie_image10.jpg",
// 		};
	
		int[] imgNum = new int[10];
		
		for(int i=0; i<10; i++){
			imgNum[i] = (i+1);
		}
	
		out.println("<h2>영화 포스터 </h2>");
		for(int i=0; i<imgNum.length; i++){
			out.println("<img src='../images/movie_image"+imgNum[i]+".jpg' width = '300px'/>");
		}
	%>
</body>
</html>