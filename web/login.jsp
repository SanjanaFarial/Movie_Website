<%-- 
    Document   : signup
    Created on : 21/08/2018, 12:02:44 AM
    Author     : taarn
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Login</title>
        <%@ include file="header2.jsp"%>
    </head>
    <body>
        <h1 style="text-align:center">Login here</h1>
   
        <form style="height: 200px" action="login" method="post">
            
         <p style="text-align:center"><input name="email" placeholder="email" type="text"/><br><br>

         <input name="pass"  placeholder="password" type="password"/><br><br>
         
         <input type="submit" value="Login"/> <br><br>


         <a href="signup.jsp">not registered yet? sign up here</a></p>
        </form>
    </body>
    <%@ include file="footer.jsp"%>
</html>
