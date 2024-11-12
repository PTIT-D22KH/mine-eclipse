package mine.config;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
public class DatabaseConfig {
	public static Connection getConnection()
	{
		// Initialize all the information regarding
		// Database Connection
		String dbURL = "jdbc:mysql://localhost:3306/test?allowPublicKeyRetrieval=true&useSSL=false";
		// Database name to access
		String dbUsername = "test_user";
		String dbPassword = "superSecretPassword!123";
		Connection con = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection(dbURL,dbUsername,dbPassword);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		
		return con;
	}
}
