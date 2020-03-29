package week_2;

import java.util.Scanner;

public class Condtions3 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter your grade");
		String userGrade = input.nextLine();
		
		switch(userGrade){
		
		case "A":
			System.out.println("Distinction");
			break;
		case "B":
			System.out.println("Perfect");
			break;
		case "C":
			System.out.println("Good");
			break;
		default :
			System.out.println("Fail");
			break;
		}

	}

}
