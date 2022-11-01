package crudoperations;

import java.io.*;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.sql.*;
import demo.DBConnection;
@WebServlet("/deleteuserbyid")
public class DeleteUserByIdServlet extends HttpServlet {
   public void service(HttpServletRequest request,HttpServletResponse response) throws ServletException,IOException
    {
        response.setContentType("text/html");
        PrintWriter out=response.getWriter();
        try
        {
        Connection con=DBConnection.getConnection();
        PreparedStatement pstmt=con.prepareStatement("delete from useregistration where id=?");
        int id=Integer.parseInt(request.getQueryString());
        pstmt.setInt(1, id);
        int n=pstmt.executeUpdate();
        
        response.sendRedirect("deleteuser");
        
        }
        catch(Exception e)
        {
        out.println(e);  
        }
    }

}