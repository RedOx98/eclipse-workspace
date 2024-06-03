<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Hello JSP</title>
</head>
<body>
<strong>Welcome to JSP! </strong>

<br/>
<%! int x =22;
int y =22;  %>
<%= new String("Olaide") %>
<br/>

<%--
int x =70;
/* out.print("The value of x is " + x); 
out.print(x);*/
response.sendRedirect("http://www.google.com");
--%>
<br/>

<%!
String message(){
	
	return "Olaide Hammed";
}
%>

<%= message() %>
</body>
</html>