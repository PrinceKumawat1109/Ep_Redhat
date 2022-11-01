package servlet;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class BookManager
{
  String url = "jdbc:mysql://localhost:3306/ep";
  String dbuser ="root";
  String dbpwd = "1109";


  Connection con =null;
  PreparedStatement ps =null;
  
  public List<Book> getDetails() throws Exception
  {
    con = DriverManager.getConnection(url,dbuser,dbpwd);
    ps= con.prepareStatement("select * from store");
    ResultSet rs= ps.executeQuery();
    List<Book> L =new ArrayList<Book>();
  while(rs.next())
  {
    Book B =new Book();
    B.setBookid(rs.getInt(1));
    B.setTitle(rs.getString(2));
    B.setPrice(rs.getDouble(3));
    
    L.add(B);
  }
  return L;
}
}