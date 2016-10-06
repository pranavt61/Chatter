import javax.servlet.*;
import javax.servlet.http.*;

public class AddUserController extends HTTPServlet
{
	public void doGet(HttpServletRequest req, HttpServletResponse res)
	throws IOExeption, ServletExeption
	{
		
	}

	public void doPost(HttpServletRequest req, HttpServletResponse res)
	throws IOExeption, ServletExeption
	{
		String name = req.getParameter("username");
		String pass = req.getParameter("password");
		req.setAttribute("error", false);
		RequestDispatcher view = req.getRequestDispatcher("index.jsp");
		
		UserModel.addUser(name,pass);
		

		view.forward(req,res);
	}
}