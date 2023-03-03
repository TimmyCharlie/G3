<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>Assignment 4 Group 3 - Login</title>
</head>
<body>
<div style="text-align: center">
    <h1>Login with database credentials</h1>
    <form action="<%= request.getContextPath()%>/login" method="post">
        <table style="width: 100%">
            <tr>
                <td>UserName: </td>
                <td><input type="text" name="username" required></td>
            </tr>
            <tr>
                <td>Password: </td>
                <td><input type="password" name="password" required></td>
            </tr>
        </table>
        <input type="submit" value="Submit"/>
    </form>

</div>
</body>
</html>