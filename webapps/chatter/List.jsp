<html>
<head>
	<title><%=request.getAttribute("user").getName()%>'s list</title>
</head>
<body>
	<h1>Welocome</h1>
	<p>ID:<%= request.getAttribute("user").getID()%></p>
</body>
</html>