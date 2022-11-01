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

public class UpdateData extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter pw = response.getWriter();
		try
		{
			Student B=new Student();
			StudentManager BM=new StudentManager();
			
			
			String name = request.getParameter("btitle");
			int id = Integer.parseInt(request.getParameter("id"));
			String dept = request.getParameter("btitle");
			B.setName(name);
			B.setId(id);
			B.setDept(dept);
			String ack = BM.updateData(B);
			pw.print(ack);
		}
		catch(Exception e)
		{
			pw.print(e.getMessage());
		}
		RequestDispatcher rd = request.getRequestDispatcher("updatedata.jsp");
		rd.include(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

}
