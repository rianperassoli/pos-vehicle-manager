<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Model Vehicle</title>
</head>
<body>
	 <form action="/modelVehicle/save" method="post">

		<c:import url="_fields.jsp" />
		
		<c:import url="_buttons.jsp" />
				
	</form>
</body>
</html>