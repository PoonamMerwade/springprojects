<%@ taglib uri="http://java.sun.com/jstl/core_rt" prefix="c"%>

<jsp:include page="/header"/>
<section style="padding:10px;min-height:400px;">
	<h2>${msg }</h2>
	
	<form>
	<label>Select salutation:</label>
	<select name="salut">
	<option value="">---------SELECT-----</option>
	<option value="Mr">Mister</option>
	<option value="Ms">Misses</option>
	<option value="Dr">Doctor</option>
	<option value="Ms">Miss</option>
	</select>
	
	<label>Enter Username :<input type="text" name="unm"></label>
	<button>Done</button>
	</form>
	</section>
<jsp:include page="/footer"/>
	
	
	
	
	
	