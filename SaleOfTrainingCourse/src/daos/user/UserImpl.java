package daos.user;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import daos.ConfigDao;
import entities.User;

public class UserImpl implements IUser{

	/**
	 * Function that allows saving the user's credentials to the database.
	 */
	@Override
	public void saveCredentialsUser(String login, String password) throws SQLException {
		String sql = "INSERT INTO sotc_user (us_login, us_password)VALUES (?, ?);";
		try(Connection connection = ConfigDao.getConnection()){
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
	/**
	 * Function that retrieves all user IDs and returns them in a list.
	 * 
	 * @return the list of the users
	 */
	public List<User> retrievingDatabaseCredentials() throws SQLException {
		List<User> users = new ArrayList<User>();
		String sql = "SELECT us_id_user, us_login, us_password FROM sotc_user;";
		try(Connection connection = ConfigDao.getConnection()){
			try(Statement statement = connection.createStatement()){
				try(ResultSet resultSet = statement.executeQuery(sql)){	
					while(resultSet.next()) {
						users.add(new User(
								resultSet.getInt(1), 
								resultSet.getString(2), 
								resultSet.getString(3)
								));
					}
				}
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return users;
	}
	
	/**
	 * Function that verifies whether the user actually exists in the database
	 * 
 	 * @param users
	 * @param login
	 * @param password
	 */
	@Override
	public void CheckIfTheProvidedCredentialsAreInTheDatabase(List<User> users, String login, String password) {
		//TODO To continue
		
		System.out.println("Vérification effectuée");
		System.out.println("Vous êtes connecté");	
	}
}
