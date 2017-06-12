<%-- 
    Document   : profile
    Created on : May 11, 2017, 3:38:28 AM
    Author     : hp
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">    
    </head>
    <body>
       <form action=changename.jsp method=POST>
                     <input type="submit" value="change name" />       
       </form>
        <form action=changeemail.jsp method=POST>
                     <input type="submit" value="change email" />
        </form>
         <form action=deleteaccount.jsp method=POST>       
                      <input type="submit" value="delete account" />
         </form>
         <form action=changepassword.jsp method=POST>
                       <input type="submit" value="change password" />
         </form>
    </body>
</html>
