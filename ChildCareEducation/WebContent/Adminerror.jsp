<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<style type="text/css">
h1{
color:red;
}
body {
	background:url("resources/pictures/kid-notebook-computer-learns-159533.jpeg") no-repeat center center;
}
</style>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Adminlogin</title>
<link rel="stylesheet" href="resources/cssfile/login.css">
</head>
<body>



	<div class="login-box">
		<img src="resources/pictures/avatar.png" class="avatar">
		<h1>Invalid username or password</h1>
		<form action="AdminController" method="post">
			<p>Username</p>
			<input type="text" name="username" placeholder="Enter Username">
			<p>Password</p>
			<input type="password" name="password"
				placeholder="Enter Password Here"> <input type="submit"
				value="login">
<a href="login.jsp">Main login Page</a>

		</form>
	</div>



</body>
</html>