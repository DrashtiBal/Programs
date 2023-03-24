<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@page import="com.student.drashti.StudentDAO"%>
<%@page import="java.util.List"%>
<%@page import="com.student.drashti.Student"%>
<!DOCTYPE html>
<html>
<head>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-GLhlTQ8iRABdZLl6O3oVMWSktQOp6b7In1Zl3/Jr59b6EGGoI1aFkw7cmDA6j6gD"
	crossorigin="anonymous">
<script
	src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/js/bootstrap.bundle.min.js"
	integrity="sha384-w76AqPfDkMBDXo30jS1Sgez6pr3x5MlQ1ZAGC+nuZB+EYdgRZgiwxhTBTkF7CXvN"
	crossorigin="anonymous"></script>
<style type="text/css">
.button {
	margin: 0;
	position: absolute;
	top: 20%;
	left: 49%;
	-ms-transform: translate(-50%, -50%);
	transform: translate(-50%, -50%);
	color: gray;
	border: none;
	background: none;
	text-decoration: none;
}
</style>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h2>
		<center>CRUD Operation</center>
	</h2>
	<h3>
		<center>Welcome Page</center>
	</h3>
	<%
	List<Student> l1 = StudentDAO.getAllUser();
	if (!l1.isEmpty()) {
		out.print("<center><table border='3'  class='table table-striped table-hover table-secondary '><br><br>");
		out.print("<center><h3>All Student Details</h3>");
		out.print("<tr><th>Id</th><th>Name</th><th>Email</th><th>Password</th><th>Delete</th><th>Update</th></tr>");
		for (Student stu : l1) {
			out.print("<tr><td><a href='InsertServlet?action=getSingleUser&id=" + stu.getId() + "'>" + stu.getId()
			+ "</a></td><td><a href='InsertServlet?action=getSingleUser&id=" + stu.getId() + "'>" + stu.getName()
			+ "</a></td><td>" + stu.getEmail() + "</td><td>" + stu.getPassword()
			+ "</td><td><a href='InsertServlet?action=deleteUser&id=" + stu.getId()
			+ "'>delete</a></td><td><a href='UpdateForm.jsp?id=" + stu.getId() + "'>update</a></td></tr>");
		}
	} else {
		out.print("<center><h4>No User Available</h4><br><br>");
	}
	out.print("</table><br>");
	out.print("<center><button><a href='addUserForm.html'>Add New Student Details</a></button><br><br>");
	//out.print("<center><button><a href='homePage.jsp'>Home Page</a></button><br>");
	%>
</body>
</html>