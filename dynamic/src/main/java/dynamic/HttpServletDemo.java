package dynamic;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class HttpServletDemo extends HttpServlet{

  
  private static final long serialVersionUID = 1L;
    @Override
    public void doGet(HttpServletRequest req,HttpServletResponse res) throws ServletException ,IOException
    {
    res.setContentType("text/html");
      Date d =new Date();
      
      PrintWriter pw = res.getWriter();
      pw.print("<html>");
      pw.print("<head><title>HttpServlet Demo</title></head>");
      pw.print("<h2>Servlet created using HttpServlet class @" + d.toString() + "</h2>");
      pw.print("</body>");
      pw.print("</html");
    }
    
}