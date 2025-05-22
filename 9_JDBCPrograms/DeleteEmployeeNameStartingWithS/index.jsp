<%@ page import="java.sql.*" %>
<!DOCTYPE html>
<html>
<head>
    <title>Delete Employee Record</title>
</head>
<body>
    <h2>Delete Employee Record</h2>
    
    <form action="deleteEmployee.jsp" method="POST">
        <label for="empname">Enter Employee Name (starts with 'S'):</label><br>
        <input type="text" id="empname" name="empname" required><br><br>
        <input type="submit" value="Delete Employee">
    </form>

    <hr>

    <a href="report.jsp">View Employee Report</a>
</body>
</html>
