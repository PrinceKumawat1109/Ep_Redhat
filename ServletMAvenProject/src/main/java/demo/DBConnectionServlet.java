package demo;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.sql.*;

public class DBConnectionServlet extends HttpServlet 
{
	public void service(HttpServletRequest request,HttpServletResponse response)throws IOException,ServletException
	{
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		ServletConfig sconfig = getServletConfig();
		ServletContext scontext = getServletContext();
		
		String driverclass=scontext.getInitParameter("driverclass");
				String url=scontext.getInitParameter("url");
				String uname=sconfig.getInitParameter("username");
				String pwd=sconfig.getInitParameter("password");
		
				try
				{
				Connection con = null;
				out.println("Driver class loaded");
				
				con=DriverManager.getConnection(url,uname,pwd);
				out.println("Connection Established");
				
				con.close();
				}
				catch(Exception e)
				{
				  out.println(e);
				}
				
	}
	
}
	