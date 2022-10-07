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


@WebServlet("/StudentCtrl")
public class StudentCtrl extends HttpServlet {


	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		
		StudentBean bean = new StudentBean();
		StudentModel model = new StudentModel();
		
		bean.setRollNo(Integer.parseInt(request.getParameter("rollNo")));
		bean.setFirstName(request.getParameter("firstName"));
		bean.setLastName(request.getParameter("lastName"));
		bean.setSession(request.getParameter("session"));
		
		String op = request.getParameter("operation");
		
		if (op.equals("add")) {
			
			try {
				model.add(bean);
				RequestDispatcher rd = request.getRequestDispatcher("student.jsp");
				request.setAttribute("ok", "Student Added Succesfully ");
				rd.forward(request, response);
				response.sendRedirect("StudentCtrl");
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
		}else {/*if (op.equals("modify")) {
			
			try {
				model.update(bean);
				RequestDispatcher rd = request.getRequestDispatcher("student.jsp");
				request.setAttribute("ok", "Student Updated Succesfully ");
				rd.forward(request, response);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}*/
			
			/*
			 * }else if (op.equals("delete")) {
			 * 
			 * try { model.delete(bean); RequestDispatcher rd =
			 * request.getRequestDispatcher("student.jsp"); request.setAttribute("ok",
			 * "Student Deleted Succesfully "); rd.forward(request, response); } catch
			 * (Exception e) { // TODO Auto-generated catch block e.printStackTrace(); }
			 */	}
		    }
            }
