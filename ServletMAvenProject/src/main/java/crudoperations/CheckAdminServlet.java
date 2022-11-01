package crudoperations;

import java.io.*;
import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.sql.*;
import demo.DBConnection;

@WebServlet("/adminlogin")
public class CheckAdminServlet extends HttpServlet
{
  public void service(HttpServletRequest request,HttpServletResponse response) throws ServletException,IOException
  {
      response.setContentType("text/html");
      PrintWriter out=response.getWriter();
      
      String adminId=request.getParameter("aid");
      String password=request.getParameter("apwd");
      
      try
      {
    	  Connection con=DBConnection.getConnection();
    	  PreparedStatement pstmt=con.prepareStatement("select * from admin where adminid=? and password=?");
    	  pstmt.setString(1, adminId);
    	  pstmt.setString(2, password);
    	  ResultSet rs=pstmt.executeQuery();
    	  if(rs.next())
    	  {
    		  out.println("login succesfull");
    		  RequestDispatcher rd=request.getRequestDispatcher("/adminhome");
    	      rd.include(request, response);
    	  }
    	  else
    	  {
    		out.println("login failed");  
    	  }
    	  pstmt.close();
    	  con.close();
      }
      catch(Exception e)
      {
    	  out.println(e);
      }
     
  }
}