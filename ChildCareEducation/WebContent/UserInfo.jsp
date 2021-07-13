<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>

<style type="text/css">
h1 {
	margin-top: 70px;
	padding: 0 0 20px;
	text-align: center;
	font-size: 40px;
}

a {
	  font-size: 30px;
	  font-family: cursive;
	  text-decoration: none;
	  margin-left: 30px;
}
table {
    border-collapse: collapse;
    width: 100%;
    
}

th, td {
	font-size:30px;
    text-align: left;
    padding: 13px;
}

tr:nth-child(even){background-color: #f2f2f2}

th {
    background-color: #4CAF50;
    color: white;
}
</style>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>UserInfo</title>
</head>
<body>
	<a href="UserInformtion?actions=student_list">list All</a>
	<a href="AdminSession">Home</a>

	<div>
		<h1>User Details</h1>
	</div>
	<div >
		<table >
			<thead>
				<tr>

					<th>User Id</th>
					<th>User Name</th>
					<th>Password</th>
					<th>Email</th>
					<th>Action</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach items="${stu}" var="studentvar">
					<tr>

						<td><c:out value="${studentvar.id}" /></td>
						<td><c:out value="${studentvar.uname}" /></td>
						<td><c:out value="${studentvar.password}" /></td>
						<td><c:out value="${studentvar.email}" /></td>
						<td><a
							href="UserInformtion?actions=student_delete&studentId=${studentvar.id}">Delete</a>
						</td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
	</div>




</body>
</html>