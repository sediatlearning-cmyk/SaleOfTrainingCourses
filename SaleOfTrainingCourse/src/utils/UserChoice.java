package utils;

import java.util.Scanner;

public class UserChoice {

	public static int askTheUserToMakeAChoice(Scanner scanner, String [] menu) {
		
		String menuStr = "\n------------------------------------- MENU -------------------------------------\n\n";

		menuStr += 0 + ": Quitter \n";
		
		for (int index = 0; index < menu.length; index++) {
			menuStr += index + 1 + ": " + menu[index] + "\n";
		}
		System.out.println(menuStr);
		System.out.println("--------------------------------------------------------------------------------");
		int userChoice = UserChoice.inputChoice(scanner, menuStr, 0, menu.length);
		return userChoice;
	}
	/**
	 * Fonction qui permet à l'utilisateur de saisir un entier entre une valeur mini et une valeur maxi
	 * @param menuStr
	 * @param minVal
	 * @param maxVal
	 * @return userInputChoice
	 */
	public static int inputChoice(Scanner scanner, String menuStr, int minVal, int maxVal) {
		int userInputChoice = 0;
		System.out.print("Faites votre choix :");
		String userInput = scanner.nextLine();
	    userInputChoice = Integer.parseInt(userInput);
	    if (userInputChoice < minVal || userInputChoice > maxVal) {
	        System.out.println("Votre saisie doit être comprise entre " + minVal + " et " + maxVal);
	    } 
		return userInputChoice;
	}
	
	public static String askTheUserToInputAKeyword(Scanner scanner) {
		System.out.print("Quel mot recherchez vous?");
		String keyWord = scanner.nextLine().toLowerCase();
		return keyWord;
	}
}
