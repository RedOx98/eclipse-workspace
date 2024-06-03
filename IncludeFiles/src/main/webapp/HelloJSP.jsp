<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>

<meta charset="UTF-8">
<title>Hello JSP</title>
</head>
<body>
<h1>Files</h1>
<hr/>
<!-- Static Include -->
<%@ include file="file.txt" %>
<br/>
<!-- Dynamic Include -->
<jsp:include page="file2.txt"></jsp:include>
</body>
</html>