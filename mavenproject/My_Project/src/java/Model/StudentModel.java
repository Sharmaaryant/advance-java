package Model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;

import com.mysql.cj.xdevapi.PreparableStatement;

import Bean.StudentBean;


public class StudentModel {
	/* ResourceBundle rb = ResourceBundle.getBundle("com.rays.rb.app"); */
	public void add(StudentBean bean) throws Exception {
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/mvc", "root", "Babu@1234");

		
		PreparedStatement ps = conn.prepareStatement("insert into student values(?,?,?,?)");
		
		conn.setAutoCommit(false);//ye kyo
		
		ps.setInt(1, bean.getRollNo());
		ps.setString(2, bean.getFirstName());
		ps.setString(3, bean.getLastName());
		ps.setString(4, bean.getSession());
		
		ps.executeUpdate();
		
		conn.commit();
		System.out.println("Kam HO gaya");
		conn.close();
		ps.close();
	}
	public void update(StudentBean bean) throws Exception {
	
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/mvc", "root", "Babu@1234");

		
		PreparedStatement ps = conn.prepareStatement("update student set firstName = ?, lastName = ?, session = ? "
				+ "where rollNo =?");
		
		conn.setAutoCommit(false);//ye kyo
		ps.setInt(4, bean.getRollNo());
		ps.setString(1, bean.getFirstName());
		ps.setString(2, bean.getLastName());
		ps.setString(3, bean.getSession());
		ps.executeUpdate();
		conn.commit();
		System.out.println("Tera bhi ho gaya");
		conn.close();
		ps.close();
		
	}
	public void delete(StudentBean bean) throws Exception {
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/mvc", "root", "Babu@1234");

		
		PreparedStatement ps = conn.prepareStatement("delete from student where rollNo = ?");
		conn.setAutoCommit(false);
		
		ps.setInt(1, bean.getRollNo());
		ps.executeUpdate();
		conn.commit();
		System.out.println("delete kyo kiya");
		conn.close();
		ps.close();
	}
	
	public List<StudentBean> getby(StudentBean bean) throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/mvc", "root", "Babu@1234");

		
		PreparedStatement ps = conn.prepareStatement("select * from student where rollNo = ?");
		
		ps.setInt(1, bean.getRollNo());
		ResultSet rs = ps.executeQuery();
		ArrayList<StudentBean> list = new ArrayList<StudentBean>();
		while (rs.next()) {

			StudentBean bean1 = new StudentBean();

			bean1.setRollNo(rs.getInt(1));
			bean1.setFirstName(rs.getString(2));
			bean1.setLastName(rs.getString(3));
			bean1.setSession(rs.getString(4));

			list.add(bean1);
		}
		return list;

	}
	
	public List<StudentBean> search() throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/mvc", "root", "Babu@1234");

		conn.setAutoCommit(false);
		PreparedStatement ps = conn.prepareStatement("select * from student  ");
		ResultSet rs = ps.executeQuery();
		ArrayList<StudentBean> list = new ArrayList<StudentBean>();
		while (rs.next()) {

			StudentBean bean1 = new StudentBean();

			bean1.setRollNo(rs.getInt(1));
			bean1.setFirstName(rs.getString(2));

			bean1.setLastName(rs.getString(3));
			bean1.setSession(rs.getString(4));

			list.add(bean1);
		}
		return list;
	}

	 public StudentBean mode(int rollNo ) throws Exception{
		  
		 Class.forName("com.mysql.cj.jdbc.Driver");
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/mvc", "root", "Babu@1234");
		  
		 
		  PreparedStatement ps =conn.prepareStatement("select * from student where rollNo = ?"); 
		  ps.setInt(1, rollNo);
		 
		
		  
		  StudentBean bean = null;
		  
		  ResultSet rs = ps.executeQuery();
		  
		  
		  while (rs.next()) {
		  
		  bean = new StudentBean();
		  
		  bean.setRollNo(Integer.parseInt(rs.getString(1)));
		  bean.setFirstName(rs.getString(2));
		  bean.setLastName(rs.getString(3));
		  bean.setSession(rs.getString(4));
		  
		  
		 
		  
		  }
		  
		  ps.close(); conn.close(); return bean;
		  
		  }
	







}
