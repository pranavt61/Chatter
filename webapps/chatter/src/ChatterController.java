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
		String name = "N/A";


		if(session == null)
			//No user Logged in, send back to login
			view = req.getRequestDispatcher("/index.jsp");
		else
			view = req.getRequestDispatcher("/List.jsp");

		view.forward(req,res);
	}
	public void doPost(HttpServletRequest req, HttpServletResponse res)
	throws IOException, ServletException
	{
		doGet(req,res);
	}
}