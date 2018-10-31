<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@ taglib uri="http://www.springframework.org/tags/form" prefix="mvc"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page isELIgnored="false"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>All Season Ticket Locations</title>
</head>
<body>
	<c:forEach items="${all}" var="item">
		<table>
			<tr>
				<td>First Name</td>
				<td>${item.firstName}</td>
			</tr>
			<tr>
				<td>Last Name</td>
				<td>${item.lastName}</td>
			</tr>
			<tr>
				<td>Email</td>
				<td>${item.email}</td>
			</tr>
			<tr>
				<td>Phone Number</td>
				<td>${item.phoneNumber}</td>
			</tr>
			<tr>
				<td>City</td>
				<td>${item.city}</td>
			</tr>
			<tr>
				<td>State</td>
				<td>${item.state}</td>
			</tr>
			<tr>
				<td>Zip Code</td>
				<td>${item.zipCode}</td>
			</tr>
			<tr>
				<td>Section</td>
				<td>${item.section}</td>
			</tr>
			<tr>
				<td>Row</td>
				<td>${item.row}</td>
			</tr>
			<tr>
				<td>Seats</td>
				<td>${item.seats}</td>
			</tr>
		</table>
		<br />
		<hr style="text-align: left; margin-left: 0; width: 25%">
		<br />
	</c:forEach>
	<a href="form.mvc">Add a New Season Ticket Location</a>
</body>
</html>