<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@page import="com.student.drashti.Student"%>
	<%@page import="com.student.drashti.StudentDAO"%>
<!DOCTYPE html>
<html>
<head>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-GLhlTQ8iRABdZLl6O3oVMWSktQOp6b7In1Zl3/Jr59b6EGGoI1aFkw7cmDA6j6gD" crossorigin="anonymous">
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/js/bootstrap.bundle.min.js" integrity="sha384-w76AqPfDkMBDXo30jS1Sgez6pr3x5MlQ1ZAGC+nuZB+EYdgRZgiwxhTBTkF7CXvN" crossorigin="anonymous"></script>
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
<table border=1 width='1' class="table table-striped table-hover">
<tr><td>Id</td><td><input type="text" name="id" value="<%=s1.getId() %>" readonly></td></tr>
<tr><td>Name</td><td><input type="text" name="name" value="<%=s1.getName() %>"></td></tr>
<tr><td>Email</td><td><input type="text" name="email" value="<%=s1.getEmail() %>"></td></tr>
<tr><td>password</td><td><input type="text" name="password" value="<%=s1.getPassword() %>"></td></tr>
<tr><td><input type="submit" value="Update"></td></tr>
</table>
</form>
</body>
</html>