package Controler;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Bean.StudentBean;
import Model.StudentModel;


@WebServlet("/Modify2")
public class Modify2 extends HttpServlet {
	

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		StudentBean bean = new StudentBean();
		StudentModel model = new StudentModel();
		
		bean.setRollNo(Integer.parseInt(request.getParameter("rollNo")));
		bean.setFirstName(request.getParameter("firstName"));
		bean.setLastName(request.getParameter("lastName"));
		bean.setSession(request.getParameter("session"));
		
		String op = request.getParameter("operation");
		

		if (op.equals("modify")) {
			
			try {
				model.update(bean);
				RequestDispatcher rd = request.getRequestDispatcher("student.jsp");
				request.setAttribute("ok", "Student Updated Succesfully ");
				rd.forward(request, response);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	}else {
	}
	}

}
