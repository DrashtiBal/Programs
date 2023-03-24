package com.student.drashti;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import javassist.bytecode.stackmap.BasicBlock.Catch;

/**
 * Servlet implementation class InsertServlet
 */
@WebServlet("/InsertServlet")
public class InsertServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doPost(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		try
		{
		String option = request.getParameter("action");
		switch (option) {
		case "insertServlet":
			Student s = new Student();
			String id=request.getParameter("id");
			int sid=Integer.parseInt(id);
			String name = request.getParameter("name");
			String email = request.getParameter("email");
			String password = request.getParameter("password");
			// Student s1=new Student();
			s.setId(sid);
			s.setName(name);
			s.setEmail(email);
			s.setPassword(password);
			StudentDAO.saveUser(s);
//	        out.print("Student details are Inserted");
			response.sendRedirect("homePage1.jsp");

			break;
		/*
		 * case "getAllUserServlet": // Student s=new Student(); List<Student> l1 =
		 * StudentDAO.getAllUser(); out.print("<table border='1'>"); out.print(
		 * "<tr><th>Id</th><th>Name</th><th>email</th><th>Password</th><th>Delete</th><th>Update</th></tr>"
		 * ); for (Student stu : l1) {
		 * out.print("<tr><td><a href='InsertServlet?action=getSingleUser&id=" +
		 * stu.getId() + "'>" + stu.getId() +
		 * "</a></td><td><a href='InsertServlet?action=getSingleUser&id=" + stu.getId()
		 * + "'>" + stu.getName() + "</a></td><td>" + stu.getEmail() + "</td><td>" +
		 * stu.getPassword() + "</td><td><a href='InsertServlet?action=deleteUser&id=" +
		 * stu.getId() + "'>delete</a></td><td><a href='UpdateForm.jsp?id=" +
		 * stu.getId() + "'>update</a></td></tr>"); } out.
		 * print("<button><a href='addUserForm.html'>Add New Student Details</a></button><br><br>"
		 * ); out.print("<button><a href='homePage.jsp'>Home Page</a></button>");
		 * out.print("</table>"); break;
		 */
		/*
		 * case "/GetUserById": StudentDAO.getUserById(id); break;
		 */
		case "deleteUser":
			int did = Integer.parseInt(request.getParameter("id"));
			StudentDAO.deleteUser(did);
			response.sendRedirect("homePage1.jsp");
			break;

		case "updateUser":
			String id1 = request.getParameter("id");
			int s1id = Integer.parseInt(id1);
			String name1 = request.getParameter("name");
			String email1 = request.getParameter("email");
			String password1 = request.getParameter("password");
			Student s1 = new Student();

			s1.setId(s1id);
			s1.setName(name1);
			s1.setEmail(email1);
			s1.setPassword(password1);

			StudentDAO.updateUser(s1);
			response.sendRedirect("homePage1.jsp");
			break;

		case "getSingleUser":
			Student s2 = new Student();
			String id2 = request.getParameter("id");
			int sid1 = Integer.parseInt(id2);
			s2 = StudentDAO.getUserById(sid1);
			//out.print("<p>Details Of User</p>");
			out.print("<center><table border='1'>");
			out.print("<tr><th>Id</th><th>Name</th><th>Email</th><th>Password</th></tr>");
			out.print("<tr><td>" + s2.getId() + "</td><td>" + s2.getName() + "</td><td>" + s2.getEmail() + "</td><td>"
					+ s2.getPassword() + "</td></tr>");
			//out.print("<a href='addUserForm.html'>Add Student Details here</a>");
			out.println("<center><button><a href='addUserForm.html'>Add New Student Details</a></button><br><br>");
			out.print("<center><button><a href='homePage1.jsp'>View All Student Details</a></button>");
			break;
			
		default:
			System.exit(0);
		}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}
