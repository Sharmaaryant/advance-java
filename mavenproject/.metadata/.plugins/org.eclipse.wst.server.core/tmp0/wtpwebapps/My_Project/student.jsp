<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" type="text/css" href="./style.css">
</head>
<header>
<%@ include file="Header.jsp" %>
</header>
<body>
	<%
		String s = (String) request.getAttribute("ok");
		if (s != null) {
	%>
	<h1>
		<font color="red"> <%=s%>
		</font>
	</h1>


	<%
		}
	%>


	<center>
	<h1>Student Management</h1>
		<form action="StudentCtrl" method="post">
			<table border="10px">
				<tr>
					<th><b>Roll no.-</b></th>
					<td><input type="text" value="" name="rollNo"></td>
				</tr>
				<tr>
					<th><b>First Name -</b></th>
					<td><input type="text" value="" name="firstName"></td>
				</tr>
				<tr>
					<th><b>Last Name -</b></th>
					<td><input type="text" value="" name="lastName"></td>
				</tr>
				<tr>
					<th><b>session -</b></th>
					<td><input type="month" value="" name="session"></td>
				</tr>
				</table>
				</center> 
				<HR>
				<center>
				<table>
				<th></th>
				<td><input type="submit"  value="add" name="operation">
				<input type="reset" value="clear"></td>
				<br>
	
			</center>
			</table>
</form>
<footer>
<%@ include file="Footer.jsp" %>
</footer>
</body>
</html>