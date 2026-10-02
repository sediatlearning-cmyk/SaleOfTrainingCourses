package daos.trainingcourse;

import java.sql.SQLException;
import java.util.List;

import entities.TrainingCourse;

public interface ITrainingCourse {

	/**
	 * Retrieves all training courses from the database that match the requested keyword.
	 *
	 * @return a list containing all training courses with this keyword
	 * @throws SQLException 
	 */
	public List<TrainingCourse> findByKeyWord(String keyword) throws SQLException;
	
	/**
	 * Retrieves all available training courses from the database.
	 *
	 * @return a list containing all available training courses
	 */
	public List<TrainingCourse> findByIsAvailableField();
	
	/**
	 * Retrieves all in-person training courses from the database.
	 *
	 * @return a list containing all in-person training courses
	 */
	public List<TrainingCourse> findByInPerson();
	
	/**
	 * Retrieves all remote training courses from the database.
	 *
	 * @return a list containing all remote training courses
	 */
	public List<TrainingCourse> findByRemotely();
}
