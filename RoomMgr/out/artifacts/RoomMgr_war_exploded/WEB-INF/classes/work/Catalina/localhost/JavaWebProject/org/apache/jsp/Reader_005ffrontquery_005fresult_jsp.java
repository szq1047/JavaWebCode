/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.59
 * Generated at: 2015-06-01 14:53:44 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;
import com.shuangyulin_QQ287307421.domain.Reader;
import com.shuangyulin_QQ287307421.domain.ReaderType;

public final class Reader_005ffrontquery_005fresult_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html;charset=gb2312");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write(" \r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");

    String path = request.getContextPath();
    String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
    List<Reader> readerList = (List<Reader>)request.getAttribute("readerList");
    //获取所有的readerType信息
    List<ReaderType> readerTypeList = (List<ReaderType>)request.getAttribute("readerTypeList");
    ReaderType readerType = (ReaderType)request.getAttribute("readerType");

    int currentPage =  (Integer)request.getAttribute("currentPage"); //当前页
    int totalPage =   (Integer)request.getAttribute("totalPage");  //一共多少页
    int  recordNumber =   (Integer)request.getAttribute("recordNumber");  //一共多少记录
    String readerNo = (String)request.getAttribute("readerNo"); //读者编号查询关键字
    String readerName = (String)request.getAttribute("readerName"); //姓名查询关键字
    String birthday = (String)request.getAttribute("birthday"); //读者生日查询关键字
    String telephone = (String)request.getAttribute("telephone"); //联系电话查询关键字

      out.write("\r\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Transitional//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd\">\r\n");
      out.write("<html xmlns=\"http://www.w3.org/1999/xhtml\">\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=gb2312\" />\r\n");
      out.write("<title>读者查询</title>\r\n");
      out.write("<style type=\"text/css\">\r\n");
      out.write("<!--\r\n");
      out.write("body {\r\n");
      out.write("    margin-left: 0px;\r\n");
      out.write("    margin-top: 0px;\r\n");
      out.write("    margin-right: 0px;\r\n");
      out.write("    margin-bottom: 0px;\r\n");
      out.write("}\r\n");
      out.write(".STYLE1 {font-size: 12px}\r\n");
      out.write(".STYLE3 {font-size: 12px; font-weight: bold; }\r\n");
      out.write(".STYLE4 {\r\n");
      out.write("    color: #03515d;\r\n");
      out.write("    font-size: 12px;\r\n");
      out.write("}\r\n");
      out.write("-->\r\n");
      out.write("</style>\r\n");
      out.write("\r\n");
      out.write(" <script src=\"");
      out.print(basePath );
      out.write("calendar.js\"></script>\r\n");
      out.write("<script>\r\n");
      out.write("var  highlightcolor='#c1ebff';\r\n");
      out.write("//此处clickcolor只能用win系统颜色代码才能成功,如果用#xxxxxx的代码就不行,还没搞清楚为什么:(\r\n");
      out.write("var  clickcolor='#51b2f6';\r\n");
      out.write("function  changeto(){\r\n");
      out.write("source=event.srcElement;\r\n");
      out.write("if  (source.tagName==\"TR\"||source.tagName==\"TABLE\")\r\n");
      out.write("return;\r\n");
      out.write("while(source.tagName!=\"TD\")\r\n");
      out.write("source=source.parentElement;\r\n");
      out.write("source=source.parentElement;\r\n");
      out.write("cs  =  source.children;\r\n");
      out.write("//alert(cs.length);\r\n");
      out.write("if  (cs[1].style.backgroundColor!=clickcolor&&source.id!=\"nc\")\r\n");
      out.write("for(i=0;i<cs.length;i++){\r\n");
      out.write("    cs[i].style.backgroundColor=clickcolor;\r\n");
      out.write("}\r\n");
      out.write("else\r\n");
      out.write("for(i=0;i<cs.length;i++){\r\n");
      out.write("    cs[i].style.backgroundColor=\"\";\r\n");
      out.write("}\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("function  changeback(){\r\n");
      out.write("if  (event.fromElement.contains(event.toElement)||source.contains(event.toElement)||source.id==\"nc\")\r\n");
      out.write("return\r\n");
      out.write("if  (event.toElement!=source&&cs[1].style.backgroundColor!=clickcolor)\r\n");
      out.write("//source.style.backgroundColor=originalcolor\r\n");
      out.write("for(i=0;i<cs.length;i++){\r\n");
      out.write("\tcs[i].style.backgroundColor=\"\";\r\n");
      out.write("}\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("/*跳转到查询结果的某页*/\r\n");
      out.write("function GoToPage(currentPage,totalPage) {\r\n");
      out.write("    if(currentPage==0) return;\r\n");
      out.write("    if(currentPage>totalPage) return;\r\n");
      out.write("    document.forms[0].currentPage.value = currentPage;\r\n");
      out.write("    document.forms[0].submit();\r\n");
      out.write("\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("function changepage(totalPage)\r\n");
      out.write("{\r\n");
      out.write("    var pageValue=document.bookQueryForm.pageValue.value;\r\n");
      out.write("    if(pageValue>totalPage) {\r\n");
      out.write("        alert('你输入的页码超出了总页数!');\r\n");
      out.write("        return ;\r\n");
      out.write("    }\r\n");
      out.write("    document.readerQueryForm.currentPage.value = pageValue;\r\n");
      out.write("    document.readerQueryForm.submit();\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("</script>\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("<body>\r\n");
      out.write("<form action=\"");
      out.print(basePath );
      out.write("/Reader/Reader_FrontQueryReader.action\" name=\"readerQueryForm\" method=\"post\">\r\n");
      out.write("<table width=\"100%\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n");
      out.write("  <tr>\r\n");
      out.write("    <td height=\"30\" background=\"");
      out.print(basePath );
      out.write("images/tab_05.gif\"><table width=\"100%\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n");
      out.write("      <tr>\r\n");
      out.write("        <td width=\"12\" height=\"30\"><img src=\"");
      out.print(basePath );
      out.write("images/tab_03.gif\" width=\"12\" height=\"30\" /></td>\r\n");
      out.write("        <td><table width=\"100%\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n");
      out.write("          <tr>\r\n");
      out.write("            <td width=\"46%\" valign=\"middle\"><table width=\"100%\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n");
      out.write("              <tr>\r\n");
      out.write("                <td width=\"5%\"><div align=\"center\"><img src=\"");
      out.print(basePath );
      out.write("images/tb.gif\" width=\"16\" height=\"16\" /></div></td>\r\n");
      out.write("                <td width=\"95%\" class=\"STYLE1\"><span class=\"STYLE3\">你当前的位置</span>：[读者管理]-[读者查询]</td>\r\n");
      out.write("              </tr>\r\n");
      out.write("            </table></td>\r\n");
      out.write("            <td width=\"54%\"><table border=\"0\" align=\"right\" cellpadding=\"0\" cellspacing=\"0\">\r\n");
      out.write("\r\n");
      out.write("            </table></td>\r\n");
      out.write("          </tr>\r\n");
      out.write("        </table></td>\r\n");
      out.write("        <td width=\"16\"><img src=\"");
      out.print(basePath );
      out.write("images/tab_07.gif\" width=\"16\" height=\"30\" /></td>\r\n");
      out.write("      </tr>\r\n");
      out.write("    </table></td>\r\n");
      out.write("  </tr>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("  <tr>\r\n");
      out.write("  <td>\r\n");
      out.write("读者编号:<input type=text name=\"readerNo\" value=\"");
      out.print(readerNo );
      out.write("\" />&nbsp;\r\n");
      out.write("读者类型：<select name=\"readerType.readerTypeId\">\r\n");
      out.write(" \t\t\t\t<option value=\"0\">不限制</option>\r\n");
      out.write(" \t\t\t\t");

 					for(ReaderType readerTypeTemp:readerTypeList) {
 			   
      out.write("\r\n");
      out.write(" \t\t\t   <option value=\"");
      out.print(readerTypeTemp.getReaderTypeId() );
      out.write('"');
      out.write('>');
      out.print(readerTypeTemp.getReaderTypeName() );
      out.write("</option>\r\n");
      out.write(" \t\t\t   ");

 					}
 				
      out.write("\r\n");
      out.write(" \t\t\t</select>\r\n");
      out.write("姓名:<input type=text name=\"readerName\" value=\"");
      out.print(readerName );
      out.write("\" />&nbsp;\r\n");
      out.write("读者生日:<input type=text readonly  name=\"birthday\" value=\"");
      out.print(birthday );
      out.write("\" onclick=\"setDay(this);\"/>&nbsp;<br/>\r\n");
      out.write("联系电话:<input type=text name=\"telephone\" value=\"");
      out.print(telephone );
      out.write("\" />&nbsp;\r\n");
      out.write("    <input type=hidden name=currentPage value=\"1\" />\r\n");
      out.write("    <input type=submit value=\"查询\" />\r\n");
      out.write("  </td>\r\n");
      out.write("</tr>\r\n");
      out.write("  <tr>\r\n");
      out.write("    <td><table width=\"100%\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n");
      out.write("      <tr>\r\n");
      out.write("        <td width=\"8\" background=\"");
      out.print(basePath );
      out.write("images/tab_12.gif\">&nbsp;</td>\r\n");
      out.write("        <td><table width=\"100%\" border=\"0\" cellpadding=\"0\" cellspacing=\"1\" bgcolor=\"b5d6e6\" onmouseover=\"changeto()\"  onmouseout=\"changeback()\">\r\n");
      out.write("          <tr>\r\n");
      out.write("          <!-- \r\n");
      out.write("            <td width=\"3%\" height=\"22\" background=\"");
      out.print(basePath );
      out.write("images/bg.gif\" bgcolor=\"#FFFFFF\"><div align=\"center\">\r\n");
      out.write("              <input type=\"checkbox\" name=\"checkall\" onclick=\"checkAll();\" />\r\n");
      out.write("            </div></td> -->\r\n");
      out.write("            <td width=\"3%\" height=\"22\" background=\"");
      out.print(basePath );
      out.write("images/bg.gif\" bgcolor=\"#FFFFFF\"><div align=\"center\"><span class=\"STYLE1\">序号</span></div></td>\r\n");
      out.write("            <td  height=\"22\" background=\"");
      out.print(basePath );
      out.write("images/bg.gif\" bgcolor=\"#FFFFFF\"><div align=\"center\"><span class=\"STYLE1\">读者编号</span></div></td>\r\n");
      out.write("            <td  height=\"22\" background=\"");
      out.print(basePath );
      out.write("images/bg.gif\" bgcolor=\"#FFFFFF\"><div align=\"center\"><span class=\"STYLE1\">读者类型</span></div></td>\r\n");
      out.write("            <td  height=\"22\" background=\"");
      out.print(basePath );
      out.write("images/bg.gif\" bgcolor=\"#FFFFFF\"><div align=\"center\"><span class=\"STYLE1\">姓名</span></div></td>\r\n");
      out.write("            <td  height=\"22\" background=\"");
      out.print(basePath );
      out.write("images/bg.gif\" bgcolor=\"#FFFFFF\"><div align=\"center\"><span class=\"STYLE1\">性别</span></div></td>\r\n");
      out.write("            <td  height=\"22\" background=\"");
      out.print(basePath );
      out.write("images/bg.gif\" bgcolor=\"#FFFFFF\"><div align=\"center\"><span class=\"STYLE1\">读者生日</span></div></td>\r\n");
      out.write("            <td  height=\"22\" background=\"");
      out.print(basePath );
      out.write("images/bg.gif\" bgcolor=\"#FFFFFF\"><div align=\"center\"><span class=\"STYLE1\">联系电话</span></div></td>\r\n");
      out.write("            <td  height=\"22\" background=\"");
      out.print(basePath );
      out.write("images/bg.gif\" bgcolor=\"#FFFFFF\"><div align=\"center\"><span class=\"STYLE1\">联系qq</span></div></td>\r\n");
      out.write("            <td  height=\"22\" background=\"");
      out.print(basePath );
      out.write("images/bg.gif\" bgcolor=\"#FFFFFF\"><div align=\"center\"><span class=\"STYLE1\">读者地址</span></div></td>\r\n");
      out.write("            <td  height=\"22\" background=\"");
      out.print(basePath );
      out.write("images/bg.gif\" bgcolor=\"#FFFFFF\"><div align=\"center\"><span class=\"STYLE1\">读者头像</span></div></td>\r\n");
      out.write("            <td  height=\"22\" background=\"");
      out.print(basePath );
      out.write("images/bg.gif\" bgcolor=\"#FFFFFF\"><div align=\"center\"><span class=\"STYLE1\">详情</span></div></td> \r\n");
      out.write("          </tr>\r\n");
      out.write("           ");

           		/*计算起始序号*/
            	int startIndex = (currentPage -1) * 3;
            	/*遍历记录*/
            	for(int i=0;i<readerList.size();i++) {
            		int currentIndex = startIndex + i + 1; //当前记录的序号
            		Reader reader = readerList.get(i); //获取到Reader对象
             
      out.write("\r\n");
      out.write("          <tr>\r\n");
      out.write("            <td height=\"20\" bgcolor=\"#FFFFFF\"><div align=\"center\" class=\"STYLE1\">\r\n");
      out.write("              <div align=\"center\">");
      out.print(currentIndex );
      out.write("</div>\r\n");
      out.write("            </div></td>\r\n");
      out.write("            <td height=\"20\" bgcolor=\"#FFFFFF\"><div align=\"center\"><span class=\"STYLE1\">");
      out.print(reader.getReaderNo() );
      out.write("</span></div></td>\r\n");
      out.write("            <td bgcolor=\"#FFFFFF\"><div align=\"center\"><span class=\"STYLE1\">");
      out.print(reader.getReaderType().getReaderTypeName() );
      out.write("</span></div></td>\r\n");
      out.write("            <td height=\"20\" bgcolor=\"#FFFFFF\"><div align=\"center\"><span class=\"STYLE1\">");
      out.print(reader.getReaderName() );
      out.write("</span></div></td>\r\n");
      out.write("            <td height=\"20\" bgcolor=\"#FFFFFF\"><div align=\"center\"><span class=\"STYLE1\">");
      out.print(reader.getSex() );
      out.write("</span></div></td>\r\n");
      out.write("            <td height=\"20\" bgcolor=\"#FFFFFF\"><div align=\"center\"><span class=\"STYLE1\">");
      out.print(reader.getBirthday() );
      out.write("</span></div></td>\r\n");
      out.write("            <td height=\"20\" bgcolor=\"#FFFFFF\"><div align=\"center\"><span class=\"STYLE1\">");
      out.print(reader.getTelephone() );
      out.write("</span></div></td>\r\n");
      out.write("            <td height=\"20\" bgcolor=\"#FFFFFF\"><div align=\"center\"><span class=\"STYLE1\">");
      out.print(reader.getQq() );
      out.write("</span></div></td>\r\n");
      out.write("            <td height=\"20\" bgcolor=\"#FFFFFF\"><div align=\"center\"><span class=\"STYLE1\">");
      out.print(reader.getAddress() );
      out.write("</span></div></td>\r\n");
      out.write("            <td height=\"20\" bgcolor=\"#FFFFFF\"><div align=\"center\"><span class=\"STYLE1\"><img src=\"");
      out.print(basePath);
      out.print(reader.getPhoto());
      out.write("\" width=\"50px\" height=\"50px\" /></span></div></td>\r\n");
      out.write("            <td height=\"20\" bgcolor=\"#FFFFFF\"><div align=\"center\"><span class=\"STYLE1\"><a href=\"");
      out.print(basePath  );
      out.write("Reader/Reader_FrontShowReaderQuery.action?readerNo=");
      out.print(reader.getReaderNo() );
      out.write("\">查看</a></span></div></td> \r\n");
      out.write("          </tr>\r\n");
      out.write("          ");
	} 
      out.write("\r\n");
      out.write("        </table></td>\r\n");
      out.write("        <td width=\"8\" background=\"images/tab_15.gif\">&nbsp;</td>\r\n");
      out.write("      </tr>\r\n");
      out.write("    </table></td>\r\n");
      out.write("  </tr>\r\n");
      out.write("\r\n");
      out.write("  <tr>\r\n");
      out.write("    <td height=\"35\" background=\"");
      out.print(basePath );
      out.write("images/tab_19.gif\"><table width=\"100%\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n");
      out.write("      <tr>\r\n");
      out.write("        <td width=\"12\" height=\"35\"><img src=\"");
      out.print(basePath );
      out.write("images/tab_18.gif\" width=\"12\" height=\"35\" /></td>\r\n");
      out.write("        <td><table width=\"100%\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n");
      out.write("          <tr>\r\n");
      out.write("            <td class=\"STYLE4\">&nbsp;&nbsp;共有");
      out.print(recordNumber );
      out.write("条记录，当前第 ");
      out.print(currentPage );
      out.write('/');
      out.print(totalPage );
      out.write(" 页</td>\r\n");
      out.write("            <td><table border=\"0\" align=\"right\" cellpadding=\"0\" cellspacing=\"0\">\r\n");
      out.write("                <tr>\r\n");
      out.write("                  <td width=\"40\"><img src=\"");
      out.print(basePath );
      out.write("images/first.gif\" width=\"37\" height=\"15\" style=\"cursor:hand;\" onclick=\"GoToPage(1,");
      out.print(totalPage );
      out.write(");\" /></td>\r\n");
      out.write("                  <td width=\"45\"><img src=\"");
      out.print(basePath );
      out.write("images/back.gif\" width=\"43\" height=\"15\" style=\"cursor:hand;\" onclick=\"GoToPage(");
      out.print(currentPage-1 );
      out.write(',');
      out.print(totalPage );
      out.write(");\"/></td>\r\n");
      out.write("                  <td width=\"45\"><img src=\"");
      out.print(basePath );
      out.write("images/next.gif\" width=\"43\" height=\"15\" style=\"cursor:hand;\" onclick=\"GoToPage(");
      out.print(currentPage+1 );
      out.write(',');
      out.print(totalPage );
      out.write(");\" /></td>\r\n");
      out.write("                  <td width=\"40\"><img src=\"");
      out.print(basePath );
      out.write("images/last.gif\" width=\"37\" height=\"15\" style=\"cursor:hand;\" onclick=\"GoToPage(");
      out.print(totalPage );
      out.write(',');
      out.print(totalPage );
      out.write(");\"/></td>\r\n");
      out.write("                  <td width=\"100\"><div align=\"center\"><span class=\"STYLE1\">转到第\r\n");
      out.write("                    <input name=\"pageValue\" type=\"text\" size=\"4\" style=\"height:12px; width:20px; border:1px solid #999999;\" />\r\n");
      out.write("                    页 </span></div></td>\r\n");
      out.write("                  <td width=\"40\"><img src=\"");
      out.print(basePath );
      out.write("images/go.gif\" onclick=\"changepage(");
      out.print(totalPage );
      out.write(");\" width=\"37\" height=\"15\" /></td>\r\n");
      out.write("                </tr>\r\n");
      out.write("            </table></td>\r\n");
      out.write("          </tr>\r\n");
      out.write("        </table></td>\r\n");
      out.write("        <td width=\"16\"><img src=\"");
      out.print(basePath );
      out.write("images/tab_20.gif\" width=\"16\" height=\"35\" /></td>\r\n");
      out.write("      </tr>\r\n");
      out.write("    </table></td>\r\n");
      out.write("  </tr>\r\n");
      out.write("</table>\r\n");
      out.write("  </form>\r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
