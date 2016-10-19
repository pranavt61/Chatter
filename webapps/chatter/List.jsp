<script src="ChatterScript.js"></script>
<%@include file="Header.jsp"%>

	<button id="swapButton" onclick="swap()">Edit</button>
	<p id="chatter">${user.chatter}</p> <br />

	<form id="logOutButton" action="LogOut" method="GET">
		<input type="submit" value="Log Out" />
	</form>

<%@include file="Footer.jsp"%>