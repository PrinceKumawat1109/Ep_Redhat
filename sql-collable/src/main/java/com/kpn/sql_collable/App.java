package com.kpn.sql_collable;
import java.sql.*;
public class App 
{
    public static void main( String[] args ) throws Exception
    {
//    	Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/ep","root","1109");
//        CallableStatement cs = con.prepareCall("{CALL getDetails(?)}");
//        cs.setInt(1,1002);
//		ResultSet rs = cs.executeQuery();
//		while(rs.next())
//		{
//			
//			System.out.println("Name:" + rs.getString(1));
//			System.out.println("Id:" + rs.getInt(2));
//			System.out.println("dept:" + rs.getString(3));
//		}
//		con.close();
    	String url = "jdbc:mysql://localhost:3306/ep";
    	String username = "root";
    	String password = "1109";
    	Connection con = DriverManager.getConnection(url,username,password);
    	CallableStatement stmt = con.prepareCall("{CALL getDetails()}");
    	ResultSet rs = stmt.executeQuery();
    	while(rs.next())
    	{
    	System.out.println(rs.getString(1) +"\t" +rs.getInt(2) +"\t"+rs.getString(3) +"\t");
    	}
    	con.close();
    }
}


//1.
//without argument:
//	String url = "jdbc:mysql://localhost:3306/ep";
//String username = "root";
//String password = "1109";
//Connection con = DriverManager.getConnection(url,username,password);
//CallableStatement stmt = con.prepareCall("{CALL getDetails()}");
//ResultSet rs = stmt.executeQuery();
//while(rs.next())
//{
//System.out.println(rs.getString(1) +"\t" +rs.getInt(2) +"\t"+rs.getString(3) +"\t");
//}
//con.close();
//}
//}

//2. with argument Insert:
//	String url = "jdbc:mysql://localhost:3306/ep";
//String username = "root";
//String password = "1109";
//Connection con = DriverManager.getConnection(url,username,password);
//String qry = "insert into student values(?,?,?)";
//stmt.setString(1, "Rahul");
//stmt.setInt(2, 2000030900);
//stmt.setString(3, "ece");
//stmt.execute();
//
//System.out.println( "Row Inserted...." );
//con.close();
//}
//
//}

//3. with argument update:
//	String url = "jdbc:mysql://localhost:3306/ep";
//String username = "root";
//String password = "1109";
//Connection con = DriverManager.getConnection(url,username,password);
//String qry = "update student set ID = ? where Name = 'Rahul'";
//PreparedStatement stmt = con.prepareStatement(qry);
//stmt.setInt(1, 100);
//
//stmt.executeUpdate();
//
//System.out.println( "Row Inserted...." );
//con.close();
//}
//
//}


//4. In-out:
//	cs.setInt(1,1100);
//cs.resgisterOutParameter(1,Types.INTEGER);
//cs.execute();
//int mark = cs.getInt(1);
//System.out.println("The Mark of Student who hold the ID 1100 is" + mark);
//con.close();