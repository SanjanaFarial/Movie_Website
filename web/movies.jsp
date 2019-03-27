<%-- 
    Document   : movies
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
        <title>movies</title>
        <%@ include file="header2.jsp"%>
    </head>
    <body>
        <form method="post">

            <table border="2">
                <tr>
                    <td>year</td>
                    <td>name</td>
                    <td>genre</td>
                    <td>director</td>
                    <td>cast</td>
                    <td>rating</td>
                    <td>comment</td>
                </tr>
                <%       try {
                        Class.forName("com.mysql.jdbc.Driver");
                        String url = "jdbc:mysql://localhost:3306/projectdb";
                        String username = "root";
                        String password = "";
                        String query = "select * from movietable";
                        Connection conn = DriverManager.getConnection(url, username, password);
                        Statement stmt = conn.createStatement();
                        ResultSet rs = stmt.executeQuery(query);
                        while (rs.next()) {
                %>
                <tr>
                    <td><%out.print(rs.getString("year")); %></td>
                    <td><%out.print(rs.getString("name")); %></td>
                    <td><%out.print(rs.getString("genre")); %></td>
                    <td><%out.print(rs.getString("director")); %></td>
                    <td><%out.print(rs.getString("cast")); %></td>
                    <td><input type="text" name="firstname"></td>
                    <td><%out.print(rs.getString("comment")); %></td>
                </tr>


                <%
                    }
                %>
            </table>
            <%
                    rs.close();
                    stmt.close();
                    conn.close();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            %>
        </form>
    </body>
    <%@ include file="footer.jsp"%>   
</html>
