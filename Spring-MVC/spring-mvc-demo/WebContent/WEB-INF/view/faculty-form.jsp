<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<html>

<head>

	<title>Faculty Form</title>
	
	<style>
		.error {color:red}
	</style>

</head>
<body>

	<form:form action="facultyForm" modelAttribute="faculty">
	
	First Name (*): <form:input path="firstName" />
	<form:errors path="firstName" cssClass="error"/>
	<br><br>
	
	
	Last Name : <form:input path="lastName" />
	<br><br>
	Experience : <form:input path="experience"/>
	<form:errors path="experience" cssClass="error"/>
	
	<br><br>
	Pin Code : <form:input path="pinCode"/>
	<form:errors path="pinCode" cssClass="error"/>
	
	<br><br>
	Course Code : <form:input path="courseCode"/>
	<form:errors path="courseCode" cssClass="error"/>
	
	<br><br>
	
	<input type="submit" value="Submit"/>
	
	</form:form>
</body>
</html>