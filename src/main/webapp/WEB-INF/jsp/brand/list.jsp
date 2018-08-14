<%@ page language="java" contentType="text/html; charset=UTF-8"	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>

<jsp:include page="../head.jsp">
	<jsp:param name="title" value="List Brands"></jsp:param>
</jsp:include>

<body>

	<h1 class="display-4" align="center">List Brands</h1>
	<hr>

	<div class = "container">
		<table class="table">
			<thead class="thead-dark">
				<tr>
					<th scope="col">Id</th>
					<th scope="col">Description</th>
					<th scope="col">Nationality</th>
					<th scope="col"> <a href="/brand/new" class="btn btn-outline-primary col-12"> + New Brand </a> </th>
				</tr>
			</thead>
	
			<tbody>
				<c:forEach items="${brands}" var="brand">
					<tr>
						<th scope="row"><a href="/brand/show/${brand.id}">
								${brand.id} </a></th>
						<td>${brand.description}</td>
						<td>${brand.nationality.description}</td>
						<td  align="center">
							<a href="/brand/show/${brand.id}" class="btn btn-outline-warning col-5"> Edit </a>
							<a href="/brand/delete/${brand.id}" class="btn btn-outline-danger col-5"> Remove </a>											
						</td>
					</tr>
				</c:forEach>
			</tbody>
	
		</table>
		
		<a href="/" class="btn btn-outline-secondary col-12"> Home </a>
	</div>
</body>
</html>