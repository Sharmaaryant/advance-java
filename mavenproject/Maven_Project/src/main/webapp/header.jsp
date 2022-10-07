<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<center>
<img alt="" src="file:///C:/workspace/mavenproject/Maven_Project/src/main/webapp/hhh.PNG" width="100px" height="100px">
</center>
<HR>
<%  String userid = (String) session.getAttribute("userid");
out.println("Welcome !!" + userid );%>
<HR>
<a href="Logout.jsp">Logout</a>
<a href="index.jsp">Home</a>
<a href="">Contact</a>
<a href="">Change ID</a>
<a href="">Change Password</a>
</body>
</html>



