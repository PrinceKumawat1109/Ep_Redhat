package crudoperations;

import java.sql.*;
import demo.DBConnection;
import java.io.*;
import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;


@WebServlet("/checkuser")
public class CheckUserLoginServlet extends HttpServlet {
	public void service(HttpServletRequest request,HttpServletResponse response) throws ServletException,IOException
	  {
		response.setContentType("text/html");
	      PrintWriter out=response.getWriter();
	      
	      String username=request.getParameter("uname");
	      String password=request.getParameter("pwd");
	      
	      try
	      {
	    	  Connection con=DBConnection.getConnection();
	    	  PreparedStatement pstmt=con.prepareStatement("select * from useregistration where username=? and password=?");
	    	  pstmt.setString(1, username);
	    	  pstmt.setString(2, password);
	    	  ResultSet rs=pstmt.executeQuery();
	    	  if(rs.next())
	    	  {
	    		  out.println("login succesfull");
	    		  HttpSession hp=request.getSession();
	              hp.setAttribute("username", username);
	              out.println(username);
	    		  RequestDispatcher rd=request.getRequestDispatcher("/userhome");
	    	      rd.include(request, response);
	    	  }
	    	  else
	    	  {
	    		out.println("login failed");
	    		RequestDispatcher rd=request.getRequestDispatcher("/userlogin.html");
	    		rd.forward(request, response);
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
