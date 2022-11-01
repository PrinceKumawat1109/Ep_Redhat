package com.controller;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.model.Student;
import com.model.StudentManager;


public class AddData extends HttpServlet {
  private static final long serialVersionUID = 1L;
       
    
    
  protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
  {
    response.setContentType("text/html");
    PrintWriter pw = response.getWriter();
    try
    {
      Student S = new Student();
      StudentManager sm = new StudentManager();
      int id=Integer.parseInt(request.getParameter("ID"));
      String name = request.getParameter("name");
      String dept = request.getParameter("dept");
      S.setName(name);
      S.setId(id);
      S.setName(dept);
      String ack = sm.saveData(S);
      pw.print(ack);
    }
    catch(Exception e)
    {
      pw.print(e.getMessage());
    }
    RequestDispatcher rd =request.getRequestDispatcher("addnew.jsp");
    rd.include(request, response);
  }

  
  protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
  {
    
  }

}