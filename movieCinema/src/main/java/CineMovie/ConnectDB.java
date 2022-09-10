package CineMovie;

import java.sql.Connection;
import java.sql.DriverManager;

//Database Connection Creating Class
public class ConnectDB {

	private static String url = "jdbc:mysql://localhost:3306/d2ms_cinema_db";
	private static String username = "root";
	private static String password = "Lanka1996@";
	private static Connection conn;
	
	public static Connection getConnection() 
	{
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			//Get the database connection for the given URL, User Name and Password
			conn = DriverManager.getConnection(url, username, password);
		}
		catch (Exception e)
		{
			System.out.println("Database Connection is Unsuccessful.");
		}
		
		return conn;//This returns SQL Connection for MySQL Database Connection.
	}
}
