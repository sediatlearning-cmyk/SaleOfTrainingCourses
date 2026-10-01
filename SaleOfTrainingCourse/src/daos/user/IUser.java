package daos.user;

import entities.User;

public interface IUser {
	
	public User saveIdUser(String login, String password);
}
