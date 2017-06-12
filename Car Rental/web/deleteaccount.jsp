<%-- 
    Document   : deleteaccount
    Created on : May 11, 2017, 4:09:24 PM
    Author     : hp
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    </head>
    <body>
        <form name=login action=deleteaccount method=POST autocomplete=on>
                     <input type=text name=name placeholder=Username autofocus required><br>
                     <input type=password name=pass placeholder=Password autofocus required><br>
                              <input type=submit value=delete>
                   
                </form>
    </body>
</html>
