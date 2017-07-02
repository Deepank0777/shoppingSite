<%-- 
    Document   : deleteO
    Created on : Jul 12, 2016, 1:58:12 PM
    Author     : Deepank-PC
--%>
<%@page import="java.sql.*"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
     <%
        try{
                 String oid = session.getAttribute("orderid").toString();
                String pid=request.getParameter("id");
                String sql="delete from temporder where productid="+pid ;
                Class.forName("com.mysql.jdbc.Driver");
                Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/computer", "root", "akrati");
                Statement st=  con.createStatement();
                int rs = st.executeUpdate(sql);
                if(rs>0)
                        {
                            response.sendRedirect("cart.jsp");
                        }
            }
         
                catch(Exception ex){
                                out.println("Error"+ex);
                }
     %>
    </body>
</html>
