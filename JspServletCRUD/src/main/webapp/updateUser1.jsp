<%@page import="com.jspServlet.drashti.Employee1"%>
<%@page import="com.jspServlet.drashti.Employee1DAO"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
Employee1 e1=new Employee1();
String tid=request.getParameter("id");
int uid=Integer.parseInt(tid);
String name=request.getParameter("name");
String email=request.getParameter("email");
String password=request.getParameter("password");
e1.setId(uid);
e1.setName(name);
e1.setEmail(email);
e1.setPassword(password);
try {
int rs=Employee1DAO.updateUser(e1);
 if(rs>0){  
	 out.print("<p>Record Updated successfully!</p>");
	 response.sendRedirect("viewAllUser.jsp");
 	}
 else{  
	out.print("Sorry! unable to update record");  
	request.getRequestDispatcher("viewAllUser.jsp").include(request, response);
 	}
}catch(Exception s1) {
	s1.printStackTrace();
}  

%>
</body>
</html>