<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
 <%@ include file="header.jsp" %> 
<style>
h1{
border: 20px;
  border: 1px solid black;
  border-color: black;
  background-color:activeborder;
  
  width: 60%;
  
   }
   body{position: relative;
	padding-bottom: 58px;
	min-height: 100vh;}</style>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
	String error1 = (String)request.getAttribute("error1");
String m = (String)request.getAttribute("m");

	%>
	<center>
		<h1>
		Hello</h1><h1>
		     And Welcome To </h1><h1>Sharma Ji ki School </h1><h1>If  You interested for Addmission</h1><h1>
			<a href="loginview.jsp">Click Here</a>
			<p></p>
			<%
if(error1 != null){
%>
<%=error1%>
<%=m%>
<%} %>
			
		</h1>
	</center>
	<%
	String fname = (String) request.getAttribute("fname");
	%>
	
	<%
		
	%>
	<%
		String msg = (String) request.getAttribute("msg");
		if (msg != null) {
	%>

	<%=msg%>
	<%
		}
	%>

</body>
<%@ include file="footer.jsp" %>
</html>