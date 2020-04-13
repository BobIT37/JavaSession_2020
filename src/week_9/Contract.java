package week_9;

public class Contract extends Employee{

	@Override
	public void speak() {
		System.out.println("The position is contract");
		
	}
	
	public void benefits() {
		System.out.println("Salary is better but benefits are less in contract");
	}
	
	

}
