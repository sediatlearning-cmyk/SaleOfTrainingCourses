package daos.user;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class UserImpl implements IUser{

	String url = "jdbc:mariadb://localhost:3306/sale_of_training_course";

	@Override
	public void saveCredentialsUser(String login, String password) throws SQLException {
		String sql = "INSERT INTO sotc_user (us_login, us_password)VALUES (?, ?);";
		try(Connection connection = DriverManager.getConnection(url, login, password)){
			try(PreparedStatement preparedStatement = connection.prepareStatement(sql)){
				preparedStatement.setString(1, login);
				preparedStatement.setString(2, password);

				int rows = preparedStatement.executeUpdate();
				if(rows == 1) {
					System.out.println("Insertion réussie");
				}
			}
		}
		catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
