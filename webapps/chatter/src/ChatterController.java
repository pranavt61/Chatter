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
		UserModel user = (UserModel)session.getAttribute("user");

		if(user != null)
		{
			ChatterModel chatter = ChatterModel.getChatterByID(user, req.getAttribute("chatterID"));
			if(chatter != null)
			{
				req.setAttribute("user", user);
				req.setAttribute("chatter", chatter);
				view = req.getRequestDispatcher("/chatter.jsp");
			}
			else
			{
				view = req.RequestDispatcher("/List");
			}
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
		UserModel user = (UserModel)session.getAttribute("user");

		if(user != null)
		{
			ChatterModel chatter = ChatterModel.getChatterByID(user, req.getAttribute("chatterID"));
			if(chatter != null)
			{
				chatter.setMessage(req.getParameter("chatter"));
			}

			view = req.getRequestDispatcher("/List");
		}
		else 
		{
			view = req.getRequestDispatcher("/index.jsp");
		}
		view.forward(req,res);
	}
}