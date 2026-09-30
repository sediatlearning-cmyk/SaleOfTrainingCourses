package daos;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import entities.TrainingCourse;

public class TrainingCourseImpl implements ITrainingCourse{

	@Override
	public List<TrainingCourse> findByWord() {
		// TODO Auto-generated method stub
		return null;
	}

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

	@Override
	public List<TrainingCourse> findByInPerson() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<TrainingCourse> findByRemotely() {
		// TODO Auto-generated method stub
		return null;
	}
	

}
