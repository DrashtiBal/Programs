

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/GetUserByIdServlet")
public class GetUserByIdServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter writer = response.getWriter();
		writer.print("<html><head></head>");
		writer.print("<body>");
		writer.print("<form action=GetUserByIdServlet method=get>");
		writer.print("<table border='1'>");
		writer.print("<tr><td>Enter Id</td><td><input type=text name=id></td></tr>");
		writer.print("<tr><td><center><input type=submit value=View></center></td></tr>");
		writer.print("</table>");
		writer.print("</form>");
		writer.print("</body></html>");
		Employee e1 = new Employee();
		if(!(request.getParameter("id")==null))
		{
		String id=request.getParameter("id");
		int eid=Integer.parseInt(id);
		
		Employee e=EmployeeDAO.GetUserById(eid);
		if(e.getId()!=0)
		{
		writer.print("<table border='1'>");
		writer.print("<tr><th>id</th><th>name</th><th>email</th><th>password</th></tr>");
		writer.println("<tr><td>"+e.getId()+"</td><td>"+e.getName()+"</td><td>"+e.getEmail()+"</td><td>"+e.getPassword()+"</td></tr>");	 
		writer.print("</table>");
		writer.print("<a href=form1.html>Insert New Employee</a>");}
		else
		{
			writer.println("Id does not exist");
			request.getRequestDispatcher("form1.html").include(request, response);
		}
		writer.close();
	}
	}
	//}
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}
}
