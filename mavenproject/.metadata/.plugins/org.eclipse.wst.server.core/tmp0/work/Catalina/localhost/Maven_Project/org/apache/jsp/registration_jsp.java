/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.55
 * Generated at: 2022-08-31 14:03:19 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.Locale;
import java.util.ResourceBundle;

public final class registration_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(2);
    _jspx_dependants.put("/footer.jsp", Long.valueOf(1660765258863L));
    _jspx_dependants.put("/header.jsp", Long.valueOf(1661746383708L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = new java.util.HashSet<>();
    _jspx_imports_classes.add("java.util.ResourceBundle");
    _jspx_imports_classes.add("java.util.Locale");
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    if (!javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      final java.lang.String _jspx_method = request.getMethod();
      if ("OPTIONS".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        return;
      }
      if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET, POST or HEAD. Jasper also permits OPTIONS");
        return;
      }
    }

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=ISO-8859-1");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<HR>\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"ISO-8859-1\">\r\n");
      out.write("<title>Insert title here</title>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("<center>\r\n");
      out.write("<img alt=\"\" src=\"file:///C:/workspace/mavenproject/Maven_Project/src/main/webapp/hhh.PNG\" width=\"100px\" height=\"100px\">\r\n");
      out.write("</center>\r\n");
      out.write("<HR>\r\n");
  String userid = (String) session.getAttribute("userid");
out.println("Welcome !!" + userid );
      out.write("\r\n");
      out.write("<HR>\r\n");
      out.write("<a href=\"Logout.jsp\">Logout</a>\r\n");
      out.write("<a href=\"\">Home</a>\r\n");
      out.write("<a href=\"\">Contact</a>\r\n");
      out.write("<a href=\"\">Change ID</a>\r\n");
      out.write("<a href=\"\">Change Password</a>\r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("</HR>\r\n");
      out.write("<html>\r\n");
      out.write("\r\n");
      out.write("<head>\r\n");
      out.write("\r\n");
      out.write("<style>\r\n");
      out.write("\r\n");
      out.write("table, th, td {\r\n");
      out.write("  border: 20px;\r\n");
      out.write("  border: 1px solid black;\r\n");
      out.write("  border-color: black;\r\n");
      out.write("  background-color:activeborder;\r\n");
      out.write("  width: 50%;\r\n");
      out.write("   margin-left: auto;\r\n");
      out.write("  margin-right: auto;\r\n");
      out.write(" }\r\n");
      out.write("  img {\r\n");
      out.write("  display: block;\r\n");
      out.write("  margin-left: auto;\r\n");
      out.write("  margin-right: auto;\r\n");
      out.write("  box-shadow: 20px; \r\n");
      out.write("  width:100px;\r\n");
      out.write("}\r\n");
      out.write("   h2 {\r\n");
      out.write("        width: 100%;\r\n");
      out.write("        padding: 10px 0;\r\n");
      out.write("        background-color: lightblue;}\r\n");
      out.write("        h3{\r\n");
      out.write("        width: 100%;\r\n");
      out.write("        padding: 10px 0;\r\n");
      out.write("        background-color: buttonface;</style>\r\n");
      out.write("<meta charset=\"ISO-8859-1\">\r\n");
      out.write("<title>My Profile</title>\r\n");
      out.write("</head><center>\r\n");
      out.write("\r\n");
      out.write("</center>\r\n");
      out.write("<body>\r\n");

String err1 = (String)request.getAttribute("err1");
String err2=  (String)request.getAttribute("err2");
String err3 = (String)request.getAttribute("err3");
String err4 = (String)request.getAttribute("err4");
String err5 = (String)request.getAttribute("err5");
String err6 = (String)request.getAttribute("err6");
String err7 = (String)request.getAttribute("err7");
String err8 = (String)request.getAttribute("err8");
String err9 = (String)request.getAttribute("err9");
String err10 = (String)request.getAttribute("err10");
String err11 = (String)request.getAttribute("err11");
      out.write("\r\n");
      out.write("<h2>\r\n");
      out.write("<marquee behavior=\"scroll\" direction=\"left\" scrollamount=\"20\">This Is My Project</marquee></h2>\r\n");
      out.write("<h3><marquee behavior=\"scroll\" direction=\"left\" scrollamount=\"10\">Fill Your Information For Your Admission</marquee>\r\n");
      out.write("</h3>\r\n");
      out.write("\r\n");
      out.write("	<ul><form  method=\"post\" action=\"registration\">\r\n");
      out.write("	<img src=\"file:///C:/workspace/mavenproject/Maven_Project/src/main/webapp/WEB-INF/hhh.PNG\" width=\"14%\" height=\"14%\"\r\n");
      out.write("	>\r\n");
      out.write("	<hr><p align=\"center\" style=\"font-size: 20px\"><u><strong><b>Sharma ji ki School</u></strong></b></p>\r\n");
      out.write("	<hr><p align=\"center\" style=\"font-size: 18px\"><u><strong><b>Registraion Form</u></strong></b></p>\r\n");
      out.write("	\r\n");
      out.write("		<table  align=\"center\" >\r\n");
      out.write("		\r\n");
      out.write("		\r\n");
      out.write("		<tr>\r\n");
      out.write("				<th><u><b><var> User ID :</var></b><u></th>\r\n");
      out.write("				<td align=\"center\"><input type=\"text\" name=\"Userid\"  value=\"\">			");

if(err1 != null){

      out.write('\r');
      out.write('\n');
      out.print(err1 );
      out.write('\r');
      out.write('\n');
} 
      out.write("\r\n");
      out.write("</td>\r\n");
      out.write("								\r\n");
      out.write("\r\n");
      out.write("			</tr>\r\n");
      out.write("\r\n");
      out.write("		<tr>\r\n");
      out.write("				<th><u><b><var>Admission for Class :</var></b></u></th>\r\n");
      out.write("				<td align=\"center\"><label for=\"std\" style=\"text-align: center;\"></label>\r\n");
      out.write("				<select name=\"std\">\r\n");
      out.write("				<option value=\"Option\"> ----------Select--------- </option>\r\n");
      out.write("				<option value=\"I\">(1st){First} </option>\r\n");
      out.write("				<option value=\"II\">(2nd){Second} </option>\r\n");
      out.write("				<option value=\"III\">(3rd){Third} </option>\r\n");
      out.write("				<option value=\"IV\">(4th){Fourth} </option>\r\n");
      out.write("				<option value=\"V\">(5th){Fifth} </option>\r\n");
      out.write("				<option value=\"VI\">(6th){Sixth}</option>\r\n");
      out.write("				<option value=\"VII\">(7th){Seventh} </option> \r\n");
      out.write("				<option value=\"VIII\">(8th){Eighth} </option> \r\n");
      out.write("				<option value=\"IX\">(9th){Ninth} </option>\r\n");
      out.write("				<option value=\"X\">(10th){Tenth} </option>\r\n");
      out.write("				</select>\r\n");
      out.write("				\r\n");
      out.write("</td>\r\n");

if(err2 != null){

      out.write('\r');
      out.write('\n');
      out.print(err2 );
      out.write('\r');
      out.write('\n');
} 
      out.write("\r\n");
      out.write("			</tr>\r\n");
      out.write("			<tr>\r\n");
      out.write("				<th><u><b><var>Student First Name:</var></b><u></th>\r\n");
      out.write("				<td align=\"center\"><input type=\"text\" name=\"fname\" placeholder=\"Tera phela naam likha\"value=\"\">");

if(err3 != null){

      out.write('\r');
      out.write('\n');
      out.print(err3 );
      out.write('\r');
      out.write('\n');
} 
      out.write("\r\n");
      out.write("</td>\r\n");
      out.write("			</tr>\r\n");
      out.write("		\r\n");
      out.write("			<tr>\r\n");
      out.write("				<th><u><b><var>Student Last Name:</var></b><u></th>\r\n");
      out.write("				<td align=\"center\"><input type=\"text\" name=\"lname\"  placeholder=\"Tera akhari naam likha\"value=\"\">");

if(err4 != null){

      out.write('\r');
      out.write('\n');
      out.print(err4 );
      out.write('\r');
      out.write('\n');
} 
      out.write("\r\n");
      out.write("</td>\r\n");
      out.write("			</tr>\r\n");
      out.write("			\r\n");
      out.write("			<tr>\r\n");
      out.write("				<th><u><b><var>Mobile No:</var></b></u></th>\r\n");
      out.write("				<td align=\"center\"><input type=\"number\" name=\"number\" placeholder=\"Tera phone Number de\" value=\"\">	 ");

if(err5 != null){

      out.write('\r');
      out.write('\n');
      out.print(err5 );
      out.write('\r');
      out.write('\n');
} 
      out.write(" \r\n");
      out.write("</td>\r\n");
      out.write("			</tr>\r\n");
      out.write("			<tr>\r\n");
      out.write("\r\n");
      out.write("                <th><u><b><var>Student's Date of Birth:</var></b></u></th>\r\n");
      out.write("\r\n");
      out.write("  <td align=\"center\"><input type=\"date\" name=\"date\" placeholder=\"keb paida hoa tha \">\r\n");

if(err6 != null){

      out.write('\r');
      out.write('\n');
      out.print(err6 );
      out.write('\r');
      out.write('\n');
} 
      out.write(" </td>\r\n");
      out.write("</tr>\r\n");
      out.write("			<tr>\r\n");
      out.write("				<th><b><u><u><var>Gender:</var><u></u></b></th>\r\n");
      out.write("				<td align=\"center\"><label for=\"gender\" style=\"text-align: center;\"></label>\r\n");
      out.write("						<input type=\"radio\" name=\"gender\" value=\" male\" selected>Male\r\n");
      out.write("						<input type=\"radio\" name =\"gender\"value=\"female\" selected>Female\r\n");
      out.write("						<input type=\"radio\" name =\"gender\"value =\"Custom\" selected>Others		 \r\n");

if(err7 != null){

      out.write('\r');
      out.write('\n');
      out.print(err7 );
      out.write('\r');
      out.write('\n');
} 
      out.write(" </td>\r\n");
      out.write("<tr>\r\n");
      out.write("			<th><u><b><var>Password:</var></b></u></th>\r\n");
      out.write("\r\n");
      out.write("  <td align=\"center\"><input type=\"password\" name=\"password\" placeholder=\" password \">\r\n");

if(err8 != null){

      out.write('\r');
      out.write('\n');
      out.print(err8 );
      out.write('\r');
      out.write('\n');
} 
      out.write('\r');
      out.write('\n');

if(err11 != null){

      out.write('\r');
      out.write('\n');
      out.print(err11 );
      out.write('\r');
      out.write('\n');
} 
      out.write("  </td>\r\n");
      out.write("</tr>\r\n");
      out.write("<tr>\r\n");
      out.write("<th><u><b><var>conformpassword:</var></b></u></th>\r\n");
      out.write("\r\n");
      out.write("  <td align=\"center\"><input type=\"password\" name=\"conformpassword\" placeholder=\"conform password \"> \r\n");

if(err9 != null){

      out.write('\r');
      out.write('\n');
      out.print(err9 );
      out.write('\r');
      out.write('\n');
} 
      out.write('\r');
      out.write('\n');

if(err11 != null){

      out.write('\r');
      out.write('\n');
      out.print(err11 );
      out.write('\r');
      out.write('\n');
} 
      out.write(" \r\n");
      out.write(" </td>\r\n");
      out.write("</tr>\r\n");
      out.write("			</table>\r\n");
      out.write("			<table align=\"center\" >\r\n");
      out.write("			<tr><td align=\"center\"><strong>\r\n");
      out.write("				<input  \r\n");
      out.write("				    type=\"submit\" name=\"Login\" value=\"Log In\"><input\r\n");
      out.write("				    \r\n");
      out.write("					type=\"submit\" name=\"Cancel\" value=\"Cancel\"></strong></td>\r\n");
      out.write("\r\n");
      out.write("			</tr>\r\n");
      out.write("		<center>");

if(err10 != null){

      out.write('\r');
      out.write('\n');
      out.print(err10 );
      out.write('\r');
      out.write('\n');
} 
      out.write("	</center>\r\n");
      out.write("		</table>\r\n");
      out.write("	\r\n");
      out.write("	</form></ul>\r\n");
      out.write("</body>\r\n");
      out.write("<HR>\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"ISO-8859-1\">\r\n");
      out.write("<title>Insert title here</title>\r\n");
      out.write("\r\n");
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("<meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\r\n");
      out.write("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\r\n");
      out.write("<title>Document</title>\r\n");
      out.write("<!-- Latest compiled and minified CSS -->\r\n");
      out.write("<link rel=\"stylesheet\"\r\n");
      out.write("	href=\"https://stackpath.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css\"\r\n");
      out.write("	integrity=\"sha384-HSMxcRTRxnN+Bdg0JdbxYKrThecOKuH5zCYotlSAcp1+c8xmyTe9GYg1l9a69psu\"\r\n");
      out.write("	crossorigin=\"anonymous\">\r\n");
      out.write("\r\n");
      out.write("<!-- Optional theme -->\r\n");
      out.write("<link rel=\"stylesheet\"\r\n");
      out.write("	href=\"https://stackpath.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap-theme.min.css\"\r\n");
      out.write("	integrity=\"sha384-6pzBo3FDv/PJ8r2KRkGHifhEocL+1X2rVCTTkUfGk7/0pbek5mMa1upzvWbrUbOZ\"\r\n");
      out.write("	crossorigin=\"anonymous\">\r\n");
      out.write("\r\n");
      out.write("<!-- Latest compiled and minified JavaScript -->\r\n");
      out.write("<script\r\n");
      out.write("	src=\"https://stackpath.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js\"\r\n");
      out.write("	integrity=\"sha384-aJ21OjlMXNL5UyIl/XNwTMqvzeRMZH2w8c5cRVpzpU8Y5bApTppSuUkhZXN0VxHd\"\r\n");
      out.write("	crossorigin=\"anonymous\"></script>\r\n");
      out.write("\r\n");
      out.write("<!-- Bootstrap -->\r\n");
      out.write("<link rel=\"stylesheet\"\r\n");
      out.write("	href=\"https://stackpath.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css\"\r\n");
      out.write("	integrity=\"sha384-HSMxcRTRxnN+Bdg0JdbxYKrThecOKuH5zCYotlSAcp1+c8xmyTe9GYg1l9a69psu\"\r\n");
      out.write("	crossorigin=\"anonymous\">\r\n");
      out.write("\r\n");
      out.write("<!-- HTML5 shim and Respond.js for IE8 support of HTML5 elements and media queries -->\r\n");
      out.write("<!-- WARNING: Respond.js doesn't work if you view the page via file:// -->\r\n");
      out.write("<!--[if lt IE 9]>\r\n");
      out.write("      <script src=\"https://oss.maxcdn.com/html5shiv/3.7.3/html5shiv.min.js\"></script>\r\n");
      out.write("      <script src=\"https://oss.maxcdn.com/respond/1.4.2/respond.min.js\"></script>\r\n");
      out.write("    <![endif]-->\r\n");
      out.write("<!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->\r\n");
      out.write("<script src=\"https://code.jquery.com/jquery-1.12.4.min.js\"\r\n");
      out.write("	integrity=\"sha384-nvAa0+6Qg9clwYCGGPpDQLVpLNn0fRaROjHqs13t4Ggj3Ez50XnGQqc/r8MhnRDZ\"\r\n");
      out.write("	crossorigin=\"anonymous\"></script>\r\n");
      out.write("<!-- Include all compiled plugins (below), or include individual files as needed -->\r\n");
      out.write("<script\r\n");
      out.write("	src=\"https://stackpath.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js\"\r\n");
      out.write("	integrity=\"sha384-aJ21OjlMXNL5UyIl/XNwTMqvzeRMZH2w8c5cRVpzpU8Y5bApTppSuUkhZXN0VxHd\"\r\n");
      out.write("	crossorigin=\"anonymous\"></script>\r\n");
      out.write("\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<body>\r\n");
      out.write("	\r\n");
      out.write("\r\n");
      out.write("	<center>\r\n");
      out.write("	<div class=\"container-fluid\">\r\n");
      out.write("		<nav class=\"navbar navbar-inverse navbar-fixed-bottom\">\r\n");
      out.write("			\r\n");
      out.write("		\r\n");
      out.write("			\r\n");
      out.write("					<a class=\"navbar-brand\" href=\"\" >Sharma Ji Ki School</a>\r\n");
      out.write("\r\n");
      out.write("</nav>\r\n");
      out.write("			</div>\r\n");
      out.write("</center>\r\n");
      out.write("		\r\n");
      out.write("\r\n");
      out.write("	\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
      out.write("</HR> \r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
