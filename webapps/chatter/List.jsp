<%@ page import="UserModel"%>
<html>
<head>
	<title>${user.name}</title>
</head>
<body>
	<h1>Welocome</h1>
	<p>ID:${user.name}</p>
	<p>Test:<%=session.getAttribute("user").name%></p>
</body>
</html>