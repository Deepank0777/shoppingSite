package org.apache.jsp.bootstrap;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Adminpannel_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Admin Pannel</title>\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"onecss.css\" />\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"bootstrap-theme.min.css\" />\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"bootstrap.css\" />\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"bootstrap.min.css\" />\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"bootstrap-theme.css\" />\n");
      out.write("    </head>\n");
      out.write("    <style>\n");
      out.write("        body{\n");
      out.write("            background-image: url(\"bg.jpg\");\n");
      out.write("        }\n");
      out.write("        </style>\n");
      out.write("    <body style=\"background-color: #269abc;\">\n");
      out.write("        <p><div class=\"row\" style=\"background-color: white; height: 6%\">\n");
      out.write("            <div class=\"col-sm-3\"><h2>ORDER STATUS</h2></div>\n");
      out.write("            <div class=\"col-sm-3\"><h2><a href=\"insert.jsp\">UPLOAD FILES</a></h2></div>\n");
      out.write("            <div class=\"col-sm-3\"><h2><a href=\"insert.jsp\">REMOVE FILES</a></h2></div>\n");
      out.write("            <div class=\"col-sm-3\"><h2><a href=\"adminlogin.jsp\">logout</a></h2></div>\n");
      out.write("        </div></p>\n");
      out.write("        <hr/>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
