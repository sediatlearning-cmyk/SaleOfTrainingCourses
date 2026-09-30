package daos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConfigDao {

	public static Connection getConnection() throws SQLException{
		try {
			Class.forName("org.mariadb.jdbc.Driver");
		}
		catch(ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		String url = "jdbc:mariadb://localhost:3306/";
		String login = "root";
		String password = "";
		
		return DriverManager.getConnection(url, login, password);
	}
	
}
