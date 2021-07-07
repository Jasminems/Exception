/*A Java Program to generate SQLException*/
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
public class Ex11 
{
	public static void main(String[] args) 
	{
		Connection connection = null;
		try 
		{
			String driverName = "oracle.jdbc.driver.OracleDriver";
			Class.forName(driverName);
			String serverName = "localhost";
			String serverPort = "1521";
			String sid = "mySchema";
			String url = "jdbc:oracle:thin:@" + serverName + ":" + serverPort + ":" + sid;
			String username = "username";
			String password = "password";
			connection = DriverManager.getConnection(url, username, password);
			System.out.println("Successfully Connected to the database!");
		} 
		catch (ClassNotFoundException e) 
		{
			System.out.println("Could not find the database driver " + e.getMessage());
		} 
		catch (SQLException e) 
		{
			while (e != null) 
			{
				String message = e.getMessage();
				int errorCode = e.getErrorCode();
				String sqlState = e.getSQLState();
				String driverName;
		try 
		{
			driverName = connection.getMetaData().getDriverName();
			if (driverName.equals("Oracle JDBC Driver") && errorCode == 123) 
			{
			}  
 
		} 
		catch (SQLException e1) 
		{
			System.out.println("Could not retrieve database metadata " + e1.getMessage());
		}
		e = e.getNextException();
			}
		}
 }
 }