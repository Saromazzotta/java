<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css" />
<head>
<meta charset="UTF-8">
<title>Books</title>
</head>
<body>

	<h1>All Books</h1>

	<table class="table">
		<thead>
			<tr>
				<th scope="col">ID</th>
				<th scope="col">Title</th>
				<th scope="col">Language</th>
				<th scope="col"># Pages</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach var="book" items="${allBooks}">
				<tr>
					<td><c:out value="${book.id}"/></td>
					<td><a href="/books/${book.id}"> <c:out value="${book.title}" /></a></td>
					<td><c:out value="${book.language}" /></td>
					<td><c:out value="${book.description}" /></td>
				</tr>
			</c:forEach>
		</tbody>
	</table>

</body>
</html>