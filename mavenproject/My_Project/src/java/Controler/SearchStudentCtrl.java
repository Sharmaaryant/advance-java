package Controler;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Bean.StudentBean;
import Model.StudentModel;

@WebServlet(urlPatterns = "/SearchStudentCtrl")
public class SearchStudentCtrl extends HttpServlet {
	
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		StudentBean bean = new StudentBean();

		StudentModel model = new StudentModel();

		try {
			List<StudentBean> list = model.search();

			RequestDispatcher rd = request.getRequestDispatcher("SearchStudent.jsp");

			request.setAttribute("list", list);

			rd.forward(request, response);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		StudentBean bean = new StudentBean();

		StudentModel model = new StudentModel();

		try {
			List<StudentBean> list = model.search();

			RequestDispatcher rd = request.getRequestDispatcher("SearchStudent.jsp");

			request.setAttribute("list", list);

			rd.forward(request, response);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
