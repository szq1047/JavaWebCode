<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@ page import="java.util.*"%>
<%@ page import="com.roomMgr.model.RoomInfo"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%
	List<RoomInfo> roomInfoList = (List<RoomInfo>) request
			.getAttribute("roomInfoList");
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>修改客房信息</title>
<link rel="stylesheet" type="text/css" href="CSS/myCss.css" />
<style type="text/css">
.style2 {
	width: 400px;
	height: 250px;
	text-align: center;
	margin-top: 50px;
	margin-left: auto;
	margin-right: auto;
	border-style: solid;
	border-width: 1px;
	border-color: gray;
}

.selectStyle {
	width: 150px;
}
</style>

</head>
<body>
	<form method="post" action="updateRoomInfo.do">
		<div class="main">
			<table class="style2">
				<c:if test="${not empty roomInfoList }">
					<c:forEach var="rom" items="${roomInfoList}" varStatus="i">
						<tr>
							<td>房间编号</td>
							<td><input type="text" name="rno" value="${rom.getRno() }" readonly="readonly"/></td>
						</tr>
						<tr>
							<td>房间类型</td>
							<td><select class="selectStyle" name="rstyle" id="rstyle">
									<option value="1" >单人间</option>
									<option value="2" >双人间</option>
									<option value="3" >豪华单人间</option>
									<option value="4" >豪华双人间</option>
									<option value="5" >标准间</option>
							</select>
								<script>
								 for(var i=0;i<document.getElementById('rstyle').options.length;i++){
									if(document.getElementById('rstyle').options[i].text==='${rom.getRstyle()}'){
									document.getElementById('rstyle').options[i].selected=true;
									}
								}   
								
								</script>
							</td>
						</tr>
						<tr>
							<td>房间价格</td>
							<td><input type="text" name="rprice" value="${rom.getRprice() }"/></td>
						</tr>
						<tr>
							<td>房间状态</td>
							<td><select class="selectStyle" name="rstate" id="selstate">
									<option value="1">占用</option>
									<option value="2">未占用</option>
							</select>
							<script>
								 for(var i=0;i<document.getElementById('selstate').options.length;i++){
									if(document.getElementById('selstate').options[i].text==='${rom.getRstate()}'){
									document.getElementById('selstate').options[i].selected=true;
									}//通过遍历select标签的文件，如果文本与rom.getRstate()得到值相同，那么就设为标记
								}   
								</script>
							</td>
						</tr>
						<tr>
							<td>房间号码</td>
							<td><input type="text" name="rtel" value="${rom.getRtel() }"/></td>
						</tr>

						<tr>
							<td colspan="2" align="center"><input type="submit"
								value="修改" /></td>
						</tr>
					</c:forEach>
				</c:if>
			</table>
		</div>
	</form>
</body>
</html>