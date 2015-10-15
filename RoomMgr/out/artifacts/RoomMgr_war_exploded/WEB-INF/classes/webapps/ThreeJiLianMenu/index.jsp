<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'index.jsp' starting page</title>
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
	<script type="text/javascript" src="js/jquery-1.4.min.js"></script>
	<script type="text/javascript">
		
		
		function getTwo(obj){
			//alert(obj);
			$.ajax({
				type:"post",
				url:"getCity.do",
				data:"sheng="+obj,
				dataType:"json",
				success:function(cityArray){
				//获取原始的dom对象
					var city_select = document.getElementById('city');
					city_select.length=0;
					for(var i=0;i<cityArray.length;i++){
						//使用原始的对象创建方法，new Option对象
						//需要尝试appendTo();方法。
						city_select.options[city_select.length] = new Option(cityArray[i].text,cityArray[i].value);
					}
				}
			});
		}
		function getThree(obj){
			//alert(obj);
			$.ajax({
				type:"post",
				url:"getCountry.do",
				data:"shi="+obj,
				dataType:"json",
				success:function(jsonArray){//接受json对象
					//alert(jsonArray.length);
					var xian = document.getElementById("xian");
					xian.length=0;
					for(var i=0;i<jsonArray.length;i++){
						xian.options[xian.length]= new Option(jsonArray[i].text,jsonArray[i].name);
					}
				}
			});
		}
	</script>
  </head>
  
  <body style="font-size:30px"> 
  三级级联菜单实现 
    <hr>
    <table align="center">
    	<tr align="center">
					<td>
						籍贯:
					</td>
					<td>
						<select onchange="getTwo(this.value);" id="address">
							<option value="s">
								--省--
							</option>
							<option value="gd">
								广东省
							</option>
							<option value="jx">
								江西省
							</option>
						</select>
						<select id="city" onchange="getThree(this.value);">
							<option value="shi">
								--市--
							</option>
						</select>
						<select id="xian">
							<option value="xian">
								--县/区--
							</option>
						</select>
					</td>
				</tr>
    </table>
  </body>
</html>
