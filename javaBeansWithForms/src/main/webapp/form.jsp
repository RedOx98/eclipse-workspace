


<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Get property</title>
</head>
<body>
Submit form <br/>
<jsp:useBean id="user" class="org.olahammed.beans.User" scope="session"></jsp:useBean>

<form action="formValue.jsp">
First Name: <input type="text" name="firstName" value='<jsp:getProperty property="firstName" name="user"/>' required/>
Last Name: <input type="text" name="lastName" value='<jsp:getProperty property="lastName" name="user"/>' required/><br/>
<input type="submit" value="submit"/>
</form>
</body>
</html>