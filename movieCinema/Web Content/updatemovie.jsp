<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="ISO-8859-1">
	<title>Updating</title>
	<link rel="stylesheet" href="update.css">
	<meta name="viewport" content="width=device-width, initial-scale=1.0">
</head>
<body>

<header class="header">

		<div class="header-logo">
			<img src="D2MS_logo 2.png" width="90px" height="90px" alt="Logo"><span>D2MS Cinema</span>
		</div>
		
</header>

	<%
		String movieID = request.getParameter("movID");
		String movieName = request.getParameter("movName");
		String movieDescription = request.getParameter("movDesc");
		String ratingAndReviews = request.getParameter("ratAndRev");
		String releaseDate = request.getParameter("reDate");
		String movieCategory = request.getParameter("movCat");
	%>
	
	<form class="box" action="update" method="post">
	
	<h1>Movie Update</h1>
	
	<input type="text" name="movid" value="<%= movieID %>" readonly>
	<input type="text" name="movnam" value="<%= movieName %>">
	<input type="text" name="movdes" value="<%= movieDescription %>">
	<input type="text" name="movrar" value="<%= ratingAndReviews %>">
	<input type="text" name="movreda" value="<%= releaseDate %>">
	<input type="text" name="movcat" value="<%= movieCategory %>">
	
	<!-- 
	<table>
		<tr>
			<td>Movie ID</td> <td>
			<input type="text" name="movid" value="<%= movieID %>" readonly></td>
		</tr>
		
		<tr>
			<td>Movie Name</td> 
			<td><input type="text" name="movnam" value="<%= movieName %>"></td>
		</tr>
		
		<tr>
			<td>Movie Description</td> 
			<td><input type="text" name="movdes" value="<%= movieDescription %>"></td>
		</tr>
		
		<tr>
			<td>Movie Rating And Reviews</td> 
			<td><input type="text" name="movrar" value="<%= ratingAndReviews %>"></td>
		</tr>
		
		<tr>
			<td>Movie Release Date</td> 
			<td><input type="text" name="movreda" value="<%= releaseDate %>"></td>
		</tr>
		
		<tr>
			<td>Movie Category</td> 
			<td><input type="text" name="movcat" value="<%= movieCategory %>"></td>
		</tr>
		
			
	</table>
	-->
		
	<input type="submit" name="submit" value="Update Movie Details"><br>
	</form>

</body>
</html>