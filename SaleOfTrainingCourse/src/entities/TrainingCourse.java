package entities;

public class TrainingCourse {
	
	private int idTrainingCourse;
	private String name;
	private String description;
	private int durationInDays;
	private boolean inPerson;
	private boolean remotely;
	private double unitaryPrice;
	private boolean isAvailable;
	
	/**
	 * @param idTrainingCourse
	 * @param name
	 * @param description
	 * @param durationInDays
	 * @param inPerson
	 * @param remotely
	 * @param unitaryPrice
	 * @param isAvailable
	 */
	public TrainingCourse(int idTrainingCourse, String name, String description, int durationInDays, boolean inPerson,
			boolean remotely, double unitaryPrice, boolean isAvailable) {
		super();
		this.idTrainingCourse = idTrainingCourse;
		this.name = name;
		this.description = description;
		this.durationInDays = durationInDays;
		this.inPerson = inPerson;
		this.remotely = remotely;
		this.unitaryPrice = unitaryPrice;
		this.isAvailable = isAvailable;
	}
	/**
	 * @return the idTrainingCourse
	 */
	public int getIdTrainingCourse() {
		return idTrainingCourse;
	}
	/**
	 * @param idTrainingCourse the idTrainingCourse to set
	 */
	public void setIdTrainingCourse(int idTrainingCourse) {
		this.idTrainingCourse = idTrainingCourse;
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}
	/**
	 * @param description the description to set
	 */
	public void setDescription(String description) {
		this.description = description;
	}
	/**
	 * @return the durationInDays
	 */
	public int getDurationInDays() {
		return durationInDays;
	}
	/**
	 * @param durationInDays the durationInDays to set
	 */
	public void setDurationInDays(int durationInDays) {
		this.durationInDays = durationInDays;
	}
	/**
	 * @return the inPerson
	 */
	public boolean isInPerson() {
		return inPerson;
	}
	/**
	 * @param inPerson the inPerson to set
	 */
	public void setInPerson(boolean inPerson) {
		this.inPerson = inPerson;
	}
	/**
	 * @return the remotely
	 */
	public boolean isRemotely() {
		return remotely;
	}
	/**
	 * @param remotely the remotely to set
	 */
	public void setRemotely(boolean remotely) {
		this.remotely = remotely;
	}
	/**
	 * @return the unitaryPrice
	 */
	public double getUnitaryPrice() {
		return unitaryPrice;
	}
	/**
	 * @param unitaryPrice the unitaryPrice to set
	 */
	public void setUnitaryPrice(double unitaryPrice) {
		this.unitaryPrice = unitaryPrice;
	}
	
	/**
	 * @return the isAvailable
	 */
	public boolean isAvailable() {
		return isAvailable;
	}
	/**
	 * @param isAvailable the isAvailable to set
	 */
	public void setAvailable(boolean isAvailable) {
		this.isAvailable = isAvailable;
	}
	
	@Override
	public String toString() {
		return    "id : " + idTrainingCourse + ", \n"
				+ "name : " + name + ", \n"
				+ "description : "+ description + ", \n"
				+ "durationInDays : " + durationInDays + ", \n"
				+ "inPerson : " + inPerson + ", \n"
				+ "remotely : "+ remotely + ", \n"
				+ "unitaryPrice : " + unitaryPrice + "\n \n";
	}
}
