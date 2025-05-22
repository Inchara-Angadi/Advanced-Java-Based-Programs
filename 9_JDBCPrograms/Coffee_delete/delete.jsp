<%--Read all the existing records from the table coffee which is from the database test and delete
an existing coffee product from the table with its id and display the rest of the records using
HTML and JSP to get the field and display the results respectively--%>


<%@ page import="java.sql.*" %>
<%
    String idStr = request.getParameter("id");
    Connection conn = null;
    PreparedStatement pstmt = null;

    try {
        if (idStr != null) {
            int id = Integer.parseInt(idStr);

            // Set up MySQL connection
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost/coffee", "root", "");

            // SQL query to delete the coffee record
            String query = "DELETE FROM coffee WHERE id = ?";
            pstmt = conn.prepareStatement(query);
            pstmt.setInt(1, id);
            int rows = pstmt.executeUpdate();

            if (rows > 0) {
                out.println("<p style='color:green;'>✔ Coffee with ID " + id + " deleted successfully!</p>");
            } else {
                out.println("<p style='color:red;'>✖ No coffee found with ID " + id + "</p>");
            }
        } else {
            out.println("<p style='color:red;'>Please provide a valid Coffee ID.</p>");
        }
    } catch (Exception e) {
        out.println("<p style='color:red;'>Error: " + e.getMessage() + "</p>");
    } finally {
        try { if (pstmt != null) pstmt.close(); } catch (Exception e) {}
        try { if (conn != null) conn.close(); } catch (Exception e) {}
    }

    // Redirect to index.jsp after showing the result
    response.setHeader("Refresh", "2; URL=index.jsp");
%>
