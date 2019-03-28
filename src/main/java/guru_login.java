package main.java;
 
import java.io.IOException;
 
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
 
/**
 * Servlet implementation class guru_login
 */
public class guru_login extends HttpServlet {
 
    public guru_login() {
        super();
        // TODO Auto-generated constructor stub
    }
 
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String username = request.getParameter("username");
		String password = request.getParameter("password");

		if(username.isEmpty() || password.isEmpty() )
		{
			RequestDispatcher req = request.getRequestDispatcher("index.jsp");
			req.include(request, response);
		}
		else if(isUserValid(username,password))
		{

			RequestDispatcher req = request.getRequestDispatcher("register_4.jsp");
			request.setAttribute("uname",username);
			req.forward(request, response);
		}
		else
		{
			String login_stat = "You : have entered the wrong username or password";
			RequestDispatcher req = request.getRequestDispatcher("index.jsp");
			request.setAttribute("login_stat",login_stat);
			req.include(request, response);

		}
	}

	public boolean isUserValid(String username, String password) {
    	boolean isValid = false;

		if((username.equalsIgnoreCase("MEDYO") && password.equalsIgnoreCase("SPRINT"))||
				(username.equalsIgnoreCase("USER") && password.equalsIgnoreCase("USER")))
		{
			isValid = true;
		} else {
    		isValid = false;
		}
    	return isValid;
	}
 
}
