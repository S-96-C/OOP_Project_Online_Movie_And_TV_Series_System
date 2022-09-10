package CineMovie;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//Movie Update Servlet
@WebServlet("/MovieUpdateServlet")
public class MovieUpdateServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		String movieID = request.getParameter("movid");
		String movieName = request.getParameter("movnam");
		String movieDescription = request.getParameter("movdes");
		String ratingAndReviews = request.getParameter("movrar");
		String releaseDate = request.getParameter("movreda");
		String movieCategory = request.getParameter("movcat");
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		boolean isTrue;
		
		isTrue = MovieDBUtil.movieupdate(movieID, movieName, movieDescription, ratingAndReviews, releaseDate, movieCategory);
		
		//Loop condition
		if (isTrue == true)
		{			
			out.println("<script type='text/javascript'>");
			out.println("alert('Updated Successful')");
			out.println("location = './movielist'");
			out.println("</script>");
		}
		else
		{
			List<Movie> movDetails = MovieDBUtil.getMovieDetails(movieID);
			request.setAttribute("movDetails", movDetails);
			
			RequestDispatcher rdis = request.getRequestDispatcher("unsuccessful.jsp");
			rdis.forward(request, response);
		}
	}

}
