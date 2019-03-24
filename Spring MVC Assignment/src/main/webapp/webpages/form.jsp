<%--
  Created by IntelliJ IDEA.
  User: gaurav
  Date: 3/24/19
  Time: 6:12 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Form</title>
</head>
<body>
    <form action="/submitform" method="post">
        <input type="text" placeholder="firstname" name="firstname">
        <input type="text" placeholder="lastname" name="lastname">
        <input type="submit">
    </form>
</body>
</html>
