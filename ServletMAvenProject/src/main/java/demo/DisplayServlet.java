package  demo;

import java.io.*;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet("/display")
public class DisplayServlet extends HttpServlet
{
	public void service(HttpServletRequest request,HttpServletResponse response) throws IOException
	{
			response.setContentType("text/html");
			PrintWriter out = response.getWriter();
			
			out.println("In Display Servlet<br><br>");
			
			String output = (String) request.getAttribute("output");
			out.println(output);
			
	}
}
