

<jsp:include page="include/header.jsp"/>

<h1>Update User</h1>

<form action="${ pageContext.request.contextPath}/site" method="post">

Username: <input type="text" name="username" value="${param.username}" required="required"/><br/>
Email: <input type="email" name="email" value="${param.email}" required="required"/><br/>
<input type="hidden" name="form" value="updateUserOperation"/>
<input type="hidden" name="user_id" value="${param.user_id}"/>
<input type="submit" value="updateUser"/>
</form>

<jsp:include page="include/footer.jsp" />