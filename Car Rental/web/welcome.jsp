
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    
        
        Hi Mr. ${sessionScope.user.getusername()}    
        <form action="profile.jsp">
                     <input type="submit" value="Profile" />
        </form>  
         <c:if test = "${sessionscope.user.getposition == member}" >
        <form action=RideBook >
                       From Date :
                     <input type="date" name="fdate"  /><br>
                      To Date :
                     <input type="date" name="tdate"  /><br>
                     <inpit type="submit" value="show cars" />
             </form>
        </c:if>  
        <c:if test = "${sessionscope.user.getposition == owner}" >
            <form action="carinfo">
                <input type="submit" value="your cars" />
            </form>
        </c:if>

    </head>
    <body>
       
    </body>
</html>
