package week_11;

public class ExceptionHandling {

	public static void main(String[] args) {
		
		int num1, num2;
		
		try {
			
			//We suspect that this block of statement can throw exception so we handled it 
			//by placing these statements inside try and handled the exception in catch block
			num1 = 2;
			num2 = 62 / num1;
			System.out.println(num2);
			System.out.println("I am in the try block");		
		}
		catch (ArithmeticException e){
			//This block will only execute if any Arithmetic exception occurs in try block
			System.out.println("You should not divide  number by zero");
		}
		catch (Exception e) {
			//This is a generic exception handler which means it can handle all exceptions
			System.out.println("Exception occured");
		}
		finally {
			System.out.println("I am in finally block");
		}
		System.out.println("I am out of try-ctach block");
	}

}
