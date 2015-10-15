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
    //��ȡ���е�book��Ϣ
    List<Book> bookList = (List<Book>)request.getAttribute("bookList");
    //��ȡ���е�reader��Ϣ
    List<Reader> readerList = (List<Reader>)request.getAttribute("readerList");
    LoanInfo loanInfo = (LoanInfo)request.getAttribute("loanInfo");
    String username=(String)session.getAttribute("username");
    if(username==null){
        response.getWriter().println("<script>top.location.href='" + basePath + "login/login_view.action';</script>");
    }
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<HTML><HEAD><TITLE>�鿴������Ϣ</TITLE>
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
 		var returndate=new Date(returndate_str.replace(/-/g,"/"));//Ӧ������
 		var returnSdate_input=document.getElementById("s_returnSdate");//��ȡʵ�ʹ黹���ڿؼ�
 		//�����2015-06-15�ĸ�ʽ
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
 				punish.value=diffDays/10+"Ԫ";
		}else{//����Ļ�������Ϊ0
				punish.value=0.0+"Ԫ";
		}
};
// �����������ڵļ������ 
		function DateDiff(sDate1, sDate2){ //sDate1��sDate2��2002-12-18��ʽ 
			var aDate, oDate1, oDate2, iDays;
			aDate = sDate1.split("-");
			oDate1 = new Date(aDate[1] +"/"+ aDate[2] +"/" + aDate[0]);//ת��Ϊ12-18-2002��ʽ 
			aDate = sDate2.split("-")  ;
			oDate2 = new Date(aDate[1] + "/" + aDate[2] + "/" + aDate[0]);
			iDays = parseInt(Math.abs(oDate1 - oDate2) / 1000 / 60 / 60 /24); //�����ĺ�����ת��Ϊ����  
			return iDays  ;
		};
		
		//ʵ�ֻ�����������������ʱ
 	
 	
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
    <td width=30%>���ı��:</td>
    <td width=70%><input id="loanInfo.loadId" name="loanInfo.loadId" type="text" value="<%=loanInfo.getLoadId() %>" readOnly /></td>
  </tr>

  <tr>
    <td width=30%>ͼ�����:</td>
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
    <td width=30%>���߶���:</td>
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
    <td width=30%>����ʱ��:</td>
    <td width=70%><input type="text" readonly  id="s_borrowdate"  name="loanInfo.borrowDate" value='<%=loanInfo.getBorrowDate() %>'/></td>
  </tr>

  <tr>
    <td width=30%>Ӧ�黹ʱ��:</td>
    <td width=70%><input type="text" readonly  id="s_returndate"  name="loanInfo.returnDate"  value='<%=loanInfo.getReturnDate() %>'/></td>
  </tr>
  <tr>
  <td width=30%>ʵ�ʹ黹����:</td>
  <td>
<!--<%=new SimpleDateFormat("yyyy-MM-dd").format(new Date()) %>  -->
<input type="text" readonly  id="s_returnSdate"  name="loanInfo.returnSDate"  value='<%=loanInfo.getReturnSDate()%>'/></td>
  </tr>
  <tr>
  <td width=30%>������:</td>
  <td><input type="text" readonly  id="lect"  name="loanInfo.punish"  value='<%=loanInfo.getPunish() %>'/></td>
  </tr>

  <tr>
      <td colspan="4" align="center">
      <input type="submit" value="����" onclick="return confirm('ȷ��Ҫ�黹������');"/>
        <input type="button" value="����" onclick="history.back();"/>
      </td>
    </tr>

</table>
</s:form>
   </TD></TR>
  </TBODY>
</TABLE>
</BODY>
</HTML>
