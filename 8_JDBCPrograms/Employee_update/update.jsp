<%@ page import="java.sql.*" %>
<%
    String empnoStr = request.getParameter("empno");
    Connection conn = null;
    PreparedStatement pstmt = null;
    ResultSet rs = null;

    // If empno is not null, fetch and show employee details
    if (empnoStr != null) {
        int empno = Integer.parseInt(empnoStr);
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/Employee", "root", "");

            String sql = "SELECT * FROM Emp WHERE Emp_NO = ?";
            pstmt = conn.prepareStatement(sql);
            pstmt.setInt(1, empno);
            rs = pstmt.executeQuery();

            if (rs.next()) {
                String empName = rs.getString("Emp_Name");
                int basicSalary = rs.getInt("Basicsalary");
%>

<h2>Update Employee Details</h2>
<form action="updateEmployee.jsp" method="post">
    Employee Number: <input type="text" name="empno" value="<%= empno %>" readonly><br><br>
    Employee Name: <input type="text" name="empname" value="<%= empName %>" required><br><br>
    Basic Salary: <input type="number" name="basicsalary" value="<%= basicSalary %>" required><br><br>
    <input type="submit" value="Update Employee">
</form>

<%
            } else {
                out.println("<p style='color:red;'>Employee with empno " + empno + " not found.</p>");
            }

        } catch (Exception e) {
            out.println("<p style='color:red;'>Error: " + e.getMessage() + "</p>");
        } finally {
            try { if (rs != null) rs.close(); } catch (Exception e) {}
            try { if (pstmt != null) pstmt.close(); } catch (Exception e) {}
            try { if (conn != null) conn.close(); } catch (Exception e) {}
        }
    }
%>
