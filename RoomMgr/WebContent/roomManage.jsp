<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ page import="java.util.*" %> 
<%@ page import="com.roomMgr.model.RoomInfo" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%
	List<RoomInfo> roomInfoList=(List<RoomInfo>)request.getAttribute("roomInfoList");
	//List<RoomInfo> romInfoBySelect=(List<RoomInfo>)request.getAttribute("selectRoomInfo");
	//String message=request.getAttribute("message").toString();
%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>
<link rel="stylesheet" type="text/css" href="CSS/myCss.css" />
<style type="text/css">
	.style1{margin-top:0px;;padding:0px;}
	.style2 td{
	width:150px;
	text-align:center;
	border-style: solid;border-width:1px;border-color: gray;
	}
</style>
<script type="text/javascript">
	function Studelete(rno){
		msg="是否删除？";
		if(window.confirm(msg)){
			window.location="deleteRoomInfo.do?Rno="+rno;
		}
	}
</script>
</head>
<body>
<div class="main">
	<table >
		<tr><td><a href="addRoom.jsp">添加客房</a></td>
		<!-- <td>
			<form method="post" action="selectRoomInfo.do">
			<table style="margin-left: 100px">
			<tr>
			<td>房间类型：</td>
			<td>
			<select name="rstyle">
				<option value="1">单人间</option>
				<option value="2">双人间</option>
				<option value="3">豪华单人间</option>
				<option value="4">豪华双人间</option>
				<option value="5">标准间</option>
			</select></td>
			<td >房间状态：</td>
			<td><select name="rstate"><option value="1">占用</option><option value="2">未占用</option></select></td>
			<td><input type="submit" value="查询"></td>
			</tr>
			</table>
			</form>
		</td> -->
		</tr>
		<tr>
			<table class="style2">
				<tr><td>房间编号</td><td>房间类型</td><td>房间价格</td><td>房间状态</td><td>房内电话号码</td><td>操作</td></tr>
				<c:if test="${empty roomInfoList }">
				<tr align="center"><td colspan="6">暂无数据</td></tr>
				</c:if>
				<c:if test="${not empty roomInfoList }">
				<c:forEach var="rom" items="${roomInfoList}" varStatus="i">
				<tr align="center">
					<td>${rom.getRno()}</td>
					<td>${rom.getRstyle()}</td>
					<td>${rom.getRprice()}</td>
					<td>${rom.getRstate()}</td>
					<td>${rom.getRtel()}</td>
					<td><a href="RoomManage.do?Rno=${rom.getRno()}&action=getRoomInfoById">修改</a>  <a href="#" onclick="Studelete(${rom.getRno()});">删除</a></td>
					
				</tr>
				</c:forEach>
				</c:if>
			</table>
		</tr>		
	</table>
</div>
</body>
</html>