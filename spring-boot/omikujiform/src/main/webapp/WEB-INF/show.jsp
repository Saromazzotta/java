<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css" />
<title>Show Page</title>
</head>
<body>


	<div class="d-flex flex-column">
		<h1 class="mx-auto">Here's Your Omikuji!</h1>
		<span class="mx-auto bg-info border border-2 border-dark">
		In <c:out value="${numberInput}"/> years, you will live in <c:out value="${cityInput}"/> 
		with <c:out value="${personInput}"/> as your room mate, <c:out value="${hobbyInput}"/>. 
		The next time you see a <c:out value="${livingInput}"/>, you will have good luck. 
		Also, <c:out value="${niceInput}"/>
		</span>
		<a href="http://localhost:8080/omikuji" class="mx-auto">Go Back</a>
	</div>
</body>
</html>