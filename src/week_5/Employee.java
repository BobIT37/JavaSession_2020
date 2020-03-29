package week_5;

public class Employee {
	
	//create variable
	
	private String firstName;
	private String lastName;
	private String SSN;
	
	//Constructor not params
	public Employee(){
		System.out.println("Employee class first const");
	}
	
	// Const 2
	public Employee(String firstName, String lastName, String SSN){
		System.out.println("3 params const");
		this.firstName = firstName;
		this.lastName = lastName;
		this.SSN = SSN;
	}
	
	
	//methods
	public void worker(int hourlyRate){
		System.out.println(firstName+ " "+ lastName+ " is getting hourly "+ hourlyRate);
	}

	
	//getter and setter methods
		// in the set method, we set information
		// get method is used to get information from set method
	
	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getSSN() {
		return SSN;
	}

	public void setSSN(String sSN) {
		SSN = sSN;
	}
	
	
	
	
	


}
