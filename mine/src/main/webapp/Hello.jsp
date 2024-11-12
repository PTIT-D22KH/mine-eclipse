<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<%@page import = "mine.HelloClass, java.util.Date" %>

<meta charset="UTF-8">
<title>Hello JSP</title>
</head>
<body>
<%= new HelloClass().demo() %>
<% out.print(new Date()); %>
</body>
</html>