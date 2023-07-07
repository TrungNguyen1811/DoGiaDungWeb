
package Utility;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DB_Utility {
	public static Connection getJDBCConnection() {
		Connection connection = null;
		try {
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
			String user = "sa";
			String pass = "123456";
			String url = "jdbc:sqlserver://localhost:1433;databaseName=Ecom_test";	
			connection = DriverManager.getConnection(url, user, pass);
			System.out.println("Success!");
			
		} catch (ClassNotFoundException | SQLException ex) {
			ex.printStackTrace();
		}

		return connection;
	}
}
