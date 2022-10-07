package in;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import in.co.rays.bean.Registrationbean;
import in.co.rays.model.Registrationmodel;

@WebServlet(urlPatterns = "/count")
public class VisiterCount extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		ServletContext ctx = getServletContext();

		int count = (int)ctx.getAttribute("visitcount");
		
		try {
			if(count == 0) {
				 count = 1;
			 }else {
				count++;
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		ctx.setAttribute("visitcount", count);
		PrintWriter out = response.getWriter();
		out.println("<html><body>");
		out.println( " <h1>Visiter Count: "+count+" </h1>");
		out.println("</body></html>");
		
		 
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
