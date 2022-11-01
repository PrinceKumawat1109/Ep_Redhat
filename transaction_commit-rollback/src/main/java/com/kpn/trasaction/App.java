package com.kpn.trasaction;
import java.sql.*;
import java.util.Scanner;
public class App 
{
	 public static void main(String[] args)throws Exception
	 {
	        Connection con = null;
	        try
	        {
	          con = DriverManager.getConnection("jdbc:mysql://localhost:3306/ep","root","1109");
	          Statement s =con.createStatement();
	          con.setAutoCommit(false);
	          Scanner scanner = new Scanner(System.in);
	          System.out.println("Enter the Account No to debit:");
	          int fromacc = scanner.nextInt();
	          System.out.println("Enter the Amount:");
	          int amt = scanner.nextInt();
	          System.out.println("Enter the Account No to cridit:");
	          int toacc = scanner.nextInt();
	          String qry = "select count(*) from bank where accno="+toacc;
	          ResultSet rs = s.executeQuery(qry);
	          int status = 0;
	          while(rs.next()) 
	          {
	            status = rs.getInt(1);
	          }
	          s.executeUpdate("update bank set Amount=(Amount-"+amt+") where accno="+fromacc);
	          if(status==1)
	          {
	            s.executeUpdate("update bank set Amount=(Amount+"+amt+") where accno="+toacc);
	          }
	          else
	          {
	            throw new Exception("Invalid Account Number.Transection roll back");
	          }
	          con.commit();
	          System.out.println("Transection Commited..");
	          con.close();
	        }
	        catch(Exception e)
	        {
	          con.rollback();
	          System.out.println(e.getMessage());
	        }
	 }
}