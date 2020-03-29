package week_5;

public class ConstructorConcept1 {
	
	//constructor is a special method that is used to initialize objects
	//The constructor is called when an object of a class is created
	//It can be used to set initial values of object attributes
	//Const name must be same with class name
	
	int x;
	
	//regular constructor
	public ConstructorConcept1(){
		x = 5;
	}
	
	public static void main(String[] args) {
		
		ConstructorConcept1 cc = new ConstructorConcept1();
		
		System.out.println(cc.x);

	}
}
