<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<style type="text/css">
body {
	background:url("resources/pictures/kid-notebook-computer-learns-159533.jpeg") no-repeat center center;
}
</style>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>LoginHere</title>
<link rel="stylesheet" href="resources/cssfile/login.css">
</head>
<body>

<div class="login-box">
		<img src="resources/pictures/avatar.png" class="avatar">
		<h1 style="color:red";> Invalid Login</h1>
		<form action="LoginController" method="post">
			<p>Username</p>
			<input type="text" name="username" placeholder="Enter Username">
			<p>Password</p>
			<input type="password" name="password"
				placeholder="Enter Password Here"> <input type="submit"
				value="login"> <a href="recoverpass.jsp">Forget Password?</a> <a
				href="registration.jsp">Don't have an account?</a>

		</form>
	</div>


</body>
</html>