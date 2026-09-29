package entities;

public class Customer {
	private int id_customer;
	private String lastname;
	private String firstname;
	private String email;
	private String address;
	private String phoneNumber;
	
	/**
	 * @param id_customer
	 * @param lastname
	 * @param firstname
	 * @param email
	 * @param address
	 * @param phoneNumber
	 */
	public Customer(int id_customer, String lastname, String firstname, String email, String address,
			String phoneNumber) {
		super();
		this.id_customer = id_customer;
		this.lastname = lastname;
		this.firstname = firstname;
		this.email = email;
		this.address = address;
		this.phoneNumber = phoneNumber;
	}

	/**
	 * @return the id_customer
	 */
	public int getId_customer() {
		return id_customer;
	}

	/**
	 * @param id_customer the id_customer to set
	 */
	public void setId_customer(int id_customer) {
		this.id_customer = id_customer;
	}

	/**
	 * @return the lastname
	 */
	public String getLastname() {
		return lastname;
	}

	/**
	 * @param lastname the lastname to set
	 */
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	/**
	 * @return the firstname
	 */
	public String getFirstname() {
		return firstname;
	}

	/**
	 * @param firstname the firstname to set
	 */
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}

	/**
	 * @return the address
	 */
	public String getAddress() {
		return address;
	}

	/**
	 * @param address the address to set
	 */
	public void setAddress(String address) {
		this.address = address;
	}

	/**
	 * @return the phoneNumber
	 */
	public String getPhoneNumber() {
		return phoneNumber;
	}

	/**
	 * @param phoneNumber the phoneNumber to set
	 */
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	@Override
	public String toString() {
		return "Customer [id_customer=" + id_customer + ", lastname=" + lastname + ", firstname=" + firstname
				+ ", email=" + email + ", address=" + address + ", phoneNumber=" + phoneNumber + "]";
	}
}
