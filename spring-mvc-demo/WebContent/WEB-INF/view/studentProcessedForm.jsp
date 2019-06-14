<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Student data post processed</title>
</head>
<body>
	<h2>Student details:</h2>
	<p>First name: ${student.firstName}</p>
	<p>Last name: ${student.lastName}</p>
	<p>Country: ${student.country}</p>
	<p>Programming language: ${student.progLanguage}</p>
	Operating Systems:
	<ul>
		<c:forEach var="temp" items="${student.os}">
		<li>${temp}</li>
		</c:forEach>
	</ul>
	<p>Zip code: ${student.zipCode}</p>
	<p>Course code: ${student.courseCode}</p>
</body>
</html>