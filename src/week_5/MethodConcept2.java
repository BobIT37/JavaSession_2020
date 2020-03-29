package week_5;

public class MethodConcept2 {
	
	//Parameterized methods
	
	public static void helloWorld(String sayHello){
		System.out.println("Bob says "+ sayHello);
	}
	
	public static void sumOfValues(int a, int b, int c){
		System.out.println("Sum of values "+ (a+b+c));
	}
	
	public static void main(String[] args) {
		
		helloWorld("hi guys how r u?");
		sumOfValues(1, 2, 3);

	}

}
