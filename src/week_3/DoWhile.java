package week_3;

import java.util.Scanner;

public class DoWhile {

	public static void main(String[] args) {
		
		/*
		 * Ask for 5 dollars
		 * and keep asking for 5 dollars until you get it
		 * or user enters it
		 */
		
		Scanner input = new Scanner(System.in);
		
		int amount;
		
		do{
			System.out.println("Give me 5 dollars");
			amount = input.nextInt();
		}while(amount != 5);
		
		System.out.println("Thank you bro...");

	}

}
