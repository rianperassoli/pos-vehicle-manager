<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<br/>
<label for="horsepower"> Horsepower </label>
<input type="number" name="horsePower" id="horsepower" value="${engine.horsePower}" />		

<br/>
<label for="liter"> Liters </label>
<input type="number" name="liter" id="liter" value="${engine.liter}" />

<br/>
<label for="displacements"> Displacements </label>
<input type="number" name="displacements" id="displacements" value="${engine.displacements}" />

<br/>
<label for="valves"> Valves </label>
<input type="number" name="valves" id="valves" value="${engine.valves}" />

<br/>
<label for="fuel"> Fuel </label>
<select id="fuel" name="fuel">

	<option></option>		
	<option value="gasoline" <c:if test="${engine.fuel == 'gasoline'}">selected</c:if> >Gasoline</option>		
	<option value="ethanol" <c:if test="${engine.fuel == 'ethanol'}">selected</c:if> >Ethanol</option>		
	<option value="diesel" <c:if test="${engine.fuel == 'diesel'}">selected</c:if> >Diesel</option>		
	<option value="cng" <c:if test="${engine.fuel == 'cng'}">selected</c:if> >(CNG/GNV) Compressed Natural Gas</option>	
	
</select>