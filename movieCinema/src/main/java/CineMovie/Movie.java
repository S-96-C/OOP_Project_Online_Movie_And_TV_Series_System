package CineMovie;

//This is the Movie Class
public class Movie {

	private String movieID;
	private String movieName;
	private String movieDescription;
	private String ratingAndReviews;
	private String releaseDate;
	private String movieCategory;
	
	//Constructor Calling
	public Movie(String movieID, String movieName, String movieDescription, String ratingAndReviews, String releaseDate, String movieCategory)
	{
		this.movieID = movieID;
		this.movieName = movieName;
		this.movieDescription = movieDescription;
		this.ratingAndReviews = ratingAndReviews;
		this.releaseDate = releaseDate;
		this.movieCategory = movieCategory;
	}
	//Getters
	public String getMovieID() 
	{
		return movieID;//Return the Movie ID
	}

	public String getMovieName() 
	{
		return movieName;//Return the Movie Name
	}

	public String getMovieDescription() 
	{
		return movieDescription;//Return the Movie Description
	}

	public String getRatingAndReviews() 
	{
		return ratingAndReviews;//Return the Movie Ratings and Reviews
	}

	public String getReleaseDate() 
	{
		return releaseDate;//Return the Movie Release Date
	}

	public String getMovieCategory() 
	{
		return movieCategory;//Return the Movie Category
	}
	
}
