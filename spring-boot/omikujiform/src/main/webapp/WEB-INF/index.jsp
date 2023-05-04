<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css" />
<title></title>
</head>
<body>

	<h1 class="col-md-6 mx-auto">Send an Omikuji!</h1>
	<form action="/process" class="col-md-6 mx-auto" method="post">
        <div class="form-group">
        	<label>Pick any number from 5 to 25</label>
        	<input type="number" name="numberInput" class="form-control"/>
        </div>
        <div class="form-group">
        	<label>Enter the name of any city</label>
        	<input type="text" name="cityInput" class="form-control"/>
        </div>
        <div class="form-group">
        	<label>Enter the name of any real person</label>
        	<input type="text" name="personInput" class="form-control"/>
        </div>
        <div class="form-group">
        	<label>Enter professional endeavor or hobby:</label>
        	<input type="text" name="hobbyInput"  class="form-control"/>
        </div>     
        <div class="form-group">
        	<label>Enter any type of living thing.</label>
        	<input type="text" name="livingInput" class="form-control"/>
        </div> 
        <div class="form-group">
        	<label>Say something nice to someone:</label>
        	<input type="text" name="niceInput" class="form-control"/>
        </div>
        <div class="form-group">
        	<label>Send and show a friend</label>
        	<button class="btn btn-info mt-3">Send</button>
        </div>  
	</form>

	
</body>
</html>
