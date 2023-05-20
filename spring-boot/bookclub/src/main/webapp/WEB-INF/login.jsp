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
		<h1 style="color: purple;">Book Club</h1>
		<h5>A place for friends to share thoughts on books</h5>
		<div class="row gx-3 gx-xxl-5">
			<div class="col">
				<h2>Register</h2>
				<form:form action="/users/register" method="post" modelAttribute="newUser">
					<form:errors class="error" path="userName" />
					<div class="form-floating mb-3">
						<form:input class="form-control" id="uNameInput" path="userName" placeholder="#"/>
						<form:label path="userName" for="uNameInput">UserName:</form:label>
					</div>
					<form:errors class="error" path="email" />
					<div class="form-floating mb-3">
						<form:input class="form-control" id="emailInput" type="email" path="email" placeholder="#"/>
						<form:label path="email" for="emailInput">Email:</form:label>
					</div>
					<form:errors class="error" path="password" />
					<div class="form-floating mb-3">
						<form:input class="form-control" id="passInput" type="password" path="password" placeholder="#"/>
						<form:label path="password" for="passInput">Password:</form:label>
					</div>
					<form:errors class="error" path="confirm" />
					<div class="form-floating mb-3">
						<form:input class="form-control" id="confirmInput" type="password" path="confirm" placeholder="#"/>
						<form:label path="confirm" for="confirmInput">Confirm Password:</form:label>
					</div>
					<button class="btn btn-success">Register</button>
				</form:form>
			</div>
			<div class="col">
				<h2>Login</h2>
				<form:form class="form-floating mb-3" action="/users/login" method="post" modelAttribute="newLogin">
					<form:errors class="error" path="email" />
					<div class="form-floating mb-3">
						<form:input class="form-control" id="emailInput" path="email" placeholder="#"/>
						<form:label path="email" for="emailInput">Email:</form:label>
					</div>
					<form:errors class="error" path="password" />
					<div class="form-floating mb-3">
						<form:input class="form-control" id="passInput" type="password" path="password" placeholder="#"/>
						<form:label path="password" for="passInput">Password:</form:label>
					</div>
					<button class="btn btn-success">Login</button>
				</form:form>
			</div>
		</div>
	</div>
</body>
</html>