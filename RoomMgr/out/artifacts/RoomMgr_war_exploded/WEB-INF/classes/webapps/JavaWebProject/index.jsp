<%@ page language="java" import="java.util.*" pageEncoding="gb2312"%> <%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<html>
<head>
<title>˫���ֻ���SSH2ͼ�����ϵͳ������-��ҳ</title>
<link href="<%=basePath %>css/index.css" rel="stylesheet" type="text/css" />
 </head>
<body>
<div id="container">
	<div id="banner"><img src="<%=basePath %>images/logo.gif" /></div>
	<div id="globallink">
		<ul>
			<li><a href="<%=basePath %>index.jsp">��ҳ</a></li>
			<li><a href="<%=basePath %>BookType/BookType_FrontQueryBookType.action" target="OfficeMain">ͼ������</a></li> 
			<li><a href="<%=basePath %>Book/Book_FrontQueryBook.action" target="OfficeMain">ͼ��</a></li> 
			<li><a href="<%=basePath %>ReaderType/ReaderType_FrontQueryReaderType.action" target="OfficeMain">��������</a></li> 
			<li><a href="<%=basePath %>Reader/Reader_FrontQueryReader.action" target="OfficeMain">����</a></li> 
			<li><a href="<%=basePath %>LoanInfo/LoanInfo_FrontQueryLoanInfo.action" target="OfficeMain">������Ϣ</a></li> 
		</ul>
		<br />
	</div> 
	<div id="main">
	 <iframe id="frame1" src="<%=basePath %>desk.jsp" name="OfficeMain" width="100%" height="100%" scrolling="yes" marginwidth=0 marginheight=0 frameborder=0 vspace=0 hspace=0 >
	 </iframe>
	</div>
	<div id="footer">
		<p>˫������� QQ:287307421��254540457 �ֻ�:13908064703 &copy;��Ȩ���� <a href="http://taochengxu.taobao.com" target="_blank">˫�����Ա���</a>&nbsp;&nbsp;<a href="<%=basePath%>login/login_view.action"><font color=red>��̨��½</font></a></p>
	</div>
</div>
</body>
</html>