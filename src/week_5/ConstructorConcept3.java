package week_5;

public class ConstructorConcept3 {
	
	int x;
	
	//Parameterized constructor
	
	public ConstructorConcept3(int y){
		x = y;
	}

	public static void main(String[] args) {
		
		ConstructorConcept3 cc = new ConstructorConcept3(5);
		System.out.println(cc.x);

	}

}
