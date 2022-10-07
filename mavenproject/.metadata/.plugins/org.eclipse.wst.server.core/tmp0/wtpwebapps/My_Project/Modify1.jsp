<%@ page errorPage="Error.jsp" language="java" contentType="text/html; charset=ISO-8859-1"
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
		String err = (String) request.getAttribute("err");

		
	%>

	<h1>
		<form method="post" action="Modify1">


			<center>
				<h2 align="center">Modify Detailed</h2>
				

				<table>

					<tr>
						<th>Write Roll No. :</th>
						<td><input type="number" name="mode" value=""> <%
 	if (err != null) {
 %> <%=err%> <%
 	}
 %></td>
					</tr>
					<table>

					<tr>
						<td align="center"><input type="submit" name="got"
							value="GET MODIFY"></td>


					</h1>
				</table>
				<footer>
<%@ include file="Footer.jsp" %>
</footer>

</body>
</html>