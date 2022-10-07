package Controler;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Bean.StudentBean;
import Model.StudentModel;



@WebServlet("/Modify1")
public class Modify1 extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		
		int rollNo = Integer.parseInt(request.getParameter("mode"));
		PrintWriter ps = response.getWriter();
		StudentBean bean = new StudentBean();
		bean.setRollNo(rollNo);
		StudentModel model = new StudentModel();
		StudentBean bean2 =null;
		
		try {
			bean2= model.mode(rollNo);
			if (bean2 != null) {
				
				
				RequestDispatcher rd = request.getRequestDispatcher("Modify2.jsp");
				
				request.setAttribute("m1", bean2.getRollNo());
				request.setAttribute("m2", bean2.getFirstName());
				request.setAttribute("m3", bean2.getLastName());
				request.setAttribute("m4", bean2.getSession());
				
				rd.forward(request, response);
				}else {
					RequestDispatcher rd1 = request.getRequestDispatcher("Modify1.jsp");
					request.setAttribute("err", "Try again");
				    rd1.forward(request, response);
					
				}
			
	
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		
		
	}

}
