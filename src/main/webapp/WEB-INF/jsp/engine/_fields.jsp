
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
<select id="fuel" name="fuel" value="${engine.fuel}">

	<option></option>			
	<option value="gasoline">Gasoline</option>
	<option value="ethanol">Ethanol</option>
	<option value="diesel">Diesel</option>
	<option value="cng">(CNG/GNV) Compressed Natural Gas</option>	
	
</select>