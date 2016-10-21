<%@ taglib prefix="c" uri="./WEB-INF/lib/jstl-1.2.jar" %>

<%@include file="Header.jsp"%>
<h2>${user.name}</h2>

<table>
<c:forEach var="chatter" items="${chatterArray}">
	<tr>
		<td><strong>${chatter.title}</strong></td>
		<td>${chatter.message}</td>
		<td><form method="GET" action="Chatter?chatterID=${chatter.chatterID}"><input type="submit" value="Edit"></input></form></td>
	</tr>
</c:forEach>
</table>

<form method="GET" action="Logout">
	<input type="submit" value="Log Out"> </input>
</form>
<%@include file="Footer.jsp"%>