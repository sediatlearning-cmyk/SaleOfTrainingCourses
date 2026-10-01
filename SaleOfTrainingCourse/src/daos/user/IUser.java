package daos.user;

import java.sql.SQLException;


public interface IUser {
	
	public void saveCredentialsUser(String login, String password) throws SQLException ;
}
