<%@ page import="java.sql.*" %>
<!DOCTYPE html>
<html>
<head>
    <title>Update Employee</title>
</head>
<body>
    <h2>Update Employee Details</h2>

    <form action="update.jsp" method="get">
        Employee Number: <input type="number" name="empno" required><br><br>
        <input type="submit" value="Fetch Employee Details">
    </form>
</body>
</html>
