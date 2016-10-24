<%@ taglib prefix="c" uri="/WEB-INF/lib/jstl-1.2.jar" %>

<%@include file="Header.jsp"%>
<h2>${user.name}</h2>

<table>
<% for(int i = 0; i < chatterArray.length; i++) { %>
	<tr>
		<td><strong><%=chatterArray[i].title%></strong></td>
		<td><%=chatterArray[i].message%></td>
		<td><form method="GET" action="Chatter?chatterID=${chatter.chatterID}"><input type="submit" value="Edit"></input></form></td>
	</tr>
<% } %>
</table>

<form method="GET" action="Logout">
	<input type="submit" value="Log Out"> </input>
</form>
<%@include file="Footer.jsp"%>