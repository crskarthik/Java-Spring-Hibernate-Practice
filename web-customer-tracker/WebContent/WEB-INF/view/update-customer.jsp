<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Update Customer</title>
<link type="text/css" rel="stylesheet"
	href="${pageContext.request.contextPath}/assets/css/style.css" />
<link type="text/css" rel="stylesheet"
	href="${pageContext.request.contextPath}/assets/css/add-customer-style.css" />
</head>
<body>
	<div id="wrapper">
		<div id="header">
			<h2>CRM - Customer Relationship Manager</h2>
		</div>
	</div>


	<div id="controller">
		<div id="content">
			<form:form action="./updateCustomer" modelAttribute="customer"
				method="POST">
				<form:hidden path="id"/>
				<table>
					<tbody>
						<tr>
							<td><label>First name:</label></td>
							<td><form:input path="firstName" /></td>
						</tr>
						<tr>
							<td><label>Last name:</label></td>
							<td><form:input path="lastName" /></td>
						</tr>
						<tr>
							<td><label>Email:</label></td>
							<td><form:input path="email" /></td>
						</tr>
						<tr>
							<td></td>
							<td><input type="submit" class="save" value="Save" /></td>
						</tr>
					</tbody>
				</table>
			</form:form>

			<div style="clear;both;"></div>
				<p>
					<a href="${pageContext.request.contextPath}/customer/list">Go Back</a>
				</p>
		</div>
	</div>
</body>
</html>