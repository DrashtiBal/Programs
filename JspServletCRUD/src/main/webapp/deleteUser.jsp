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
Employee1DAO.deleteByID(eid);
response.sendRedirect("viewAllUser.jsp");
%>
</body>
</html>