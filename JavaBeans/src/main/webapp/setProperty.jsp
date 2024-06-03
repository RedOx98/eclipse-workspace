

<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Set property</title>
</head>
<body>
<jsp:useBean id="user" class="org.olahammed.beans.User" scope="request"></jsp:useBean>

<jsp:setProperty property="firstName" name="user" value="John"/> <br/>
<jsp:setProperty property="lastName" name="user" value="Doe"/> <br/>

Values are updated

<%
request.getRequestDispatcher("getProperty.jsp").forward(request, response);

%>
</body>
</html>