package daos;

import java.sql.SQLException;
import java.util.List;

import entities.TrainingCourse;

public interface ITrainingCourse {

	public List<TrainingCourse> findByKeyWord(String keyword) throws SQLException;
	
	public List<TrainingCourse> findByIsAvailableField();
	
	public List<TrainingCourse> findByInPerson();
	
	public List<TrainingCourse> findByRemotely();
}
