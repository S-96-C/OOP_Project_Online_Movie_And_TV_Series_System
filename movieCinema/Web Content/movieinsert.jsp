<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="ISO-8859-1">
	<title>Movie Insert</title>
	<link rel="stylesheet" href="insertmovie.css">
	<meta name="viewport" content="width=device-width, initial-scale=1.0">
</head>
<body>

<header class="header">

		<div class="header-logo">
			<img src="D2MS_logo 2.png" width="90px" height="90px" alt="Logo"><span>D2MS Cinema</span>
		</div>
		
</header>
	
	<form class="box" action="insert" method="post">
	<h1>New Movie Insert</h1>
	
	<input type="text" required="required" name="movieID" placeholder="Movie ID">
	<input type="text" required="required" name="movieName" placeholder="Movie Name">
	<input type="text" required="required" name="movieDescription" placeholder="Movie Description">
	<input type="text" required="required" name="ratingAndReviews" placeholder="Movie Rating and Reviews">
	<input type="text" required="required" name="releaseDate" placeholder="Movie Release Date">
	<input type="text" required="required" name="movieCategory" placeholder="Movie Category">
	
	<!--
	<table>
		
		<tr>
			<td>Movie ID</td>
			<td><input type="text" width="100px" name="movieID"></td>
		</tr>
		
		<tr>
			<td>Movie Name</td> 
			<td><input type="text" name="movieName"></td>
		</tr>
		
		<tr>
			<td>Movie Description</td> 
			<td><input type="text" name="movieDescription"></td>
		</tr>
		
		<tr>
			<td>Movie Ratings And Reviews</td> 
			<td><input type="text" name="ratingAndReviews"></td>
		</tr>
		
		<tr>
			<td>Movie Release Date</td> 
			<td><input type="text" name="releaseDate"></td>
		</tr>
		
		<tr>
			<td>Movie Category</td> 
			<td><input type="text" name="movieCategory"></td>
		</tr>
		
		
	</table>	
	-->
	
	<input type="submit" name="submit" value="Add Movie">
	</form>

</body>
</html>