package org.apache.jsp.bootstrap;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class one_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"onecss.css\" />\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"bootstrap-theme.min.css\" />\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"bootstrap.css\" />\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"bootstrap.min.css\" />\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"bootstrap-theme.css\" />\n");
      out.write("        <title>www.SHAKE INDIA.com</title>\n");
      out.write("    </head>\n");
      out.write("\t<style>\n");
      out.write("        body{\n");
      out.write("            background-image:url(\"background1.jpg\");\n");
      out.write("            }\n");
      out.write("        </style>  \n");
      out.write("    <body id=\"main\">\n");
      out.write("        <div id=\"first\">\n");
      out.write("            <div class=\"left1\">SHAKE INDIA ONLINE STORE</div>\n");
      out.write("            \n");
      out.write("        </div>\n");
      out.write("\t\t<div id=\"header\">\n");
      out.write("            <div class=\"left2\"><img src=\"logo.jpg\" width=\"10%\"/></div>\n");
      out.write("            <div ><a href=\"www.gooogle.com\"><img src=\"search1.jpg\" width=\"100px\" class=\"right2\"/></a></div>\n");
      out.write("            <div class=\"row\">\n");
      out.write("                <h3>\n");
      out.write("\t\t\t\t<div class=\"col-sm-5\"></div>\n");
      out.write("                <div class=\"col-sm-1\"><b><a href=\"second.jsp\" style=\"color:white;\">MEN</a></b></div>\n");
      out.write("                <div class=\"col-sm-1\"><b><a href=\"second.jsp\"style=\"color:white;\">WOMEN</a></b></div>\n");
      out.write("                <div class=\"col-sm-1\"><b><a href=\"second.jsp\"style=\"color:white;\">KIDS</a></b></div>\n");
      out.write("                <div class=\"col-sm-4\"></div>\n");
      out.write("                </h3>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t<div id=\"pic\">\n");
      out.write("\t\t\t<div class=\"pic\"><img src=\"pic.jpg\" width=\"100%\" height=\"80%\"/></div>\n");
      out.write("\t\t</div>\n");
      out.write("\t\t<div id=\"bottom\" >\n");
      out.write("\t\t\t<div class=\"contact\"style=\"color:white;\"><b>contact us</b></div><br>\n");
      out.write("\t\t\t<ul class=\"contactinfo\">\n");
      out.write("\t\t\t\t<li>no:+917529938255</li>\n");
      out.write("\t\t\t\t<li>sec 23,raj nagar ghaziabad.</li>\n");
      out.write("\t\t\t</ul>\n");
      out.write("\t\t\t<div class=\"row1\">\n");
      out.write("\t\t\t<div class=\"social\"style=\"color:white;\"><b>social</b></div><br>\n");
      out.write("\t\t<div><a href=\"www.twitter.com\"><img src=\"twitter.png\" width=\"15px\" class=\"twitt\"/></a></div>\n");
      out.write("\t\t<div><a href=\"www.facebook.com\"><img src=\"facebook.png\" width=\"15px\" class=\"fb\"/></a></div>\n");
      out.write("\t\t<div><a href=\"www.youtube.com\"><img src=\"youtube.png\" width=\"20px\" class=\"you\"/></a></div>\n");
      out.write("\t\t\n");
      out.write("\t\t</div>\n");
      out.write("\t\t</div>\n");
      out.write("\t\t<div id=\"footer\">\n");
      out.write("\t\t<div class=\"foot\"><b>Deepank's Copyright@2016</b></div>\n");
      out.write("\t\t\n");
      out.write("\t\t</div>\n");
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
