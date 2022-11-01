package  demo;

import java.io.*;

import javax.servlet.*;
import javax.servlet.http.*;

public class FirstServlet extends HttpServlet
{
	public void service(HttpServletRequest request,HttpServletResponse response) throws IOException
	{
			response.setContentType("text/html");
			PrintWriter out = response.getWriter();
			out.println("Welcome to Servlets");
			System.out.println("Welcome to Servlets");

	}
}
