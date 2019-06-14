<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
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
			<h3>Customer information of ${customer.firstName}</h3>
		</div>
	</div>


	<div id="controller">
		<div id="content">
			First Name: ${customer.firstName} <br /> Last Name:
			${customer.lastName} <br /> Email: ${customer.email} <br />
		</div>
		<div style=""></div>
		<p>
			<a href="${pageContext.request.contextPath}/customer/list">Go
				Back</a>
		</p>
	</div>
</body>
</html>