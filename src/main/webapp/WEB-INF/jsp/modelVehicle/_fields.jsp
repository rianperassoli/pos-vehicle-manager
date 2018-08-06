<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<br/>
<label for="length"> Length </label>
<input type="number" name="length" id="length" value="${modelVehicle.length}" />		

<br/>
<label for="length"> Width </label>
<input type="number" name="width" id="width" value="${modelVehicle.width}" />

<br/>
<label for="engine"> Engine </label>
<select id="engine" name="engine.id">

	<option></option>
	<c:forEach items="${engines}" var="engine">

	<c:set var="selected" value=""/>

	<c:if test="${engine.id eq modelVehicle.engine.id}">
		<c:set var="selected" value="selected"/>
	</c:if>
		
	<option value="${engine.id}" ${selected}>${engine.toString()}</option>
	
</c:forEach>
</select>
 
<br/>
<label for="brand"> Brand </label>
<select id="brand" name="brand.id">

	<option></option>
	<c:forEach items="${brands}" var="brand">

	<c:set var="selected" value=""/>

	<c:if test="${brand.id eq modelVehicle.brand.id}">
		<c:set var="selected" value="selected"/>
	</c:if>
		
	<option value="${brand.id}" ${selected}>${brand.description}</option>
	
</c:forEach>
	
</select>