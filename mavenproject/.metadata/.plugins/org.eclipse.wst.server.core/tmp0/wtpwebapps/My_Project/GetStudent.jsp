<%@page import="Bean.StudentBean"%>
<%@page import="java.util.Iterator"%>
<%@page import="java.util.ArrayList"%>
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
<form>

		<br> <br> <br>
		<center>
			<table border="6px"
				style="box-shadow: 3px 3px 5px black; color: cyan">
				<tr style="color: black">
					
					<td>rollNo</td>
					<td>fname</td>
					<td>lname</td>
					<td>session</td>
				</tr>

				<%
				ArrayList list = (ArrayList) request.getAttribute("ok");
				Iterator<StudentBean> it = list.iterator();
				while (it.hasNext()) {
					StudentBean bean = it.next();
				%>
				<tr style="color: red">
					
					<td><%=bean.getRollNo()%></td>
					<td><%=bean.getFirstName() %></td>
					<td><%=bean.getLastName()%></td>
					<td><%=bean.getSession()%></td>
				</tr>
			</table>
			<%
			}
			%>
		</center>
	</form>
	<footer>
<%@ include file="Footer.jsp" %>
</footer>
</body>
</html>