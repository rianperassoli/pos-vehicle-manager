<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>

<jsp:include page="../head.jsp">
	<jsp:param name="title" value="Engine"></jsp:param>
</jsp:include>


<body>
	 <form action="/engine/save" method="post">

		<br/>
		<label for="id"> ID </label>
		<input type="number" name="id" id="id" value="${engine.id}" />

		<c:import url="_fields.jsp" />
		
		<c:import url="_buttons.jsp" />		
		
		<br/>	
		<a href="/engine/delete/${engine.id}"> Delete </a>
				
	</form>
</body>
</html>