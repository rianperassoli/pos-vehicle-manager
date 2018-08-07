<%@ page language="java" contentType="text/html; charset=UTF-8"	pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>

<jsp:include page="./head.jsp">
	<jsp:param name="title" value="Vehicle Manager"></jsp:param>
</jsp:include>

<body>
	<a href="/brand/list" > List Brand </a>

	<br />

	<a href="/country/list"> List Country </a>

	<br />

	<a href="/engine/list"> List Engine </a>

	<br />

	<a href="/modelVehicle/list"> List Model </a>
</body>
</html>
