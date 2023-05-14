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
<title>Expenses</title>
<link rel="stylesheet" href="/css/style.css"/>
<link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css" />
<script src="/webjars/bootstrap/js/bootstrap.min.js"></script>
</head>
<body>

	<div class="container">
	
		<h1>Safe Travels</h1>
		<table class="table">
		<thead>
			<tr>
				<th scope="col">Expense</th>
				<th scope="col">Vendor</th>
				<th scope="col">Amount</th>
				<th scope="col">Action</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach var="travel" items="${allTravels}" >
			<tr>
				<td><a href="/expenses/${travel.id}"><c:out value="${travel.expense}"/></a></td>
				<td><c:out value="${travel.vendor}"/></td>
				<td>$<c:out value="${travel.amount}"/></td>
				<td><a href="/expenses/edit/${travel.id}">Edit</a></td>
				<td><a style="color: red;" href="/expenses/delete/${travel.id}">Delete</a></td>
			</tr>	
			</c:forEach>
		</tbody>
		</table>
		
		
		<h1>Add an expense:</h1>
		<form:form action="/expenses" method="post" modelAttribute="travels">
			<div class="mb-3">
				<form:label path="expense">Expense</form:label>
				<form:errors path="expense"/>
				<form:input type="text" path="expense"/>
			</div>
			
			<div class="mb-3">
				<form:label path="vendor">Vendor</form:label>
				<form:errors path="vendor"/>
				<form:input type="text" path="vendor"/>
			</div>
			
			<div class="mb-3">
				<form:label path="amount">Amount</form:label>
				<form:errors path="amount"/>
				<form:input type="number" step="0.01" min="0.01" path="amount"/>
			</div>
			
			<div class="mb-3">
				<form:label path="description">Description</form:label>
				<form:errors path="description"/>
				<form:input type="text" path="description"/>
			</div>
			
			<button class="btn btn-primary">Submit</button>
		
		</form:form>
		
	
	</div>

</html>