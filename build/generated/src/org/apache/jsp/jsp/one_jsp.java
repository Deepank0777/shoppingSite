package org.apache.jsp.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;

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

    try {
        java.util.Date d = new java.util.Date();
        String orderid = "";
        try {
            orderid = session.getAttribute("orderid").toString();
        } catch (Exception e) {

        }
        if (orderid == "" || orderid == null) {
            orderid = d.getYear() + "" + d.getMonth() + "" + d.getDate() + "" + d.getHours() + "" + d.getMinutes() + "" + d.getSeconds();
            session.setAttribute("orderid", orderid);

            //
        }
        //out.println(orderid);
    } catch (Exception ex) {
    }

      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <link href=\"css/newcss.css\" rel=\"stylesheet\">\n");
      out.write("        <title>www.SHAKE INDIA.com</title>\n");
      out.write("\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"../css/slidercss.css\" />\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"../bootstrap/bootstrap-theme.min.css\" />\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"../bootstrap/bootstrap.css\" />\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"../bootstrap/bootstrap.min.css\" />\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"../bootstrap/bootstrap-theme.css\" />\n");
      out.write("        <title>www.SHAKE INDIA.com</title>\n");
      out.write("        <script  type=\"text/javascript\" src=\"../jquirey/jquery.min.js\"></script>\n");
      out.write("        <script type=\"text/javascript\" src=\"../jquirey/jssor.slider.mini.js\"></script>\n");
      out.write("\n");
      out.write("         <script>\n");
      out.write("            jQuery(document).ready(function($) {\n");
      out.write("                var options = {$AutoPlay: true};\n");
      out.write("                var jssor_slider1 = new $JssorSlider$\n");
      out.write("                        ('slider1_container', options);\n");
      out.write("            });\n");
      out.write("        </script>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div id=\"header\" style=\"width: 101%\">\n");
      out.write("            <div id=\"top\" style=\"border-bottom:3px solid yellow ; \n");
      out.write("                 color: black;text-align: center;width: 100%;height: 20px;\">\n");
      out.write("                SHAKE INDIA ONLINE STORE                \n");
      out.write("            </div>\n");
      out.write("            <div class=\"row\" style=\"color: white;background-color: brown ;height:130px;\">\n");
      out.write("                <img src=\"../images/logo.png\" style=\"width: 80px;height: 73px;float: left;\" />\n");
      out.write("                <a href=\"cart.jsp\"> <img src=\"../images/cart-of-e-commerce-in-solid-shape_318-32274.png\" \n");
      out.write("                                         accesskey=\"\"  style=\"width: 60px;height:73px;float: right; margin-right:10px \" /></a>\n");
      out.write("\n");
      out.write("                <form class=\"well form-search\" >\n");
      out.write("                    <input type=\"text\" class=\"span3 search-query\"\n");
      out.write("                           style=\"width: 300px;height: 30px;margin-left: 60px\" placeholder=\"What are you searching for?\"/>\n");
      out.write("                    <button class=\"btn\">Search</button>\n");
      out.write("                    <login style=\"font-weight: bolder;float: right;margin-right:50px \" >\n");
      out.write("                        <h4><a href=\"login.jsp\">Login\\Registration</a></h4>       \n");
      out.write("                    </login>\n");
      out.write("                </form>\n");
      out.write("                <text style=\"font-size: 20px;font-weight: bold;font-style: italic\">\n");
      out.write("                <div class=\"col-sm-5\"></div>\n");
      out.write("                <div class=\"col-sm-1\" ><a href=\"second.jsp\" >MEN</a></div>\n");
      out.write("                <div class=\"col-sm-1\"><a href=\"second.jsp\">WOMEN</a></div>\n");
      out.write("                <div class=\"col-sm-1\"><a href=\"second.jsp\">CHILD</a></div>\n");
      out.write("                <div class=\"col-sm-4\"></div>\n");
      out.write("                </text>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("        <div id=\"slider1_container\" style=\"position: relative;\n");
      out.write("                         width: 100%; height: 500px;\">\n");
      out.write("                        <div u=\"slides\" style=\"cursor: move; position: absolute; \n");
      out.write("                             overflow: hidden; width: 1350px;\n");
      out.write("                             height: 500px;\">\n");
      out.write("                            <div><img u=\"image\" src=\"../images/1.jpg\" /></div>\n");
      out.write("                            <div><img u=\"image\" src=\"../images/2.jpg\" /></div>\n");
      out.write("                            <div><img u=\"image\" src=\"../images/3.jpg\" /></div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("        <div id=\"bottom\" style=\"width: 100%;height:100px;background-color: lightseagreen \" >\n");
      out.write("            <div class=\"contact\"style=\"color:chartreuse; float: left;margin-left: 25px\"><b>contact us</b><br>\n");
      out.write("                <ul class=\"contactinfo\">\n");
      out.write("                    <li>no:+917529938255</li>\n");
      out.write("                    <li>sec 23,raj nagar ghaziabad.</li>\n");
      out.write("                </ul>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"social\"style=\"color:aqua;float: right;margin-right: 25px\"><b>social</b><br>\n");
      out.write("                <a href=\"www.twitter.com\"><img src=\"../images/twitter.png\" width=\"15px\"/></a><br>\n");
      out.write("                <a href=\"www.facebook.com\"><img src=\"../images/facebook.png\" width=\"15px\"/></a><br>\n");
      out.write("                <a href=\"www.youtube.com\"><img src=\"../images/youtube.png\" width=\"20px\"/></a><br>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <div id=\"footer\">\n");
      out.write("            <b>Deepank's Copyright@2016</b>\n");
      out.write("        </div>\n");
      out.write("\n");
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
