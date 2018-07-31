<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>List Brands</title>
</head>
<body>

	<a href="/brand/new"> New Brand </a>

	<table>
		<thead>
			<tr>
				<th>Id</th>
				<th>Description</th>
				<th>Nationality</th>
			</tr>
		</thead>

		<tbody>
			<c:forEach items="${brands}" var="brand">
				<tr>
					<td><a href="/brand/show/${brand.id}">
							${brand.id} </a></td>
					<td>${brand.description}</td>
					<td>${brand.nationality.description}</td>
				</tr>
			</c:forEach>
		</tbody>

	</table>

</body>
</html>