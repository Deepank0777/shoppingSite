<%-- 
    Document   : image1
    Created on : Apr 13, 2016, 11:29:43 PM
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
    <body >
        <style>
            table.img-rounded{
                    
                    background-color: white;
                    float: left;
                    margin-left: 15px;
                    margin-top: 20px;
                    
                    
                    
                }
            
        </style>
         <div id="header" style="width: 101%">
            <div id="top" style="border-bottom:3px solid yellow ; 
                 color: black;text-align: center;width: 100%;height: 20px;">
                SHAKE INDIA ONLINE STORE                
            </div>
            <div class="row" style="color: white;background-color: brown ;height:130px;">
                <img src="../images/logo.png" style="width: 80px;height: 73px;float: left;" />
                <a href="cart.jsp"><img src="../images/cart-of-e-commerce-in-solid-shape_318-32274.png" 
                                        accesskey=""  style="width: 60px;height:73px;float: right; margin-right:10px " /></a>

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
        <div id="database" style="height:700px;background-color: gray">
        <%
            try {
                String sql = "select id,price from shakestock ";
                Class.forName("com.mysql.jdbc.Driver");
                Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/computer", "root", "akrati");
                Statement st = con.createStatement();
                ResultSet rs = st.executeQuery(sql);
                while (rs.next()) {
                    String id = rs.getString(1);
                    String price = rs.getString(2);
        %>
        
        <table class="img-rounded" style="margin-left: 80px">
            <tr>
                <td><a href="images4.jsp?id=<%=id%>"> <image class="img-rounded" src="image2.jsp?id=<%=id%>"
                  style="width:320px;height:180px;"/></a></td>
        </tr>
        <tr>
            <td ><b style="margin-left: 35%"> price:-<%=price%></b></td>
        </tr> 
        </table>
        <%

                }
            } catch (Exception ex) {

            }
        %>
        </div>
        <div id="bottom" style="width: 100%;height:100px;background-color: lightseagreen " >
            <div class="contact"style="color:chartreuse; float: left;margin-left: 25px"><b>contact us</b><br>
			<ul class="contactinfo">
				<li>no:+917529938255</li>
				<li>sec 23,raj nagar ghaziabad.</li>
			</ul>
            </div>
            <div class="social"style="color:aqua;float: right;margin-right: 25px"><b>social</b><br>
                <a href="www.twitter.com"><img src="../images/twitter.png" width="15px"/></a><br>
                <a href="www.facebook.com"><img src="../images/facebook.png" width="15px"/></a><br>
                <a href="www.youtube.com"><img src="../images/youtube.png" width="20px"/></a><br>
            </div>
        </div>
        <div id="footer">
            <b>Deepank's Copyright@2016</b>
        </div>
      
    </body>
</html>
