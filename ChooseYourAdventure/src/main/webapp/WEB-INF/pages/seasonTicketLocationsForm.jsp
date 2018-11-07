<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@ taglib uri = "http://www.springframework.org/tags/form" prefix="mvc" %>
<%@ page isELIgnored="false" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Spring MVC Form Handling</title>
</head>
<body>
<h2>Season Ticket Holder Form For Iowa State Football</h2>
<mvc:form modelAttribute="seasonTicketLocations" action="result.mvc">
	<table>
	    <tr>
	        <td><mvc:label path="firstName">First Name</mvc:label></td>
	        <td><mvc:input path="firstName" /></td>
	    </tr>
	    <tr>
	        <td><mvc:label path="lastName">Last Name</mvc:label></td>
	        <td><mvc:input path="lastName" /></td>
	    </tr>
		<tr>
            <td><mvc:label path="email">Email</mvc:label></td>
            <td><mvc:input path="email" /></td>
        </tr>
        <tr>
            <td><mvc:label path="phoneNumber">Phone Number</mvc:label></td>
            <td><mvc:input path="phoneNumber" /></td>
        </tr>
        <tr>
            <td><mvc:label path="city">City</mvc:label></td>
            <td><mvc:input path="city" /></td>
        </tr>
        <tr>
            <td><mvc:label path="state">State</mvc:label></td>
            <td><mvc:select path="state" items="${states}" /></td>
        </tr>
        <tr>
            <td><mvc:label path="zipCode">Zip Code</mvc:label></td>
            <td><mvc:input path="zipCode" /></td>
        </tr>
        <tr>
            <td><mvc:label path="section">Section</mvc:label></td>
            <td><mvc:select path="section" items="${sections}" /></td>
        </tr>
         <tr>
            <td><mvc:label path="row">Row</mvc:label></td>
            <td><mvc:select path="row" items="${rows}" /></td>
        </tr>
         <tr>
            <td><mvc:label path="seats">Seats</mvc:label></td>
            <td><mvc:input path="seats" /></td>
        </tr>
         <tr>
            <td><mvc:label path="status">Status</mvc:label></td>
            <td><mvc:radiobuttons path="status" /></td>
        </tr>
        <tr>
	        <td colspan="2">
                <input type="submit" value="Submit" />
	        </td>
	    </tr>
	</table>  
</mvc:form>
<a href = "viewAll.mvc">List Of All Season Ticket Holders For Iowa State Football</a>
</body>
</html>