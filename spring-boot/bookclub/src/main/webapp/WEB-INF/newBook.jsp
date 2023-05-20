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
<title>Book Share</title>
<link rel="stylesheet" href="/css/style.css"/>
<link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css" />
<script src="/webjars/bootstrap/js/bootstrap.min.js"></script>
</head>
<body>
	<div id="wrapper">
		<div class="d-flex justify-content-between">
			<h1 style="color: purple;">Add a Book to Your Shelf</h1>
			<a href="/books">Back to the shelves</a>
		</div>
		
		<form:form action="/books/new" method="post" modelAttribute="books">
			<form:errors class="error" path="title"/>
			<div class="form-floating mb-3">
				<form:input class="form-control" id="title" path="title" placeholder="#"/>
				<form:label path="title" for="title">Title:</form:label>
			</div>
		
			<form:errors class="error" path="authorName"/>
			<div class="form-floating mb-3">
				<form:input class="form-control" id="authorName" path="authorName" placeholder="#"/>
				<form:label path="authorName" for="authorName">Author Name:</form:label>
			</div>
		
			<form:errors class="error" path="myThoughts"/>
			<div class="form-floating mb-3">
				<form:textarea rows="4" cols="50" class="form-control" id="myThoughts" path="myThoughts" placeholder="#"/>
				<form:label path="myThoughts" for="myThoughts">My Thoughts:</form:label>
			</div>
		
			<button class="btn btn-primary">Submit</button>
	</form:form>
	</div>
</body>
</html>