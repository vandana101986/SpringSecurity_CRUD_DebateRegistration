<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<h2 align="center"  style="font-weight: bold">Debate Competetion Form</h2>

	<br>
	
	<form action="save" method="post">
		<table align="center">
			<tr>
				<td>First Name</td>
				<td><input type="text" value="${student.fname}" name="fname" />
				</td>
			</tr>
			<tr>
				<td>Last Name</td>
				<td><input type="text" value="${student.lname}" name="lname" />
				</td>
			</tr>
			<tr>
				<td>Course</td>
				<td><input type="text" value="${student.course}" name="course" />
				</td>
			</tr>
			<td>Country</td>
			<td><input type="text" value="${student.country}" name="country" />
			</td>
			</tr>
			<br>
			<tr></tr>
			<tr></tr>
			<tr>
				<td colspan="2"><input type="hidden" value="${student.id}" name="id" />
				<input type="submit" /></td>
			</tr>
		</table>
	</form>
	
<br>
<br>

<h5 align="center" ><a href="student/list">Back to List</a></h5>

</body>
</html>