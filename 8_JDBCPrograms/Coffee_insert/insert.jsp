<%@ page import="java.sql.*" %>
<%
    String name = request.getParameter("name");
    String priceStr = request.getParameter("price");

    Connection conn = null;
    PreparedStatement pstmt = null;

    try {
        Class.forName("com.mysql.cj.jdbc.Driver");
        conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/coffee", "root", "");

        String sql = "INSERT INTO coffee (coffee_name, price) VALUES (?, ?)";
        pstmt = conn.prepareStatement(sql);
        pstmt.setString(1, name);
        pstmt.setInt(2, Integer.parseInt(priceStr));

        int rows = pstmt.executeUpdate();

        if (rows > 0) {
            out.println("<p style='color:green;'>✔ Coffee inserted successfully!</p>");
        } else {
            out.println("<p style='color:red;'>✖ Failed to insert coffee.</p>");
        }

    } catch (Exception e) {
        out.println("<p style='color:red;'>Error: " + e.getMessage() + "</p>");
    } finally {
        try { if (pstmt != null) pstmt.close(); } catch (Exception e) {}
        try { if (conn != null) conn.close(); } catch (Exception e) {}
    }

    // Redirect back to index.jsp
    response.setHeader("Refresh", "2; URL=index.jsp");
%>
