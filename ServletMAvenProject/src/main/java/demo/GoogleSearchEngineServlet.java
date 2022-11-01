package demo;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
@WebServlet("/googlesearch")
public class GoogleSearchEngineServlet extends HttpServlet
{
  
  public void init()
  {
    System.out.println("Servlet is Initialized");
  }
  public void service(HttpServletRequest request,HttpServletResponse response) throws ServletException,IOException 
  {
    response.setContentType("text/html");
    PrintWriter out = response.getWriter();
    
    String keyword = request.getParameter("txt");
    response.sendRedirect("https://www.google.com/search?q="+keyword);
  }
  public void destroy()
  {
    System.out.println("Servlet is Destroyed");
  }
}