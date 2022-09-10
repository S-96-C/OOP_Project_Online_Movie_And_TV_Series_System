<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import = "java.sql.*" %>
<!DOCTYPE html>
<html>
<head>

	<meta charset="ISO-8859-1">
	<link rel="stylesheet" href="login.css">
	<meta name="viewport" content="width=device-width, initial-scale=1.0">
	<title>Login Page</title>
	
</head>
<body>
<header class="header">

		<div class="header-logo">
			<img src="D2MS_logo 2.png" width="90px" height="90px" alt="Logo"><span>D2MS Cinema</span>
		</div>
		
</header>

	<form class="box" action="log" method="post">
	
		<h1>Admin Login</h1>
		
		<input type="text" required="required" name="email" placeholder="admin email">
		<input type="password" required="required" name="pass" placeholder="password">

	
	<input type="submit" name="submit" value="Login">
	
	</form>

</body>
</html>