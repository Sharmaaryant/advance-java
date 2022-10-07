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


@WebServlet(urlPatterns = "/forgot")
public class forgotpasswordctl extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		response.setContentType("text/html");
		
		String userid = request.getParameter("Get");// This is same from jsp file <th>Write User Id :</th>
		//<td><input type="text" name="'get'" value="">
		
	
		PrintWriter ps = response.getWriter();
		
		Registrationbean bean =  new Registrationbean();
		
		bean.setUserid(userid);
		
		Registrationmodel model = new Registrationmodel();
		Registrationbean bean2 =null;
		
	try {
		bean2=model.forgotpassword(userid);
		if (bean2 != null) {
			
	
		RequestDispatcher rd = request.getRequestDispatcher("Forgotpass.jsp");
		
		request.setAttribute("m", bean2.getPassword());
		rd.forward(request, response);
		//ps.println("suss");
		}else {
			RequestDispatcher rd1 = request.getRequestDispatcher("Forgotpass.jsp");
			request.setAttribute("pass", "Try again");
			request.setAttribute("jj", "Sign in");
			rd1.forward(request, response);
			//ps.println("not done");
		}
	} catch (Exception e) {
		// TODO: handle exception
	}
		
	
	}
	}
