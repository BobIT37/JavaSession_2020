package week_2;

import java.util.Scanner;

public class Conditions5 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a value between 1-4");
		int homework = scanner.nextInt();
		
		switch (homework){
		case 1 :
			System.out.println("Essay is written");
			break;
		case 2 :
			System.out.println("Reading is done");
			break;
		case 3 :
			System.out.println("Homework is submitted");
			break;
		case 4 :
			System.out.println("Homework is done");
			break;
		default:
			System.out.println("invalid input");
		
		}

	}

}
