<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@page import="com.student.drashti.Student"%>
	<%@page import="com.student.drashti.StudentDAO"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
String id=request.getParameter("id");
int sid=Integer.parseInt(id);
Student s1=StudentDAO.getUserById(sid);
%>
<form action="InsertServlet?action=updateUser" method="post">
<table border=1 width='1'>
<tr><td>Id</td><td><input type="text" name="id" value="<%=s1.getId() %>" readonly></td></tr>
<tr><td>Name</td><td><input type="text" name="name" value="<%=s1.getName() %>"></td></tr>
<tr><td>Email</td><td><input type="text" name="email" value="<%=s1.getEmail() %>"></td></tr>
<tr><td>password</td><td><input type="text" name="password" value="<%=s1.getPassword() %>"></td></tr>
<tr><td><input type="submit" value="Update"></td></tr>
</table>
</form>
</body>
</html>