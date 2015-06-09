<%@ page language="java" import="java.util.*" pageEncoding="GBK"%>
<%@ page import="java.util.List" %>
<%@ page import="hib.Goods" %>
<%@ page import="hib.GoodsDAO" %>
<%@ page import="service.GoodsService" %>
<%@ page import="service.impl.GoodsServiceImpl" %>
<%@ page import="javax.servlet.*" %>

<%@ page import="org.apache.struts2.ServletActionContext" %>
<%@ page import="org.omg.CORBA.Request" %>
<%@ page import="org.springframework.context.ApplicationContext" %>
<%@ page import="org.springframework.web.context.support.WebApplicationContextUtils" %>

<%@ page import="com.opensymphony.xwork2.ActionContext" %>
<%@ page import="com.opensymphony.xwork2.ActionSupport" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    
    <title>查看商品信息</title>
	<link rel="stylesheet" type="text/css" href="sg.css">

  </head>

  <body>

   <form action="CheckGoods" method="post">
	   </form> 
  <div class="count">
    <h1 align="center">商品信息表</h1>
	<h2>
	<table align="center" border="1px">
	<tr><th><font size='3'>商品名</font></th><th><font size='3'>商品号</font></th><th><font size='3'>单价</font></th><th><font size='3'>会员价</font></th><th><font size='3'>总数量</font></th><th><font size='3'>当前数量</font></th></tr> 
	<s:iterator value="list">
	     <tr>
	        <td>
	     <s:property value="goodsName"/>
	        </td>
	         <td>
	     <s:property value="goodsId"/>
	        </td>
	         <td>
	     <s:property value="price"/>
	        </td>
	          <td>
	     <s:property value="memberPrice"/>
	        </td>
	           <td>
	     <s:property value="total"/>
	        </td>
	            <td>
	     <s:property value="currentQuantity"/>
	        </td>
	     </tr>

	</s:iterator>
	
	<%--<%} --%>
	</table>
	</h2>
	</div>
  </body>
</html>
