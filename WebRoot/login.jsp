<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<title>用户登录</title>
<link href="css/style.css" rel="stylesheet" type="text/css" />
<script language="JavaScript" src="js/jquery.js"></script>
<script src="js/cloud.js" type="text/javascript"></script>
<script language="javascript">
	$(function() {
		$('.loginbox').css({
			'position' : 'absolute',
			'left' : ($(window).width() - 692) / 2
		});
		$(window).resize(function() {
			$('.loginbox').css({
				'position' : 'absolute',
				'left' : ($(window).width() - 692) / 2
			});
		})
	});
</script>
<head />
<body>
	<s:div class="login-03">
		<s:div class="third-login">
			<h1><img src="images/twit.png" alt=""/>登陆界面</h1>
			<s:form action="Login_UserLogin" namespace="/action" theme="simple">
				<ul>
				
					<li><s:textfield name="id" cssClass="loginuser" value="Id"
							onclick="JavaScript:this.value=''" />
					</li>
					<li><s:password name="password" cssClass="loginpwd" />
					</li>
					<li><s:submit value="登录" cssClass="loginbtn" />&nbsp&nbsp&nbsp<a
						href="adminLogin.jsp">后台登录</a>
					</li>
				</ul>
			</s:form>
		</s:div>
	</s:div>
	

</body>

</html>
