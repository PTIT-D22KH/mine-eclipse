<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login</title>
</head>
<body>
<form action="<%= request.getContextPath()%>/mineSiteController" method="post">
Username: <input type="text" name="username"> <br/>
Password: <input type="password" name="password"> <br/>
<input type="hidden" name="action" value="authenticate">
<input type="submit" value="Login">
</form>
</body>
</html>