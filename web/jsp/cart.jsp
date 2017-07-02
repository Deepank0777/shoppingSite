<%--
    Document   : cart
    Created on : May 9, 2016, 6:27:27 PM
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
            <a href="cart.jsp">     <img src="../images/cart-of-e-commerce-in-solid-shape_318-32274.png" 
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

        <div style="background-color: whitesmoke;width: 100%;height:550px ">
            <div class="row" style="width: 70%;height: 550px;background-color: white;
                 text-align: center;margin-left: 15%">
   <table style="width: 100%;line-height: 80px">
    <tr>
        <td  class="col-sm-4"><b>ITEM</b></td>
      <td  class="col-sm-1"><b>QTY</b></td>
     <td  class="col-sm-1"><b>PRICE</b></td>
     <td  class="col-sm-5"><b>DELIVERY DETAILS</b></td>
    <td  class="col-sm-1"><b>TOATAL</b></td>
    </tr>
   </table>
                    <%
                        String orderid = session.getAttribute("orderid").toString();
                        String sql = "select t.productid,p.price,t.qty,p.price*t.qty as Total from temporder t,shakestock p where p.id=t.productid and t.orderid='" + orderid + "'";
                        Class.forName("com.mysql.jdbc.Driver");
                        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/computer", "root", "akrati");
                        Statement st = con.createStatement();
                        ResultSet rs = st.executeQuery(sql);
                        int sum = 0;
                        while (rs.next()) {

                    %>
  <table style="width: 100%;line-height: 80px"> 
    <tr>
        <td  class="col-sm-4">
<form method="post" action="deleteO.jsp?id=<%=rs.getString(1)%>">
    <input type="submit" value="delete" name="submit">Nike Shoes
            <img src="image2.jsp?id=<%=rs.getString(1)%>" style="width: 120px;height: 120px"/></td>
        <td class="col-sm-1" ><%=rs.getString(3)%></td>
        <td class="col-sm-1" ><%=rs.getString(2)%></td>
       <td class="col-sm-5" >YOUR ORDER WILL WE DELIVER SOON</td>
      <td  class="col-sm-1"><%=rs.getString(4)%></td>
      </form>
        </tr>
   </table>

          <%
            sum=sum+Integer.parseInt(rs.getString(4));
            %>
                

                <%
                    }
                %>
                <table style="width:100%; line-height: 80px "><form action="login.jsp">
                    <tr style ="border-top:2px solid aqua;border-bottom: 2px solid aqua ">
              <td colspan="6">Grand Total</td><td><b><%=sum%></b></td>
              <td><input type="submit" value="Payment" style="background-color: yellow"></td></tr>

         
                 </table>
            </div>

        </div>
    
</body>
</html>
