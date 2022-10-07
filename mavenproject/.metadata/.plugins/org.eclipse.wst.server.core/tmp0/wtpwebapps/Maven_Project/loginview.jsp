<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<!DOCTYPE html>

<html>
<head>
<%--  <HR><%@ include file="header.jsp" %></HR>  --%>
<style>
table, th, td {
border: 20px;
  border: 1px solid black;
  border-color: black;
  background-color:activeborder;
  center;
  width: 60%;
  
   }</style>

<meta charset="ISO-8859-1">
<title>Login Page</title>
</head>

<body>
<center>
<img alt="" src="file:///C:/workspace/mavenproject/Maven_Project/src/main/webapp/hhh.PNG" width="100px" height="100px">
</center>
<% 

String pass = (String)request.getAttribute("pass");
String blank1 = (String)request.getAttribute("blank1");
String blank2 = (String)request.getAttribute("blank2");
%>
<h1 align ="center">


<form  method="post" action="login">

<table>	

<h2 align="center"> Login Form</h2>

 


<tr>
<th>User ID*:</th>
<td><input type = "text" name="userid" value = "">

<%
if(blank1 != null){
%>
<%=blank1%>
<%} %> 
</td>
</tr>

<tr>
<th>password*:</th>
<td><input type = "password" name="password" value = "">
<%
if(blank2 != null){
%>
<%=blank2 %>
<%} %>
</td>
</tr>
<tr>
<th></th>
<td>

</td>
</tr> 
</h1>
</table>
<table>
<tr>
<th>
<a href="Forgotpass.jsp"><%
if(pass != null){
%>
<%=pass%>
<%} %></a>
</th>
</tr>
</table>

<table >

<tr><td align="center"><input type = "submit" name = "Login" value="Log In">
      <a href="registration.jsp"><input type = "button" name = "Sign in" value="Sign in"></a>
    </td></tr>
</table>

</form>
</body>

</html>
<%@ include file="footer.jsp" %> 