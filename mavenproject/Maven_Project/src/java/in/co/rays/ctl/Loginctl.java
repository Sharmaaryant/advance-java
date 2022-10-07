package in.co.rays.ctl;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import in.co.rays.bean.Registrationbean;

import in.co.rays.model.Registrationmodel;

@WebServlet(urlPatterns = "/login")//get jeb ker naa jeb session id pata ker na hoto
public class Loginctl extends HttpServlet {
		protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		response.setContentType("text/html");
		
		String userid = request.getParameter("userid");
		String password = request.getParameter("password");
		
	
		PrintWriter ps = response.getWriter();
		
		Registrationbean bean =  new Registrationbean();
		
		bean.setUserid(userid);
		bean.setPassword(password);
		
		Registrationmodel model = new Registrationmodel();
		Registrationbean bean2 =null;
		
	try {
		
		 if (userid.equals("")&&password.equals("")) { RequestDispatcher rd =
				  request.getRequestDispatcher("loginview.jsp");
				  
				  request.setAttribute("blank1", " Required user ");
				  request.setAttribute("blank2", " Required password ");
				  
				  rd.forward(request, response); }
		 bean2=model.authenticate(userid, password);
			if (bean2 != null) {
			
			HttpSession session = request.getSession();
		
			response.sendRedirect("Welcome.jsp");
			
			
			}else {
				RequestDispatcher rd1 = request.getRequestDispatcher("loginview.jsp");
				request.setAttribute("pass", "Forgot Password");
				rd1.forward(request, response);
			
			}
	} catch (Exception e) {
		e.printStackTrace();
		// TODO: handle exception
	}
}
}
