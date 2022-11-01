
package com.kpn.sql;
import java.sql.*;
public class App 
{
    public static void main( String[] args )throws Exception
    {
        String url = "jdbc:mysql://localhost:3306/ep";
        String username = "root";
        String psw = "1109";
        Connection con = DriverManager.getConnection(url,username,psw);
        Statement stmt=con.createStatement();  
        ResultSet rs=stmt.executeQuery("select * from table1");  
        while(rs.next()) 
        {
        System.out.println( "Name: " + rs.getString(1));
        System.out.println( "ID: " + rs.getInt(2));
          
        }
        con.close();
        System.out.println("Done....."); 
    }
}
//Creation

//package com.kartikeya.EP;
//import java.sql.*;
//public class App 
//{
//  public static void main( String[] args )throws Exception
//  {
//      String url = "jdbc:mysql://localhost:3306/ep";
//      String username = "root";
//      String psw = "root";
//      Connection con = DriverManager.getConnection(url,username,psw);
//      Statement stmt=con.createStatement();  
//      String sqlQry = "INSERT INTO enterprise VALUES(2000031251,'Harsha')";
//      stmt.executeUpdate(sqlQry);
//      con.close();
// System.out.println("DONE ...");
//      
//  }
//}
//
////Update
//
//package com.kartikeya.EP;
//import java.sql.*;
//public class App 
//{
//  public static void main( String[] args )throws Exception
//  {
//      String url = "jdbc:mysql://localhost:3306/ep";
//      String username = "root";
//      String psw = "root";
//      Connection con = DriverManager.getConnection(url,username,psw);
//      Statement stmt=con.createStatement();
//      String sqlQry = "UPDATE enterprise  SET NAME = 'Harryson' WHERE ROLL=2000031251";
//      stmt.executeUpdate(sqlQry);
//      con.close();
// System.out.println("DONE ...");
//      
//  }
//}
//
//
////Delete
//
//package com.kartikeya.EP;
//import java.sql.*;
//public class App 
//{
//  public static void main( String[] args )throws Exception
//  {
//      String url = "jdbc:mysql://localhost:3306/ep";
//      String username = "root";
//      String psw = "root";
//      Connection con = DriverManager.getConnection(url,username,psw);
//      Statement stmt=con.createStatement();
//      String sqlQry ="DELETE FROM ENTERPRISE WHERE ROLL=2000031251";      
//      stmt.executeUpdate(sqlQry);
//      con.close();
// System.out.println("DONE ...");
//      
//  }
//}
//
//
//
////Read
//
//package com.kartikeya.EP;
//import java.sql.*;
//public class App 
//{
//  public static void main( String[] args )throws Exception
//  {
//      String url = "jdbc:mysql://localhost:3306/ep";
//      String username = "root";
//      String psw = "root";
//      Connection con = DriverManager.getConnection(url,username,psw);
//      Statement stmt=con.createStatement();  
//      String sqlQry="SELECT * FROM enterprise where roll=2000030198";
//      ResultSet rs=stmt.executeQuery(sqlQry);
//      while(rs.next())
//      {
//        System.out.println(rs.getInt(1));
//        System.out.println(rs.getString(2));
//      }
//      con.close();
//      
//  }
//}