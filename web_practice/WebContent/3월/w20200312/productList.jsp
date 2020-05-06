<%@page import="vo.ProductVO"%>
<%@page import="java.util.Vector"%>
<%@page import="dao.ProductDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>productvt.jsp</title>

<style type="text/css">
	*{
		margin : 0px;
		padding 0px;
		background-color : pink;
	
	}
	
	#container{
		width:1000px;
		margin : auto;
		
	}
	
	img{
		width : 300px;
		height : 300px;
	}
	
	.wrap{
		width : 300px;
		float : left;
		border : 1px solid red;
	}
	
	.red{color : red;}
	
	.price{text-decoration: line-through;}
	
	p{text-align: center;}
	
	input{
		background-color: green;
		margin-left: 50px;	
	}
	
/*	#price{text-decoration: }
	#imgBtns{border-top: }*/
	#name{border-top: 3px;}
	
	
	

</style>


	<% ProductDAO dao = new ProductDAO(); %>
	<% Vector<ProductVO> vt = dao.getAllData(); %>

</head>
<body>




	<div id="container">
	<%
	for(ProductVO vo : vt){
		
		
	
	%>
		<div class="wrap">
		
		
			<a href="productDetail.jsp?pno=<%=vo.getPno() %>">
			
			<img src="<%=vo.getImgfile() %>" />
			</a>
			<p>상품 번호 : <%=vo.getPno() %></p>
			<p>상품명 : <%=vo.getPname() %></p>
			<p class="price">상품가격 : <%=vo.getPrice() %></p>
			<p class="red">마감임박</p>
			<p>할인율 : <%= vo.getDcratio() %>% 할인</p>
			
			<p class="ratio">할인 가격
			<%=vo.getPrice()-vo.getPrice()*vo.getDcratio()/100 %>
			
			</p>
		
				<input type="button" value="장바구니"/>
				
			</a>
			<input type="button" value="즉시주문"/>
		</div>
			
	<%} %>
	</div>
</body>
</html>