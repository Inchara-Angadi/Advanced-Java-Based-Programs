<%@ page import="java.sql.*" %>
<%
    String idStr = request.getParameter("id");
    String name = request.getParameter("name");
    String priceStr = request.getParameter("price");

    Connection conn = null;
    PreparedStatement pstmt = null;

    try {
        int id = Integer.parseInt(idStr);
        int price = Integer.parseInt(priceStr);

        Class.forName("com.mysql.cj.jdbc.Driver");
        conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/coffee", "root", "");

        String sql = "UPDATE coffee SET coffee_name = ?, price = ? WHERE id = ?";
        pstmt = conn.prepareStatement(sql);
        pstmt.setString(1, name);
        pstmt.setInt(2, price);
        pstmt.setInt(3, id);

        int rows = pstmt.executeUpdate();

        if (rows > 0) {
            out.println("<p style='color:green;'>✔ Coffee updated successfully!</p>");
        } else {
            out.println("<p style='color:red;'>✖ No coffee found with ID: " + id + "</p>");
        }

    } catch (Exception e) {
        out.println("<p style='color:red;'>Error: " + e.getMessage() + "</p>");
    } finally {
        try { if (pstmt != null) pstmt.close(); } catch (Exception e) {}
        try { if (conn != null) conn.close(); } catch (Exception e) {}
    }

    // Redirect back to index.jsp after 2 seconds
    response.setHeader("Refresh", "2; URL=index.jsp");
%>
