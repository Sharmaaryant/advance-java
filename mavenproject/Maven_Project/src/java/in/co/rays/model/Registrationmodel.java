package in.co.rays.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import in.co.rays.bean.Registrationbean;

public class Registrationmodel {

	public  Integer nextpk() throws Exception {
		int pk = 0;
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mvcdb", "root", "Babu@1234");
		PreparedStatement ps = con.prepareStatement("select max(id) from user");
		ResultSet rs = ps.executeQuery();
		while (rs.next()) {
			pk = rs.getInt(1);
		}
		ps.close();
		con.close();
		return pk + 1;

	}

	public  void add(Registrationbean Bean) throws Exception {

		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/mvcdb", "root", "Babu@1234");

		PreparedStatement ps = conn.prepareStatement("INSERT INTO USER VALUE(?,?,?,?,?,?,?,?,?,?)");
		ps.setInt(1, nextpk());
		ps.setString(2, Bean.getUserid());
		ps.setString(3, Bean.getStd());
		ps.setString(4, Bean.getFname());
		ps.setString(5, Bean.getLname());
		ps.setString(6, Bean.getNumber());
		ps.setString(7, Bean.getDate());
		ps.setString(8, Bean.getGender());
		ps.setString(9, Bean.getPassword());
		ps.setString(10, Bean.getConformpassword());

		ps.executeUpdate();
		System.out.println("Inserted");
		conn.close();
		ps.close();
	}

	
		  public Registrationbean authenticate(String userid, String password) throws Exception{
	  
	  
	  Class.forName("com.mysql.cj.jdbc.Driver"); 
	  Connection conn =
	  DriverManager.getConnection("jdbc:mysql://localhost:3306/mvcdb","root",
	  "Babu@1234"); 
	  PreparedStatement ps =
	  conn.prepareStatement("select * from USER where userid = ? and password = ?"); 
	  ps.setString(1, userid); 
	  ps.setString(2, password);
	  
	  Registrationbean bean = null;
	  
	  ResultSet rs = ps.executeQuery();
	  
	  
	  while (rs.next()) {
	  
	  bean = new Registrationbean();
	  
	  bean.setUserid(rs.getString(1));
	  bean.setPassword(rs.getString(2));
	  bean.setFname(rs.getString(4));
	  bean.setLname(rs.getString(3));
	  bean.setStd(rs.getString(5));
	  bean.setNumber(rs.getString(6));
	  bean.setDate(rs.getString(7));
	  bean.setGender(rs.getString(8));
	  bean.setConformpassword(rs.getString(9));
	 
	  
	  }
	  
	  ps.close(); conn.close(); return bean;
	  
	  }
		  
		  public Registrationbean forgotpassword(String userid ) throws Exception{
			  
			  
			  Class.forName("com.mysql.cj.jdbc.Driver"); 
			  Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/mvcdb","root","Babu@1234"); 
			  PreparedStatement ps =conn.prepareStatement("select * from USER where userid = ?"); 
			  ps.setString(1, userid); 
			 
			
			  
			  Registrationbean bean = null;
			  
			  ResultSet rs = ps.executeQuery();
			  
			  
			  while (rs.next()) {
			  
			  bean = new Registrationbean();
			  
			  bean.setUserid(rs.getString(1));
			  bean.setPassword(rs.getString(9));
			  
			 
			  
			  }
			  
			  ps.close(); conn.close(); return bean;
			  
			  }
				
}
