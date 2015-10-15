<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@ page import="java.util.*"%>
<%@ page import="com.roomMgr.model.CustomerInfo"%>
<%@ page import="com.roomMgr.model.RoomInfo"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%
	List<CustomerInfo> customerInfoList = (List<CustomerInfo>) request
.getAttribute("cusInfoList");
	Map<String, RoomInfo> roomInfoHashMap = (Map<String, RoomInfo>) request
	.getAttribute("roomInfoHashMap");
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>客人入住</title>
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
<script type="text/javascript" src="js/jquery-1.4.min.js"></script>
<script type="text/javascript">
/* 	function showSubMenu(obj) {
		//alert(obj);
		$.ajax({
			type : "post",
			url : "roomInfoById.do",
			data : "rno=" + obj,
			dataType : "json",
			success : function(RoomArray) {
				//获取原始的dom对象
				var rstyle = document.getElementById('rstyle');
				var rprice = document.getElementById('rprice');
				//使用原始的对象创建方法，new Option对象
				//需要尝试appendTo();方法。
				alert(RoomArray);
				rstyle.value = RoomArray[0].Rstyle;
				rprice.value = RoomArray[0].Rprice;
				//city_select.options[city_select.length] = new Option(cityArray[i].text,cityArray[i].value);
			}
		}); 
	}
	 */
	function showSubMenu(obj) {  
		// alert(obj);
	    //获取表单提交的内容  
	   	// var idField = document.getElementById("userName");  
	    //访问validate.do这个servlet，同时把获取的表单内容idField加入url字符串，以便传递给validate.do  
	    var url = "roomInfoById?rno=" + obj;                  
	    //创建一个XMLHttpRequest对象req  
	    if(window.XMLHttpRequest) {  
	        //IE7, Firefox, Opera支持  
	        req = new XMLHttpRequest();  
	    }else if(window.ActiveXObject) {  
	        //IE5,IE6支持  
	        req = new ActiveXObject("Microsoft.XMLHTTP");  
	    }  
	    /* 
	     open(String method,String url, boolean )函数有3个参数 
	     method参数指定向servlet发送请求所使用的方法，有GET,POST等 
	     boolean值指定是否异步，true为使用，false为不使用。 
	     我们使用异步才能体会到Ajax强大的异步功能。 
	     */  
	    req.open("POST", url, true);  
	    //onreadystatechange属性存有处理服务器响应的函数,有5个取值分别代表不同状态  
	    req.onreadystatechange = callback;  
	    //send函数发送请求  
	    req.send(null);                  
	}  
	  
	function callback() {  
	    if(req.readyState == 4 && req.status == 200) {  
	        var check = req.responseText;  
	        show (check);  
	    }  
	}  
	  
	function show(str) {  
		var rstyle = document.getElementById('rstyle');
		var rprice = document.getElementById('rprice');
		var lens=str.length;
		var str1=str.substring(2,lens-5);
		var str2=str1.split(',');
		for(var i=0;i<str2.length;i++){
			var obj=str2[i].split(':');   
			if(obj[0]=='"rstyle"'){
				rstyle.value=obj[1];
			}else if(obj[0]=='"rprice"'){
				rprice.value=obj[1];
			}
			
		} 
	}  
	function getToday(){
		var tfromDate=document.getElementById("tfromDate");
		var date = new Date();
		var dateFormat = date.getFullYear() + "-"+ (date.getMonth() + 1) + "-" + date.getDate();
		tfromDate.value=dateFormat;
	}
	function GetDateNow(){
		var tday=document.getElementById("tday").value;
		var tleftDate=document.getElementById("tleftDate");
		var date = new Date();
		var day=parseInt(tday);
		if(/^\d+$/.test(day)){//js判断是否为数字
			date.setDate(date.getDate()+day);
			tleftDate.value= date.getFullYear() + "-"+ (date.getMonth() + 1) + "-" + date.getDate();
		}else{
			alert("请输入整数！");
		}

		
	}
	function getMoney(){
		var tday=document.getElementById("tday").value;
		var rprice = document.getElementById("rprice").value;
		tday=parseInt(tday);
		rprice=parseInt(rprice);
		var tmoney=document.getElementById("tmoney");
		//alert(rprice*tday);
		tmoney.value=rprice*tday.toString();
	}
</script>
</head>
<body>
	<form method="post" action="roomEntry.do">
		<div class="main">
			<table class="style2">

				<tr>
					<td colspan="2"><input type="hidden" name="cno"
						value="<%=customerInfoList.get(0).getCno()%>"></td>
				</tr>
				<tr>
					<td>客户姓名</td>
					<td><input type="text" name="cname"
						value="<%=customerInfoList.get(0).getCname()%>"
						readonly="readonly"></td>
				</tr>

				<c:if test="${not empty roomInfoHashMap }">
					<tr>
						<td>房间号</td>
						<td><select class="selectStyle" name="rno" id="rno"
							onchange="showSubMenu(this.options[this.options.selectedIndex].value)">
								<c:forEach var="roommap" items="${roomInfoHashMap}">
									<option value="${roommap.key}">${roommap.key}</option>
								</c:forEach>
						</select></td>
					</tr>

				</c:if>
				<tr>
					<td>房间类型</td>
					<td><input type="text" name="rstyle" id="rstyle"
						readonly="readonly" onclick="<script>Date.Now()</script>"></td>
				</tr>
				<tr>
					<td>房间价格</td>
					<td><input type="text" name="rprice" id="rprice"
						readonly="readonly"></td>
				</tr>

				<tr>
					<td>入住日期</td>
					<td><input type="text" name="tfromDate" id="tfromDate"
						onclick="getToday()"></td>
				</tr>
				<tr>
					<td>入住天数</td>
					<td><input type="text" name="tday" id="tday"
						onblur="getMoney()"></td>
				</tr>
				<tr>
					<td>退房日期</td>
					<td><input type="text" name="tleftDate" id="tleftDate"
						onclick="GetDateNow()"></td>
				</tr>
				<tr>
					<td>金额</td>
					<td><input type="text" name="tmoney" id="tmoney"></td>
				</tr>
				<tr>
					<td>押金</td>
					<td><input type="text" name="tdeposit" value="100"></td>
				</tr>
				<tr>
					<td colspan="2" align="center"><input type="submit" value="开房" /></td>
				</tr>
			</table>
		</div>
	</form>
</body>
</html>