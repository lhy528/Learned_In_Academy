<%@page import="vo.ProductVO"%>
<%@page import="dao.ProductDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<% 

	int pno = Integer.parseInt(request.getParameter("pno"));
	ProductDAO dao = new ProductDAO();
	ProductVO vo = new ProductVO();

	vo = dao.getData(pno);
	
	
	


%>    
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>

<style type="text/css">
	#container{margin : 10px; background-color: pink;}
	#pimg{
		width : 500px;
		height: 500px;
	}
	
	#pic{
		
		float : left;
	}
	#desc{
		margin : 30px;
		float : left;
	}
	
	#dc{color: red;
		font-weight: bold;
	
	}
	
	#price{text-decoration: line-through;}
	#imgBtns{border-top:1px solid gray;}
	#name{border-top : 3px solid black;}
	
	

</style>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
<script type="text/javascript">
	$(document).ready(function(){
		
		$("#cart").on('click',function(){
			
			var pno = <%=vo.getPno() %>
			
			$("#no").val(pno);
			
			
			//$("#no").val();
			//input tag 에 value 를 미리 넣어 놨다면 이방식으로 사용.
			document.frm.action="cart.jsp";
			document.frm.submit();
			
		});
		
		
		
	});

</script>

</head>
<body>

<form action="#" name="frm">
	<!-- hidden : 사용자에겐 안보이지만  -->
	<input type="hidden" name="no" id="no" />
</form>
	
	<div id="container">
		<div id="pic">
			<img src="<%=vo.getBigfile() %>" alt="<%=vo.getPname() %>"id="pimg" />
		
		</div>
		
		<div id="desc">
			<h3><%=vo.getProdesc() %></h3>
		</div>
		
		<p id="name">상품명 : <%=vo.getPname() %></p>
		<p>상품가 : <%=vo.getPrice() %></p>
		<p id="dc">
			할인가 : <%=vo.getPrice()-vo.getPrice()*vo.getDcratio()/100 %>
		</p>
		
		<div id="imgBtns">
			<img src="../images/btn_buy.jpg" alt="즉시구매버튼" />
	
			<img src="../images/btn_cart.jpg" alt="장바구니버튼" id="cart" />
		
			<img src="../images/btn_wish.jpg" alt="위시리스트버튼" />
		
		</div>
		
		
	</div>
	
</body>
</html>