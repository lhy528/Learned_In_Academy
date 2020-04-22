<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!-- 3. 아마존 회원가입 창 최대한 똑같이 만들어 보기  -->
<!DOCTYPE html>
<html lang="ko" dir="ltr">
  <head>
    <meta charset="utf-8">
    <title>Amazon Register</title>
    <script type="text/javascript">
    	function checkForm(x) {
			console.dir(x);
			var name = x.form[0].value;
			var email = x.form[1].value;
			var pw = x.form[2].value;
			var pwchk = x.form[3].value;
			
			console.log("name : " +name);
			console.log("email : " +email);
			console.log("pw : " +pw);
			console.log("pwchk : " +pwchk);
			
			if(pw != pwchk){
				alert("비밀번호가 다르옵니다");
				x.form[2].value ="";
				x.form[3].value ="";
				x.form[2].focus();
				return;
			}
			
			
			
		}
    </script>
    

    <style media="screen">
      body{font-family: "Amazon Ember",Arial,sans-serif;}
      #logo{width: 103px; margin-bottom: 18px;}
      .center{text-align: center;}
      i{color: blue; font-weight: bold;}
      .top{text-align: center;}
      .inner{width: 312px; height: 488px; padding: 14px 18px;
             border: 1px solid lightgray;
             border-radius: 4px;
             text-align: left;
             /* position: absolute; */
           display: inline-block;
       }
      .h1{margin-top: 0px; text-rendering: optimizeLegibility; padding-bottom: 4px;}
      .label{font-size: 13px; padding: 0px 0px 2px 2px; font-weight: bold;}
      .label2{position: relative; left: 10px; bottom: 18px;}
      .label3{font-size: 12px; padding: 0px 0px 2px 2px;}
      .input{width: 100%; height: 25px;}
      .btn{width: 100%; height: 29px; padding: 1px 6px; border-radius: 4px;
      background-color: #f0c14b;
    border-color: #a88734 #9c7e31 #846a29;}
    a{text-decoration: none;}
    .after{padding-top: 12px; border-top: 1px solid lightgray; padding-top: 20px;}

    </style>
  </head>
  <body>
    <div class="top">
      <img id="logo" src="C:\Users\goott2\web_workspace\web_goott\WebContent\images\amazonlogo.jpg" alt="">
    </div>

    <div class="center">
      <div class="inner">
        <form action="hw2_registerOK.jsp">
        <h1 class="h1">Create account</h1>
        <label for="#" class="label">Your name</label><br>
        <input type="text" class="input" name="name" id="name"><br>
        <br>
        <label for="#" class="label">Email</label><br>
        <input type="email" class="input" name="email" id="email"><br>
        <br>
        <label for="#" class="label">Password</label><br>
        <input placeholder="At least 6 characters"type="password" class="input" name="pwd1" id="pwd1"><br>
        <i class="label">i</i>
        <div class="label2">
          <label class="label">Passwords must be at least 6 characters.</label>
        </div>

        <label for="#" class="label" >Re-enter password</label><br>
        <input type="password" class="input" name="pwd2" id="pwd2"><br>
        <br>
        <button class="btn" type="button" onclick="checkForm(this)">Create your Amazon Account</button>
        <br>
        <br>
        <label class="label3" for="">By creating an account, you agree to Amazon's <br>
          <a href="#">Conditions of Use</a> and <a href="#">Privacy Notice.</a></label>
          <br><br>
          <div class="after">
            <label style="font-weight : bold" for="" class="label3">Already have an account? <a href="#">Sign-In</a></label>

          </div>
        </form>
      </div>
    </div>
  </body>
</html>
