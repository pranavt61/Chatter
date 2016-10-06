import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;

public class AddUserController extends HttpServlet
{
	public void doGet(HttpServletRequest req, HttpServletResponse res)
	 throws IOException, ServletException
	{
		req.getRequestDispatcher("addUser.jsp").forward(req,res);
	}

	public void doPost(HttpServletRequest req, HttpServletResponse res)
	 throws IOException, ServletException
	{
		String name = req.getParameter("username");
		String pass = req.getParameter("password");
		req.setAttribute("error", false);
		RequestDispatcher view = req.getRequestDispatcher("index.jsp");
		
		UserModel.addUser(name,pass);

		view.forward(req,res);
	}
}