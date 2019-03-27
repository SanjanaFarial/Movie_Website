<%-- 
    Document   : signup
    Created on : 23/09/2018, 3:42:48 AM
    Author     : taarn
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
   <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="css/home.css" type="text/css" rel="stylesheet"/>
        <title>Registration Page</title>
        <%@ include file="header2.jsp"%>
    </head>
    
        <form action="signup" method="post">
        <h1 style="text-align:center">Sign Up here</h1>
        <p style="text-align:center">
        Username: <input type="text" name="uname" placeholder="username"/><br><br>
        
        Password: <input type="password" name="pass" placeholder="password"/><br><br>
        
        Email : <input type="text" name="email" placeholder="email"/><br><br>
        
        <input type="submit" value="Sign Up"/> <br><br>
        <a href="login.jsp">Already signed up? Login Here</a></p>
        
        </form>
        <link rel="stylesheet" href="css/font-awesome.min.css" />
        

<%@ include file="footer.jsp"%>
</html>
