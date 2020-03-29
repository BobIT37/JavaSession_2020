package week_1;

public class IncrementAndDecrement {

	public static void main(String[] args) {
		
		int a = 1;
		//int b = a + 1;
		// int b = ++a;
		++a;   // pre-increment
		System.out.println(a); 
		
		
		//post increment
		int x, y;
		x = 1;
		y = x++;
		System.out.println(y);
		
		//decrement
		
		int m = 5;
		int n = --m; // pre decrement
		System.out.println(n);
		
		int c = 5;
		int d = c--; // post decrement
		System.out.println(d); 
		
		//shorthand
		
		int f = 7; // 7+6
		//f += 6;
		//System.out.println(f);
		
		f *= 6;
		System.out.println(f); // 7 * 6
		

	}

}
