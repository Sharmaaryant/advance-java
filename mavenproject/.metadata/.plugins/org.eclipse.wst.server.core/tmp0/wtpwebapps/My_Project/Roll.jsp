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
<form action="GetStudentCtrl" method="post">
		<center>
			<h1 style="color: Blue; text-shadow: 2px 2px 3px black">GetStudent...</h1>
			<table border="6px"
				style="box-shadow: 3px 3px 5px black; color: cyan">
				<tr>
					<th><b><font color="black"> Enter Roll No. </font></b></th>
					<td><input type="text" size="15" name="rollNo"><br></td>
					<td><input type="submit" value="search" name="operation"></td>
				</tr>
				</table>
		</center>
	</form><footer>
<%@ include file="Footer.jsp" %>
</footer>
</body>
</html>