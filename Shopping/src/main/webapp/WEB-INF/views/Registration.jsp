<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>


<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	This is Registration page


	<c:url value="/customer/registration" var="url" />
	<form:form action="${url}" commandName="regobject" method="post">

		<div class="form-group">
			<label for="name">id</label>
			<form:input path="id" class="form-Control" />
		</div>
		<br>

		<div class="form-group">
			<label for="email">name</label>
			<form:input path="name" class="form-Control" />
		</div>


		<div class="form-group">
			<label for="phone">password</label>
			<form:input path="password" class="form-Control" />
		</div>

		<div class="form-group">
			<label for="username">contact</label>
			<form:input path="contact" class="form-Control" />
		</div>
		<input type="submit" value="Register">

	</form:form>


</body>
</html>