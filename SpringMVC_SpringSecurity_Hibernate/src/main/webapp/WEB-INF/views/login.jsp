<%--
  Created by IntelliJ IDEA.
  User: xia.jia
  Date: 5/14/2022
  Time: 9:40 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Login</title>
</head>
<body>
    <h1>SpringMVC + Spring Security + Hibernate </h1>
    <h4>Login Form</h4>
    <form action = "/loginAction", method="post">
        <table>
            <tr>
                <td>Username</td>
                <td>
                    <input type ="text" name = "username">
                </td>
            </tr>
            <tr>
                <td>Password</td>
                <td>
                    <input type = "password" name="password">
                </td>
            </tr>
            <tr>
                <td>
                    <button type = "submit">Login</button>
                </td>
            </tr>
        </table>
    </form>
</body>
</html>
