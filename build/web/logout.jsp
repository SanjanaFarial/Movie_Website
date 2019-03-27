<%-- 
    Document   : logout
    Created on : Sep 29, 2016, 3:55:07 PM
    Author     : taarn
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>logout</title>
    </head>
    <body>
        <h1>Hello World!</h1>
        <%session.invalidate();
        RequestDispatcher rd = request.getRequestDispatcher("index.jsp");
        rd.forward(request,response);
         //response.sendRedirect("index.jsp");
        %>
    </body>
</html>
