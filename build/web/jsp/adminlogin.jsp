<%-- 
    Document   : adminlogin
    Created on : Apr 8, 2016, 5:02:00 PM
    Author     : Deepank-PC
--%>


<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.sql.*"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <style>
        body{
            background-image: url("background1.jpg");
        }
        </style>
    <body style="background-color: orchid">
        <center>
        <%
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


        %>
        <form name="frm" style=" width:100%;margin-top: 20%; color: white;">
            <b> id<input type="text" name="t1"/></b><br><br>
            <b>password<input type="text" name="t2"/></b><br><br>
            <input type="submit" name="submit" value="save"/>
        </form>
        </center>>
    
</html>
