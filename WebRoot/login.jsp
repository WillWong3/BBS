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
	$(function(){
    $('.loginbox').css({'position':'absolute','left':($(window).width()-692)/2});
	$(window).resize(function(){  
    $('.loginbox').css({'position':'absolute','left':($(window).width()-692)/2});
    })});  
</script> 
<head/>
<body style="background-color:#1c77ac; background-image:url(images/light.png); background-repeat:no-repeat; background-position:center top; overflow:hidden;">
    <s:div id="mainBody">
      <s:div id="cloud1" cssClass="cloud"></s:div>
      <s:div id="cloud2" cssClass="cloud"></s:div>
    </s:div>  
    <s:div cssClass="loginbody">  
    <span class="systemlogo"></span>
    <s:div cssClass="loginbox" style="position: absolute; left: 337px;">    
    <s:form action="Login_UserLogin" namespace="/action" theme="simple">
    <ul>
    <li>用户类型：<s:select name="type" list="#{'pm':'经理','manager':'主管','developer':'工程师'}" headerKey="-1" headerValue="--请选择" size="0"/></li>
   <li><s:textfield name="id" cssClass="loginuser" value="Id" onclick="JavaScript:this.value=''"/></li>
    <li><s:password name="password" cssClass="loginpwd"/></li>
    <li><s:submit value="登录" cssClass="loginbtn"/>&nbsp&nbsp&nbsp<a href="adminLogin.jsp">后台登录</a></li>
     </ul>
     </s:form>   
    </s:div>   
    </s:div>
    
</body>

</html>
