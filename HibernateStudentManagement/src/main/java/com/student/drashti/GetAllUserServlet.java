package com.student.drashti;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class GetAllUserServlet
 */
@WebServlet("/GetAllUserServlet")
public class GetAllUserServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public GetAllUserServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//List<Student> l1=null;
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		Student s=new Student();
		//String action=request.
		List<Student> l1=StudentDAO.getAllUser();
		out.print("<table border='1'>");
		out.print("<tr><th>Id</th><th>Name</th><th>email</th><th>Password</th><th>Delete</th><th>Update</th></tr>");
		for (Student stu : l1) {
			out.print("<tr><td><a href='getUserById.jsp?id=" + stu.getId() + "'>" +stu.getId()
			+ "</a></td><td><a href='getUserByName.jsp?name=" + stu.getName() + "'>" + stu.getName() + "</a></td><td>"
			+stu.getEmail() + "</td><td>" +stu.getPassword() + "</td><td><a href='deleteUser.jsp?id=" + stu.getId()
			+ "'>delete</a></td><td><a href='updateUser.jsp?id=" + stu.getId() + "'>update</a></td></tr>");
		}
		out.print("<a href='addUserForm.html'>Add New Student Details</a>");
		out.print("</table>");
	}
}
