<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@page import="com.jspServlet.drashti.Employee1"%>
<%@page import="com.jspServlet.drashti.Employee1DAO"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
String id=request.getParameter("id");
int eid=Integer.parseInt(id);
Employee1 e1=Employee1DAO.getUserById(eid);
%>

<form action="updateUser1.jsp" method="post">
<table border='1'>
	<tr><td>Id</td><td><input type="hidden" name="id" value="<%=e1.getId() %>" >
	<tr><td>Name</td><td><input type="text" name="name" value="<%=e1.getName() %>"></td></tr>
	<tr><td>Email</td><td><input type="email" name="email" value="<%=e1.getEmail() %>"></td></tr>
	<tr><td>Password</td><td><input type="password" name="password" value="<%=e1.getPassword() %>"></td></tr>
	<tr><td><input type="submit" value="Update"></td></tr>
</table>
</form>
</body>
</html>