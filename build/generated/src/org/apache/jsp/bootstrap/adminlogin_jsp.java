package org.apache.jsp.bootstrap;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;

public final class adminlogin_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    <style>\n");
      out.write("        body{\n");
      out.write("            background-image: url(\"background1.jpg\");\n");
      out.write("        }\n");
      out.write("        </style>\n");
      out.write("    <body style=\"background-color: orchid\">\n");
      out.write("        <center>\n");
      out.write("        ");

            if (request.getParameter("submit")!= null) {
                String id = request.getParameter("t1");
                String password = request.getParameter("t2");
                try {
                    Class.forName("com.mysql.jdbc.Driver");
                    Connection cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/computer", "root", "akrati");
                    Statement st = cn.createStatement();
                    String query = "select * from adminlogin1 where id='"+id+"' and password='"+password+"'";
                    ResultSet rs = st.executeQuery(query);
                    if (rs.next()) {
                        out.println("<span style='color:green'>login successfully</span>");
                    } else {
                        out.println("<span style='color:green'>invalid user</span>");
                    }
                } catch (Exception e) {
                    out.println("error" + e);
                }
            }


        
      out.write("\n");
      out.write("        <form name=\"frm\" style=\" width:100%;margin-top: 20%;\">\n");
      out.write("            <b> id<input type=\"text\" name=\"t1\"/></b><br><br>\n");
      out.write("            <b>password<input type=\"text\" name=\"t2\"/></b><br><br>\n");
      out.write("            <input type=\"submit\" name=\"submit\" value=\"save\"/>\n");
      out.write("        </form>\n");
      out.write("        </center>>\n");
      out.write("    \n");
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
