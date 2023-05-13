<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="java.util.Date"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page isErrorPage="true" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Edit Burger</title>
<link rel="stylesheet" href="/css/style.css"/>
<link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css" />
<script src="/webjars/bootstrap/js/bootstrap.min.js"></script>
</head>
<body>

	<div class="d-flex justify-content-between">
		<h1>Edit Burger:</h1>
		<a class="mt-3" href="/">Go back</a>
	
	</div>
	
	<form:form action="/burgers/update/${thisBurger.id}" method="put" modelAttribute="thisBurger">
		<!-- <input type="hidden" name="method" value="put"/> -->
		<div class="mb-3">
			<form:label path="burgerName" class="form-label">Burger Name</form:label>
			<form:errors path="burgerName"/>
			<form:input path="burgerName"/>	
		</div>
		
		<div class="mb-3">
			<form:label path="restaurantName" class="form-label">Restaurant Name</form:label>
			<form:errors path="restaurantName"/>
			<form:input path="restaurantName"/>	
		</div>
		
		<div class="mb-3">
			<form:label path="rating" class="form-label">Rating</form:label>
			<form:errors path="rating"/>
			<form:input path="rating"/>	
		</div>
		
		<div class="mb-3">
			<form:label path="notes" class="form-label">Notes</form:label>
			<form:errors path="notes"/>
			<form:input path="notes"/>	
		</div>
		
		<button class="btn btn-primary">Submit</button>
	</form:form>
</body>
</html>