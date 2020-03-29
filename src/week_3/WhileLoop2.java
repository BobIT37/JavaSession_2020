package week_3;

public class WhileLoop2 {

	public static void main(String[] args) {
		
		/*
		 * Usign if condition within while loop
		 * start variable number with 1
		 * and loop until 100
		 * check if number is even
		 * print the number
		 * 
		 * Output: 2 4 6 8 10...
		 */
		
		int number = 1;
		
		while(number <= 100){
			if(number % 2 ==0)
				System.out.println(number);
			number++;
		}
		

	}

}
