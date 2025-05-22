<%--Develop a JDBC project using MySQL to append the fields empno, empname and basicsalary
into the table Emp of the database Employee by getting the fields through keyboard and Generate
the report as follows for the table Emp (Emp_NO , Emp_Name, Basicsalary ) using HTML and JSP
to get the field and display the results respectively--%>


<%@ page import="java.sql.*" %>
<%
    String empno = request.getParameter("empno");
    String empname = request.getParameter("empname");
    String basicsalary = request.getParameter("basicsalary");

    Connection conn = null;
    PreparedStatement pstmt = null;

    try {
        // Database connection setup
        Class.forName("com.mysql.cj.jdbc.Driver");
        conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/employee", "root", "");

        // SQL query to insert a new employee record
        String insertQuery = "INSERT INTO Emp (Emp_NO, Emp_Name, Basicsalary) VALUES (?, ?, ?)";
        pstmt = conn.prepareStatement(insertQuery);
        pstmt.setInt(1, Integer.parseInt(empno));
        pstmt.setString(2, empname);
        pstmt.setInt(3, Integer.parseInt(basicsalary));

        int rowsAffected = pstmt.executeUpdate();

        if (rowsAffected > 0) {
            out.println("<p style='color:green;'>Employee record inserted successfully!</p>");
        } else {
            out.println("<p style='color:red;'>Failed to insert employee record.</p>");
        }

    } catch (Exception e) {
        out.println("<p style='color:red;'>Error: " + e.getMessage() + "</p>");
    } finally {
        try { if (pstmt != null) pstmt.close(); } catch (Exception e) {}
        try { if (conn != null) conn.close(); } catch (Exception e) {}
    }

    // Redirect to index.jsp after a short delay
    response.setHeader("Refresh", "2; URL=index.jsp");
%>
