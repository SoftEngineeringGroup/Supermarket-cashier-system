<%@ page language="java" import="java.util.*" pageEncoding="GBK"%>
<%@page import="java.text.*" %>
<%@ page import="hib.Goods" %>
<%@page import="hib.Client" %>
<%! double totalPrice,r; 
  int b;
  int sum;
  double sumPrice;
  String date; 
%>
<jsp:useBean id="dx" scope="session" class="hib.Goods"/>
<jsp:useBean id="ax" scope="session" class="hib.Client"/>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <title>收银</title>
    <link href="shouyin.css" type="text/css" rel="stylesheet" />
  </head>
  
  <body>
  <div class="count">
  	<form action="ShouYin" method="post">
  		<table>
  			<%--  String goodsID=request.getParameter("goodsID");
				String buyQuantity=request.getParameter("buyQuantity");
				String counterID=request.getParameter("counterID");
			    String invoiceID=request.getParameter("invoiceID");
				String hID=request.getParameter("hID");
				String buyDate=request.getParameter("buyDate");
				String way=request.getParameter("way");
				String identify=request.getParameter("identify");
					
				if(invoiceID==null&&counterID==null){		
					Date d=new Date();
					DateFormat format2 = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss"); 
					date= format2.format(d);
				--%>
			<tr><td><font size='5'>收银员号：</font></td><td><input type="text" name="emp.counterId"></td></tr>
			<tr><td><font size='5'>发票号：</font></td><td><input type="text" name="emp.tradeId"></td></tr>
			<tr><td><font size='5'>会员号：</font></td><td><input type="text" name="emp.memberId"></td></tr>
			<tr><td><font size='5'>购买日期：</font></td><td><input type="text" name="emp.buyDate" ></td></tr>
			<tr><td><font size='5'>商品编号：</font></td><td><input type="text" name="emp.goodsId"></td></tr>
			         
			
			<tr> <td><font size='5'>数量：</font></td><td><input type="text" name="emp.saleQuantity"></td></tr>
			
			
			<tr><td><div class="login-btn-panel"><input class="login-btn" type="submit" name="submit" value="加入"style="font-family:微软雅黑">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<input class="login-btn" type="submit" name="jieshu" value="结束收银"style="font-family:微软雅黑"></div></td></tr>
			
	
			<table border="1px">
				
				<%--  <%
				try{
				if(way.equals("credit")){
				   out.println("<tr><td>"+"信用卡号："+"</td>");
				 %>
				 <td><input type="password" name="credit"></td></tr>
				<%out.println("<tr><td>"+"密码："+"</td>"); %>
				 <td><input type="password" name="password"></td></tr>
				<% out.println("<tr><td>"+"人民币/信用卡："+"</td>");
				%>
				<td><input type="text" name="cash/credit"></td></tr>
				
				<%	out.println("<tr><td>"+"找回："+"</td>");
				%>
				<td><input type="text" name="cash/credit"></td></tr>
				<%
				
				}else if(way.equals("cash")){
					out.println("<tr><td>"+"<font size='5'>"+"人民币/信用卡："+"</font>"+"</td>");
					%>
					<td><input type="text" name="cash/credit"></td></tr>
				
					<%	out.println("<tr><td>"+"<font size='5'>"+"找回："+"</font>"+"</td>");
					%>
					<td><input type="text" name="cash/credit"></td></tr>
					
				<%
				}
				else{
					out.println("<font size='5'>"+"选择一种付款方式"+"</font>");
				}
				}catch(Exception e){
					out.println("");
				}
				%>--%>
			</table>
			
  		</table>
  	</form>
  	</div>
  </body>
</html>
