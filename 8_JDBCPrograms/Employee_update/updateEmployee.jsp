<%@ page import="java.sql.*" %>
<%
    String empnoStr = request.getParameter("empno");
    String empname = request.getParameter("empname");
    String basicsalaryStr = request.getParameter("basicsalary");

    Connection conn = null;
    PreparedStatement pstmt = null;

    try {
        int empno = Integer.parseInt(empnoStr);
        int basicsalary = Integer.parseInt(basicsalaryStr);

        Class.forName("com.mysql.cj.jdbc.Driver");
        conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/Employee", "root", "");

        String sql = "UPDATE Emp SET Emp_Name = ?, Basicsalary = ? WHERE Emp_NO = ?";
        pstmt = conn.prepareStatement(sql);
        pstmt.setString(1, empname);
        pstmt.setInt(2, basicsalary);
        pstmt.setInt(3, empno);

        int rows = pstmt.executeUpdate();

        if (rows > 0) {
            out.println("<p style='color:green;'>✔ Employee updated successfully!</p>");
        } else {
            out.println("<p style='color:red;'>✖ Failed to update employee.</p>");
        }

    } catch (Exception e) {
        out.println("<p style='color:red;'>Error: " + e.getMessage() + "</p>");
    } finally {
        try { if (pstmt != null) pstmt.close(); } catch (Exception e) {}
        try { if (conn != null) conn.close(); } catch (Exception e) {}
    }

    // Redirect back to the main page after 2 seconds
    response.setHeader("Refresh", "2; URL=index.jsp");
%>
