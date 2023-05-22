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
			<h1 style="color: purple;">Welcome, ${currentUser.userName}</h1>
			<a href="/users/logout">Logout</a>
		</div>
		<div class="d-flex justify-content-between">
			<h5>Books from everyone's shelves:</h5>		
			<a href="/books/new">+ Add to my shelf!</a>
		</div>
		
			<!--Book Table  -->
	<table class="table">
		<thead>
			<tr>
				<th scope="col">ID</th>
				<th scope="col">Title</th>
				<th scope="col">Author Name</th>
				<th scope="col">Posted By</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach var="book" items="${books}">
			<tr>
				<td><c:out value="${book.id}"/></td>
				<td><a href="/books/${book.id}">${book.title}</a></td>
				<td><c:out value="${book.authorName}"/></td>
				<td><c:out value="${book.user.userName}"/></td>
			</tr>	
			</c:forEach>
		</tbody>
		</table>
		
	</div>
	
</body>
</html>