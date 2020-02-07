<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" %>
<html>
<head>
    <title>sputnik-web</title>
</head>
<body>
<h2>sputnik-web</h2>
<hr>
This project was created from maven-archetype-webapp.<br><br>
<form method="get" action="MainServlet">
    <input type="text" name="param">
    <input type="submit" value="submit by get">
</form>
<form method="post" action="MainServlet">
    <input type="text" name="param">
    <input type="submit" value="submit by post">
</form>
</body>
</html>
