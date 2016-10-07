import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
import org.junit.*;

public class AuthController extends HttpServlet
{
	public void doGet(HttpServletRequest req, HttpServletResponse res)
	throws IOException, ServletException
	{
		req.setAttribute("error", false);
		RequestDispatcher view = req.getRequestDispatcher("/index.jsp");
		view.forward(req,res);
	}

	public void doPost(HttpServletRequest req, HttpServletResponse res)
	throws IOException, ServletException
	{
		String name = req.getParameter("username");
		String pass = req.getParameter("password");
		UserModel user = UserModel.authUser(name, pass);
		RequestDispatcher view;
		
		if(user != null)
		{
			req.setAttribute("user", user.getName());

			//Add user ID for future Auth
			Cookie userID = new Cookie("UserID", user.getID() + "");
			userID.setMaxAge(60*60*24);
			res.addCookie(userID);

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
}