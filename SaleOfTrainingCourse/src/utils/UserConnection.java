package utils;

import java.util.Scanner;

public class UserConnection {

	public static String askTheUserToEnterHisLogin(Scanner scanner) {
		System.out.print("Entrez votre login : ");
		String login = scanner.nextLine().toLowerCase();
		return login;
	}
}
