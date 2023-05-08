<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css" />
<link rel="stylesheet" href="/css/style.css"/>
</head>
<body>


	<h1>Your Gold: <c:out value="${gold}"/></h1>
	
	<div class="container">
	
		<div id="place">
			<form class="form">
				<h1>Farm</h1>
				<div class="d-flex flex-column">
					<h4>(earns 10-20 gold)</h4>
					<button>Find Gold!</button>
				</div>
			</form>
		</div>
		
		<div id="place">
			<form class="form">
				<h1>Cave</h1>
				<div class="d-flex flex-column">
					<h4>(earns 5-10 gold)</h4>
					<button>Find Gold!</button>
				</div>
			</form>
		</div>

		<div id="place">
			<form class="form">
				<h1>House</h1>
				<div class="d-flex flex-column">
					<h4>(earns 2-5 gold)</h4>
					<button>Find Gold!</button>
				</div>
			</form>
		</div>

		<div id="place">
			<form class="form">
				<h1>Quest</h1>
				<div class="d-flex flex-column">
					<h4>(earns/takes 0-50 gold)</h4>
					<button>Find Gold!</button>
				</div>
			</form>
		</div>

	</div>
	
	
</body>
</html>