<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@ taglib uri="http://www.springframework.org/tags/form" prefix="mvc"%>
<%@ page isELIgnored="false"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Spring MVC Form Handling</title>
</head>
<body>
	<h2>Season Ticket Holder Added For Iowa State Football</h2>
	<table>
		<tr>
			<td>ID</td>
			<td>${s.id}</td>
		</tr>
		<tr>
			<td>First Name</td>
			<td>${s.firstName}</td>
		</tr>
		<tr>
			<td>Last Name</td>
			<td>${s.lastName}</td>
		</tr>
		<tr>
			<td>Email</td>
			<td>${s.email}</td>
		</tr>
		<tr>
			<td>Phone Number</td>
			<td>${s.phoneNumber}</td>
		</tr>
		<tr>
			<td>City</td>
			<td>${s.city}</td>
		</tr>
		<tr>
			<td>State</td>
			<td>${s.state}</td>
		</tr>
		<tr>
			<td>Zip Code</td>
			<td>${s.zipCode}</td>
		</tr>
		<tr>
			<td>Section</td>
			<td>${s.section}</td>
		</tr>
		<tr>
			<td>Row</td>
			<td>${s.row}</td>
		</tr>
		<tr>
			<td>Seats</td>
			<td>${s.seats}</td>
		</tr>
		<tr>
			<td>Status</td>
			<td>${s.status}</td>
		</tr>
	</table>
	<a href="viewAll.mvc">List Of All Season Ticket Holders For Iowa State Football</a>
</body>
</html>