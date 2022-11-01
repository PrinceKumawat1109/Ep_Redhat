package demo;

import java.io.*;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.sql.*;

@WebServlet("/search") // this is enough to configure servlet , no need to set in web.xml
public class SearchEngineServlet extends HttpServlet
{
  public void service(HttpServletRequest request,HttpServletResponse response) throws ServletException,IOException
  {
      response.setContentType("text/html");
      PrintWriter out=response.getWriter();
      
      String text = request.getParameter("text");
      
      try
      {
        Connection con =DBConnection.getConnection();
        
        
        PreparedStatement pstmt = con.prepareStatement(" select * from product where name like ?  ")  ;
        
        pstmt.setString(1,"%"+text+"%");
        
        ResultSet rs = pstmt.executeQuery();
        
        out.println("Product Names\n");
        
        while(rs.next())
        {
          out.println(rs.getString(2)+"<br>");
        }
      }
      catch(Exception e)
      {
        out.println(e);
      }
  }
}