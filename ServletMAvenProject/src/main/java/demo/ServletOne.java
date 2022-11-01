package demo;

import java.io.*;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.sql.*;


public class ServletOne extends HttpServlet
{
  public void service(HttpServletRequest request,HttpServletResponse response) throws ServletException,IOException
  {
      response.setContentType("text/html");
      PrintWriter out=response.getWriter();
      
      ServletConfig sconf=getServletConfig();
      ServletContext scont=getServletContext();
      out.print(sconf.getInitParameter("uname"));
      out.print(sconf.getInitParameter("pwd"));
      out.print(scont.getInitParameter("id"));
      out.print(scont.getInitParameter("name"));
  }
}