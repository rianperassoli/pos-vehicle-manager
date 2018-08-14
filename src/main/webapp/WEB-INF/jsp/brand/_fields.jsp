<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<div class="form-group">
	<br/>
	<label for="description"> Brand </label>
	<input type="text" name="description" id="description" value="${brand.description}" />		
</div>

<div class="form-group">
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
</div>