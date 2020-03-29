package week_6;

public class Car extends Vehicle{
	
	
	//Const
	public Car() {
		
		System.out.println("Car ---- const");
	}
	
	public void start() {
		System.out.println("Car ---- start");
	}
	
	public void stop() {
		System.out.println("Car --- stop");
	}
	
	public String refuel() {
		return "Car -- refuel -- return type";
	}
	
	public static void numOfPeople() {
		System.out.println("Car --- static --- meth");
		
	}

}
