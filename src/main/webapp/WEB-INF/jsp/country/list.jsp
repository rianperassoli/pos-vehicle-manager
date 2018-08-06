<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>List Countries</title>
</head>
<body>

	<a href="/country/new"> New Country </a>

	<table>
		<thead>
			<tr>
				<th>Id</th>
				<th>Description</th>
				<th>Initials</th>
			</tr>
		</thead>

		<tbody>
			<c:forEach items="${countries}" var="country">
				<tr>
					<td><a href="/country/show/${country.id}"> ${country.id} </a></td>
					<td>${country.description}</td>
					<td>${country.initials}</td>
				</tr>
			</c:forEach>
		</tbody>

	</table>

	<a href="/"> Home </a>

</body>
</html>