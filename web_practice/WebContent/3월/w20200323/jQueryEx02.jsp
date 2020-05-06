<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>jQueryEx02.jsp</title>
<style type="text/css">
    .plus{
        background-color: black;
        color: white;
    }

</style>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
<script type="text/javascript">
    $(document).ready(function(){
        $("h1").hover(function(){
            $("h1").addClass('plus');
        }, function(){
            $("h1").removeClass('plus');
        });

    });
</script>
</head>
<body>
	 <h1>HELLO</h1>
	 <h1>jQuery</h1>
	 <h1>WORLD</h1>
</body>
</html>