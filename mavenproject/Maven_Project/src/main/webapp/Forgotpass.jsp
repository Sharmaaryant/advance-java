<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<%@ include file="header.jsp" %>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%
		String m = (String) request.getAttribute("m");
		String pass = (String) request.getAttribute("pass");
		String jj = (String) request.getAttribute("jj");
	%>

	<h1>
		<form method="post" action="forgot">


			<center>
				<h2 align="center">To Get your Password recovered</h2>
				<%
					if (m != null) {
				%>
				<%=m%>
				<%
					}
				%>

				<table>

					<tr>
						<th>Write User Id :</th>
						<td><input type="text" name="get" value=""> <%
 	if (pass != null) {
 %> <%=pass%> <%
 	}
 %></td>
					</tr>


					</h1>
				</table>

				<table>

					<tr>
						<td align="center"><input type="submit" name="got"
							value="Get Password"><%if(jj != null){%><a href="registration.jsp"><input
								type="button" name=<%=jj %> value="Sign In"></a></td><% }%>
					</tr>
				</table>
		</form>
</body>
<%@ include file="footer.jsp" %>
</html>