package week_1;

public class BooleanOperators {
	
	public static void main(String[] args) {
		
		//Boolean == returns true or false
		
		/*
		 * | or
		 * || or
		 * & and
		 * && and
		 * ==
		 * != not equal
		 * ! not
		 * 
		 */
		//!isEmpty() true
		// .equal()
		
		boolean A = false;
		boolean B = true;
		
		System.out.println("A | B = "+ (A | B)); //true
		System.out.println("A & B ="+ (A & B)); //false
		System.out.println("!A = "+ (!A));
		System.out.println("A && B= "+ (A && B));
		System.out.println("A || B= "+ (A || B));
		System.out.println("A == B="+ (A == B));

	}

}
