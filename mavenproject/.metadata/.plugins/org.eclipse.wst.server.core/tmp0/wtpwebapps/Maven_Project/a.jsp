<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
In A JSP
<%
request.setAttribute("a", "one");
%>
 <jsp:forward page="b.jsp"></jsp:forward> <!--  -->
<%-- <%
response.sendRedirect("b.jsp");
%> --%>
</body>
</html>
