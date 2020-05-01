package week_2;

import java.util.Scanner;

public class GuessWhat {

	public static void main(String[] args) {
		
		System.out.println("******** MATH OPERATORS *******************");
		System.out.println("1. Addition\n"
				         + "2. Subtraction\n"
				         + "3. Multiplication\n"
				         + "4. Division");
		System.out.println("You will see random math any operator and guess result accordingly...");
		System.out.println(" ");
		
		
		double tr = getRandomIntegerBetweenRange(1,4);
		System.out.println("Random operators = "+tr);
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter first number:");
		double a = scanner.nextDouble();
		System.out.println("Please enter second number:");
		double b = scanner.nextDouble();
		
		
		
		System.out.println("Please enter your guess");
		double enterResult = scanner.nextDouble();
		System.err.println("Your result is "+ enterResult);

		if(tr==1.0) {
			System.out.println("Addition result is: " + (a + b));
		}
		else if (tr == 2.0) {
			System.out.println("Subtraction result is: "+ (a - b));
		}
		else if (tr== 3.0) {
			System.out.println("Multiplication result is: "+ (a * b));
		}
		else if(tr== 4.0) {
			System.out.println("Division result is: "+ (a / b));
		}else {
			System.out.println("Invalid input");
		}
		
	}
	
	public static double getRandomIntegerBetweenRange(double min, double max){
	    double x = (int)(Math.random()*((max-min)+1))+min;
	    return x;
	}

}
