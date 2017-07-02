<%-- 
    Document   : registration
    Created on : Jul 12, 2016, 3:05:15 PM
    Author     : Deepank-PC
--%>

<%@page import="java.sql.*"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="css/newcss.css" rel="stylesheet">
        <title>www.SHAKE INDIA.com</title>

        <link rel="stylesheet" type="text/css" href="../css/slidercss.css" />
        <link rel="stylesheet" type="text/css" href="../bootstrap/bootstrap-theme.min.css" />
        <link rel="stylesheet" type="text/css" href="../bootstrap/bootstrap.css" />
        <link rel="stylesheet" type="text/css" href="../bootstrap/bootstrap.min.css" />
        <link rel="stylesheet" type="text/css" href="../bootstrap/bootstrap-theme.css" />
    </head>
    <body>
        <div id="header" style="width: 101%">
            <div id="top" style="border-bottom:3px solid yellow ; 
                 color: black;text-align: center;width: 100%;height: 20px;">
                SHAKE INDIA ONLINE STORE                
            </div>
            <div class="row" style="color: white;background-color: brown ;height:130px;">
                <img src="../images/logo.png" style="width: 80px;height: 73px;float: left;" />
                <img src="../images/cart-of-e-commerce-in-solid-shape_318-32274.png" 
                     accesskey=""  style="width: 60px;height:73px;float: right; margin-right:10px " />

                <form class="well form-search" >
                    <input type="text" class="span3 search-query"
                           style="width: 300px;height: 30px;margin-left: 60px" placeholder="What are you searching for?"/>
                    <button class="btn">Search</button>
                    <login style="font-weight: bolder;float: right;margin-right:50px " >
                        <h4><a href="login.jsp">Login\Registration</a></h4>       
                    </login>
                </form>
                <text style="font-size: 20px;font-weight: bold;font-style: italic">
                <div class="col-sm-5"></div>
                <div class="col-sm-1" ><a href="second.jsp" >MEN</a></div>
                <div class="col-sm-1"><a href="second.jsp">WOMEN</a></div>
                <div class="col-sm-1"><a href="second.jsp">CHILD</a></div>
                <div class="col-sm-4"></div>
                </text>
            </div>
        </div>

                    <%
                    if(request.getParameter("submit")!=null)
                    {
                     String userid=request.getParameter("userid");   
                    String password=request.getParameter("password");
                    String name=request.getParameter("name");
                    String mobile=request.getParameter("mobile");
                   String sql="insert into userlogin(userid,password,name,mobile) values('"+userid+"','"+password+"','"+name+"','"+mobile+"')";
                   Class.forName("com.mysql.jdbc.Driver");
                        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/computer", "root", "akrati");
                        Statement st = con.createStatement();
                        int  re=st.executeUpdate(sql);
                    if(re>0){
                        session.setAttribute("userid", userid);
                        response.sendRedirect("payment.jsp");
                    }
                    
                    }
                    %>
<div class="container" style="background-color: whitesmoke;margin-top: 30px">
                <div class="row" >
                    <div class="col-sm-4"></div>
                    <div class="col-sm-4" >
                        <h2><b>Registration</b></h2>
                        <hr style="height: 2px;" size="50" noshade>
                        <center >
                            <form name="frm" method="post" >
                                <table >
                                    <tr><td>&nbsp;</td></tr>
                                    <tr><td><input style="width: 350px; padding: 10px; font-size: 16px; height: 42px;" 
                                                   placeholder="USER ID" type="text" name="userid"></td></tr>
                                    <tr><td>&nbsp;</td></tr>
                                    <tr><td><input style="width: 350px; padding: 10px; font-size: 16px; height: 42px;"
                                                   placeholder="PASSWORD" type="password" name="password"></td></tr>
                                    <tr><td>&nbsp;</td></tr>
                                    <tr><td><input style="width: 350px; padding: 10px; font-size: 16px; height: 42px;"
                                                   placeholder="CNF PASSWORD" type="password" name="cpassword"></td></tr>
                                    <tr><td>&nbsp;</td></tr>
                                    <tr><td><input style="width: 350px; padding: 10px; font-size: 16px; height: 42px;"
                                                   placeholder="NAME" type="text" name="name"></td></tr>
                                    <tr><td>&nbsp;</td></tr>
                                    <tr><td><input style="width: 350px; padding: 10px; font-size: 16px; height: 42px;"
                                                   placeholder="CONTACT NUMBER" type="text" name="mobile"></td></tr>
                                   
                                    <tr><td>&nbsp;</td></tr>
                                </table>
                                <input type="submit" name="submit" value="Register" style="width: 350px; padding:0px; background-color: #3d3838; color: white; font-size: 16px; height: 55px;"/>
                               
                            </form>
          </center>
          </div>
        <div class="col-sm-4"></div>
       </div>
    </div>
  </body>
</html>