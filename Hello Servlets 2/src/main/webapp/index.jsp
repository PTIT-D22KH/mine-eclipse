<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Hello JSP</title>
</head>
<body>
<strong>
Examples
</strong>
<%-- <%! int x = 22; 
int y = 44; %>
<%= 25 * 3 %>
<br/>
<%= 25 > 3 %> --%>

<%! public int x = 10; 
private String message() {
	return "Vu Cong Tuan Duong";
}%>
<br/>
<%= message() %>
<br/>
<!-- 
<%--
	int x = 25;
	out.print("The value of x: ");
	out.print(x); 
	response.sendRedirect("https://google.com");

--%>
-->

<br/>
<%= x %>
</body>
</html>