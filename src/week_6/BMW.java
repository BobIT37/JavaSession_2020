package week_6;

public class BMW extends Car{
	
	public BMW() {
		super.start();
		System.out.println("BMW const");
	}
	
	//Override
	@Override
	public void start() {
		System.out.println("Car ---- start");
		System.out.println("Car starting override");
	}
	
	public void theftSafety() {
		System.out.println("BMW -- theftsafety");
	}
	
	public int personNum() {
		int i = 5;
		return i;
	}
	

}
