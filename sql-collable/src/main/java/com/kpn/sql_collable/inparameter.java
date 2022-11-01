package com.kpn.sql_collable;
import java.util.*;
import java.sql.*;
public class inparameter
{
  public static void main(String args[])
  {
    Scanner sr=new Scanner(System.in);
    try
    {
      Class.forName("com.mysql.cj.jdbc.Driver");
      Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/ep?useSSL=false","root","1109");
      CallableStatement cs=conn.prepareCall("{CALL getdata(?,?,?)}");
      
      cs.setString(1, "muni");
      
      
      cs.setInt(2, 30911);
      cs.setString(3, "csit");
      
      boolean flag=cs.execute();
      if(!flag)
      {
        System.out.println("Inserted Successfully......!");
      }
      else
      {
        System.out.println("Error Occrued");
      }
    }
    catch(Exception e)
    {
      System.out.println(e);
    }
  }
}