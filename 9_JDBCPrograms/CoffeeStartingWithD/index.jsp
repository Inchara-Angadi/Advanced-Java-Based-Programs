<%--Read all the existing records from the table coffee which is from the database test and query
coffee name starting with ‘D’ in the table using HTML and JSP to get the field and display the
results respectively--%>


<%@ page import="java.sql.*" %>
<!DOCTYPE html>
<html>
<head>
    <title>Coffee Records</title>
</head>
<body>
    <h2>☕ All Coffee Records</h2>
    <%
        Connection conn = null;
        Statement stmt = null;
        ResultSet rs = null;

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/coffee", "root", "");

            stmt = conn.createStatement();
            rs = stmt.executeQuery("SELECT * FROM coffee");
    %>
    <table border="1" cellpadding="6">
        <tr>
            <th>ID</th>
            <th>Coffee Name</th>
            <th>Price</th>
        </tr>
        <%
            while (rs.next()) {
        %>
        <tr>
            <td><%= rs.getInt("id") %></td>
            <td><%= rs.getString("coffee_name") %></td>
            <td><%= rs.getInt("price") %></td>
        </tr>
        <% } %>
    </table>
    <%
        } catch (Exception e) {
            out.println("<p style='color:red;'>Error: " + e.getMessage() + "</p>");
        } finally {
            try { if (rs != null) rs.close(); } catch (Exception e) {}
            try { if (stmt != null) stmt.close(); } catch (Exception e) {}
            try { if (conn != null) conn.close(); } catch (Exception e) {}
        }
    %>

    <h2> Coffee Names Starting with ‘D’</h2>
    <%
        Connection conn2 = null;
        PreparedStatement pstmt = null;
        ResultSet rs2 = null;

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn2 = DriverManager.getConnection("jdbc:mysql://localhost:3306/coffee", "root", "");

            String query = "SELECT * FROM coffee WHERE coffee_name LIKE 'D%'";
            pstmt = conn2.prepareStatement(query);
            rs2 = pstmt.executeQuery();
    %>
    <table border="1" cellpadding="6">
        <tr>
            <th>ID</th>
            <th>Coffee Name</th>
            <th>Price</th>
        </tr>
        <%
            while (rs2.next()) {
        %>
        <tr>
            <td><%= rs2.getInt("id") %></td>
            <td><%= rs2.getString("coffee_name") %></td>
            <td><%= rs2.getInt("price") %></td>
        </tr>
        <% } %>
    </table>
    <%
        } catch (Exception e) {
            out.println("<p style='color:red;'>Error: " + e.getMessage() + "</p>");
        } finally {
            try { if (rs2 != null) rs2.close(); } catch (Exception e) {}
            try { if (pstmt != null) pstmt.close(); } catch (Exception e) {}
            try { if (conn2 != null) conn2.close(); } catch (Exception e) {}
        }
    %>
</body>
</html>
