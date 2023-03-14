
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/UpdateServlet")
public class UpdateServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		// doGet(request, response);
		Employee e1 = new Employee();
		response.setContentType("text/html");
		PrintWriter writer = response.getWriter();

		writer.print("<html><head></head>");
		writer.print("<body>");
//search box for id		
		writer.print("<form action=UpdateServlet method=post>");
		writer.print("<table border='1'>");
		writer.print("<tr><td>Enter Id</td><td><input type=text name=id></td></tr>");
		writer.print("<tr><td><center><input type=submit value=submit></center></td></tr>");
		writer.print("</table>");
		writer.print("</form>");

	}

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.setContentType("text/html");
		PrintWriter writer = response.getWriter();

		String id = request.getParameter("id");
		int eid = Integer.parseInt(id);
		// System.out.println(eid);
		Employee e = EmployeeDAO.GetUserById(eid);
//Old data		
		if (!(e.getId() == 0)) {
			// Enter new Data
			writer.print("<p>Update Employee Details</p>");
			writer.print("<form action=UpdateServlet1?id=" + e.getId() + " method=post>");
			writer.print("<table border='1'>");
			writer.print("<tr><td>Enter Id To Be Updated</td><td><input type=text name=id value='" + e.getId()
					+ "'></td></tr>");
			writer.print("<tr><td>Enter Name To Be Updated</td><td><input type=text name=name value='" + e.getName()
					+ "'></td></tr>");
			writer.print("<tr><td>Enter Email To Be Updated</td><td><input type=text name=email value='" + e.getEmail()
					+ "'></td></tr>");
			writer.print("<tr><td>Enter Password to Be Updated</td><td><input type=text name=password value='"
					+ e.getPassword() + "'></td></tr>");
			writer.print("<tr><td><center><input type=submit value=Update></center></td></tr>");
			writer.print("</table>");
			writer.print("</form>");
			writer.print("</body></html>");

		} else {
			writer.println("Id does not exist");
			request.getRequestDispatcher("form1.html").include(request, response);
			// response.sendRedirect("form1.html");
		}

	}

}
