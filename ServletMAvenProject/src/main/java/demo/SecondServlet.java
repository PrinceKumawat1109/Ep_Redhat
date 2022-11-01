package demo;

import java.io.*;

import javax.servlet.*;
import javax.servlet.http.*;

public class SecondServlet extends HttpServlet
{
  public void service(HttpServletRequest request,HttpServletResponse response) throws ServletException,IOException
  {
      response.setContentType("text/html");
      PrintWriter out=response.getWriter();
      out.println("Bye to Servlets");
      System.out.println("Bye to Servlets");  
  }
}