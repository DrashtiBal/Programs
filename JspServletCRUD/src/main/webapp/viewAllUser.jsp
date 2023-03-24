<%@page import="org.apache.jasper.tagplugins.jstl.core.ForEach"%>
<%@page import="com.jspServlet.drashti.Employee1DAO"%>
<%@page import="java.util.List"%>
<%@page import="com.jspServlet.drashti.Employee1"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h2><center>CRUD Operation</center></h2>
<h3><center>Welcome Page</center></h3>

<div class=button>
<button><a style=text-decoration:none href="addUserForm.html" >Add Student details Here</a></button>
</div>
	<%
	Employee1 e1 = new Employee1();
	List<Employee1> l2 = Employee1DAO.viewAllUser();
	out.print("<table border='1'>");
	out.print("<tr><th>Id</th><th>Name</th><th>Email</th><th>Password</th><th>Delete</th><th>Update</th></tr>");
	for (Employee1 ee : l2) {
		out.print("<tr><td><a href='getUserById.jsp?id=" + ee.getId() + "'>" + ee.getId()
		+ "</a></td><td><a href='getUserByName.jsp?name=" + ee.getName() + "'>" + ee.getName() + "</a></td><td>"
		+ ee.getEmail() + "</td><td>" + ee.getPassword() + "</td><td><a href='deleteUser.jsp?id=" + ee.getId()
		+ "'>delete</a></td><td><a href='updateUser.jsp?id=" + ee.getId() + "'>update</a></td></tr>");
	}
	out.print("</table>");
	%>
</body>
</html>