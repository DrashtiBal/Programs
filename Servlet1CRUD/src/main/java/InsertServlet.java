

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class InsertServlet
 */
@WebServlet("/ServiceServlet")
public class InsertServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public InsertServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int status;
		
		response.setContentType("text/html");
		PrintWriter writer = response.getWriter();
		String id=request.getParameter("id");
		int eid=Integer.parseInt(id);
		String name=request.getParameter("name");
		String email=request.getParameter("email");
		String password=request.getParameter("password");
		
		Employee e1 = new Employee();
		e1.setId(eid);
		e1.setName(name);
		e1.setEmail(email);
		e1.setPassword(password);
		try {
		status = EmployeeDAO.insertUser(e1);  
		//System.out.println(status);
        if(status>0){  
        	 writer.print("<p>Record saved successfully!</p>");
            request.getRequestDispatcher("form1.html").include(request, response);  
//       	RequestDispatcher rd = request.getRequestDispatcher("form1.html");
//        	rd.forward(request, response);
      
        }else{  
        	writer.print("Sorry! unable to save record");  
        }
        }catch (Exception e) {
			e.printStackTrace();
		}  
          
        writer.close();  
	}

}
