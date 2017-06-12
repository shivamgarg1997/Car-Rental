<%-- 
    Document   : signup
    Created on : May 10, 2017, 7:39:35 AM
    Author     : hp
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        
    </head>
    <body>
       <form name=login action=SignupServlet method=POST autocomplete=on>
                     <input type=text name=username placeholder=Username autofocus required><br>
                     <input type=text name=email placeholder=email autofocus required><br>
                     <select name=position>
                         <option>member</option>
                         <option>owner</option>
                     </select>
                     <input type=password name=password placeholder=Password autofocus required><br>
                              <input type=submit value=Signup>
                   
                </form>
    </body>
</html>
