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
			<h1><img src="images/twit.png" alt=""/>Log In with Twitter</h1>
			<form class="three">
					<p>Username / Email</p>
					<li class="base">
					<input type="text" value="" onfocus="this.value='';" onblur="if (this.value == '') {this.value ='';}"><a href="#" class=" icons3 user3"></a>
				</li>
					<p>Password</p>
					<li>
							<input type="password" value="" onfocus="this.value = '';" onblur="if (this.value == '') {this.value = '';}"><a href="#" class=" icons3 lock3"></a>
					</li>

					<s:div class="submit-three">
						<input type="submit" onclick="myFunction()" value="Log In" > 
					</s:div>
			</form>
		</s:div>
	</s:div>
	

</body>

</html>
