<script src="ChatterScript.js"></script>
<%@include file="Header.jsp"%>

	<h1>Welcome</h1>
	<button id="swapButton" onclick="swap()">Edit</button>
	<p id="chatter">${user.chatter}</p> <br />

	<form action="LogOut" method="GET">
		<input type="submit" value="Log Out" />
	</form>

<%@include file="Footer.jsp"%>