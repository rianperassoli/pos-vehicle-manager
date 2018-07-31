<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Country</title>
</head>
<body>
	 <form action="/country/save" method="post">

		<br/>
		<label for="id"> ID </label>
		<input type="number" name="id" id="id" value="${country.id}" />

		<c:import url="_fields.jsp" />
		
		<c:import url="_buttons.jsp" />		
		
		<br/>	
		<a href="/country/delete/${country.id}"> Delete </a>
				
	</form>
</body>
</html>