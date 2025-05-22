<%@ page import="java.sql.*" %>
<!DOCTYPE html>
<html>
<head>
    <title>Coffee List</title>
</head>
<body>	
    <h2> Coffee Records from Database</h2>

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
                    int id = rs.getInt("id");
                    String name = rs.getString("coffee_name");
                    int price = rs.getInt("price");
            %>
            <tr>
                <td><%= id %></td>
                <td><%= name %></td>
                <td><%= price %></td>
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

    <h3>Add a New Coffee Product</h3>
    <form action="insert.jsp" method="post">
        Coffee Name: <input type="text" name="name" required><br><br>
        Price: <input type="number" name="price" required><br><br>
        <input type="submit" value="Insert Coffee">
    </form>
</body>
</html>
