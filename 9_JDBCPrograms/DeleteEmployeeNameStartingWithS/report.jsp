<%@ page import="java.sql.*" %>
<!DOCTYPE html>
<html>
<head>
    <title>Employee Report</title>
</head>
<body>
    <h2>Employee Report</h2>

    <%
        Connection conn = null;
        Statement stmt = null;
        ResultSet rs = null;

        try {
            // Database connection setup
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/Employee", "root", "");

            // Query to select all records from the Emp table
            String selectQuery = "SELECT * FROM Emp";
            stmt = conn.createStatement();
            rs = stmt.executeQuery(selectQuery);

            while (rs.next()) {
                int empno = rs.getInt("Emp_NO");
                String empname = rs.getString("Emp_Name");
                int basicsalary = rs.getInt("Basicsalary");
    %>

    <p>~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~</p>
    <p>Emp_No: <%= empno %></p>
    <p>Emp_Name: <%= empname %></p>
    <p>Basic: <%= basicsalary %></p>
    <p>~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~</p>

    <%
            }
        } catch (Exception e) {
            out.println("<p style='color:red;'>Error: " + e.getMessage() + "</p>");
        } finally {
            try { if (rs != null) rs.close(); } catch (Exception e) {}
            try { if (stmt != null) stmt.close(); } catch (Exception e) {}
            try { if (conn != null) conn.close(); } catch (Exception e) {}
        }
    %>

    <hr>
    <a href="index.jsp">Back to Delete Employee</a>
</body>
</html>
