<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
 pageEncoding="ISO-8859-1"%>
<%@ page trimDirectiveWhitespaces="true" %>
<%@page import="org.apache.jasper.tagplugins.jstl.core.Import"%>
<%@page import="com.jspServlet.drashti.Employee1DAO"%>
<%@page import="com.jspServlet.drashti.Employee1"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<jsp:include page="InsertUserForm.html"></jsp:include>
</body>
<%
String name=request.getParameter("name");
String email=request.getParameter("email");
String password=request.getParameter("password");
Employee1 e1=new Employee1();
e1.setName(name);
e1.setEmail(email);
e1.setPassword(password);
int status=Employee1DAO.insertEmp(e1);
if(status>0)
{
	out.print("User Inserted Successfully");
	//response.sendRedirect("InsertUserForm.html");
}
else
{
	out.print("Failed to Add User");
}
%>
</html>