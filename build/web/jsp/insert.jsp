<%-- 
    Document   : insert
    Created on : Apr 8, 2016, 8:11:40 PM
    Author     : Deepank-PC
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>insert1</title>
    </head>
    <style>
        body{
            background-image:url("../images/insert1.jpg");
        }
        table.ex{
            border: 7px solid springgreen;
            margin-left: 10%;
            margin-top: 15%;
            font-weight: bolder;
        }

    </style>
    <body >
        <table style="color: white" class="ex">
        <form name="frm"  method="post" action="../goods" enctype="multipart/form-data"
              style="color: grey;">
            
           <tr>
                <td></td>
            </tr>
            <tr>
                <td></td>
            </tr>
            <tr>
                <td></td>
            </tr>
            <tr> 
               <td>id:</td>
               <td><input type="text" name="t1"/></td>
            </tr>
            <tr>
                <td>price:</td>
                <td><input type="text" name="t2"/></td>
            </tr>
            <tr>
                <td> pic:</td>
                <td><input type="file" name="t3" /></td>
            </tr>
            <tr>
                <td></td>
            </tr>
            <tr>
                <td></td>
            </tr>
            <tr>
                <td></td>
            </tr>
            <tr>
                <td></td>
                <td><input type="submit" name="submit1" value="upload"/>
                <input type="submit" name="submit2" value="delete"/>
                <input type="submit" name="submit3" value="upload big"/>
                <input type="submit" name="submit4" value="delete big"/></td>
           </tr>
           
        </form>
        </table>


    </body>
</html>
