

<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Home</title>
</head>
<body>
It's home <br/>
<a href="<%= request.getContextPath()%>/Test?page=login">Login</a> <br/>
<a href="<%= request.getContextPath()%>/Test?page=signUp">sign</a> <br/>
<a href="<%= request.getContextPath()%>/Test?page=about">About</a> <br/>
</body>
</html>