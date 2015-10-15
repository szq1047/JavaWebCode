<%@page import="java.text.Format"%>
<%@page import="java.text.*"%>
<%@ page language="java" import="java.util.*" pageEncoding="gb2312"%>
<%@ page import="com.shuangyulin_QQ287307421.domain.LoanInfo" %>
<%@ page import="com.shuangyulin_QQ287307421.domain.Book" %>
<%@ page import="com.shuangyulin_QQ287307421.domain.Reader" %>
<%@ taglib prefix="s" uri="/struts-tags"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
    //获取所有的book信息
    List<Book> bookList = (List<Book>)request.getAttribute("bookList");
    //获取所有的reader信息
    List<Reader> readerList = (List<Reader>)request.getAttribute("readerList");
    LoanInfo loanInfo = (LoanInfo)request.getAttribute("loanInfo");
    String username=(String)session.getAttribute("username");
    if(username==null){
        response.getWriter().println("<script>top.location.href='" + basePath + "login/login_view.action';</script>");
    }
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<HTML><HEAD><TITLE>查看借阅信息</TITLE>
<STYLE type=text/css>
body{margin:0px; font-size:12px; background-image:url(<%=basePath%>images/bg.jpg); background-position:bottom; background-repeat:repeat-x; background-color:#A2D5F0;}
.STYLE1 {color: #ECE9D8}
.label {font-style.:italic; }
.errorLabel {font-style.:italic;  color:red; }
.errorMessage {font-weight:bold; color:red; }
</STYLE>
 <script src="<%=basePath %>calendar.js"></script>
 <script type="text/javascript">
 	window.onload=function(){
 	
 		var returndate_str=document.getElementById("s_returndate").value;//
 		var returndate=new Date(returndate_str.replace(/-/g,"/"));//应还日期
 		var returnSdate_input=document.getElementById("s_returnSdate");//获取实际归还日期控件
 		//输出以2015-06-15的格式
 		var returnSdate_str=new Date().getFullYear()+"-";
 		if((new Date().getMonth()+1)<10){
 			returnSdate_str+="0"+(new Date().getMonth()+1)+"-";
 		}else{
 			returnSdate_str+=(new Date().getMonth()+1)+"-";
 		}
 		if(new Date().getDate()<10){
 			returnSdate_str+="0"+new Date().getDate();
 		}else{
 			returnSdate_str+=new Date().getDate();
 		}
 		returnSdate_input.value=returnSdate_str;
 		//alert(returnSdate_str);
 		var returnSdate=new Date(returnSdate_str.replace(/-/g,"/"));
 		var punish=document.getElementById("lect");
 		if (returnSdate.getTime() > returndate.getTime()  ) {
 				var diffDays=DateDiff(returnSdate_str,returndate_str);
 				//alert(diffDays);
 				punish.value=diffDays/10+"元";
		}else{//否则的话罚款金额为0
				punish.value=0.0+"元";
		}
};
// 计算两个日期的间隔天数 
		function DateDiff(sDate1, sDate2){ //sDate1和sDate2是2002-12-18格式 
			var aDate, oDate1, oDate2, iDays;
			aDate = sDate1.split("-");
			oDate1 = new Date(aDate[1] +"/"+ aDate[2] +"/" + aDate[0]);//转换为12-18-2002格式 
			aDate = sDate2.split("-")  ;
			oDate2 = new Date(aDate[1] + "/" + aDate[2] + "/" + aDate[0]);
			iDays = parseInt(Math.abs(oDate1 - oDate2) / 1000 / 60 / 60 /24); //把相差的毫秒数转换为天数  
			return iDays  ;
		};
		
		//实现还书操作：当点击还书时
 	
 	
 </script>
</HEAD>
<BODY><br/><br/>
<s:fielderror cssStyle="color:red" />
<TABLE align="center" height="100%" cellSpacing=0 cellPadding=0 width="80%" border=0>
  <TBODY>
  <TR>
    <TD align="left" vAlign=top ><s:form action="/LoanInfo/LoanInfo_UpdateReturnBookLoanInfo.action" method="post" onsubmit="return checkForm();" enctype="multipart/form-data" name="form1">
<table width='100%' cellspacing='1' cellpadding='3'  class="tablewidth">
  <tr>
    <td width=30%>借阅编号:</td>
    <td width=70%><input id="loanInfo.loadId" name="loanInfo.loadId" type="text" value="<%=loanInfo.getLoadId() %>" readOnly /></td>
  </tr>

  <tr>
    <td width=30%>图书对象:</td>
    <td width=70%>
      <select name="loanInfo.book.barcode"  disabled="disabled">
      <%
        for(Book book:bookList) {
          String selected = "";
          if(book.getBarcode().equals(loanInfo.getBook().getBarcode()))
            selected = "selected";
      %>
          <option value='<%=book.getBarcode() %>' <%=selected %>><%=book.getBookName() %></option>
      <%
        }
      %>
      </select>
    </td>
  </tr>

  <tr>
    <td width=30%>读者对象:</td>
    <td width=70%>
      <select name="loanInfo.reader.readerNo" disabled="disabled">
      <%
        for(Reader reader:readerList) {
          String selected = "";
          if(reader.getReaderNo().equals(loanInfo.getReader().getReaderNo()))
            selected = "selected";
      %>
          <option value='<%=reader.getReaderNo() %>' <%=selected %>><%=reader.getReaderName() %></option>
      <%
        }
      %>
    </td>
  </tr>

  <tr>
    <td width=30%>借阅时间:</td>
    <td width=70%><input type="text" readonly  id="s_borrowdate"  name="loanInfo.borrowDate" value='<%=loanInfo.getBorrowDate() %>'/></td>
  </tr>

  <tr>
    <td width=30%>应归还时间:</td>
    <td width=70%><input type="text" readonly  id="s_returndate"  name="loanInfo.returnDate"  value='<%=loanInfo.getReturnDate() %>'/></td>
  </tr>
  <tr>
  <td width=30%>实际归还日期:</td>
  <td>
<!--<%=new SimpleDateFormat("yyyy-MM-dd").format(new Date()) %>  -->
<input type="text" readonly  id="s_returnSdate"  name="loanInfo.returnSDate"  value='<%=loanInfo.getReturnSDate()%>'/></td>
  </tr>
  <tr>
  <td width=30%>罚款金额:</td>
  <td><input type="text" readonly  id="lect"  name="loanInfo.punish"  value='<%=loanInfo.getPunish() %>'/></td>
  </tr>

  <tr>
      <td colspan="4" align="center">
      <input type="submit" value="还书" onclick="return confirm('确定要归还本书吗？');"/>
        <input type="button" value="返回" onclick="history.back();"/>
      </td>
    </tr>

</table>
</s:form>
   </TD></TR>
  </TBODY>
</TABLE>
</BODY>
</HTML>
