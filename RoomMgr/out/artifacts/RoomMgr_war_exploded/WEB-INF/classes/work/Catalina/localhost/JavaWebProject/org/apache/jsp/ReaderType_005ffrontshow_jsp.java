/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.59
 * Generated at: 2015-05-10 12:14:30 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;
import com.shuangyulin_QQ287307421.domain.ReaderType;

public final class ReaderType_005ffrontshow_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fs_005ffielderror_0026_005fcssStyle_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fs_005fform_0026_005fonsubmit_005fname_005fmethod_005fenctype_005faction;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fs_005ffielderror_0026_005fcssStyle_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fs_005fform_0026_005fonsubmit_005fname_005fmethod_005fenctype_005faction = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fs_005ffielderror_0026_005fcssStyle_005fnobody.release();
    _005fjspx_005ftagPool_005fs_005fform_0026_005fonsubmit_005fname_005fmethod_005fenctype_005faction.release();
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

    String path = request.getContextPath();
    String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
    ReaderType readerType = (ReaderType)request.getAttribute("readerType");


      out.write("\r\n");
      out.write("<HTML><HEAD><TITLE>查看读者类型</TITLE>\r\n");
      out.write("<STYLE type=text/css>\r\n");
      out.write("body{margin:0px; font-size:12px; background-image:url(");
      out.print(basePath);
      out.write("images/bg.jpg); background-position:bottom; background-repeat:repeat-x; background-color:#A2D5F0;}\r\n");
      out.write(".STYLE1 {color: #ECE9D8}\r\n");
      out.write(".label {font-style.:italic; }\r\n");
      out.write(".errorLabel {font-style.:italic;  color:red; }\r\n");
      out.write(".errorMessage {font-weight:bold; color:red; }\r\n");
      out.write("</STYLE>\r\n");
      out.write(" <script src=\"");
      out.print(basePath );
      out.write("calendar.js\"></script>\r\n");
      out.write("</HEAD>\r\n");
      out.write("<BODY><br/><br/>\r\n");
      if (_jspx_meth_s_005ffielderror_005f0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("<TABLE align=\"center\" height=\"100%\" cellSpacing=0 cellPadding=0 width=\"80%\" border=0>\r\n");
      out.write("  <TBODY>\r\n");
      out.write("  <TR>\r\n");
      out.write("    <TD align=\"left\" vAlign=top >");
      //  s:form
      org.apache.struts2.views.jsp.ui.FormTag _jspx_th_s_005fform_005f0 = (org.apache.struts2.views.jsp.ui.FormTag) _005fjspx_005ftagPool_005fs_005fform_0026_005fonsubmit_005fname_005fmethod_005fenctype_005faction.get(org.apache.struts2.views.jsp.ui.FormTag.class);
      _jspx_th_s_005fform_005f0.setPageContext(_jspx_page_context);
      _jspx_th_s_005fform_005f0.setParent(null);
      // /ReaderType_frontshow.jsp(25,33) name = action type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_s_005fform_005f0.setAction("");
      // /ReaderType_frontshow.jsp(25,33) name = method type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_s_005fform_005f0.setMethod("post");
      // /ReaderType_frontshow.jsp(25,33) name = onsubmit type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_s_005fform_005f0.setOnsubmit("return checkForm();");
      // /ReaderType_frontshow.jsp(25,33) name = enctype type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_s_005fform_005f0.setEnctype("multipart/form-data");
      // /ReaderType_frontshow.jsp(25,33) name = name type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_s_005fform_005f0.setName("form1");
      int _jspx_eval_s_005fform_005f0 = _jspx_th_s_005fform_005f0.doStartTag();
      if (_jspx_eval_s_005fform_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        if (_jspx_eval_s_005fform_005f0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
          out = _jspx_page_context.pushBody();
          _jspx_th_s_005fform_005f0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
          _jspx_th_s_005fform_005f0.doInitBody();
        }
        do {
          out.write("\r\n");
          out.write("<table width='100%' cellspacing='1' cellpadding='3'  class=\"tablewidth\">\r\n");
          out.write("  <tr>\r\n");
          out.write("    <td width=30%>读者类型编号:</td>\r\n");
          out.write("    <td width=70%>");
          out.print(readerType.getReaderTypeId() );
          out.write("</td>\r\n");
          out.write("  </tr>\r\n");
          out.write("\r\n");
          out.write("  <tr>\r\n");
          out.write("    <td width=30%>读者类型:</td>\r\n");
          out.write("    <td width=70%>");
          out.print(readerType.getReaderTypeName() );
          out.write("</td>\r\n");
          out.write("  </tr>\r\n");
          out.write("\r\n");
          out.write("  <tr>\r\n");
          out.write("    <td width=30%>可借阅数目:</td>\r\n");
          out.write("    <td width=70%>");
          out.print(readerType.getNumber() );
          out.write("</td>\r\n");
          out.write("  </tr>\r\n");
          out.write("\r\n");
          out.write("  <tr>\r\n");
          out.write("      <td colspan=\"4\" align=\"center\">\r\n");
          out.write("        <input type=\"button\" value=\"返回\" onclick=\"history.back();\"/>\r\n");
          out.write("      </td>\r\n");
          out.write("    </tr>\r\n");
          out.write("\r\n");
          out.write("</table>\r\n");
          int evalDoAfterBody = _jspx_th_s_005fform_005f0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
        if (_jspx_eval_s_005fform_005f0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
          out = _jspx_page_context.popBody();
        }
      }
      if (_jspx_th_s_005fform_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _005fjspx_005ftagPool_005fs_005fform_0026_005fonsubmit_005fname_005fmethod_005fenctype_005faction.reuse(_jspx_th_s_005fform_005f0);
        return;
      }
      _005fjspx_005ftagPool_005fs_005fform_0026_005fonsubmit_005fname_005fmethod_005fenctype_005faction.reuse(_jspx_th_s_005fform_005f0);
      out.write("\r\n");
      out.write("   </TD></TR>\r\n");
      out.write("  </TBODY>\r\n");
      out.write("</TABLE>\r\n");
      out.write("</BODY>\r\n");
      out.write("</HTML>\r\n");
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

  private boolean _jspx_meth_s_005ffielderror_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  s:fielderror
    org.apache.struts2.views.jsp.ui.FieldErrorTag _jspx_th_s_005ffielderror_005f0 = (org.apache.struts2.views.jsp.ui.FieldErrorTag) _005fjspx_005ftagPool_005fs_005ffielderror_0026_005fcssStyle_005fnobody.get(org.apache.struts2.views.jsp.ui.FieldErrorTag.class);
    _jspx_th_s_005ffielderror_005f0.setPageContext(_jspx_page_context);
    _jspx_th_s_005ffielderror_005f0.setParent(null);
    // /ReaderType_frontshow.jsp(21,0) name = cssStyle type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005ffielderror_005f0.setCssStyle("color:red");
    int _jspx_eval_s_005ffielderror_005f0 = _jspx_th_s_005ffielderror_005f0.doStartTag();
    if (_jspx_th_s_005ffielderror_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005ffielderror_0026_005fcssStyle_005fnobody.reuse(_jspx_th_s_005ffielderror_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005ffielderror_0026_005fcssStyle_005fnobody.reuse(_jspx_th_s_005ffielderror_005f0);
    return false;
  }
}