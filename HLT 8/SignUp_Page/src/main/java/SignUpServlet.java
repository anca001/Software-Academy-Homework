

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class SignUpServlet
 */
@WebServlet("/SignUpServlet")
public class SignUpServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SignUpServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	
	
		try {
			PrintWriter write = response.getWriter();
			response.setContentType("text/html");
			
			String uname,pass,email;
			int uid;
			
			uname = request.getParameter("uname");
			pass = request.getParameter("pass");
			email = request.getParameter("email");
			String id = request.getParameter("uid"); //String
			
			//String-> int (Parsing)
			uid = Integer.parseInt(id);
			
			//DB connection.
			DBConnection connect = new DBConnection();
			int row_insert = connect.insert(uname, email, pass, uid);
			
			if(row_insert==1)
			{
				//ok
				response.sendRedirect("user.jsp");
			}
			else
			{
				//not ok
				write.print("Can not save user, please check again");
				RequestDispatcher dispatch = request.getRequestDispatcher("SignUp.jsp");
				dispatch.include(request, response);
			}
			//System.out.println(uname);
			
		}
		catch(Exception ex )
		{
			System.out.println("Servlet error:" + ex);
			
		}
	
	
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
