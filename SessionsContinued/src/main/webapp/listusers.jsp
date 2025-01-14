<%@ page import="org.olahammed.entity.User" %>
<%@ page import="java.util.List" %>
<jsp:include page="include/header.jsp" />

<h1>List of Users</h1>
<table border="1" style="width: 500px; height: auto;">
    <thead>
        <tr>
            <th>User Id</th>
            <th>Username</th>
            <th>Email</th>
            <th>Operation(s)</th>
        </tr>
    </thead>
    <tbody>
        <%
        List<User> listusers = (List<User>) request.getAttribute("listusers");
        if (listusers != null) {
            for (User _user : listusers) {
                out.print("<tr>");
                out.print("<td>" + _user.getUser_id() + "</td>");
                out.print("<td>" + _user.getUsername() + "</td>");
                out.print("<td>" + _user.getEmail() + "</td>");
                out.print("<td> <a href="+request.getContextPath()+"/site?page=updateuser&user_id="+_user.getUser_id()+
                		"&username="+_user.getUsername()+"&email="+_user.getEmail()+">UPDATE</a>");
                out.print(" | ");
                out.print(" <a href="+request.getContextPath()+"/site?page=deleteuser&user_id="+_user.getUser_id()+">DELETE</a></td>");
                out.print("</tr>");
            }
        } else {
            out.print("<tr><td colspan='3'>No users found</td></tr>");
        }
        %>
    </tbody>
</table>

<jsp:include page="include/footer.jsp" />
