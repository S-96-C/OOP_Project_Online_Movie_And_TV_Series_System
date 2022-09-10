package CineMovie;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//Insert Movie Servlet
@WebServlet("/MovieInsert")
public class MovieInsert extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//TODO Auto-generated method stub
		
		String movieID = request.getParameter("movieID");
		String movieName = request.getParameter("movieName");
		String movieDescription = request.getParameter("movieDescription");
		String ratingAndReviews = request.getParameter("ratingAndReviews");
		String releaseDate = request.getParameter("releaseDate");
		String movieCategory = request.getParameter("movieCategory");
		
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		boolean isTrue;
		
		isTrue = MovieDBUtil.insertmovie(movieID, movieName, movieDescription, ratingAndReviews, releaseDate, movieCategory);
		
		//Loop condition
		if (isTrue == true)
		{
			out.println("<script type='text/javascript'>");
			out.println("location = './movielist'");
			out.println("</script>");
		}
		else
		{
			RequestDispatcher rdis2 = request.getRequestDispatcher("unsuccessful.jsp");
			rdis2.forward(request, response);
		}
	}

}
