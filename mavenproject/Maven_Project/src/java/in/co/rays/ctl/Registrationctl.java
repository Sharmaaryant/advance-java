package in.co.rays.ctl;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import in.co.rays.bean.Registrationbean;

import in.co.rays.model.Registrationmodel;

@WebServlet(urlPatterns = "/registration")
public class Registrationctl extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) {

	}

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html");

		String userid = request.getParameter("Userid");
		String std = request.getParameter("std");
		String fname = request.getParameter("fname");
		String lname = request.getParameter("lname");
		String number = request.getParameter("number");
		String date = request.getParameter("date");
		String gender = request.getParameter("gender");
		String password = request.getParameter("password");
		String conformpassword = request.getParameter("conformpassword");

		//String pass = "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&-+=()])(?=\\S+$).{8,20}$";
		Registrationbean bean1 = new Registrationbean();
		bean1.setUserid(userid);
		bean1.setStd(std);
		bean1.setFname(fname);
		bean1.setLname(lname);
		bean1.setNumber(number);
		bean1.setDate(date);
		bean1.setGender(gender);
		bean1.setPassword(password);
		bean1.setConformpassword(conformpassword);

		Registrationmodel model = new Registrationmodel();
	
		
	
		try {
			 
				
			 
		if(userid.equals("")) {
				RequestDispatcher rd = request.getRequestDispatcher("registration.jsp");
				request.setAttribute("err1", "Please Enter your User ID");
				rd.forward(request, response);}
			else if(std.equals("")) {
				RequestDispatcher rd = request.getRequestDispatcher("registration.jsp");
				request.setAttribute("err2", "Please Enter your Class");
				rd.forward(request, response);}
			 else if(fname.equals("")) {
				RequestDispatcher rd = request.getRequestDispatcher("registration.jsp");
				 request.setAttribute("err3", "Please Enter Your First Name ");
				rd.forward(request, response);}
			 else if(lname.equals("")) {
				RequestDispatcher rd = request.getRequestDispatcher("registration.jsp");
				request.setAttribute("err4", "Please Enter Your Last Name");
				rd.forward(request, response);}
			 else if(number.equals("")) {
				RequestDispatcher rd = request.getRequestDispatcher("registration.jsp");
				request.setAttribute("err5", "Please Enter Your Phone No.");
				rd.forward(request, response);}
			 else if(date.equals("")) {
				RequestDispatcher rd = request.getRequestDispatcher("registration.jsp");
				request.setAttribute("err6", "Please Enter Your DOB");
				rd.forward(request, response);}
			 else if(gender.equals("")) {
				RequestDispatcher rd = request.getRequestDispatcher("registration.jsp");
				request.setAttribute("err7", "Please Enter Your Gender");
				rd.forward(request, response);}
			 else if(password.equals("")) {
				RequestDispatcher rd = request.getRequestDispatcher("registration.jsp");
				request.setAttribute("err8", "Please Enter Your Password");
				rd.forward(request, response);}
			 else if(conformpassword.equals("")) {
				RequestDispatcher rd = request.getRequestDispatcher("registration.jsp");
				request.setAttribute("err9", "Please Enter Your Conform Password");
				rd.forward(request, response);}
				
			  else if (password != conformpassword) { RequestDispatcher rd =
			  request.getRequestDispatcher("registration.jsp");
			  request.setAttribute("err10", "Please Enter again password is not same");
			   rd.forward(request, response);}
			 
			
					 else {
					
					RequestDispatcher rd = request.getRequestDispatcher("loginview.jsp");
					request.setAttribute("suss", " you are logged in "); 
					rd.forward(request, response);
					model.add(bean1);
					
			 }
			
		
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
			
			
		
	}}	

