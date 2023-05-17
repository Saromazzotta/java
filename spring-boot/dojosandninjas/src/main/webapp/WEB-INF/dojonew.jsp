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
<title>New Dojo</title>
<link rel="stylesheet" href="/css/style.css"/>
<link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css" />
<script src="/webjars/bootstrap/js/bootstrap.min.js"></script>
</head>
<body>

	<div class="d-flex justify-content-between">
		<h1>New Dojo</h1>
		<a class="mx-3" href="/ninjas/new">Create a new ninja</a>
	</div>

	
	
	<form:form action="/dojos/new" method="post" modelAttribute="dojo">
		<div class="mb-3">
			<form:label path="name">Name</form:label>
			<form:errors path="name"/>
			<form:input type="text" path="name"/>
		</div>
		
		<button class="btn btn-primary">Create</button>
	</form:form>
	
	<div class="mx-3">
		<c:forEach var="dojo" items="${dojos}">
		<a href="/dojos/${dojo.id}">
			<c:out value="${dojo.name}"/>
			<br>
		</a>
	</c:forEach>
	</div>
	
	
</body>
</html>