<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%String visitcount = (String)request.getAttribute("visitcount");%>
<form action="count" method="get">
<%
if(visitcount != null){
%>
<%=visitcount%>
<%} %>

</form>
</body>
</html>