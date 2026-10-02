package business.menu;

import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;

import daos.trainingcourse.ITrainingCourse;
import daos.trainingcourse.TrainingCourseImpl;
import daos.user.IUser;
import daos.user.UserImpl;
import entities.TrainingCourse;
import utils.UserChoice;
import utils.UserConnection;

public class MenuSelectionImpl implements IMenuSelection{
	
	private static Scanner scanner = new Scanner(System.in);
	
	/**
	 * Function that builds the menu and handles each menu case.
	 */
	public void menuSelection() throws SQLException {
		ITrainingCourse trainingCourse = new TrainingCourseImpl();
		IUser user = new UserImpl();
		
		String [] menu = {
				"Afficher la liste des formations en fonction de leurs disponibilités.",
				"Afficher la liste des formations par un mot clé",
				"Afficher la liste des formations en présentiel",
				"Afficher la liste des formations en distanciel",
				"S'inscrire",
				"Se connecter"
		};
		
		int userChoice = -1;
		while (userChoice != 0) {
			userChoice = UserChoice.askTheUserToMakeAChoice(scanner, menu);
			switch(userChoice) {
			case 1:
				System.out.println("Affichage de toutes les formations disponibles");
				List<TrainingCourse> availableTrainingCourses = trainingCourse.findByIsAvailableField();
				System.out.println(availableTrainingCourses);
				break;
			case 2:
				String keyword= UserChoice.askTheUserToInputAKeyword(scanner);
				System.out.println("Affichage de toutes les formations par le mot clé");
				List<TrainingCourse> keyWordTrainingCourses = trainingCourse.findByKeyWord(keyword);
				System.out.println(keyWordTrainingCourses);
				break;
			case 3:
				System.out.println("Affichage de toutes les formations en présentiel");
				List<TrainingCourse> inPersonTrainingCourses = trainingCourse.findByInPerson();
				System.out.println(inPersonTrainingCourses);
				break;
			case 4:
				System.out.println("Affichage de toutes les formations en distanciel");
				List<TrainingCourse> remotelyTrainingCourses = trainingCourse.findByRemotely();
				System.out.println(remotelyTrainingCourses);
				break;
			case 5:
				System.out.println("Bonjour");
				String login = UserConnection.askTheUserToEnterHisLogin(scanner);
				String password = UserConnection.askTheUserToEnterHisPassword(scanner);
				user.saveCredentialsUser(login, password);
				break;
			case 6:
				System.out.println("Bonjour");
				System.out.println("Entrez vos identifiants de connexion :");
				login = UserConnection.askTheUserToEnterHisLogin(scanner);
				password = UserConnection.askTheUserToEnterHisPassword(scanner);
				
			}
		}
	}
}
