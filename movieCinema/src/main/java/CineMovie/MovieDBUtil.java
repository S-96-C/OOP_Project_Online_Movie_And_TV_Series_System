package CineMovie;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

//This is the Common Utility Class to load All Property Details at once when it's Initializing.
public class MovieDBUtil {
	
	private static boolean isSuccess;
	private static Connection conn = null;
	private static Statement state = null;
	private static ResultSet rset = null;
	
	//Validate the Admin Login
	//Boolean Retrun
	public static boolean validate (String adminEmail, String adminPass)
	{
		
		boolean isSuccess = false;
		try
		{
			conn = ConnectDB.getConnection();
			state = conn.createStatement();
			String sql = "SELECT * FROM admin WHERE adminEmail = '"+adminEmail+"' and adminPassword = '"+adminPass+"'";
			rset = state.executeQuery(sql);
			
			if (rset.next())
			{
				isSuccess = true;
			}else {
				isSuccess = false;
			}
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
		
		return isSuccess;
	}
	
	//Get the Movie List
	public static List<Movie> getMovieList ()
	{
		//Array List
		ArrayList<Movie> mov = new ArrayList<>();
		
		
		try
		{
			conn = ConnectDB.getConnection();
			state = conn.createStatement();
			String sql = "SELECT * FROM movie";
			rset = state.executeQuery(sql);
			
			while (rset.next())
			{
				String mid = rset.getString(1);
				String mname = rset.getString(2);
				String mdes = rset.getString(3);
				String mrar = rset.getString(4);
				String mrdate = rset.getString(5);
				String mcat = rset.getString(6);
				
				Movie m = new Movie (mid, mname, mdes, mrar, mrdate, mcat);
				mov.add(m);	
			}
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
		
		return mov;
	}
	
	//Insert Movie
	//Boolean Return
	public static boolean insertmovie(String movieID, String movieName, String movieDescription, String ratingAndReviews, String releaseDate, String movieCategory) 
	{
		
		boolean isSuccess = false;
		
		try
		{
			conn = ConnectDB.getConnection();
			state = conn.createStatement();
			String sql = "INSERT INTO movie VALUES ('"+movieID+"', '"+movieName+"', '"+movieDescription+"', '"+ratingAndReviews+"', '"+releaseDate+"', '"+movieCategory+"')"; 
			int rset = state.executeUpdate(sql);
			
			if (rset > 0)
			{
				isSuccess = true;
			}
			else
			{
				isSuccess = false;
			}
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
		
		return isSuccess;
	}
	
	//Update Movie
	//Boolean Return
	public static boolean movieupdate(String movieID, String movieName, String movieDescription, String ratingAndReviews, String releaseDate, String movieCategory)
	{
		try
		{
			conn = ConnectDB.getConnection();
			state = conn.createStatement();
			String sql = "update movie set movieID='"+movieID+"', movieName='"+movieName+"', movieDescription='"+movieDescription+"', ratingAndReviews='"+ratingAndReviews+"', releaseDate='"+releaseDate+"', movieCategory='"+movieCategory+"'" + "where movieID='"+movieID+"'";
			int rset = state.executeUpdate(sql);
			
			if (rset > 0) 
			{
				isSuccess = true;
			}
			else
			{
				isSuccess = false;
			}
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
		
		return isSuccess;
	}
	
	//Get the Movie Details
	public static List<Movie> getMovieDetails(String ID)
	{
		ArrayList<Movie> mov = new ArrayList<Movie>();
		
		try
		{
			conn = ConnectDB.getConnection();
			state = conn.createStatement();
			String sql = "select * from movie where movieID='"+ID+"'";
			rset = state.executeQuery(sql);
			
			while (rset.next())
			{
				String movieID = rset.getString(1);
				String movieName = rset.getString(2);
				String movieDescription = rset.getString(3);
				String ratingAndReviews = rset.getString(4);
				String releaseDate = rset.getString(5);
				String movieCategory = rset.getString(6);
				
				Movie m = new Movie(movieID, movieName, movieDescription, ratingAndReviews, releaseDate, movieCategory);
				mov.add(m);
			}
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
		
		return mov;
	}
	
	//Delete Movie
	//Boolean Return
	public static boolean moviedelete(String movieID)
	{
		try
		{
			conn = ConnectDB.getConnection();
			state = conn.createStatement();
			String sql = "delete from movie where movieID= '"+movieID+"'";
			int rset = state.executeUpdate(sql);
			
			if (rset > 0)
			{
				isSuccess = true;
			}
			else
			{
				isSuccess = false;
			}
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
		
		return isSuccess;
	}
}
