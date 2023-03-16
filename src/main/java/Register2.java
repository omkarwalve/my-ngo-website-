

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.tomcat.websocket.BackgroundProcess;

import com.mysql.cj.protocol.a.NativeConstants.StringLengthDataType;

/**
 * Servlet implementation class Register2
 */
@WebServlet("/Register2")
public class Register2 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Register2() {
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

	String name = request.getParameter("name");
	String email = request.getParameter("email");
    String number = request.getParameter("number");
	String message	= request.getParameter("message");
			
	Member2 member2 = new Member2(name,email,number,message);
	RegisterDao2 rDao = new RegisterDao2();
	String result = rDao.insert(member2);	
	if (result.equals("Data not entered")) {
		response.sendRedirect(request.getContextPath()+"/contact_us.jsp");
	
	} else {
		response.sendRedirect(request.getContextPath()+"/contactsuccess.jsp");
		
	}

	
	}

}
