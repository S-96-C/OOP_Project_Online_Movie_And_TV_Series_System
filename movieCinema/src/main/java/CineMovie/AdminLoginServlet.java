package CineMovie;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//Admin Login Servlet
@WebServlet("/AdminLoginServlet")
public class AdminLoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException // TODO Auto-generated method stub
	{
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		String adminEmail = request.getParameter("email");
		String adminpass = request.getParameter("pass");
		
		boolean valid = false;
		
		//Use try catch
		try 
		{
			valid = MovieDBUtil.validate(adminEmail, adminpass);
			
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
		//Loop condition
		if(valid == true) {
			out.println("<script type='text/javascript'>");
			out.println("location = './movielist'");
			out.println("</script>");
		}else {
			out.println("<script type='text/javascript'>");
			out.println("location = 'adminlogin.jsp'");
			out.println("</script>");
		}
		
	}

}
