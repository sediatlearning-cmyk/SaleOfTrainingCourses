package daos.user;

import java.sql.SQLException;
import java.util.List;

import entities.User;


public interface IUser {
	
	public void saveCredentialsUser(String login, String password) throws SQLException ;
	
	public List<User> retrievingDatabaseCredentials() throws SQLException;
	
	public void CheckIfTheProvidedCredentialsAreInTheDatabase(List<User> users, String login, String password);
}
