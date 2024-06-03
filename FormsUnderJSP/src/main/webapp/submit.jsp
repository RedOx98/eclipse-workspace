<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Submit</title>
</head>
<body>
Name: <%= request.getParameter("fullname")%>
Gender: <%= request.getParameter("gender")%>
Language: <%
String[] languages = request.getParameterValues("language");
if(languages != null){
	for(int i = 0; i < languages.length; i++){
		out.print("<br/>");
		out.print(languages[i]);
	}
}
%><br/>
Country: <%= request.getParameter("country")%>
</body>
</html>