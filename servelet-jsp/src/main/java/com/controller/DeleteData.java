package com.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.model.StudentManager;

public class DeleteData extends HttpServlet {
  private static final long serialVersionUID = 1L;
       
  protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
             response.setContentType("text/html");
             PrintWriter pw = response.getWriter();
             try {
               StudentManager SM =new StudentManager();
               int sid =Integer.parseInt(request.getParameter("sid"));
               
               String ack = SM .deleteData(sid);
               pw.print(ack);
             }
             catch(Exception e)
             {
               pw.print(e.getMessage());
             }
             RequestDispatcher rd = request.getRequestDispatcher("deletedata.jsp");
             rd.include(request, response);
           }

  protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
  
  }

}