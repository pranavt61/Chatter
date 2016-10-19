import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;

public class ChatterController extends HttpServlet
{
	public void doGet(HttpServletRequest req, HttpServletResponse res)
	throws IOException, ServletException
	{
		HttpSession session = req.getSession(false);
		RequestDispatcher view;

		//return valid chatter for user
		UserModel user = session.getAttribute("user");

		if(user != null)
		{
			req.setAttribute("user", user);
			view = req.getRequestDispatcher("/List.jsp");

		}
		else
		{
			view = req.getRequestDispatcher("/index.jsp");
		}

		view.forward(req,res);
	}
	public void doPost(HttpServletRequest req, HttpServletResponse res)
	throws IOException, ServletException
	{
		HttpSession session = req.getSession(false);
		RequestDispatcher view;

		//Replace chatter here
		UserModel user = session.getAttribute("user");

		if(user != null)
		{
			user.chatter = req.getParameter("chatterText");
			req.setAttribute("user", user);
			view = req.getRequestDispatcher("/List.jsp");
		}
		else 
		{
			view = req.getRequestDispatcher("/index.jsp");
		}
		view.forward(req,res);
	}
}