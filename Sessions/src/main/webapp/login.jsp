

<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Login</title>
</head>
<body>
Submit form <br/>
<%-- <jsp:useBean id="user" class="org.olahammed.beans.User" scope="session"></jsp:useBean> --%>

<form action="<%= request.getContextPath()%>/SiteController" method=post>
Username: <input type="text" name="username" required/> <br/>
Password: <input type="password" name="password" required/><br/>
<input type="hidden" name="action" value="authenticate"/>
<input type="submit" value="Login"/>
</form>
</body>
</html>