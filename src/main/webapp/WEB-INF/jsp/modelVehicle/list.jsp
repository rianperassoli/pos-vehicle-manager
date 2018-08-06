<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>List Model</title>
</head>
<body>

	<a href="/modelVehicle/new"> New Model Vehicle</a>

	<table>
		<thead>
			<tr>
				<th>Id</th>
				<th>Length</th>
				<th>Width</th>
				<th>Engine</th>
				<th>Brand</th>
			</tr>
		</thead>

		<tbody>
			<c:forEach items="${modelVehicles}" var="modelVehicle">
				<tr>
					<td><a href="/modelVehicle/show/${modelVehicle.id}">
							${modelVehicle.id} </a></td>
					<td>${modelVehicle.length}</td>
					<td>${modelVehicle.width}</td>
					<td>${modelVehicle.engine.toString()}</td>
					<td>${modelVehicle.brand.description}</td>
				</tr>
			</c:forEach>
		</tbody>

	</table>

</body>
</html>