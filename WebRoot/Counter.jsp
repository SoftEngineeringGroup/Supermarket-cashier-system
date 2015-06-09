<%@ page language="java" import="java.util.*" pageEncoding="GBK"%>
<%@page import="java.text.*" %>


<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>    
    <title>Counter</title>
    <link href="div.css" rel="stylesheet" type="text/css"/>
    <style type="text/css">
	
	.row{ margin:5px 0;}
	input.input,textarea{ padding:5px; border:solid 1px #bbb; width:70%;font:normal 12px/150% Arial, Helvetica, sans-serif;}
	textarea{ height:80px;}
	b.label{ width:18%; float:left; display:inline-block;margin:6px 15px 0;}
	.Boxheader,.Boxfooter,.Boxbody{ position:relative;}
	
	.headerR,.FooterR,.BodyR{ float:left;width:20px; }
	.headerL,.FooterL,.BodyL{ float:left;}
	
	.headerR{background:url(lightbox-header.png) no-repeat right 0; height:46px;}
	.headerL{background:url(lightbox-header.png) no-repeat left 0; height:46px;padding:0 0 0 20px;}
	
	.FooterR{background:url(lightbox-footer.png) no-repeat right 0;height:59px;}
	.FooterL{background:url(lightbox-footer.png) no-repeat left 0;height:39px;padding:10px 0 10px 20px;}
	
	
	
	.BodyL{background:url(lightbox-body.png) repeat-y left 0;padding:10px 0 10px 20px;}
	.BodyR{background:url(lightbox-body.png) repeat-y right 0;}
	
	.BoxMask{ height:100%; width:100%;left:0; top:0; background:#000;opacity:0.25;filter:alpha(opacity=25);}
	
	.Boxfooter{height:59px; }
	.Boxbody{overflow:hidden;}
	.Boxheader{ height:46px;cursor:move; }
	.Boxfooter .btn{ display:inline-block; float:right; margin:10px 10px 0 0;}
	</style>
  </head>
  
  <body>
  <script type="text/javascript" src="lightBox.js"></script>
  <script type="text/javascript">
	var html1 = '<iframe src="select.jsp" width=800 height=400 frameborder="0"></iframe>';
	var	footerhtml1='<input type="image" alt="Cancel" src="cancel_button.gif" class="btn" id="msg1cancel" />';
	var html2 = '<iframe src="SelectGoods.jsp" width=800 height=400 frameborder="0"></iframe>';
	var	footerhtml2='<input type="image" alt="Cancel" src="cancel_button.gif" class="btn" id="msg2cancel" />';
	var html3 = '<iframe src="stock.jsp" width=800 height=400 frameborder="0"></iframe>';
	var	footerhtml3='<input type="image" alt="Cancel" src="cancel_button.gif" class="btn" id="msg3cancel" />';
	</script>
  
    <div id="header"><div class="wrapper"><img src="logo.png"></div></div>
    <div id="banner">
    <div class="wrapper">
    <div class="counter">
    
	<table>
	
	<tr><td><div class="login-btn-panel"><a class="login-btn" type="submit" title="收银" id="shouyin" onclick='Box("msg1",800,400,html1,footerhtml1);'>收银</a></div></td></tr>
	<form action="CheckGoods" method="post"><tr><td><div class="login-btn-panel"><input class="login-btn" type="submit"title="查看商品信息" id="info-good" value="查看商品信息"style="font-family:微软雅黑"/></div></td></tr></form>
	<form action="Stock" method="post"><tr><td><div class="login-btn-panel"><input class="login-btn" type="submit"title="查看库存信息" id="kucun" value="查看库存信息"style="font-family:微软雅黑"></div></td></tr>
	<tr><td><div class="login-btn-panel"><a class="login-btn" type="button"title="退出登录" id="tuichu" onClick=window.location.replace("index.jsp")>退出登录</a></div></td></tr>
	
	
	</table>
	<%
	Date d=new Date();
	DateFormat format2 = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss"); 
	String date= format2.format(d);
	out.println(date);
	
	%>

	</div>
	</div>
	</div>
	<div id="footer"><span>CopyRight 2014.All Rights Reserved.</span></div>
  </body>
</html>
