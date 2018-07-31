<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<br/>
<label for="description"> Brand </label>
<input type="text" name="description" id="description" value="${brand.description}" />		

<br/>
<label for="nationality"> Nationality </label>
<select id="nationality" name="nationality.id">

	<option></option>
	<c:forEach items="${countries}" var="country">

	<c:set var="selected" value=""/>

	<c:if test="${country.id eq brand.nationality.id}">
		<c:set var="selected" value="selected"/>
	</c:if>
		
	<option value="${country.id}" ${selected}>${country.description}</option>
	
</c:forEach>
	
</select>