/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.59
 * Generated at: 2015-06-02 07:54:53 UTC
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

public final class Reader_005fadd_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fs_005ffielderror_0026_005fcssStyle_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fs_005fform_0026_005fonsubmit_005fname_005fmethod_005fid_005fenctype_005faction;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fs_005ffielderror_0026_005fcssStyle_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fs_005fform_0026_005fonsubmit_005fname_005fmethod_005fid_005fenctype_005faction = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fs_005ffielderror_0026_005fcssStyle_005fnobody.release();
    _005fjspx_005ftagPool_005fs_005fform_0026_005fonsubmit_005fname_005fmethod_005fid_005fenctype_005faction.release();
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

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");

    String path = request.getContextPath();
    String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
    //获取所有的readerType信息
    List<ReaderType> readerTypeList = (List<ReaderType>)request.getAttribute("readerTypeList");
    String username=(String)session.getAttribute("username");
    if(username==null){
        response.getWriter().println("<script>top.location.href='" + basePath + "login/login_view.action';</script>");
    }

      out.write("\r\n");
      out.write("<HTML><HEAD><TITLE>添加读者</TITLE> \r\n");
      out.write("<STYLE type=text/css>\r\n");
      out.write("BODY {\r\n");
      out.write("    \tMARGIN-LEFT: 0px; BACKGROUND-COLOR: #ffffff\r\n");
      out.write("}\r\n");
      out.write(".STYLE1 {color: #ECE9D8}\r\n");
      out.write(".label {font-style.:italic; }\r\n");
      out.write(".errorLabel {font-style.:italic;  color:red; }\r\n");
      out.write(".errorMessage {font-weight:bold; color:red; }\r\n");
      out.write("</STYLE>\r\n");
      out.write(" <script src=\"");
      out.print(basePath );
      out.write("calendar.js\"></script>\r\n");
      out.write("<script language=\"javascript\">\r\n");
      out.write("/*验证表单*/\r\n");
      out.write("function checkForm() {\r\n");
      out.write("    var readerNo = document.getElementById(\"reader.readerNo\").value;\r\n");
      out.write("    if(readerNo==\"\") {\r\n");
      out.write("        alert('请输入读者编号!');\r\n");
      out.write("        return false;\r\n");
      out.write("    }\r\n");
      out.write("    return true; \r\n");
      out.write("}\r\n");
      out.write(" </script>\r\n");
      out.write("</HEAD>\r\n");
      out.write("\r\n");
      out.write("<BODY background=\"");
      out.print(basePath );
      out.write("images/adminBg.jpg\">\r\n");
      if (_jspx_meth_s_005ffielderror_005f0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("<TABLE align=\"center\" height=\"100%\" cellSpacing=0 cellPadding=0 width=\"80%\" border=0>\r\n");
      out.write("  <TBODY>\r\n");
      out.write("  <TR>\r\n");
      out.write("    <TD align=\"left\" vAlign=top >\r\n");
      out.write("    ");
      //  s:form
      org.apache.struts2.views.jsp.ui.FormTag _jspx_th_s_005fform_005f0 = (org.apache.struts2.views.jsp.ui.FormTag) _005fjspx_005ftagPool_005fs_005fform_0026_005fonsubmit_005fname_005fmethod_005fid_005fenctype_005faction.get(org.apache.struts2.views.jsp.ui.FormTag.class);
      _jspx_th_s_005fform_005f0.setPageContext(_jspx_page_context);
      _jspx_th_s_005fform_005f0.setParent(null);
      // /Reader_add.jsp(44,4) name = action type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_s_005fform_005f0.setAction("Reader/Reader_AddReader.action");
      // /Reader_add.jsp(44,4) name = method type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_s_005fform_005f0.setMethod("post");
      // /Reader_add.jsp(44,4) name = id type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_s_005fform_005f0.setId("readerAddForm");
      // /Reader_add.jsp(44,4) name = onsubmit type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_s_005fform_005f0.setOnsubmit("return checkForm();");
      // /Reader_add.jsp(44,4) name = enctype type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_s_005fform_005f0.setEnctype("multipart/form-data");
      // /Reader_add.jsp(44,4) name = name type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
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
          out.write("<table width='100%' cellspacing='1' cellpadding='3' class=\"tablewidth\">\r\n");
          out.write("\r\n");
          out.write("  <tr>\r\n");
          out.write("    <td width=30%>读者编号:</td>\r\n");
          out.write("    <td width=70%><input id=\"reader.readerNo\" name=\"reader.readerNo\" type=\"text\" /></td>\r\n");
          out.write("  </tr>\r\n");
          out.write("\r\n");
          out.write("  <tr>\r\n");
          out.write("    <td width=30%>读者类型:</td>\r\n");
          out.write("    <td width=70%>\r\n");
          out.write("      <select name=\"reader.readerType.readerTypeId\">\r\n");
          out.write("      ");

        for(ReaderType readerType:readerTypeList) {
      
          out.write("\r\n");
          out.write("          <option value='");
          out.print(readerType.getReaderTypeId() );
          out.write('\'');
          out.write('>');
          out.print(readerType.getReaderTypeName() );
          out.write("</option>\r\n");
          out.write("      ");

        }
      
          out.write("\r\n");
          out.write("    </td>\r\n");
          out.write("  </tr>\r\n");
          out.write("\r\n");
          out.write("  <tr>\r\n");
          out.write("    <td width=30%>姓名:</td>\r\n");
          out.write("    <td width=70%><input id=\"reader.readerName\" name=\"reader.readerName\" type=\"text\" size=\"20\" /></td>\r\n");
          out.write("  </tr>\r\n");
          out.write("\r\n");
          out.write("  <tr>\r\n");
          out.write("    <td width=30%>性别:</td>\r\n");
          out.write("    <td width=70%><input id=\"reader.sex\" name=\"reader.sex\" type=\"text\" size=\"2\" /></td>\r\n");
          out.write("  </tr>\r\n");
          out.write("\r\n");
          out.write("  <tr>\r\n");
          out.write("    <td width=30%>读者生日:</td>\r\n");
          out.write("    <td width=70%><input type=\"text\" readonly id=\"reader.birthday\"  name=\"reader.birthday\" onclick=\"setDay(this);\"/></td>\r\n");
          out.write("  </tr>\r\n");
          out.write("\r\n");
          out.write("  <tr>\r\n");
          out.write("    <td width=30%>联系电话:</td>\r\n");
          out.write("    <td width=70%><input id=\"reader.telephone\" name=\"reader.telephone\" type=\"text\" size=\"20\" /></td>\r\n");
          out.write("  </tr>\r\n");
          out.write("\r\n");
          out.write("  <tr>\r\n");
          out.write("    <td width=30%>联系Email:</td>\r\n");
          out.write("    <td width=70%><input id=\"reader.email\" name=\"reader.email\" type=\"text\" size=\"50\" /></td>\r\n");
          out.write("  </tr>\r\n");
          out.write("\r\n");
          out.write("  <tr>\r\n");
          out.write("    <td width=30%>联系qq:</td>\r\n");
          out.write("    <td width=70%><input id=\"reader.qq\" name=\"reader.qq\" type=\"text\" size=\"20\" /></td>\r\n");
          out.write("  </tr>\r\n");
          out.write("\r\n");
          out.write("  <tr>\r\n");
          out.write("    <td width=30%>读者地址:</td>\r\n");
          out.write("    <td width=70%><input id=\"reader.address\" name=\"reader.address\" type=\"text\" size=\"80\" /></td>\r\n");
          out.write("  </tr>\r\n");
          out.write("\r\n");
          out.write("  <tr>\r\n");
          out.write("    <td width=30%>读者头像:</td>\r\n");
          out.write("    <td width=70%><input id=\"photoFile\" name=\"photoFile\" type=\"file\" size=\"50\" /></td>\r\n");
          out.write("  </tr>\r\n");
          out.write("\r\n");
          out.write("  <tr bgcolor='#FFFFFF'>\r\n");
          out.write("      <td colspan=\"4\" align=\"center\">\r\n");
          out.write("        <input type='submit' name='button' value='保存' >\r\n");
          out.write("        &nbsp;&nbsp;\r\n");
          out.write("        <input type=\"reset\" value='重写' />\r\n");
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
        _005fjspx_005ftagPool_005fs_005fform_0026_005fonsubmit_005fname_005fmethod_005fid_005fenctype_005faction.reuse(_jspx_th_s_005fform_005f0);
        return;
      }
      _005fjspx_005ftagPool_005fs_005fform_0026_005fonsubmit_005fname_005fmethod_005fid_005fenctype_005faction.reuse(_jspx_th_s_005fform_005f0);
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
    // /Reader_add.jsp(39,0) name = cssStyle type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
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
