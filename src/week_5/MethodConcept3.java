package week_5;

public class MethodConcept3 {
	
	//return == non void method
	
	// return keyword is used for non-void methods
	
	public static int calculate(int a, int b, int c){
		
		return (a+b+c);
		
	}
	
	public static void main(String[] args) {
		
		System.out.println("Sum of values "+calculate(1, 2, 3));

	}

}
