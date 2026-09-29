package entities;

public class Order {
	
	private int idOrder;
	private TrainingCourse trainingCourse;
	private int quantity;
	/**
	 * @param idOrder
	 * @param trainingCourse
	 * @param quantity
	 */
	public Order(int idOrder, TrainingCourse trainingCourse, int quantity) {
		super();
		this.idOrder = idOrder;
		this.trainingCourse = trainingCourse;
		this.quantity = quantity;
	}
	/**
	 * @return the idOrder
	 */
	public int getIdOrder() {
		return idOrder;
	}
	/**
	 * @param idOrder the idOrder to set
	 */
	public void setIdOrder(int idOrder) {
		this.idOrder = idOrder;
	}
	/**
	 * @return the trainingCourse
	 */
	public TrainingCourse getTrainingCourse() {
		return trainingCourse;
	}
	/**
	 * @param trainingCourse the trainingCourse to set
	 */
	public void setTrainingCourse(TrainingCourse trainingCourse) {
		this.trainingCourse = trainingCourse;
	}
	/**
	 * @return the quantity
	 */
	public int getQuantity() {
		return quantity;
	}
	/**
	 * @param quantity the quantity to set
	 */
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	@Override
	public String toString() {
		return "Order [idOrder=" + idOrder + ", trainingCourse=" + trainingCourse + ", quantity=" + quantity + "]";
	}
}
