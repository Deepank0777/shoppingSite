package org.apache.jsp.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;

public final class login_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <link href=\"css/newcss.css\" rel=\"stylesheet\">\n");
      out.write("        <title>www.SHAKE INDIA.com</title>\n");
      out.write("\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"../css/slidercss.css\" />\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"../bootstrap/bootstrap-theme.min.css\" />\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"../bootstrap/bootstrap.css\" />\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"../bootstrap/bootstrap.min.css\" />\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"../bootstrap/bootstrap-theme.css\" />\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div id=\"header\" style=\"width: 101%\">\n");
      out.write("            <div id=\"top\" style=\"border-bottom:3px solid yellow ; \n");
      out.write("                 color: black;text-align: center;width: 100%;height: 20px;\">\n");
      out.write("                SHAKE INDIA ONLINE STORE                \n");
      out.write("            </div>\n");
      out.write("            <div class=\"row\" style=\"color: white;background-color: brown ;height:130px;\">\n");
      out.write("                <img src=\"../images/logo.png\" style=\"width: 80px;height: 73px;float: left;\" />\n");
      out.write("                <a href=\"cart.jsp\"><img src=\"../images/cart-of-e-commerce-in-solid-shape_318-32274.png\" \n");
      out.write("                                        accesskey=\"\"  style=\"width: 60px;height:73px;float: right; margin-right:10px \" /></a>\n");
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
      out.write("            ");

                if (request.getParameter("submit") != null) {
                    String userid = request.getParameter("userid");
                    String password = request.getParameter("password");
                    String sql = "select * from userlogin where userid='" + userid + "' and password='" + password + "'";
                    Class.forName("com.mysql.jdbc.Driver");
                    Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/computer", "root", "akrati");
                    Statement st = con.createStatement();
                    ResultSet rs = st.executeQuery(sql);
                    if (rs.next()) {
                        session.setAttribute("userid", userid);
                        response.sendRedirect("payment.jsp");
                    } else {
                        out.println("<h4>Invalid user.</h4>");
                    }
                }
            
      out.write("    \n");
      out.write("            <div class=\"container\" style=\"background-color: whitesmoke;margin-top: 70px\">\n");
      out.write("                <div class=\"row\" >\n");
      out.write("                    <div class=\"col-sm-4\"></div>\n");
      out.write("                    <div class=\"col-sm-4\" >\n");
      out.write("                        <h2><b>Log In</b></h2>\n");
      out.write("                        <hr style=\"height: 2px;\" size=\"50\" noshade>\n");
      out.write("                        <center >\n");
      out.write("                            <form name=\"frm\" method=\"post\" >\n");
      out.write("                                <table >\n");
      out.write("                                    <tr><td>&nbsp;</td></tr>\n");
      out.write("                                    <tr><td><input style=\"width: 350px; padding: 10px; font-size: 16px; height: 42px;\" \n");
      out.write("                                                   placeholder=\"EMAIL\" type=\"text\" name=\"userid\"></td></tr>\n");
      out.write("                                    <tr><td>&nbsp;</td></tr>\n");
      out.write("                                    <tr><td><input style=\"width: 350px; padding: 10px; font-size: 16px; height: 42px;\"\n");
      out.write("                                                   placeholder=\"PASSWORD\" type=\"password\" name=\"password\"></td></tr>\n");
      out.write("                                    <tr><td>&nbsp;</td></tr>\n");
      out.write("                                </table>\n");
      out.write("                                <input type=\"submit\" name=\"submit\" value=\"LOGIN\" style=\"width: 350px; padding:0px; background-color: #3d3838; color: white; font-size: 16px; height: 55px;\"/>\n");
      out.write("                                <h4><a href=\"registration.jsp\">New User</a></h4>\n");
      out.write("                            </form>\n");
      out.write("          </center>\n");
      out.write("          </div>\n");
      out.write("        <div class=\"col-sm-4\"></div>\n");
      out.write("       </div>\n");
      out.write("    </div>\n");
      out.write("  </body>\n");
      out.write("</html>");
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
