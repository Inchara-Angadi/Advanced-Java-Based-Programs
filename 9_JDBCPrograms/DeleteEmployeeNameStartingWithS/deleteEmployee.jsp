<%--Develop a JDBC project using MySQL to delete the records in the table Emp of the database
Employee by getting the name starting with ‘S’ through keyboard and Generate the report as
follows using HTML and JSP to get the field and display the results respectively--%>


Salary Report

~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
Emp_No : 101
Emp_Name: Ramesh'
Basic : 25000
~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
Emp_No : 102
Emp_Name: Ravi
Basic : 20000
~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~



<%@ page import="java.sql.*" %>
<!DOCTYPE html>
<html>
<head>
    <title>Delete Employee</title>
</head>
<body>
    <h2>Employee Deletion Status</h2>

    <%
        String empname = request.getParameter("empname");
        Connection conn = null;
        PreparedStatement pstmt = null;

        try {
            // Check if the entered name starts with 'S'
            if (empname != null && empname.startsWith("S")) {
                // Establish database connection
                Class.forName("com.mysql.cj.jdbc.Driver");
                conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/Employee", "root", "");

                // SQL query to delete the employee record
                String deleteQuery = "DELETE FROM Emp WHERE Emp_Name = ?";
                pstmt = conn.prepareStatement(deleteQuery);
                pstmt.setString(1, empname);

                int rowsAffected = pstmt.executeUpdate();

                if (rowsAffected > 0) {
                    out.println("<p style='color:green;'>Employee record deleted successfully!</p>");
                } else {
                    out.println("<p style='color:red;'>No employee found with the name starting with 'S'.</p>");
                }
            } else {
                out.println("<p style='color:red;'>Please enter a name starting with 'S'.</p>");
            }
        } catch (Exception e) {
            out.println("<p style='color:red;'>Error: " + e.getMessage() + "</p>");
        } finally {
            try { if (pstmt != null) pstmt.close(); } catch (Exception e) {}
            try { if (conn != null) conn.close(); } catch (Exception e) {}
        }
    %>

    <h3>Remaining Employees</h3>

    <%
        // Generate the report of all remaining employees
        Statement stmt = null;
        ResultSet rs = null;
        try {
            // Reconnect to the database to retrieve and display remaining records
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/Employee", "root", "");
            String selectQuery = "SELECT * FROM Emp";
            stmt = conn.createStatement();
            rs = stmt.executeQuery(selectQuery);

            while (rs.next()) {
                int empno = rs.getInt("Emp_NO");
                String name = rs.getString("Emp_Name");
                int salary = rs.getInt("Basicsalary");
    %>

    <p>~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~</p>
    <p>Emp_No: <%= empno %></p>
    <p>Emp_Name: <%= name %></p>
    <p>Basic: <%= salary %></p>
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
