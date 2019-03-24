<%--
  Created by IntelliJ IDEA.
  User: gaurav
  Date: 3/24/19
  Time: 3:07 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Form</title>
</head>
<body>
    <form action="/form/submitform" method="post">
        <label>Username : </label><br>
        <input name="username" type="text">
        <label>Password : </label><br>
        <input name="password" type="password">
        <br>
        <input type="submit">
    </form>
</body>
</html>
