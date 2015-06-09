<%@ page language="java" import="java.util.*" pageEncoding="GBK"%>
<%@page import="java.text.*" %>
<%@taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>

  <head>
    <title>Login</title>
     <link rel="stylesheet"  type="text/css"  href="div.css"/>
    </head>  
 
<body>
	<div id="header"><div class="wrapper"><img src="logo.png"></div></div>
	
	
    <div class="wrapper">
	    <div class="counter1">
		    <h1>µÇÂ¼</h1>
		    <div class="login-mod">
		    <form action="Login" method="post">
			 
			    	<div class="login-form"><span class="icon-wrapper"><i class="icon_login un"></i></span><input type="text" name="emp.userName" placeholder="ÓÃ»§Ãû"></div>
			    	<div class="login-form"><span class="icon-wrapper"><i class="icon_login pwd"></i></span><input type="password" name="emp.password" placeholder="ÃÜÂë"></div>
			   
			    <div class="login-btn-panel" align="center">
			    
			    <input class="login-btn" type="submit" name="submit" value="µÇÂ¼"style="font-family:Î¢ÈíÑÅºÚ">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
			    <input class="login-btn"type="reset" name="reset" value="ÖØÖÃ"style="font-family:Î¢ÈíÑÅºÚ">
			   
			    </div>
			  </form> 
		    </div>
		
	    <%
		Date d=new Date();
		DateFormat format2 = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss"); 
		String date= format2.format(d);
		out.println(date);
		%>
	    </div>
    </div>
 

  </body>

</html>
