
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
     
    </head>
    <body>
    <c:if test = "${sessionscope.car == null}" >
        you dont have any car
        </c:if>
        <c:if test = "${sessionscope.car != null}" >
            <c:forEach items="${sessionscope.car}" var="item">
                     ${item}<br>
            </c:forEach>
        </c:if>
    </body>
</html>
