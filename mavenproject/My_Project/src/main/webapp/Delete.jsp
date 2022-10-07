<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" type="text/css" href="./style.css">
</head>
<body>
<center>
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
	</center>
	<center>
	<h1>Student Management</h1>
		<form action="Delete" method="post">
			<table border="10px">
				<tr>
					<th><b>Roll no.-</b></th>
					<td><input type="text" value="" name="rollNo"></td>
				</tr>
				<th></th>
				<td><input type="submit" value="delete" name="operation"></td>
				
</body>
</html>