<%-- 
    Document   : image3
    Created on : Apr 14, 2016, 2:53:18 PM
    Author     : Deepank-PC
--%>

<%@page import="java.sql.*"%>
<%@page import="java.io.*"%>
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
                String id=request.getParameter("id");
                String sql="select * from shakestock1 where id="+id;
                Class.forName("com.mysql.jdbc.Driver");
                Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/computer", "root", "akrati");
                Statement st=  con.createStatement();
                ResultSet rs=st.executeQuery(sql);
                %>
        <div>
            <b style="color: black">"Hello Deepank Sir"</b>
            </div> 
        
        
        <%
                if(rs.next()){
                    //clear the responce header information
                    response.reset();
                    //check the file type and send the header content type accordingly
                    Blob blb=rs.getBlob(3);
                    byte[] bdata=blb.getBytes(1,(int) blb.length());
                    //get the responce output stream object to write the content of the
                    OutputStream output=response.getOutputStream();
                    output.write(bdata);
                output.close();
     
                }
            }
            
            catch(Exception ex){
              out.println("error"+ex);
            }
            %>
            
    </body>
</html>
