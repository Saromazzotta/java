<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core"%>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<h2 style="text-align: center;">You have visited <a>http://your_server</a> <c:out value="${count}"/></h2>
	<h3 style="text-align: center;"><a href="http://localhost:8080/your_server">Test another visit?</a></h3>
	
	
</body>
</html>