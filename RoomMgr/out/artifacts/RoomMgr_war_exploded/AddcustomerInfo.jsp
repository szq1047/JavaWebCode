<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>客户信息的登记</title>
<link rel="stylesheet" type="text/css" href="CSS/myCss.css" />
<style type="text/css">
	
	.style2{
	width:400px;
	height:250px;
	text-align:center;
	margin-top:50px;
	margin-left:auto;
	margin-right:auto;
	border-style: solid;border-width:1px;border-color: gray;
	}
	.selectStyle{
		width:150px;
	}
</style>
</head>
<body>
<form method="post" action="addCusInfo.do">
	<div class="main">
	<table class="style2">
		<tr><td colspan="2"><center><h2>客户信息登记</h2></center></td></tr>
		<tr>
			<td >客户编号</td><td><input type="text" name="cno"></td>
		</tr>
		<tr>
			<td>客户姓名</td>
			
			<td>
				<input type="text" name="cname">
			</td>
		</tr>
		<tr>
			<td>性别</td>
			<td>
			<select class="selectStyle" name="csex">
					<option value="M">男</option>
					<option value="F" selected="selected">女</option>		
			</select>
			</td>
		</tr>
		<tr>
			<td>身份证号</td>
			<td>
			<input type="text" name="cid">
			</td>
		</tr>
		<tr><td colspan="2" align="center"><input type="submit" value="登记"/></td></tr>
		</table>
	</div>
	</form>
</body>
</html>