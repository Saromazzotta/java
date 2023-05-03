<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Fruits and Loops</title>
</head>
<link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css" />
<link rel="stylesheet" href="/css/style.css" />
<script src="/webjars/bootstrap/js/bootstrap.min.js"></script>
<body>

	<h1 class="mx-auto text-primary">Fruit Store</h1>
	<table class="table table-striped border-primary border border-1">
		<thead>
			<tr>
				<th scope="col">Name</th>
				<th scope="col">Price</th>
			</tr>
		</thead>
		<tbody>
				<c:forEach var="oneFruit" items="${fruitsFromMyController}">
			<tr>
					<td><c:out value="${oneFruit.name}" /></td>
					<td><c:out value="${oneFruit.price}" /></td>
			</tr>
				</c:forEach>
		</tbody>
	</table>

</body>
</html>