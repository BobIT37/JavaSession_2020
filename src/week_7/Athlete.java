package week_7;

public class Athlete {
	
	//All athletes run
	//All athletes jump
	
	String name;
	int age;
	
	//default const
	public Athlete() {
		
	}
	
	//parameterized const
	public Athlete(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public void game() {
		System.out.println("Athlete is playing...");
	}
	
	public void run() {
		System.out.println("Athlete is running...");
	}
	
	
		

}
