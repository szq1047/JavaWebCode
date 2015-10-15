<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta charset="UTF-8">
<title>登录界面</title>
<style type="text/css">
	.main{
		background-image: url(images/Yosemite2.jpg);
		background-repeat:no-repeat;
		background-position:left;
		background-attachment:fixed;
		overflow: hidden;
	}
	.div1{
		position:relative;
		left:500px;
		top:200px;
	}
	.tb1{
		width:400px;
		height:250px;
		border-color: blue;
		border-width: 1px;
		border-style: solid;
	}
</style>
</head>
<body class="main">
	<form method="post" action="UserLogin.do">
	<div class="div1">
		<table class="tb1">
			<tr>
			<td colspan="2"><center><h2>房间管理系统登录</h2></center></td>
			</tr>
			<tr>
			<td style="width:80px">用户名：</td>
			<td><input type="text" name="name" value="${requestScope.username}"/><font color="red">${requestScope.userError }</font></td>
			</tr>
			<tr>
			<td>密  码：</td>
			<td><input type="password" name="password"/><font color="red">${requestScope.pwdError }</font></td>
			</tr>
			<tr>
				<td colspan="2"><center><input type="submit" value="登录"/><font color="red">${requestScope.messageError }</font></center></td>
			</tr>
		</table>
	</div>
	
	</form>
</body>
</html>