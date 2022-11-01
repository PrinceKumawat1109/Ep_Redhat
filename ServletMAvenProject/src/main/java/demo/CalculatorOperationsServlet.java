package demo;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.*;

@WebServlet("/calculator")
public class CalculatorOperationsServlet extends HttpServlet
{
  public void service(HttpServletRequest request,HttpServletResponse response) throws IOException,ServletException
  {
    response.setContentType("text/html");
    PrintWriter out = response.getWriter();
   
    out.println("<b>Calculator Application using Servlets</b><br><br>");
    
    int v1 = Integer.parseInt(request.getParameter("v1"));
    int v2 = Integer.parseInt(request.getParameter("v2"));
    String operation = request.getParameter("operation");
    int result=0;
    
    switch(operation)
    {
       case "add":
    	   result=v1+v2;
         out.println(result);
         break;
       case "sub":
    	   result=v1-v2;
         out.println(result);
         break;
       case "mul":
    	   result=v1*v2;
         out.println(result);
         break;
       case "div":
    	   result=v1/v2;
         out.println(result);
         break;
       default: 
         out.println("Select any Operation :)");
    }
    RequestDispatcher rd=request.getRequestDispatcher("/display");
    request.setAttribute("output",Integer.toString(result));
    rd.include(request, response);
  }
}