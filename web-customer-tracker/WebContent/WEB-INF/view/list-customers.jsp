<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Customers List</title>
<link type="text/css" rel="stylesheet"
	href="${pageContext.request.contextPath}/assets/css/style.css" />
</head>
<body>
	<div id="wrapper">
		<div id="header">
			<h2>CRM - Customer Relationship Manager</h2>
		</div>
	</div>
	<br />
	<input type="button" class="add-button" value="Add Customer"
		onclick="window.location.href='showAddForm';return false;" />
	<br />

	<div id="controller">
		<div id="content">
			<table>
				<thead>
					<tr>
						<th>First Name</th>
						<th>Last Name</th>
						<th>Email</th>
						<th>Actions</th>
					</tr>
				</thead>
				<tbody>
					<c:forEach var="tempCustomer" items="${customers}">
						<tr>
							<td>${tempCustomer.firstName}</td>
							<td>${tempCustomer.lastName}</td>
							<td>${tempCustomer.email}</td>
							<td><a href="./${tempCustomer.id}">View</a> |
								<a href="./showUpdateForm?customerId=${tempCustomer.id}">Update</a>|
								<a href="./delete?customerId=${tempCustomer.id}"
									onclick="if(!(confirm('Are you sure you want to delete this customer?')))return false">Delete</a></td>
						</tr>
					</c:forEach>
				</tbody>
			</table>
		</div>
	</div>
</body>
</html>