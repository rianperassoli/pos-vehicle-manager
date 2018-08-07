<%@ page language="java" contentType="text/html; charset=UTF-8"	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>

<jsp:include page="../head.jsp">
	<jsp:param name="title" value="List Engines"></jsp:param>
</jsp:include>

<body>

	<a href="/engine/new"> New Engine </a>

	<table>
		<thead>
			<tr>
				<th>Id</th>
				<th>Horsepower</th>
				<th>Liters</th>
				<th>Displacements</th>
				<th>Valves</th>
				<th>Fuel</th>
			</tr>
		</thead>

		<tbody>
			<c:forEach items="${engines}" var="engine">
				<tr>
					<td><a href="/engine/show/${engine.id}"> ${engine.id} </a></td>
					<td>${engine.horsePower}</td>
					<td>${engine.liter}</td>
					<td>${engine.displacements}</td>
					<td>${engine.valves}</td>
					<td>${engine.fuel}</td>
				</tr>
			</c:forEach>
		</tbody>

	</table>
	
	<a href="/"> Home </a>

</body>
</html>