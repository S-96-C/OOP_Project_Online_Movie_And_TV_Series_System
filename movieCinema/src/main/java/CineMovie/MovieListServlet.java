package CineMovie;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//Movie List Servlet
@WebServlet("/MovieListServlet")
public class MovieListServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//Use try catch block
		try 
		{
			List<Movie> movieList = MovieDBUtil.getMovieList();
			request.setAttribute("movieList", movieList);
			
			RequestDispatcher dis = request.getRequestDispatcher("movieuseraccount.jsp");
			dis.forward(request, response);
		} 
		catch (Exception e) 
		{
			e.printStackTrace();
		}
	}

}
