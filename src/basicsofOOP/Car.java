package basicsofOOP;

import javax.print.attribute.standard.MediaSize.Engineering;

public class Car {
	
	//Variables == properties == state
	
	String module;
	String color;
	int engineSize;
	String madeBy;
	
	//Attributes == behavior
	
	public void accelerate(){
		System.out.println("Car is accelerating...");
	}
	
	public void stop(){
		System.out.println("Car is stopping...");
	}

	public static void main(String[] args) {
		
		//Create object
		Car honda = new Car();
		honda.module = "Civic";
		honda.color = "red";
		honda.engineSize = 2000;
		honda.madeBy = "Japanese";
		
		System.out.println("Honda module is "+ honda.module);
		System.out.println("Car color is "+ honda.color);
		System.out.println("Engine size is "+ honda.engineSize);
		System.out.println("The car is made by "+ honda.madeBy);
		
		honda.accelerate();
		honda.stop();
		

	}

}
