<%-- 
    Document   : images4
    Created on : May 6, 2016, 8:31:13 PM
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
            table.ex{
                margin-left: 0px;
                margin-top: 20px;
                font-weight: bolder;
            }
            table.px{
                font-weight: bolder;
            }


        </style>
        <%
            String id = request.getParameter("id");
        %>
        <div id="header" style="width: 101%">
            <div id="top" style="border-bottom:3px solid yellow ; 
                 color: black;text-align: center;width: 100%;height: 20px;">
                SHAKE INDIA ONLINE STORE                
            </div>
            <div class="row" style="color: white;background-color: brown ;height:130px;">
                <img src="../images/logo.png" style="width: 80px;height: 73px;float: left;" />
                <a href="cart.jsp"><img src="../images/cart-of-e-commerce-in-solid-shape_318-32274.png" 
        accesskey="" 
        style="width: 60px;height:73px;float: right; margin-right:10px " /></a>

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
        <div class="row" style="width:1000px;margin-left: 170px;height:500px">
            <div class="col-sm-6"> 
                <table class="ex">
                    <tr>
                        <td style="text-align: center"><h3><b>PRODUCT IMAGE</b></h3></td>
                    </tr>
                    <tr>

                        <td><image src="image2.jsp?id=<%=id%>"style="width:100%;height:400px"/></td>
                    </tr>
                </table>
            </div>

                     <%
            try {
                String sql = "select price from shakestock where id='"+id+"' ";
                Class.forName("com.mysql.jdbc.Driver");
                Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/computer", "root", "akrati");
                Statement st = con.createStatement();
                ResultSet rs = st.executeQuery(sql);
                if (rs.next()){
        %>
            <div class="col-sm-6" style="margin-top:21px;"> 
                <h3 style="text-align:center;font-weight: bolder">PRODUCT DETAIL<br><br><br></h3>
                
                <table style="text-align:center;font-size:25px;width: 100%;margin-top: 30px ">
                    <% 
                    if(request.getParameter("submit")!=null){
                        
                    }
                    %>
                    <form name="frm" method="post">
                        <%
                        //add to cart
                        if(request.getParameter("submit")!=null){
                            int qty=Integer.parseInt(request.getParameter("qty"));
                                    String orderid=session.getAttribute("orderid").toString();
                                  sql="insert into temporder(orderid,productid,qty) values('"+orderid+"','"+id+"','"+qty+"')";
     Class.forName("com.mysql.jdbc.Driver");
    Connection con1 = DriverManager.getConnection("jdbc:mysql://localhost:3306/computer", "root", "akrati");
    Statement st1 = con1.createStatement();
     int re = st1.executeUpdate(sql);            
                        if(re>0)
                        {
                            response.sendRedirect("one.jsp");
                        }
                        }
                        %>
                    <tr>
                        <td>Product name</td>
                        <td>Nike Shoes</td>
                    </tr>
                    <tr>
                        <td >Product Title</td>
                        <td>Nike feel free</td>
                    </tr>
                    <tr>
                        <td >Product Price</td>
                        <td><%=rs.getString(1)%></td>
                    </tr>
                    <tr>
                        <td >Product Colour</td>
                        <td>As image</td>
                    </tr>
                    
                      <tr>
                          <td>Quantity</td>
                          <td><input type="number" min="1" max="5" name="qty"></td>
                      </tr>
                      <tr style="margin-top: 20px">
                        <td></td>
                        <td><input type="submit" name="submit" value="Add to Cart"/></td>
                    </tr>
                    
                   </form>
                </table>

            </div>
            <%
            }
                }catch(Exception ex){
                                out.println("Error"+ex);
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
