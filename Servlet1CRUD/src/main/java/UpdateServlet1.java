

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/UpdateServlet1")
public class UpdateServlet1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter writer=response.getWriter();

		Employee e1 = new Employee();
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
		int u=EmployeeDAO.UpdateUser(e1);
		 if(u>0){  
        	 writer.print("<p>Record Updated successfully!</p>");
        	 response.sendRedirect("GetAllUserServlet");
		 	}
		 else{  
        	writer.print("Sorry! unable to update record");  
        	request.getRequestDispatcher("form1.html").include(request, response);
		 	}
        }catch(Exception s1) {
			s1.printStackTrace();
		}  
          
		writer.close();	
	}
}
