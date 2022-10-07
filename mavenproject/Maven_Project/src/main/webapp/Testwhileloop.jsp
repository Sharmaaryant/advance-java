<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Test While Loop</title>
</head>
<body>
<h1>HOW TO USE WHILE LOOP IN HTML</h1>
<%
int i=0;
while (i<5){
%>
<h2><%=i+1%> Hello Java</h2>
<%
i++;%>
<%  } %>
</body>
</html>