<%-- 
    Document   : login
    Created on : May 7, 2017, 10:41:08 AM
    Author     : hp
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">  
    </head>
    <body>
           <form name=login action=loginservlet method=POST autocomplete=on>
                     <input type=text name=uid placeholder=Username autofocus required><br>
                     <input type=password name=pass placeholder=Password autofocus required><br>
                              <input type=submit value=Login>
                   
                </form>
    </body>
</html>
