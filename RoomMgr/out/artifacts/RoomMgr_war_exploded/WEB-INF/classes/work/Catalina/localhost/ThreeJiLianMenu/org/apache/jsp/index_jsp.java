/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.59
 * Generated at: 2015-08-04 14:25:12 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html;charset=utf-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write('\r');
      out.write('\n');

String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";

      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\">\r\n");
      out.write("<html>\r\n");
      out.write("  <head>\r\n");
      out.write("    <base href=\"");
      out.print(basePath);
      out.write("\">\r\n");
      out.write("    \r\n");
      out.write("    <title>My JSP 'index.jsp' starting page</title>\r\n");
      out.write("\t<meta http-equiv=\"pragma\" content=\"no-cache\">\r\n");
      out.write("\t<meta http-equiv=\"cache-control\" content=\"no-cache\">\r\n");
      out.write("\t<meta http-equiv=\"expires\" content=\"0\">    \r\n");
      out.write("\t<meta http-equiv=\"keywords\" content=\"keyword1,keyword2,keyword3\">\r\n");
      out.write("\t<meta http-equiv=\"description\" content=\"This is my page\">\r\n");
      out.write("\t<!--\r\n");
      out.write("\t<link rel=\"stylesheet\" type=\"text/css\" href=\"styles.css\">\r\n");
      out.write("\t-->\r\n");
      out.write("\t<script type=\"text/javascript\" src=\"js/jquery-1.4.min.js\"></script>\r\n");
      out.write("\t<script type=\"text/javascript\">\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t\r\n");
      out.write("\t\tfunction getTwo(obj){\r\n");
      out.write("\t\t\t//alert(obj);\r\n");
      out.write("\t\t\t$.ajax({\r\n");
      out.write("\t\t\t\ttype:\"post\",\r\n");
      out.write("\t\t\t\turl:\"getCity.do\",\r\n");
      out.write("\t\t\t\tdata:\"sheng=\"+obj,\r\n");
      out.write("\t\t\t\tdataType:\"json\",\r\n");
      out.write("\t\t\t\tsuccess:function(cityArray){\r\n");
      out.write("\t\t\t\t//获取原始的dom对象\r\n");
      out.write("\t\t\t\t\tvar city_select = document.getElementById('city');\r\n");
      out.write("\t\t\t\t\tcity_select.length=0;\r\n");
      out.write("\t\t\t\t\tfor(var i=0;i<cityArray.length;i++){\r\n");
      out.write("\t\t\t\t\t\t//使用原始的对象创建方法，new Option对象\r\n");
      out.write("\t\t\t\t\t\t//需要尝试appendTo();方法。\r\n");
      out.write("\t\t\t\t\t\tcity_select.options[city_select.length] = new Option(cityArray[i].text,cityArray[i].value);\r\n");
      out.write("\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t\t});\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\tfunction getThree(obj){\r\n");
      out.write("\t\t\t//alert(obj);\r\n");
      out.write("\t\t\t$.ajax({\r\n");
      out.write("\t\t\t\ttype:\"post\",\r\n");
      out.write("\t\t\t\turl:\"getCountry.do\",\r\n");
      out.write("\t\t\t\tdata:\"shi=\"+obj,\r\n");
      out.write("\t\t\t\tdataType:\"json\",\r\n");
      out.write("\t\t\t\tsuccess:function(jsonArray){//接受json对象\r\n");
      out.write("\t\t\t\t\t//alert(jsonArray.length);\r\n");
      out.write("\t\t\t\t\tvar xian = document.getElementById(\"xian\");\r\n");
      out.write("\t\t\t\t\txian.length=0;\r\n");
      out.write("\t\t\t\t\tfor(var i=0;i<jsonArray.length;i++){\r\n");
      out.write("\t\t\t\t\t\txian.options[xian.length]= new Option(jsonArray[i].text,jsonArray[i].name);\r\n");
      out.write("\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t\t});\r\n");
      out.write("\t\t}\r\n");
      out.write("\t</script>\r\n");
      out.write("  </head>\r\n");
      out.write("  \r\n");
      out.write("  <body style=\"font-size:30px\"> \r\n");
      out.write("  三级级联菜单实现 \r\n");
      out.write("    <hr>\r\n");
      out.write("    <table align=\"center\">\r\n");
      out.write("    \t<tr align=\"center\">\r\n");
      out.write("\t\t\t\t\t<td>\r\n");
      out.write("\t\t\t\t\t\t籍贯:\r\n");
      out.write("\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t<td>\r\n");
      out.write("\t\t\t\t\t\t<select onchange=\"getTwo(this.value);\" id=\"address\">\r\n");
      out.write("\t\t\t\t\t\t\t<option value=\"s\">\r\n");
      out.write("\t\t\t\t\t\t\t\t--省--\r\n");
      out.write("\t\t\t\t\t\t\t</option>\r\n");
      out.write("\t\t\t\t\t\t\t<option value=\"gd\">\r\n");
      out.write("\t\t\t\t\t\t\t\t广东省\r\n");
      out.write("\t\t\t\t\t\t\t</option>\r\n");
      out.write("\t\t\t\t\t\t\t<option value=\"jx\">\r\n");
      out.write("\t\t\t\t\t\t\t\t江西省\r\n");
      out.write("\t\t\t\t\t\t\t</option>\r\n");
      out.write("\t\t\t\t\t\t</select>\r\n");
      out.write("\t\t\t\t\t\t<select id=\"city\" onchange=\"getThree(this.value);\">\r\n");
      out.write("\t\t\t\t\t\t\t<option value=\"shi\">\r\n");
      out.write("\t\t\t\t\t\t\t\t--市--\r\n");
      out.write("\t\t\t\t\t\t\t</option>\r\n");
      out.write("\t\t\t\t\t\t</select>\r\n");
      out.write("\t\t\t\t\t\t<select id=\"xian\">\r\n");
      out.write("\t\t\t\t\t\t\t<option value=\"xian\">\r\n");
      out.write("\t\t\t\t\t\t\t\t--县/区--\r\n");
      out.write("\t\t\t\t\t\t\t</option>\r\n");
      out.write("\t\t\t\t\t\t</select>\r\n");
      out.write("\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("    </table>\r\n");
      out.write("  </body>\r\n");
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
