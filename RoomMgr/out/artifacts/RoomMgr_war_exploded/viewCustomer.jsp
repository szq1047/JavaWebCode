<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
    <%@ page import="java.util.*" %> 
<%@ page import="com.roomMgr.model.CustomerInfo" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%
	List<CustomerInfo> cusInfoList=(List<CustomerInfo>)request.getAttribute("cusInfoList");
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>客户信息表</title>
<link rel="stylesheet" type="text/css" href="CSS/myCss.css" />
<style type="text/css">
	.style1{margin-top:0px;;padding:0px;}
	.style2 td{
	width:150px;
	text-align:center;
	border-style: solid;border-width:1px;border-color: gray;
	}
</style>

</head>
<body>
<div class="main">
	<table >
		<tr>
			<table class="style2">
				<tr><td>客户编号</td><td>客户姓名</td><td>客户性别</td><td>身份证号</td><td>操作</td></tr>
				<c:if test="${empty cusInfoList }">
				<tr align="center"><td colspan="6">暂无数据</td></tr>
				</c:if>
				<c:if test="${not empty cusInfoList }">
				<c:forEach var="cus" items="${cusInfoList}" varStatus="i">
				<tr align="center">
					<td>${cus.getCno()}</td>
					<td>${cus.getCname()}</td>
					<td>
					<c:choose> 
  							<c:when test="${cus.getCsex()=='M'}">男</c:when> 
  							<c:otherwise>女</c:otherwise> 
  					</c:choose> 
					</td>
					<td>${cus.getCid()}</td>
					<td><a href="ViewCustomer.do?Cno=${cus.getCno()}&action=getCustomerInfoById">登记入住</a>  </td>	
				</tr>
				</c:forEach>
				</c:if>
			</table>
		</tr>		
	</table>
</div>
</body>
</html>