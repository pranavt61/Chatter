
<%@include file="Header.jsp"%>

<div align = "center" >
<form method="post" action="Login">
	<p>User:</p><input name="username" type="text" /><br />
	<p>Pass:</p><input name="password" type="password" /><br />
	<input type="submit" value="Login">
</form><br />
<form method="GET" action="NewUser">
	<input type="submit" value="New User">
</form>
</div>

<%@include file="Footer.jsp"%>