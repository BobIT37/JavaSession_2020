package week_11;

public class ThrowConcept {
	
	//Throw keyword is used in the method body to throw an exception
	//throws is used in method signature to declare the exceptions 
	
	void myMethod() {
		   try {
			   
		      //throwing arithmetic exception using throw
		      throw new ArithmeticException("Something went wrong!!");
		   } 
		   catch (Exception exp) {
		      System.out.println("Error: "+exp.getMessage());
		   }
		}

	public static void main(String[] args) {
		
		ThrowConcept tr = new ThrowConcept();
		tr.myMethod();

	}

}
