<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" href="/css/style.css"/>
<link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css" />
<title>Burger Tracker</title>
</head>
<body>

	<h1>Burger Tracker</h1>
	<table class="table">
	<thead>
		<tr>
			<th scope="col">Burger Name</th>
			<th scope="col">Restaurant Name</th>
			<th scope="col">Rating (out of 5)</th>
		</tr>
	</thead>
	<tbody>
		<c:forEach var="oneBurger" items="${allBurgers}" >
		<tr>
			<td><c:out value="${oneBurger.burgerName}"/></td>
			<td><c:out value="${oneBurger.restaurantName}"/></td>
			<td><c:out value="${oneBurger.rating}"/></td>
		</tr>	
		</c:forEach>
	</tbody>
	</table>
	
	<h1>Add a Burger:</h1>
	<form:form action="/" method="post" modelAttribute="burger">
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
	
	<script src="/webjars/bootstrap/js/bootstrap.min.js"></script>
</body>
</html>