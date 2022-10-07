<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%

String Class= (String) request.getParameter("demo");
String FirstName= (String) request.getParameter("fname");
String MiddleName= (String) request.getParameter("mname");

String LastName= (String) request.getParameter("lname");
String PhoneNo= (String) request.getParameter("number");
String DOB= (String) request.getParameter("date");
String Gender= (String) request.getParameter("gender");


%>

<%=Class %>
<%=FirstName%>
<%=MiddleName %>

<%=LastName%>
<%=PhoneNo%>
<%=DOB %>
<%=Gender %>


</body>
</html>