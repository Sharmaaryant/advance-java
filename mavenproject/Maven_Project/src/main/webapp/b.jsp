<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
In B JSP
<%
request.setAttribute("b", "two");
%>
<jsp:forward page="c.jsp"></jsp:forward>
<%-- <%
response.sendRedirect("c.jsp");
%> --%>
</body>
</html>