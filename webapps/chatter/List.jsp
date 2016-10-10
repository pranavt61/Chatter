<%!UserModel user = session.getAttribute("user");%>
<html>
<head>
	<title><%=user.getName()%>'s list</title>
</head>
<body>
	<h1>Welocome</h1>
	<p>ID:<%=user.getName()%></p>
</body>
</html>