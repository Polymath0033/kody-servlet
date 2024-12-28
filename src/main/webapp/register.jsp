<%--
  Created by IntelliJ IDEA.
  User: USER
  Date: 28/12/2024
  Time: 02:03
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" isELIgnored="false" language="java" %>
<html>
<head>
    <title>Register</title>
</head>
<body>
<h1>Register Account</h1>
<p>${error}</p>
<form method="post" action="/register" >
    <label for="email">Email</label>
    <input id="email" name="email" type="email" /><br/>
    <label for="name">Name</label>
    <input id="name" name="name" type="text" /><br/>
    <label for="age">Age</label>
    <input id="age" name="age" type="number" /><br />
    <label for="password">Password</label>
    <input id="password" name="password" type="password" /><br />
    <label for="confirm-password">Confirm Password</label>
    <input id="confirm-password" name="confirm-password" type="password" /><br />
    <button type="submit" >Create Account</button>
</form>
</body>
</html>
