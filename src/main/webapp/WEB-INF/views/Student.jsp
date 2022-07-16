<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1 align="center" style="font-color: #ff007f">Debate Event Registration</h1>
	<table align="center" >
		<tr>
			<td align="center" style="border: 1px solid black;background-color: #99ff99"><a href="student/addStudent"><button type="button" >Add a new Student</button></a></td>
			<tr></tr>
			<tr></tr>
		</tr>
	</table>

	<table align="center" border="1"
		style="border: 1px solid black; border-collapse: collapse;">
		<tr>
			<th style="padding: 5px;">Student Id</th>
			<th style="padding: 5px;">First Name</th>
			<th style="padding: 5px;">Last Name</th>
			<th style="padding: 5px;">Course</th>
			<th style="padding: 5px;">Country</th>
			<th style="padding: 5px;">Actions</th>
		</tr>
		<c:forEach items="${students}" var="b">
			<tr style="border: 1px solid black; border-collapse: collapse;">
				<td align="center">${b.id}</td>
				<td align="center">${b.fname}</td>
				<td align="center">${b.lname}</td>
				<td align="center">${b.course }</td>
				<td align="center">${b.country }</td>
				<td align="center"><a href="/SpringSecurityLab6/student/updateStudent?id=${b.id}">Update </a>
					<a onclick="return confirm('Are you sure you want to Delete?');" href="/SpringSecurityLab6/student/deleteStudent?id=${b.id}">| Delete</a></td>
			</tr>
		</c:forEach>
	</table>
	
	<br>
	<br>
	<table align="center">
		<tr>
			<td align="center" style="border: 1px solid black;background-color: #FFff00"><a onclick="return confirm('Are you sure you want to Logout?');" href="/SpringSecurityLab6/logout">Logout</a></td>
		</tr>
	</table>
</body>
</html>