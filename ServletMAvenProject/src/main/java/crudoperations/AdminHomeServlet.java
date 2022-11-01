package crudoperations;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet("/adminhome")
public class AdminHomeServlet extends HttpServlet {
	 public void service(HttpServletRequest request,HttpServletResponse response) throws ServletException,IOException
	  {
	      response.setContentType("text/html");
	      PrintWriter out=response.getWriter();
	      RequestDispatcher rd=request.getRequestDispatcher("adminhome.html");
	      rd.forward(request, response);
	  }
}
