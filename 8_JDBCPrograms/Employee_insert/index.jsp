<%@ page import="java.sql.*" %>
<!DOCTYPE html>
<html>
<head>
    <title>Employee Salary Report</title>
</head>
<body>
    <h2>Enter Employee Details</h2>

    <form action="insert.jsp" method="post">
        Employee Number: <input type="number" name="empno" required><br><br>
        Employee Name: <input type="text" name="empname" required><br><br>
        Basic Salary: <input type="number" name="basicsalary" required><br><br>
        <input type="submit" value="Add Employee">
    </form>

    <h2>Salary Report</h2>

    <%
        Connection conn = null;
        Statement stmt = null;
        ResultSet rs = null;
        int grandSalary = 0;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/Employee", "root", "");

            stmt = conn.createStatement();
            rs = stmt.executeQuery("SELECT * FROM Emp");

            while (rs.next()) {
                int empNo = rs.getInt("Emp_NO");
                String empName = rs.getString("Emp_Name");
                int basicSalary = rs.getInt("Basicsalary");

                grandSalary += basicSalary;  // Sum the salaries for grand total
    %>

    <hr>
    <p>Emp_No : <%= empNo %></p>
    <p>Emp_Name: <%= empName %></p>
    <p>Basic Salary : <%= basicSalary %></p>
    <hr>

    <%
            }
    %>

    <h3>Grand Salary: <%= grandSalary %></h3>

    <%
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
