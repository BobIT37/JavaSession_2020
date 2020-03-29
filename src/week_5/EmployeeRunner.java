package week_5;

public class EmployeeRunner {

	public static void main(String[] args) {
		
		// create an object
		Employee john = new Employee();
		john.setFirstName("John");
		john.setLastName("Jackson");
		john.setSSN("12345678");
		
		System.out.println("First name: "+ john.getFirstName());
		System.out.println("Last name: "+ john.getLastName());
		System.out.println("SSN : "+ john.getSSN());
		
		john.worker(15);
		
		System.out.println("**********************");
		Employee jim = new Employee("Jim", "Smith", "98765432");
		
		System.out.println("First Name: "+ jim.getFirstName());
		System.out.println("Last name: "+ jim.getLastName());
		System.out.println("SSN: "+ jim.getSSN());
		
		jim.worker(20);

	}

}
