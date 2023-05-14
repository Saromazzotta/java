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
<title>Show</title>
<link rel="stylesheet" href="/css/style.css"/>
<link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css" />
<script src="/webjars/bootstrap/js/bootstrap.min.js"></script>
</head>
<body>
	
	<div class="container">
		<div class="d-flex justify-content-between">
			<h1>Expense Details:</h1>
			<a class="mt-3" href="/expenses">Go back</a>
		</div>
		
		<div class="mx-auto">
			<p>Expense Name: <c:out value="${travels.expense}"/></p>
			<p>Expense Description: <c:out value="${travels.description}"/></p>
			<p>Vendor: <c:out value="${travels.vendor}"/></p>
			<p>Amount Spent: $<c:out value="${travels.amount}"/></p>
		</div>
	</div>
</body>
</html>