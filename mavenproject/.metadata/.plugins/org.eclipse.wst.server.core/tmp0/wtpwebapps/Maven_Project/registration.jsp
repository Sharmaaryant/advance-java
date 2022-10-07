<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>

<%@page import="java.util.Locale"%>
<%@page import="java.util.ResourceBundle"%>
<HR>
<%@ include file="header.jsp" %></HR>
<html>

<head>

<style>

table, th, td {
  border: 20px;
  border: 1px solid black;
  border-color: black;
  background-color:activeborder;
  width: 50%;
   margin-left: auto;
  margin-right: auto;
 }
  img {
  display: block;
  margin-left: auto;
  margin-right: auto;
  box-shadow: 20px; 
  width:100px;
}
   h2 {
        width: 100%;
        padding: 10px 0;
        background-color: lightblue;}
        h3{
        width: 100%;
        padding: 10px 0;
        background-color: buttonface;</style>
<meta charset="ISO-8859-1">
<title>My Profile</title>
</head><center>

</center>
<body>
<%
String err1 = (String)request.getAttribute("err1");
String err2=  (String)request.getAttribute("err2");
String err3 = (String)request.getAttribute("err3");
String err4 = (String)request.getAttribute("err4");
String err5 = (String)request.getAttribute("err5");
String err6 = (String)request.getAttribute("err6");
String err7 = (String)request.getAttribute("err7");
String err8 = (String)request.getAttribute("err8");
String err9 = (String)request.getAttribute("err9");
String err10 = (String)request.getAttribute("err10");
String err11 = (String)request.getAttribute("err11");%>
<h2>
<marquee behavior="scroll" direction="left" scrollamount="20">This Is My Project</marquee></h2>
<h3><marquee behavior="scroll" direction="left" scrollamount="10">Fill Your Information For Your Admission</marquee>
</h3>

	<ul><form  method="post" action="registration">
	<img src="file:///C:/workspace/mavenproject/Maven_Project/src/main/webapp/WEB-INF/hhh.PNG" width="14%" height="14%"
	>
	<hr><p align="center" style="font-size: 20px"><u><strong><b>Sharma ji ki School</u></strong></b></p>
	<hr><p align="center" style="font-size: 18px"><u><strong><b>Registraion Form</u></strong></b></p>
	
		<table  align="center" >
		
		
		<tr>
				<th><u><b><var> User ID :</var></b><u></th>
				<td align="center"><input type="text" name="Userid"  value="">			<%
if(err1 != null){
%>
<%=err1 %>
<%} %>
</td>
								

			</tr>

		<tr>
				<th><u><b><var>Admission for Class :</var></b></u></th>
				<td align="center"><label for="std" style="text-align: center;"></label>
				<select name="std">
				<option value="Option"> ----------Select--------- </option>
				<option value="I">(1st){First} </option>
				<option value="II">(2nd){Second} </option>
				<option value="III">(3rd){Third} </option>
				<option value="IV">(4th){Fourth} </option>
				<option value="V">(5th){Fifth} </option>
				<option value="VI">(6th){Sixth}</option>
				<option value="VII">(7th){Seventh} </option> 
				<option value="VIII">(8th){Eighth} </option> 
				<option value="IX">(9th){Ninth} </option>
				<option value="X">(10th){Tenth} </option>
				</select>
				
</td>
<%
if(err2 != null){
%>
<%=err2 %>
<%} %>
			</tr>
			<tr>
				<th><u><b><var>Student First Name:</var></b><u></th>
				<td align="center"><input type="text" name="fname" placeholder="Tera phela naam likha"value=""><%
if(err3 != null){
%>
<%=err3 %>
<%} %>
</td>
			</tr>
		
			<tr>
				<th><u><b><var>Student Last Name:</var></b><u></th>
				<td align="center"><input type="text" name="lname"  placeholder="Tera akhari naam likha"value=""><%
if(err4 != null){
%>
<%=err4 %>
<%} %>
</td>
			</tr>
			
			<tr>
				<th><u><b><var>Mobile No:</var></b></u></th>
				<td align="center"><input type="number" name="number" placeholder="Tera phone Number de" value="">	 <%
if(err5 != null){
%>
<%=err5 %>
<%} %> 
</td>
			</tr>
			<tr>

                <th><u><b><var>Student's Date of Birth:</var></b></u></th>

  <td align="center"><input type="date" name="date" placeholder="keb paida hoa tha ">
<%
if(err6 != null){
%>
<%=err6 %>
<%} %> </td>
</tr>
			<tr>
				<th><b><u><u><var>Gender:</var><u></u></b></th>
				<td align="center"><label for="gender" style="text-align: center;"></label>
						<input type="radio" name="gender" value=" male" selected>Male
						<input type="radio" name ="gender"value="female" selected>Female
						<input type="radio" name ="gender"value ="Custom" selected>Others		 
<%
if(err7 != null){
%>
<%=err7 %>
<%} %> </td>
<tr>
			<th><u><b><var>Password:</var></b></u></th>

  <td align="center"><input type="password" name="password" placeholder=" password ">
<%
if(err8 != null){
%>
<%=err8 %>
<%} %>
<%
if(err11 != null){
%>
<%=err11 %>
<%} %>  </td>
</tr>
<tr>
<th><u><b><var>conformpassword:</var></b></u></th>

  <td align="center"><input type="password" name="conformpassword" placeholder="conform password "> 
<%
if(err9 != null){
%>
<%=err9 %>
<%} %>
<%
if(err11 != null){
%>
<%=err11 %>
<%} %> 
 </td>
</tr>
			</table>
			<table align="center" >
			<tr><td align="center"><strong>
				<input  
				    type="submit" name="Login" value="Log In"><input
				    
					type="submit" name="Cancel" value="Cancel"></strong></td>

			</tr>
		<center><%
if(err10 != null){
%>
<%=err10 %>
<%} %>	</center>
		</table>
	
	</form></ul>
</body>
<HR>
<%@ include file="footer.jsp" %></HR> 
</html>