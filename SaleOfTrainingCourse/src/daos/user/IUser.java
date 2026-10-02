package daos.user;

import java.sql.SQLException;
import java.util.List;

import entities.User;


public interface IUser {
	
	/**
	 * Function that allows saving the user's credentials to the database.
	 */
	public void saveCredentialsUser(String login, String password) throws SQLException ;
	
	/**
	 * Function that retrieves all user IDs and returns them in a list.
	 * 
	 * @return the list of the users
	 */
	public List<User> retrievingDatabaseCredentials() throws SQLException;
	
	/**
	 * Function that verifies whether the user actually exists in the database
	 * 
 	 * @param users
	 * @param login
	 * @param password
	 */
	public void CheckIfTheProvidedCredentialsAreInTheDatabase(List<User> users, String login, String password);
}
