package Controler;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Bean.StudentBean;
import Model.StudentModel;

@WebServlet(urlPatterns = "/GetStudentCtrl")
public class GetStudentCtrl extends HttpServlet {
	
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}
	
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		StudentBean bean = new StudentBean();

		StudentModel model = new StudentModel();

		bean.setRollNo(Integer.parseInt(request.getParameter("rollNo")));

		List<StudentBean> list = new ArrayList<StudentBean>();

		try {
			list = model.getby(bean);

			RequestDispatcher rd = request.getRequestDispatcher("GetStudent.jsp");

			request.setAttribute("ok", list);

			rd.forward(request, response);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
