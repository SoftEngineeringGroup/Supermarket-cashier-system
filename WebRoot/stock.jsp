<%@ page language="java" import="java.util.*" pageEncoding="GBK" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
	<head>
		<title>查看库存信息</title>
		<link href="sg.css" type="text/css" rel="stylesheet"/>
	</head>
	<body>
	 <form action="Stock" method="post">
	   </form> 
	<%--<% 
     Vector goodsVector=Stock.getAllGoods();
     int length=goodsVector.size();
    --%>
		<div class="count">
		<h1 align="center">库存商品</h1>
			<table border="1" align="center" bgcolor='white'>
	     <tr>
	       <th align="center"><font size='3'>商品编号</font></th>
	       <th  align="center"><font size='3'>商品名称</font></th>
	       <th align="center"><font size='3'>总数量</font></th>
	       <th align="center"><font size='3'>卖出数量</font></th>
	       <th align="center"><font size='3'>所剩数量</font></th>
	       <th align="center"><font size='3'>总收银</font></th>
	     </tr>
	     <s:iterator value="list">
	     <tr>
	        <td>
	     <s:property value="goodsId"/>
	        </td>
	         <td>
	     <s:property value="goodsName"/>
	        </td>
	         <td>
	     <s:property value="total"/>
	        </td>
	          <td>
	     <s:property value="saleQuantity"/>
	        </td>
	           <td>
	     <s:property value="currentQuantity"/>
	        </td>
	            <td>
	     <s:property value="sumPrice"/>
	        </td>
	     </tr>

	</s:iterator>
	   </table>
			
		</div>
	</body>
</html>