

<jsp:include page="/header"/>
<section style="padding:10px;min-height:400px;">
	<h3>Visitor Registration</h3>
	<form method="post">
	<label>Name:<input type="text" name="firstName" placeholder="first Name" required/>
	<input type="text" name="lastName" placeholder="last name" required/>
	</label>
	<br/>
	<label>Date of birth:
	<input type="date" name="dateOfBirth" required/>
	</label>
	<br/>
	<button>REGISTER</button>
	</form>
</section>
<jsp:include page="/footer"/>