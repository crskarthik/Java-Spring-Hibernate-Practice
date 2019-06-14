<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Student form</title>
<style type="text/css">
.error {
	color: red
}
</style>
</head>
<body>
	<form:form action="processForm" modelAttribute="student">
	First name: <form:input path="firstName" />
		<br>
		<br>
	Last name (*): <form:input path="lastName" />
		<form:errors path="lastName" cssClass="error" />
		<br>
		<br>
	Country:
	<form:select path="country">
			<form:options items="${student.countryOptions}" />
		</form:select>
		<br>
		<br>
	Favorite Programming Language:
	Java <form:radiobutton path="progLanguage" value="Java" />
	PHP <form:radiobutton path="progLanguage" value="PHP" />
	C# <form:radiobutton path="progLanguage" value="C#" />
	Ruby <form:radiobutton path="progLanguage" value="Ruby" />

		<br>
		<br>
	Operating Systems:
	Linux <form:checkbox path="os" value="Linux" />
	Windows <form:checkbox path="os" value="Windows" />
	Mac OS <form:checkbox path="os" value="Mac OS" />

		<br>
		<br>
	Semester (*):
	<form:input path="semester"/>
	<form:errors path="semester" cssClass="error" />
		<br>
		<br>
	Zip Code:
	<form:input path="zipCode"/>
	<form:errors path="zipCode" cssClass="error" />
		<br>
		<br>
	Course code:
	<form:input path="courseCode"/>
	<form:errors path="courseCode" cssClass="error" />
		<br>
		<br>
		<input type="submit" value="submit" />
	</form:form>
</body>
</html>