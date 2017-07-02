package org.apache.jsp.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;

public final class cart_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("                <img src=\"../images/cart-of-e-commerce-in-solid-shape_318-32274.png\" \n");
      out.write("                     accesskey=\"\"  style=\"width: 60px;height:73px;float: right; margin-right:10px \" />\n");
      out.write("\n");
      out.write("                <form class=\"well form-search\" >\n");
      out.write("                    <input type=\"text\" class=\"span3 search-query\"\n");
      out.write("                           style=\"width: 300px;height: 30px;margin-left: 60px\" placeholder=\"What are you searching for?\"/>\n");
      out.write("                    <button class=\"btn\">Search</button>\n");
      out.write("                    <login style=\"font-weight: bolder;float: right;margin-right:50px \" >\n");
      out.write("                        <h4><a href=\"www.gooogle.com\">Login\\Registration</a></h4>       \n");
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
      out.write("        <div style=\"background-color: whitesmoke;width: 100%;height:550px \">\n");
      out.write("            <div class=\"row\" style=\"width: 70%;height: 550px;background-color: white;\n");
      out.write("                 text-align: center;margin-left: 15%\">\n");
      out.write("   <table style=\"width: 100%;line-height: 80px\">\n");
      out.write("    <tr>\n");
      out.write("        <td  class=\"col-sm-4\"><b>ITEM</b></td>\n");
      out.write("      <td  class=\"col-sm-1\"><b>QTY</b></td>\n");
      out.write("     <td  class=\"col-sm-1\"><b>PRICE</b></td>\n");
      out.write("     <td  class=\"col-sm-5\"><b>DELIVERY DETAILS</b></td>\n");
      out.write("    <td  class=\"col-sm-1\"><b>TOATAL</b></td>\n");
      out.write("    </tr>\n");
      out.write("   </table>\n");
      out.write("                    ");

                        String orderid = session.getAttribute("orderid").toString();
                        String sql = "select t.productid,p.price,t.qty,p.price*t.qty as Total from temporder t,shakestock p where p.id=t.productid and t.orderid='" + orderid + "'";
                        Class.forName("com.mysql.jdbc.Driver");
                        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/computer", "root", "akrati");
                        Statement st = con.createStatement();
                        ResultSet rs = st.executeQuery(sql);
                        int sum = 0;
                        while (rs.next()) {

                    
      out.write("\n");
      out.write("  <table style=\"width: 100%;line-height: 80px\"> \n");
      out.write("    <tr>\n");
      out.write("        <td  class=\"col-sm-4\">\n");
      out.write("<form method=\"post\" action=\"delete.jsp?id=");
      out.print(rs.getString(1));
      out.write("\">\n");
      out.write("    <input type=\"submit\" value=\"delete\" name=\"submit\">Nike Shoes\n");
      out.write("            <img src=\"image2.jsp?id=");
      out.print(rs.getString(1));
      out.write("\" style=\"width: 120px;height: 120px\"/></td>\n");
      out.write("        <td class=\"col-sm-1\" >");
      out.print(rs.getString(3));
      out.write("</td>\n");
      out.write("        <td class=\"col-sm-1\" >");
      out.print(rs.getString(2));
      out.write("</td>\n");
      out.write("       <td class=\"col-sm-5\" >YOUR ORDER WILL WE DELIVER SOON</td>\n");
      out.write("      <td  class=\"col-sm-1\">");
      out.print(rs.getString(4));
      out.write("</td>\n");
      out.write("      </form>\n");
      out.write("        </tr>\n");
      out.write("   </table>\n");
      out.write("\n");
      out.write("          ");

            sum=sum+Integer.parseInt(rs.getString(4));
            
      out.write("\n");
      out.write("                \n");
      out.write("\n");
      out.write("                ");

                    }
                
      out.write("\n");
      out.write("                <table style=\"width:100%; line-height: 80px \"><form action=\"pay.jsp\">\n");
      out.write("                    <tr style =\"border-top:2px solid aqua;border-bottom: 2px solid aqua \">\n");
      out.write("              <td colspan=\"6\">Grand Total</td><td><b>");
      out.print(sum);
      out.write("</b></td>\n");
      out.write("              <td><input type=\"submit\" value=\"Payment\" style=\"background-color: yellow\"></td></tr>\n");
      out.write("\n");
      out.write("         \n");
      out.write("                 </table>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("        </div>\n");
      out.write("    \n");
      out.write("</body>\n");
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
