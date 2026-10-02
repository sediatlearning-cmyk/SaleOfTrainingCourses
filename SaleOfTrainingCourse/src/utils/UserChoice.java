package utils;

import java.util.Scanner;

public class UserChoice {

	/**
	 * Function that displays the constructed menu with numbers preceding each line and returns the user's choice.
	 * 	 
	 * @param scanner
	 * @param menuStr
	 * @return userChoice
	 */
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
	 * Function that allows the user to enter an integer between a minimum and a maximum value
	 * 
	 * @param scanner
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
	/**
	 * Feature that allows the user to enter a keyword
	 * 
	 * @param scanner
	 * @return keyword
	 */
	public static String askTheUserToInputAKeyword(Scanner scanner) {
		System.out.print("Quel mot recherchez vous?");
		String keyWord = scanner.nextLine().toLowerCase();
		return keyWord;
	}
}
