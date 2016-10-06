<html>
<head>
	<title><%=req.getAttribute("user").getName()%>'s list</title>
</head>
<body>
	<h1>Welocome</h1>
	<p>ID:<%= req.getAttribute("user").getID()%></p>
</body>
</html>