package daos;

import java.util.List;

import entities.TrainingCourse;

public interface ITrainingCourse {

	public List<TrainingCourse> findByWord();
	
	public List<TrainingCourse> findByIsAvailableField();
	
	public List<TrainingCourse> findByInPerson();
	
	public List<TrainingCourse> findByRemotely();
}
