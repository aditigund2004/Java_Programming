import java.sql.*;
class ConnDemo
{
public static void main(String[] args)
{
try
{
Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/jcon","root","root");
String sql ="INSERT INTO jcon1(name,pwd,fullname,email)VALUES(?,?,?,?)";
PreparedStatement statement = con.prepareStatement(sql);
statement.setString(1,"Adi");
statement.setString(2,"@Adi_234");
statement.setString(3,"aditi gund");
statement.setString(4,"adi@gmail.com");
int rowsInserted = statement.executeUpdate();
if(rowsInserted > 0)
{

System.out.println("A new msdos user was inserted  successfully");
}
  con.close();
 }
catch(Exception e)
{
System.out.println(e);
}
}
}