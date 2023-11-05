<%--
  Created by IntelliJ IDEA.
  User: soraw
  Date: 10/30/2023
  Time: 10:14 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Register</title>
</head>
<body>
    <h1>Sarawit Kraukham 65130500083</h1>
    <form action="register" method="post">
        <label for="name-input">
            Username:
        </label>
        <input type="text" name="fullname" id="name-input" placeholder="Input your fullname."> <br>
        <label for="email-addr">
            Email Address:
        </label>
        <input type="text" name="email" id="email-addr" placeholder="Input your email."> <br>
        <input type="submit" name="submit" value="Submit">
    </form>
</body>
</html>
