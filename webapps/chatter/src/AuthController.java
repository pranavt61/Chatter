import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;

public class AuthController extends HttpServlet
{
	public void doPost(HttpServletRequest req, HttpServletResponse res)
	 throws IOException, ServletException
	{
		String name = req.getParameter("username");
		String pass = req.getParameter("password");
		UserModel user = UserModel.authUser(name, pass);
		RequestDispatcher view;
		HttpSession session;
		
		if(user != null)
		{
			//Add user ID for future Auth
			session = req.getSession();
			session.setAttribute("user", user);
			req.setAttribute("user",user);
			view = req.getRequestDispatcher("/List.jsp");
		}
		else
		{
			//No user resend to index.html
			req.setAttribute("error", true);
			view = req.getRequestDispatcher("/index.jsp");
		}
		view.forward(req,res);
	}

	public void doGet(HttpServletRequest req, HttpServletResponse res)
	throws IOException, ServletException
	{
		req.setAttribute("error", false);
		RequestDispatcher view = req.getRequestDispatcher("/index.jsp");
		view.forward(req,res);
	}
}