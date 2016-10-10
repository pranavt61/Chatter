<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core" %>
<html>
<head>
	<title>${user.name}</title>
</head>
<body>
	<h1>Welocome</h1>
	<p>ID:${user.name}</p>
	<c:if test="${user.name eq 'PT'}">
		<p>EL Worked</p>
	</c:if>
	<c:if test="${user.name eq 'not PT'}">
		<p>Breh</p>
	</c:if>
</body>
</html>