import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;

public class ListController extends HttpServlet
{
	public void doGet(HttpServletRequest req, HttpServletResponse res)
	throws IOException, ServletException
	{
		HttpSession session = req.getSession(false);
		RequestDispatcher view = req.getRequestDispatcher("/index.jsp");

		UserModel user = (UserModel)session.getAttribute("user");

		if(user != null)
		{
			ChatterModel[] chatters = ChatterModel.getUserChatters(user);
			if(chatters != null)
			{
				req.setAttribute("user", user);
				req.setAttribute("chatterArray", chatters);
				view = req.getRequestDispatcher("/List.jsp");
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
		doGet(req,res);
	}
}