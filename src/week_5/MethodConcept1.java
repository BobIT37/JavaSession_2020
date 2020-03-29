package week_5;

public class MethodConcept1 {
	
	//void method, non-void method, static method (void non-void)
	
	//void method: no return data
	public void siliconeLabs(){
		System.out.println("Silicone Labs is a training center...");
	}
	
	//non-void method: returns data (String- int- double ...)
	public String google(){
		return "Google is a company";
	}
	
	//static void (no return data)
	//Static belongs to class
	//You don't have to create an object to call static method or variables
	public static void kaplan(){
		System.out.println("Kaplan is a language school");
	}
	
	//static non-void method
	public static String rutgers(){
		return "Rutgrs is a university in NJ";
	}
	
	public static void main(String[] args) {
		
		//void method non void method calling
		//Creation of object
		
		MethodConcept1 mc = new MethodConcept1();
		
		mc.siliconeLabs();
		System.out.println(mc.google());
		
		//static method
		//if in the same class, you can call the method directly
		kaplan();
		//mc.kaplan();
		System.out.println(rutgers());
		

	}

}
