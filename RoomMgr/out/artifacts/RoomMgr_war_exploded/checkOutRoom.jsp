<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@ page import="java.util.*"%>
<%@ page import="com.roomMgr.model.CustomerInfo"%>
<%@ page import="com.roomMgr.model.RoomInfo"%>
<%@ page import="com.roomMgr.model.CustomerLivingInfo"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>结算</title>
<link rel="stylesheet" type="text/css" href="CSS/myCss.css" />
<style type="text/css">
.style2{
	width:400px;
	height:250px;
	text-align:left;
	margin-top:50px;
	margin-left:auto;
	margin-right:auto;
	border-style: solid;border-width:1px;border-color: gray;
	}
	.selectStyle{
		width:150px;
	}
</style>
<script type="text/javascript">
	function CalcMoney(){
		var spend=document.getElementById("spend").value;
		var returnMoney=document.getElementById("return");
		var spendMoney=parseFloat(spend);
		if(/^\d+$/.test(spendMoney)){
			if(spendMoney<=100){
				returnMoney.value=100-spendMoney;
			}else{
				alert("请补交"+(spendMoney-100)+"元");
			}
		}else{
			alert("请输入数字！");
		}
	}
</script>
</head>
<body>
<form method="post" action="checkoutRoom.do">
	<div class="main">
		<table class="style2">
			<tr><td colspan="2"><center><h2>退房结算</h2></center></td></tr>
			<%
				List<CustomerLivingInfo> livingInfo = (List<CustomerLivingInfo>) request.getAttribute("livingInfo");
				List<RoomInfo> roomInfo = (List<RoomInfo>) request.getAttribute("roomInfo");
				List<CustomerInfo> cusInfo = (List<CustomerInfo>) request.getAttribute("cusInfo");
				for (int i = 0; i < livingInfo.size(); i++) {
			%>
			<tr>
				<td>客户编号</td>
				<td><input type="text" name="cno" readonly="readonly" value="<%=cusInfo.get(i).getCno()%>"></td>
			</tr>
			<tr>
				<td>客户姓名</td>
				<td><%=cusInfo.get(i).getCname()%></td>
			</tr>
			<tr>
				<td>房间号</td>
				<td><input type="text" name="rno" readonly="readonly" value="<%=roomInfo.get(i).getRno()%>"></td>
			</tr>
			<tr>
				<td>入住日期</td>
				<td><%=livingInfo.get(i).getTenrollDate()%></td>
			</tr>
			<tr>
				<td>退房日期</td>
				<td><%=livingInfo.get(i).getTleftDate()%></td>
			</tr>
			<tr>
				<td>住房金额</td>
				<td><%=livingInfo.get(i).getTmoney()%></td>
			</tr>
			<tr>
				<td>押金</td>
				<td><%=livingInfo.get(i).getDeposit()%></td>
			</tr>
			<tr>
				<td>消费金额</td>
				<td><input type="text" name="spend" id="spend" onblur="CalcMoney()"></td>
			</tr>
			<tr>
				<td>找回金额</td>
				<td><input type="text" name="return" id="return" readonly="readonly"></td>
			</tr>
			<tr>
				<td colspan="2"><center>
						<input type="submit" value="结算">
					</center></td>
			</tr>
			<%
				}
			%>
		</table>
	</div>
</form>
</body>
</html>