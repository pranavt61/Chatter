import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;

public class LogOutController extends HttpServlet
{
	public void doGet(HttpServletRequest req, HttpServletResponse res)
	throws IOException, ServletException
	{
		req.getSession().invalidate();
		RequestDispatcher view = req.getRequestDispatcher("/index.jsp");

		view.forward(req,res);
	}
	public void doPost(HttpServletRequest req, HttpServletResponse res)
	throws IOException, ServletException
	{
		doGet(req, res);
	}
}