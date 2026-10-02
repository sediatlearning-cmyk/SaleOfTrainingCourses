package utils;

import java.sql.SQLException;
import java.util.Scanner;

public class UserConnection {

	/**
	 * Function that prompts the user to enter their login
	 * @param scanner
	 * @return login 
	 */
	public static String askTheUserToEnterHisLogin(Scanner scanner) {
		System.out.print("Entrez votre login : ");
		String login = scanner.nextLine().toLowerCase();
		return login;
	}
	
	/**
	 * Function that prompts the user to enter their password.
	 * @param scanner
	 * @return password 
	 */
	public static String askTheUserToEnterHisPassword(Scanner scanner) {
		System.out.print("Entrez votre mot de passe : ");
		String password = scanner.nextLine().toLowerCase();
		return password;
	}
}
