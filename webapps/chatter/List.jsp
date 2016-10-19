<script src="ChatterScript.js"></script>
<html>
<head>
	<title>${user.name}'s Chatter</title>
</head>
<body>
	<h1>Welcome</h1>
	<button id="swapButton" onclick="swap()">Edit</button>
	<p id="chatter">${user.chatter}</p> <br />

	<form action="/LogOut" method="GET">
		<input type="submit" value="Log Out" />
	</form>
</body>
</html>