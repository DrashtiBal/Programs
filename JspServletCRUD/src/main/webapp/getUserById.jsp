<%@page import="org.apache.jasper.tagplugins.jstl.core.ForEach"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@page import="com.jspServlet.drashti.Employee1DAO"%>
    <%@page import="com.jspServlet.drashti.Employee1"%>
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
out.print("<table border='1'>");
out.print("<tr><th>Id</th><th>Name</th><th>Email</th><th>Password</th></tr>");
out.println("<tr><td>"+e1.getId()+"</td><td>"+e1.getName()+"</td><td>"+e1.getEmail()+"</td><td>"+e1.getPassword()+"</td></tr>");
out.print("<a href='insertUserForm.html'>Insert New Employee</a>");  
out.print("</table>");
%>
</body>
</html>