<%-- 
    Document   : userSession
    Created on : 25/08/2018, 12:58:20 AM
    Author     : taarn
--%>

<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Profile</title>
        <%@ include file="header3.jsp"%>
    </head>
    <body>
        <div>
        
        <h1><%
        
         try{
                String session_id =null;
                HttpSession session1=request.getSession(false);  
                if(session1!=null){  
                session_id=(String)session1.getAttribute("uname");  
        }
             
          Class.forName("com.mysql.jdbc.Driver");
          Connection  con = DriverManager.getConnection("jdbc:mysql://localhost:3306/projectdb", "root", "");
          Statement stmt = con.createStatement();
          ResultSet rs = stmt.executeQuery("select * from registertable where username='"+session_id+"'");
          //rs.next();
          if(rs.next()){
            
            String name = rs.getString("username");
            String email = rs.getString("email");
            
            
            out.println("Welcome "+name);
            out.println("<br>");
            out.println("Your Email: "+email);
            out.println("<br>");
            out.println("<br>");
            out.println("<br>");
            out.println("<br>");
            out.println("<br>");
            
            
          }
          
         }catch(Exception e){
          out.println(e);
         }
     
          
       
        %></h1>
        
        <h2>  </h2>
        </div>
               
    </body>
        <%@ include file="footer.jsp"%>   
</html>
