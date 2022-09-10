<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
	<meta charset="ISO-8859-1">
	<title>Insert title here</title>
	
	<style type="text/css">
		table
		{
			border-collapse: collapse;
			align:center;
		}
		table th, td 
		{
			border: 1px solid blue
		}
	</style>
	
	<link rel="stylesheet" href="account.css">
	<meta name="viewport" content="width=device-width, initial-scale=1.0">
</head>
<body>

<header class="header">

		<div class="header-logo">
			<img src="D2MS_logo 2.png" width="90px" height="90px" alt="Logo"><span>D2MS Cinema</span>
		</div>
		
</header><br><br>

	<table style="width:1400px" height="500px">
		<tr>
			<th style="width:80px">Movie ID</th>
			<th>Movie Name</th>
			<th>Movie Description</th>
			<th style="width:130px">Movie R And R</th>
			<th style="width:142px">Movie Release Date</th>
			<th style="width:120px">Movie Category</th>
			<th>Movie Update</th>
			<th>Movie Delete</th>
		</tr>
		
	<c:forEach var = "mov" items = "${movieList}">
	
	<c:set var="movieID" value="${mov.movieID}"/>
	<c:set var="movieName" value="${mov.movieName}"/>
	<c:set var="movieDescription" value="${mov.movieDescription}"/>
	<c:set var="ratingAndReviews" value="${mov.ratingAndReviews}"/>
	<c:set var="releaseDate" value="${mov.releaseDate}"/>
	<c:set var="movieCategory" value="${mov.movieCategory}"/>
		
	<c:url value="updatemovie.jsp" var="updatemov">
	
		<c:param name="movID" value="${movieID}"/>
		<c:param name="movName" value="${movieName}"/>
		<c:param name="movDesc" value="${movieDescription}"/>
		<c:param name="ratAndRev" value="${ratingAndReviews}"/>
		<c:param name="reDate" value="${releaseDate}"/>
		<c:param name="movCat" value="${movieCategory}"/>
		
	</c:url>
	
	<c:url value="deletemovie.jsp" var="delmov">
	
		<c:param name="movID" value="${movieID}"></c:param>
		<c:param name="movName" value="${movieName}"></c:param>
		<c:param name="movDes" value="${movieDescription}"></c:param>
		<c:param name="ratAndRev" value="${ratingAndReviews}"></c:param>
		<c:param name="reDate" value="${releaseDate}"></c:param>
		<c:param name="movCat" value="${movieCategory}"></c:param>
	
	</c:url>
	
		<tr>
			<td style="text-align:center">${mov.movieID}</td>
			<td>${mov.movieName}</td>
			<td>${mov.movieDescription}</td>
			<td>${mov.ratingAndReviews}</td>
			<td style="text-align:center">${mov.releaseDate}</td>
			<td>${mov.movieCategory}</td>
			<td><a href="${updatemov}">
				<input type="button" name="update details" value="Update Movie Details">
				</a>
			</td>
			
			<td><a href="${delmov}">
				<input type="button" name="delete" value="Delete Movie">
				</a>
			</td>
		</tr>
		
	</c:forEach>
	</table>
	
	<a href="movieinsert.jsp"><button>Add Movie</button></a>
	
	
</body>
</html>