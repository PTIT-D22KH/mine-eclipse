<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Set Property</title>
</head>
<body>
<%-- <jsp:useBean id="user" class="mine.beans.User" scope="session"></jsp:useBean> --%>
<%-- <jsp:useBean id="user" class="mine.beans.User" scope="application"></jsp:useBean> --%>
<%-- <jsp:useBean id="user" class="mine.beans.User" scope="page"></jsp:useBean> --%>
<jsp:useBean id="user" class="mine.beans.User" scope="request"></jsp:useBean>
<jsp:setProperty property="firstName" name="user" value="Chaand"/><br/>
<jsp:setProperty property="lastName" name="user" value="Sheikh"/>

Values are updated
<br>
First Name: <jsp:getProperty property="firstName" name="user"/><br/>
Last Name: <jsp:getProperty property="lastName" name="user"/>
<%
	request.getRequestDispatcher("getProperty.jsp").forward(request, response);
%>
</body>
</html>