package  demo;

import java.io.*;
import java.sql.DriverManager;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.sql.*;
@WebServlet("/DBconnection")
public class MYSQLDBconnection extends HttpServlet
{
	public void service(HttpServletRequest request,HttpServletResponse response) throws IOException
	{
			response.setContentType("text/html");
			PrintWriter out = response.getWriter();
			out.println("Servlet Program for Database Connection");
			try 
			{
				Connection con=null;
				Class.forName("com.mysql.cj.jdbc.Driver");
				out.println("Driver class Loaded");
				con=DriverManager.getConnection("jdbc:mysql://localhost:3306/epjdbc?useSSL=false","root","1109");
				out.println("Connection esblish successfully");
			}
			catch(Exception e) {
				out.println(e);
			}

	}
}
