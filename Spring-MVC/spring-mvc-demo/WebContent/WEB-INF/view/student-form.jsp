<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<html>

<head>

	<title>Student Form</title>
	
	<style>
		.error {color:red}
	</style>

</head>
<body>

<i>Asterisk (*) means required.</i>
	<form:form action="studentForm" modelAttribute="stu">
	
	First name (*): <form:input path="firstName"/>
	<form:errors path="firstName" cssClass="error"/>
	
	<br><br>
	
	Last name: <form:input path="lastName"/>
	
	<br><br>
	
	Country: <form:select path="country">
				<!-- <form:option value="India" label="India"/>
				<form:option value="France" label="France"/>
				<form:option value="Germany" label="Germany"/>
				-->
				
				<form:options items="${stu.countryOptions}"/>
		</form:select>
		
	<br><br>
	Java <form:radiobutton path="language" value="Java"/>
	Python<form:radiobutton path="language" value="Python"/>
	Ruby<form:radiobutton path="language" value="Ruby"/>
	
	<br><br>
	
	Linux <form:checkbox path="os" value="linux"/>
	Mac os <form:checkbox path="os" value="Mac"/>
	Windows <form:checkbox path="os" value="windows"/>
	
	<br><br>
	
	<input type="submit" value="Submit"/>
	
	</form:form>

</body>


</html>