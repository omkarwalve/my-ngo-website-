

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.tomcat.websocket.BackgroundProcess;

/**
 * Servlet implementation class Register
 */
@WebServlet("/Register")
public class Register extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Register() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	String uname = request.getParameter("uname");
	String password = request.getParameter("password");
	String email = request.getParameter("email");
	
	Member member = new Member(uname,password,email);
	RegisterDao rDao = new RegisterDao();
	String result = rDao.insert(member);	
	if (result.equals("Data not entered")) {
		response.sendRedirect(request.getContextPath()+"/registrationfailed.jsp");
	
	} else {
		response.getWriter().print(result);
		response.getWriter().print("\nplease go back to the login page");
		response.sendRedirect(request.getContextPath()+"/index.jsp");
	}

	
	}

}
