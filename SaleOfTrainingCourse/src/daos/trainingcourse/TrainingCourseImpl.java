package daos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import entities.TrainingCourse;

public class TrainingCourseImpl implements ITrainingCourse{


	/**
	 * Retrieves all training courses from the database that match the requested keyword.
	 *
	 * @return a list containing all training courses with this keyword
	 * @throws SQLException 
	 */
	@Override
	public List<TrainingCourse> findByKeyWord(String keyword) throws SQLException {
		List<TrainingCourse> trainingCoursesByKeyWord = new ArrayList<>();
		try(Connection connection = ConfigDao.getConnection()){
			String sql = "SELECT * FROM sotc_training_course WHERE tc_name LIKE ? OR tc_description LIKE ?;";
			try(PreparedStatement preparedStatement = connection.prepareStatement(sql)){
				preparedStatement.setString(1, "%" + keyword + "%");
				preparedStatement.setString(2, "%" + keyword + "%");
				try(ResultSet resultSet = preparedStatement.executeQuery()){

					while(resultSet.next()) {
						int resultSetIdTrainingCourse = resultSet.getInt(1);
						String resultSetName = resultSet.getString(2);
						String resultSetDescription = resultSet.getString(3);
						int resultSetDurationInDays = resultSet.getInt(4);
						boolean resultSetInPerson = resultSet.getBoolean(5);
						boolean resultSetRemotely = resultSet.getBoolean(6);
						double resultSetUnitaryPrice = resultSet.getDouble(7);
						boolean resultSetIsAVailable = resultSet.getBoolean(8);
						trainingCoursesByKeyWord.add(new TrainingCourse(resultSetIdTrainingCourse, resultSetName, resultSetDescription, resultSetDurationInDays, resultSetInPerson, resultSetRemotely, resultSetUnitaryPrice, resultSetIsAVailable));
					}
				}
			}
		}
		return trainingCoursesByKeyWord;
	}


	/**
	 * Retrieves all available training courses from the database.
	 *
	 * @return a list containing all available training courses
	 */
	@Override
	public List<TrainingCourse> findByIsAvailableField() {

		List<TrainingCourse> availableTrainingCourses = new ArrayList<>();

		String sql = "SELECT * FROM sotc_training_course HAVING tc_is_available;";

		try(Connection connection = ConfigDao.getConnection()){
			try(Statement statement = connection.createStatement()){
				try(ResultSet resultSet = statement.executeQuery(sql)){

					while(resultSet.next()) {

						int resultSetIdTrainingCourse = resultSet.getInt(1);
						String resultSetName = resultSet.getString(2);
						String resultSetDescription = resultSet.getString(3);
						int resultSetDurationInDays = resultSet.getInt(4);
						boolean resultSetInPerson = resultSet.getBoolean(5);
						boolean resultSetRemotely = resultSet.getBoolean(6);
						double resultSetUnitaryPrice = resultSet.getDouble(7);
						boolean resultSetIsAVailable = resultSet.getBoolean(8);
						availableTrainingCourses.add(new TrainingCourse(resultSetIdTrainingCourse, resultSetName, resultSetDescription, resultSetDurationInDays, resultSetInPerson, resultSetRemotely, resultSetUnitaryPrice, resultSetIsAVailable));
					}
				}
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return availableTrainingCourses;
	}


	/**
	 * Retrieves all in-person training courses from the database.
	 *
	 * @return a list containing all in-person training courses
	 */
	@Override
	public List<TrainingCourse> findByInPerson() {
		List<TrainingCourse> inPersonTrainingCourses = new ArrayList<>();

		String sql = "SELECT * FROM sotc_training_course HAVING tc_in_person;";

		try(Connection connection = ConfigDao.getConnection()){
			try(Statement statement = connection.createStatement()){
				try(ResultSet resultSet = statement.executeQuery(sql)){

					while(resultSet.next()) {
						int resultSetIdTrainingCourse = resultSet.getInt(1);
						String resultSetName = resultSet.getString(2);
						String resultSetDescription = resultSet.getString(3);
						int resultSetDurationInDays = resultSet.getInt(4);
						boolean resultSetInPerson = resultSet.getBoolean(5);
						boolean resultSetRemotely = resultSet.getBoolean(6);
						double resultSetUnitaryPrice = resultSet.getDouble(7);
						boolean resultSetIsAVailable = resultSet.getBoolean(8);
						inPersonTrainingCourses.add(new TrainingCourse(resultSetIdTrainingCourse, resultSetName, resultSetDescription, resultSetDurationInDays, resultSetInPerson, resultSetRemotely, resultSetUnitaryPrice, resultSetIsAVailable));
					}
				}
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return inPersonTrainingCourses;
	}


	/**
	 * Retrieves all remote training courses from the database.
	 *
	 * @return a list containing all remote training courses
	 */
	@Override
	public List<TrainingCourse> findByRemotely() {
		List<TrainingCourse> remotelyTrainingCourses = new ArrayList<>();

		String sql = "SELECT * FROM sotc_training_course HAVING tc_remotely;";

		try(Connection connection = ConfigDao.getConnection()){
			try(Statement statement = connection.createStatement()){
				try(ResultSet resultSet = statement.executeQuery(sql)){

					while(resultSet.next()) {
						int resultSetIdTrainingCourse = resultSet.getInt(1);
						String resultSetName = resultSet.getString(2);
						String resultSetDescription = resultSet.getString(3);
						int resultSetDurationInDays = resultSet.getInt(4);
						boolean resultSetInPerson = resultSet.getBoolean(5);
						boolean resultSetRemotely = resultSet.getBoolean(6);
						double resultSetUnitaryPrice = resultSet.getDouble(7);
						boolean resultSetIsAVailable = resultSet.getBoolean(8);
						remotelyTrainingCourses.add(new TrainingCourse(resultSetIdTrainingCourse, resultSetName, resultSetDescription, resultSetDurationInDays, resultSetInPerson, resultSetRemotely, resultSetUnitaryPrice, resultSetIsAVailable));
					}
				}
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return remotelyTrainingCourses;
	}


}
