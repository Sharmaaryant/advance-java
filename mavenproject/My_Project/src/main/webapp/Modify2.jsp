<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>modify</title>
<link rel="stylesheet" type="text/css" href="./style.css">
</head>
<header>
<%@ include file="Header.jsp" %>
</header>
<body>
	<%Integer m1 = (Integer) request.getAttribute("m1");
String m2 = (String) request.getAttribute("m2");
String m3 = (String) request.getAttribute("m3");
String m4 = (String) request.getAttribute("m4"); %>

		<%
 	if (m1 != null) {
 %><% 
		if (m2 != null) {
		%><% 
 	if (m3 != null) {
 %>
		<%
 	if (m4 != null) {
 %>
 <center>
 <form method="post" action="Modify2">

		<table border="10px">
			<tr>
				<th><b>Roll no.-</b></th>
				<td><input type="text" value="<%=m1%>" name="rollNo"></td>
			</tr>
			<tr>
				<th><b>First Name -</b></th>
				<td><input type="text" value="<%=m2%>" name="firstName"></td>
			</tr>
			<tr>
				<th><b>Last Name -</b></th>
				<td><input type="text" value="<%=m3%>" name="lastName"></td>
			</tr>
			<tr>
				<th><b>session -</b></th>
				<td><input type="text" value="<%=m4%> " name="session"></td>
			</tr>
		</table>
		</center>
		<center>
				<table>
				<th></th>
				<td>
				 <input type="submit" value="modify" name="operation"> 
			<input type="reset" value="clear"></td> 
				<br>
	
			</center>
			</table>
		

		<%
 	}
 %>
		<%
 	}
 %>
		<%
 	}
 %>
	<%} %>


	</form>
	<footer>
<%@ include file="Footer.jsp" %>
</footer>
</body>
</html>