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
int eid=Integer.parseInt(id);
Student s=StudentDAO.getUserById(eid);
%>
</body>
</html>