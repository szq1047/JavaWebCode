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
<title>客户退房信息表</title>
<link rel="stylesheet" type="text/css" href="CSS/myCss.css" />
<style type="text/css">
.style1 {
	margin-top: 0px;;
	padding: 0px;
}

.style2 td {
	width: 150px;
	text-align: center;
	border-style: solid;
	border-width: 1px;
	border-color: gray;
}
</style>

</head>
<body>
	<div class="main">
		<table>
			<tr>
				<table class="style2">

					<tr>
						<td>客户编号</td>
						<td>客户姓名</td>
						<td>房间号</td>
						<td>入住日期</td>
						<td>退房日期</td>
						<td>操作</td>
					</tr>
					<%
						List<CustomerLivingInfo> livingInfo = (List<CustomerLivingInfo>) request.getAttribute("livingInfo");
						List<RoomInfo> roomInfo = (List<RoomInfo>) request.getAttribute("roomInfo");
						List<CustomerInfo> cusInfo = (List<CustomerInfo>) request.getAttribute("cusInfo");
						for (int i = 0; i < livingInfo.size(); i++){
					%>
					<tr align="center">
						<td><%=cusInfo.get(i).getCno()%></td>
						<td><%=cusInfo.get(i).getCname()%></td>
						<td><%=roomInfo.get(i).getRno()%></td>
						<td><%=livingInfo.get(i).getTenrollDate()%></td>
						<td><%=livingInfo.get(i).getTleftDate()%></td>
						<td>
						<%if(livingInfo.get(i).getDeposit()==0) {%>
							已退房
						<%} else{%>
							<a href="viewCustomerEntryInfo.do?Cno=<%=cusInfo.get(i).getCno()%>&Rno=<%=roomInfo.get(i).getRno() %>&action=getLivingInfoById">退房</a>
						<%} %>
						</td>
					</tr>
					<%} %>
				</table>
			</tr>
		</table>
	</div>
</body>
</html>