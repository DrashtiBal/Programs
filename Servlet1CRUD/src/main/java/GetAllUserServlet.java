import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

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
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		response.setContentType("text/html");
		PrintWriter writer = response.getWriter();
		Employee e1 = new Employee();
		List<Employee> l1=EmployeeDAO.GetAllUser();
		writer.print("<table border='1'>");
		writer.print("<tr><th>id</th><th>name</th><th>email</th><th>password</th><th>Delete</th></tr>");
		for (Employee em :l1) {
		writer.println("<tr><td>"+em.getId()+"</td><td>"+em.getName()+"</td><td>"+em.getEmail()+"</td><td>"+em.getPassword()+"</td><td><a href='DeleteServlet?id="+em.getId()+"'>delete</a></td></tr>");	 
	}   writer.print("<a href='form1.html'>Insert New Employee</a>");  
		writer.print("</table>");
		writer.close();
}
}