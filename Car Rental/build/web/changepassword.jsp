<%-- 
    Document   : changepassword
    Created on : May 11, 2017, 4:09:56 PM
    Author     : hp
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
   
    </head>
    <body>
         <form name=login action=changepassword method=POST autocomplete=on>
                      <input type=text name=username placeholder=username autofocus required><br>
                     <input type=password name=oldpass placeholder=oldpassword autofocus required><br>
                     <input type=password name=newpass placeholder=newPassword autofocus required><br>
                              <input type=submit value=change>
                   
                </form>
    </body>
</html>
