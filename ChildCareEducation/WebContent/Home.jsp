<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<style type="text/css">
header {
	background: linear-gradient(rgba(0, 0, 0, 0.7), rgba(0, 0, 0, 0.7)),
		url(resources/pictures/love.jpeg) no-repeat center center;
	width: 100%;
	height: 100vh;
	background-size: cover;
}
</style>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Home</title>
<link rel="stylesheet" href="resources/cssfile/home.css">
</head>
<body>




	<header>

	<div class="row">
		<div class="logo">
			<a href="Home.jsp">${uname}</a>
		</div>
		<ul class="main-nav">

			<h1>
				<li><a href="Home.jsp">Home</a></li>
				<li><a href="nutrition.jsp">Nutrients</a></li>
				<li><a href="AboutUs.jsp">About us</a></li>
				<li><a href="login.jsp">signout</a></li>
			</h1>
		</ul>
	</div>
	<div class="page">
		<h2>Know more about child care education</h2>
		<div class="botton">
			<a href="nutrition.jsp" class="btn btn-full">Read More</a> <a
				href="AboutUs.jsp" class="btn btn-half">Contact us</a>
		</div>
	</div>
	</header>
</body>
</html>