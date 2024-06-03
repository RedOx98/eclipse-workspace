

<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Form</title>
</head>
<body>
<!-- <form action="submit.jsp" method="post"> -->
<form action="<%= request.getContextPath() %>/FormsUnderJSP" method=post>
<h1>Full Name: </h1> <input type="text" name="fullname" required="required"/><br/>
<h1> Gender: </h1> <input type="radio" name="gender" value="male" checked="checked"/> <Label for="male">Male</Label><br/>
		<input type="radio" name="gender" value="female"/> <Label for="female">Female</Label><br/>
<h1>Languages known:</h1> <input type="checkbox" name="language" value="Yoruba"/> <Label for="Yoruba">Yoruba</Label><br/>
						  <input type="checkbox" name="language" value="English"/> <Label for="English">English</Label><br/>
						  <input type="checkbox" name="language" value="French"/> <Label for="French">French</Label><br/>
						  
<h1>Country:</h1> <select name="country">
					<option value="India"> <span>India</span></option>
					<option value="Pakistan"> <span>Pakistan</span></option>
					<option value="Nigeria"> <span>Nigeria</span></option>
					<option value="UK"> <span>UK</span></option>
					<option value="Canada"> <span>Canada</span></option>
				</select> <br/>
				<input type="submit" value="Submit"/>
</form>
</body>
</html>