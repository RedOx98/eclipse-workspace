

<jsp:include page="include/header.jsp"/>

<h1>Add User</h1>

<form action="${ pageContext.request.contextPath}/site" method="post">

Username: <input type="text" name="username" required="required"/><br/>
Email: <input type="email" name="email" required="required"/><br/>
<input type="hidden" name="form" value="addUserOperation"/>
<input type="submit" value="addUser"/>
</form>

<jsp:include page="include/footer.jsp" />