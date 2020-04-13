package week_9;

public class TestEmployee {

	public static void main(String[] args) {
		
		Person person = new FTEmployee();
		person.speak();
		Person person2 = new Contract();
		person2.speak();
		Employee employee = new Contract();
		employee.speak();
		FTEmployee ftEmployee = new FTEmployee();
		ftEmployee.speak();
		Contract contract = new Contract();
		contract.speak();
		contract.benefits();
		contract.healthInsurance();
		
		//Person person3 = new Person(); //will not compile

	}

}
