<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="security" uri="http://www.springframework.org/security/tags"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Index</title>
</head>
<body>
	Welcome to security home.
	<security:authentication property="principal.username" />
	<security:authentication property="principal.authorities" />
	<br />

	<p>
		<security:authorize access="hasRole('MANAGER')">
			<a href="${pageContext.request.contextPath}/managers">For
				Managers</a>
		</security:authorize>
		<br />
		<security:authorize access="hasRole('ADMIN')">
			<a href="${pageContext.request.contextPath}/admin">For Admin</a>
		</security:authorize>
		<br />
		<form:form method="POST"
			action="${pageContext.request.contextPath}/logout">
			<input type="submit" value="logout" />
		</form:form>
</body>
</html>