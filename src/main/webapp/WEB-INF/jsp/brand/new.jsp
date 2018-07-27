<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Brand</title>
</head>
<body>
	 <form action="/brand/save" method="post">

		<br/>
		<label for="id"> ID </label>
		<input type="number" name="id" id="id" value="${brand.id}" />

		<br/>
		<label for="description"> Brand </label>
		<input type="text" name="description" id="description" value="${brand.description}" />		
		
		
		<br/>
		<button type="submit"> Save </button>
				
	</form>
</body>
</html>