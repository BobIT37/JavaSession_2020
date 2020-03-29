package week_3;

public class Forloop2 {

	public static void main(String[] args) {
		
		/*
		 * 
		 * Write a program to calculate sum of all numbers
		 * between 1 to 5
		 * 1,2,3,4,5 -> 15
		 * 
		 */
		
		//System.out.println((1+2+3+4+5));
		
		int sum =  0;
		
		for(int i = 1; i<=5; i++){
			sum = sum+i;
		}
		System.out.println("sum is: "+ sum);

	}

}
