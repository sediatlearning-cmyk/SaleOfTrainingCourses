package daos.trainingcourse;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import daos.ConfigDao;
import entities.TrainingCourse;

public class TrainingCourseImpl implements ITrainingCourse{

	
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


	@Override
	public List<TrainingCourse> findByIsAvailableField() {

		List<TrainingCourse> availableTrainingCourses = new ArrayList<>();

		String sql = "SELECT * FROM sotc_training_course HAVING tc_is_available;";

		try(Connection connection = ConfigDao.getConnection()){
			try(Statement statement = connection.createStatement()){
				try(ResultSet resultSet = statement.executeQuery(sql)){

					while(resultSet.next()) {
						availableTrainingCourses.add(
								new TrainingCourse(
								resultSet.getInt(1),
								resultSet.getString(2), 
								resultSet.getString(3), 
								resultSet.getInt(4), 
								resultSet.getBoolean(5), 
								resultSet.getBoolean(6), 
								resultSet.getDouble(7), 
								resultSet.getBoolean(8)
								));
					}
				}
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return availableTrainingCourses;
	}


	
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
