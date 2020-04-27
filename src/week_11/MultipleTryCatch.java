package week_11;

public class MultipleTryCatch {

	public static void main(String[] args) {
		
		try {
			int arr[] = new int[7];
			arr[9]=30/2;
			System.out.println("Last statement of try block");
		}
		catch (ArithmeticException e) {
			System.out.println("You should not divide a number by zero");
		}
		catch (ArrayIndexOutOfBoundsException e) {
			
			System.out.println("Accessing array elementns outside of the limit");
		}
		catch (Exception e) {
			System.out.println("Don't care of exception. I can handle all of them");
		}
		finally {
			System.out.println("I can work in any condition");
		}
		System.out.println("I am not in a try or catch block... ");

	}

}
