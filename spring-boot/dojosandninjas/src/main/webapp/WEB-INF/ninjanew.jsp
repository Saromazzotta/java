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
<title>New Ninja</title>
<link rel="stylesheet" href="/css/style.css"/>
<link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css" />
<script src="/webjars/bootstrap/js/bootstrap.min.js"></script>
</head>
<body>
	
	<div class="d-flex justify-content-between">
		<h1>New Ninja</h1>
		<a class="mx-3" href="/dojos/new">Go back</a>
	</div>
	
	<form:form action="/ninjas/new" method="post" modelAttribute="ninja">
		<div class="mb-3">
			<form:label path="dojo">Dojo</form:label>
			<form:errors path="dojo"/>
			<form:select path="dojo">
				<c:forEach var="dojo" items="${dojos}">
					<option value="${dojo.id}">${dojo.name}</option>
				</c:forEach>
			</form:select>
		</div>
		<div class="mb-3">
			<form:label path="firstName">First Name</form:label>
			<form:errors path="firstName"/>
			<form:input type="text" path="firstName"/>
		</div>
		<div class="mb-3">
			<form:label path="lastName">Last Name</form:label>
			<form:errors path="lastName"/>
			<form:input type="text" path="lastName"/>
		</div>
		<div class="mb-3">
			<form:label path="age">Age</form:label>
			<form:errors path="age"/>
			<form:input type="number" path="age"/>
		</div>
		<button class="btn btn-primary">Create</button>
	</form:form>
</body>
</html>