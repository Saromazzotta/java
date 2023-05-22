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
			<h1 style="color: purple;">${book.title}</h1>
			<a href="/books">Back to the shelves</a>
		</div>
		<div class="row gx-3 gx-xxl-5">
			<div style="margin-top: 30px;"class="col">
				<h5 style="font-weight: bold;">
					<c:choose>
						<c:when test="${book.user.id == currentUser.id}">
							<span style="color: red;">You</span>
						</c:when>
						<c:otherwise>
							<span style="color: red;">${book.user.userName}</span>
						</c:otherwise>
					</c:choose> 
					read <span style="color:purple;">${book.title}</span> by <span style="color: green;">${book.authorName}</span>
				</h5>
				<h5>
					<c:choose>
							<c:when test="${book.user.id == currentUser.id}">
								<span>Here are your thoughts:</span>
							</c:when>
							<c:otherwise>
								Here are ${book.user.userName}'s thoughts:
							</c:otherwise>
						</c:choose>
				</h5>
				<div style="margin-top: 50px;
							border-top: 1px solid black;
							border-bottom: 1px solid black;
							height: 150px;
							padding: 5%;">
					<p>${book.myThoughts}</p>
				</div>
				<div class="d-flex justify-content-end" style="padding: 3px;">
					<c:if test="${book.user.id == currentUser.id}">
						<a style="margin-right: 6px;"href="/books/edit/${book.id}">Edit</a>
						<a href="/books/delete/${book.id}">Delete</a>
					</c:if>
				</div>
			</div>
		</div>
	</div>
</body>
</html>