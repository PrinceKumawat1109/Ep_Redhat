package crudoperations;

import java.io.*;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.sql.*;
import demo.DBConnection;
@WebServlet("/viewusers")
public class ViewUsersServlet extends HttpServlet {
	 public void service(HttpServletRequest request,HttpServletResponse response) throws ServletException,IOException
	  {
	      response.setContentType("text/html");
	      PrintWriter out=response.getWriter();
	      try
	      {
	    	Connection con=DBConnection.getConnection();
	    	PreparedStatement pstmt=con.prepareStatement("select * from useregistration");
	    	ResultSet rs=pstmt.executeQuery();
	    	out.println("<h3>user details are</h3>");
	    	out.println("<table align='center' border='1'><tr>");
	    	out.println("<th>ID</th>");
	    	out.println("<th>Full Name</th>");
	    	out.println("<th>Gender</th>");
	    	out.println("<th>DOB</th>");
	    	out.println("<th>email</th>");
	    	out.println("<th>username</th>");
	    	out.println("<th>mobile No.</th>");
	    	out.println("<th>location</th></tr>");
	    	while(rs.next())
	    	{
	    		out.println("<tr>");
	    		out.println("<td>" +rs.getString(1) +"</td>");
	    		out.println("<td>" +rs.getString(2) +"</td>");
	    		out.println("<td>" +rs.getString(3) +"</td>");
	    		out.println("<td>" +rs.getString(4) +"</td>");
	    		out.println("<td>" +rs.getString(5) +"</td>");
	    		out.println("<td>" +rs.getString(6) +"</td>");
	    		out.println("<td>" +rs.getString(8) +"</td>");
	    		out.println("<td>" +rs.getString(9) +"</td>");
	    		out.println("</tr>");
	    	}
	    	out.println("</table>");
	      }
	      catch(Exception e)
	      {
	    	out.println(e);  
	      }
	  }

}
