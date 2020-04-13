package week_9;

public abstract class Person {
	
	//Abstract class cannot be final and private
	//Abstract class must have at least one abstract method
	//Abstract class cannot be instantiated directly
	//An abstract class can inherit another abstract class
	
	public abstract void speak();
	
	public void healthInsurance() {
		System.out.println("If the position is fulltime, you have health ins, if not no insurance");
	}

}
