<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="ISO-8859-1">
	<title>Movie Delete</title>
	<link rel="stylesheet" href="delete.css">
	<meta name="viewport" content="width=device-width, initial-scale=1.0">
	<title>Movie Delete Page</title>
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
	
	<form class="box" action="del" method="post">
	
	<h1>Movie Delete</h1>
	
	<input type="text" name="movid" value="<%= movieID %>" readonly>
	<input type="text" name="movnam" value="<%= movieName %>" readonly>
	<input type="text" name="movdes" value="<%= movieDescription %>" readonly>
	<input type="text" name="movrar" value="<%= ratingAndReviews %>" readonly>
	<input type="text" name="movreda" value="<%= releaseDate %>" readonly>
	<input type="text" name="movcat" value="<%= movieCategory %>" readonly>
	
	<!--
	<table>
		<tr>
			<td>Movie ID</td> <td>
			<input type="text" name="movid" value="<%= movieID %>" readonly></td>
		</tr>
		
		<tr>
			<td>Movie Name</td> 
			<td><input type="text" name="movnam" value="<%= movieName %>" readonly></td>
		</tr>
		
		<tr>
			<td>Movie Description</td> 
			<td><input type="text" name="movdes" value="<%= movieDescription %>" readonly></td>
		</tr>
		
		<tr>
			<td>Movie Rating And Reviews</td> 
			<td><input type="text" name="movrar" value="<%= ratingAndReviews %>" readonly></td>
		</tr>
		
		<tr>
			<td>Movie Release Date</td> 
			<td><input type="text" name="movreda" value="<%= releaseDate %>" readonly></td>
		</tr>
		
		<tr>
			<td>Movie Category</td> 
			<td><input type="text" name="movcat" value="<%= movieCategory %>" readonly></td>
		</tr>
		
		
	</table>
	-->
		
	<input type="submit" name="submit" value="Delete Movie"><br>
	</form>
	

</body>
</html>