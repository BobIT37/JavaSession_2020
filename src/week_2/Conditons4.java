package week_2;

import java.util.Scanner;

public class Conditons4 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("*******************************");
		String mathOperators = "1. Addition \n"
				                +"2. Subtraction \n"
				                +"3. Multiplication \n"
				                +"4. Division";
		
		System.out.println(mathOperators);
		System.out.println("*********************************");
		System.out.println("Please enter math operator");
		
		String operators = scanner.nextLine();
		
		int a;
		int b;
		
		switch (operators){
		case "1":
			System.out.println("Enter first number");
			a = scanner.nextInt();
			System.out.println("Enter second number");
			b = scanner.nextInt();
			System.out.println("Addition: "+ (a+b));
			break;
		case "2":
			System.out.println("Enter first number");
			a = scanner.nextInt();
			System.out.println("Enter second number");
			b = scanner.nextInt();
			System.out.println("Subtraction: "+ (a-b));
			break;
		case "3":
			System.out.println("Enter first number");
			a = scanner.nextInt();
			System.out.println("Enter second number");
			b = scanner.nextInt();
			System.out.println("Multiplication: "+ (a*b));
			break;
		case "4":
			System.out.println("Enter first number");
			a = scanner.nextInt();
			System.out.println("Enter second number");
			b = scanner.nextInt();
			System.out.println("Division: "+ (a/b));
			break;	
		default:
			System.out.println("invalid input");
		}
		
		

	}

}
