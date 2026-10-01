package daos.user;

import java.sql.SQLException;


public interface IUser {
	
	public void saveIdUser(String login, String password) throws SQLException ;
}
