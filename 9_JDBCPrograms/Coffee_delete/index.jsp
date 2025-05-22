<%@ page import="java.sql.*" %>
<!DOCTYPE html>
<html>
<head>
    <title>Coffee List</title>
</head>
<body>
    <h2>☕ Coffee Records</h2>

    <%
        Connection conn = null;
        Statement stmt = null;
        ResultSet rs = null;

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost/coffee", "root", "");

            stmt = conn.createStatement();
            String query = "SELECT * FROM coffee";
            rs = stmt.executeQuery(query);

            if (rs != null) {
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
                String coffeeName = rs.getString("coffee_name");
                int price = rs.getInt("price");
        %>

        <tr>
            <td><%= id %></td>
            <td><%= coffeeName %></td>
            <td><%= price %></td>
        </tr>

        <%
            }
        %>
    </table>

    <h3>Delete Coffee Record</h3>
    <form action="delete.jsp" method="post">
        Coffee ID to Delete: <input type="number" name="id" required><br><br>
        <input type="submit" value="Delete Coffee">
    </form>

    <%
        } else {
            out.println("<p>No coffee records found.</p>");
        }
        } catch (Exception e) {
            out.println("<p style='color:red;'>Error: " + e.getMessage() + "</p>");
        } finally {
            try { if (rs != null) rs.close(); } catch (Exception e) {}
            try { if (stmt != null) stmt.close(); } catch (Exception e) {}
            try { if (conn != null) conn.close(); } catch (Exception e) {}
        }
    %>
</body>
</html>
